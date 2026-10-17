package com.onfido.android.sdk.capture.utils;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.core.os.BundleKt;
import ehm.e;
import igm.c;
import igm.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"INTERNAL_BETWEEN_RESULT_RECEIVER_MS", "", "MAX_CHUNKED_MEDIA_SIZE_IN_BYTE", "", "sendMedia", "Lio/reactivex/rxjava3/disposables/Disposable;", "Landroid/os/ResultReceiver;", "documentData", "", "scheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "bundleOfData", "Landroid/os/Bundle;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ResultReceiverExtensionsKt {
    public static final long INTERNAL_BETWEEN_RESULT_RECEIVER_MS = 10;
    public static final int MAX_CHUNKED_MEDIA_SIZE_IN_BYTE = 262144;

    public static final Disposable sendMedia(@NotNull final ResultReceiver resultReceiver, @NotNull byte[] documentData, @NotNull Scheduler scheduler, @NotNull final Bundle bundleOfData) {
        Intrinsics.checkNotNullParameter(resultReceiver, "<this>");
        Intrinsics.checkNotNullParameter(documentData, "documentData");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(bundleOfData, "bundleOfData");
        final List<byte[]> listChuncked = ByteArrayExtensionsKt.chuncked(documentData, 262144);
        return Observable.zip(Observable.fromIterable(d0.k1(listChuncked)).observeOn(scheduler).subscribeOn(scheduler), Observable.interval(10L, TimeUnit.MILLISECONDS, scheduler), new c() { // from class: com.onfido.android.sdk.capture.utils.ResultReceiverExtensionsKt$sendMedia$1$1
            @Override // igm.c
            public /* bridge */ /* synthetic */ Object apply(Object obj2, Object obj3) {
                return apply((IndexedValue<byte[]>) obj2, ((Number) obj3).longValue());
            }

            @NotNull
            public final IndexedValue<byte[]> apply(@NotNull IndexedValue<byte[]> item, long j2) {
                Intrinsics.checkNotNullParameter(item, "item");
                return item;
            }
        }).subscribe(new g() { // from class: com.onfido.android.sdk.capture.utils.ResultReceiverExtensionsKt.sendMedia.2
            @Override // igm.g
            public final void accept(@NotNull IndexedValue<byte[]> indexedValue) {
                Intrinsics.checkNotNullParameter(indexedValue, "<name for destructuring parameter 0>");
                int i = indexedValue.f186391a;
                byte[] bArr = (byte[]) indexedValue.f186392b;
                ResultReceiver resultReceiver2 = resultReceiver;
                Bundle bundle = bundleOfData;
                bundle.putBundle("file", BundleKt.bundleOf(new Pair("data", bArr), new Pair("index", Integer.valueOf(i)), new Pair("count", Integer.valueOf(listChuncked.size()))));
                Unit unit = Unit.f186387a;
                resultReceiver2.send(-1, bundle);
            }
        });
    }

    public static Disposable sendMedia$default(ResultReceiver resultReceiver, byte[] bArr, Scheduler scheduler, Bundle bundle, int i, Object obj2) {
        if ((i & 2) != 0) {
            scheduler = e.f126320c;
            Intrinsics.checkNotNullExpressionValue(scheduler, "io(...)");
        }
        return sendMedia(resultReceiver, bArr, scheduler, bundle);
    }
}
