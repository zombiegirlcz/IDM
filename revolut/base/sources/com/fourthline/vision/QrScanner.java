package com.fourthline.vision;

import android.graphics.Bitmap;
import com.bumptech.glide.d;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.common.InputImage;
import fim.h;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import zhm.d0;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/fourthline/vision/QrScanner;", "Ljava/io/Closeable;", "<init>", "()V", "Landroid/graphics/Bitmap;", "image", "", "scan", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "a", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeScanner", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrScanner implements Closeable {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BarcodeScanner barcodeScanner;

    public static final class a implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f35859a;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f35859a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
        public final /* synthetic */ void onSuccess(Object obj2) {
            this.f35859a.invoke(obj2);
        }
    }

    public static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f35860a;

        public b(Continuation<? super String> continuation) {
            this.f35860a = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((List<fh.a>) obj2);
            return Unit.f186387a;
        }

        public final void invoke(List<fh.a> list) {
            Continuation continuation = this.f35860a;
            Intrinsics.h(list);
            fh.a aVar = (fh.a) d0.d0(list);
            String strA = aVar != null ? aVar.f135117a.a() : null;
            m.Companion companion = m.INSTANCE;
            continuation.resumeWith(strA);
        }
    }

    public static final class c implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f35861a;

        public c(Continuation<? super String> continuation) {
            this.f35861a = continuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc2) {
            Intrinsics.checkNotNullParameter(exc2, "<unused var>");
            Continuation continuation = this.f35861a;
            m.Companion companion = m.INSTANCE;
            continuation.resumeWith(null);
        }
    }

    public QrScanner() {
        hh.a aVarI = d.i();
        Intrinsics.checkNotNullExpressionValue(aVarI, "getClient(...)");
        this.barcodeScanner = aVarI;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.barcodeScanner.close();
    }

    public final Object scan(@NotNull Bitmap bitmap, @NotNull Continuation<? super String> frame) {
        eim.c cVar = new eim.c(h.b(frame));
        this.barcodeScanner.process(InputImage.a(bitmap, 0)).addOnSuccessListener(new a(new b(cVar))).addOnFailureListener(new c(cVar));
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }
}
