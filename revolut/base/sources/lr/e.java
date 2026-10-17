package lr;

import android.content.Context;
import com.revolut.biometric_verification.impl.data.db.BiometricVerificationDatabase;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDatabase f199341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f199342b;

    public e(Context context, BiometricVerificationDatabase db8) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(db8, "db");
        this.f199341a = db8;
        File file = new File(context.getFilesDir(), "biometric_auth_deffered_upload");
        file.mkdirs();
        this.f199342b = file;
    }
}
