package jyj;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableKt;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ufm.a f179456b;

    public /* synthetic */ k(ufm.a aVar, int i) {
        this.f179455a = i;
        this.f179456b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f179455a) {
            case 0:
                Drawable drawable = (Drawable) obj2;
                od0.h hVar = od0.i.Companion;
                Bitmap bitmap$default = drawable != null ? DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null) : null;
                hVar.getClass();
                this.f179456b.b(od0.h.a(bitmap$default));
                break;
            default:
                od0.h hVar2 = od0.i.Companion;
                PendingIntent paymentCardRecognitionPendingIntent = ((PaymentCardRecognitionIntentResponse) obj2).getPaymentCardRecognitionPendingIntent();
                hVar2.getClass();
                this.f179456b.b(od0.h.a(paymentCardRecognitionPendingIntent));
                break;
        }
        return Unit.f186387a;
    }
}
