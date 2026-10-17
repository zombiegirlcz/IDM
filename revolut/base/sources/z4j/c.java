package z4j;

import com.revolut.domain.models.beneficiary.ConfirmationResult;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static String a(ConfirmationResult confirmationResult) {
        String str = confirmationResult.f;
        String str2 = confirmationResult.d;
        String str3 = confirmationResult.e;
        if (str != null) {
            return str;
        }
        if (str2 == null || str3 == null) {
            return null;
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.o(str2, " ", str3);
    }
}
