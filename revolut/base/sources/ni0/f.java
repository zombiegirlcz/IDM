package ni0;

import android.content.Intent;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {
    public static e a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        PaymentCardRecognitionResult fromIntent = PaymentCardRecognitionResult.getFromIntent(intent);
        if (fromIntent != null) {
            return new e(fromIntent);
        }
        return null;
    }
}
