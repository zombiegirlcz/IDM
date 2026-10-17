package com.onfido.android.sdk.capture.utils.mlmodel;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import gim.c;
import gim.d;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import pkm.e;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/mlmodel/OnfidoMlModelDownloaderWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ljava/io/File;", "Lkotlin/time/b;", "duration", "", "isOlderThan-HG0u8IE", "(Ljava/io/File;J)Z", "isOlderThan", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoMlModelDownloaderWorker extends CoroutineWorker {
    private static final long CACHE_EXPIRE_IN;

    @NotNull
    public static final String MODEL_ASSET_URL_KEY = "asset_url";

    @NotNull
    public static final String MODEL_ASSET_NAME_KEY = "model_name";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/mlmodel/OnfidoMlModelDownloaderWorker$Companion;", "", "<init>", "()V", "Lkotlin/time/b;", "CACHE_EXPIRE_IN", "J", "getCACHE_EXPIRE_IN-UwyO8pc", "()J", "", "MODEL_ASSET_NAME_KEY", "Ljava/lang/String;", "MODEL_ASSET_URL_KEY", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getCACHE_EXPIRE_IN-UwyO8pc, reason: not valid java name */
        public final long m3737getCACHE_EXPIRE_INUwyO8pc() {
            return OnfidoMlModelDownloaderWorker.CACHE_EXPIRE_IN;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.mlmodel.OnfidoMlModelDownloaderWorker$doWork$1, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.utils.mlmodel.OnfidoMlModelDownloaderWorker", f = "OnfidoMlModelDownloaderWorker.kt", l = {39}, m = "doWork")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return OnfidoMlModelDownloaderWorker.this.doWork(this);
        }
    }

    static {
        b.Companion companion = b.INSTANCE;
        CACHE_EXPIRE_IN = kotlin.time.c.g(7, e.DAYS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnfidoMlModelDownloaderWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    /* JADX INFO: renamed from: isOlderThan-HG0u8IE, reason: not valid java name */
    private final boolean m3736isOlderThanHG0u8IE(File file, long j2) {
        return System.currentTimeMillis() - file.lastModified() > b.f(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.utils.mlmodel.OnfidoMlModelDownloaderWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
