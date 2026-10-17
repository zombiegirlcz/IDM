package e63;

import android.app.Activity;
import f63.b;
import f63.d;
import kotlin.jvm.internal.Intrinsics;
import ni0.f;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f122888a;

    public a(f paymentCardRecognitionResultExtractor) {
        Intrinsics.checkNotNullParameter(paymentCardRecognitionResultExtractor, "paymentCardRecognitionResultExtractor");
        this.f122888a = paymentCardRecognitionResultExtractor;
    }

    public static d a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new d(new b(activity));
    }
}
