package af9;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends oki.h implements dli.b {
    public final ew3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f3973p;

    public j(n stateMapper, ew3.a passwordValidator) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(passwordValidator, "passwordValidator");
        this.o = passwordValidator;
        this.f3973p = mra.d.b(this, new f("", "", true, f0.f322471a, true, true, false), stateMapper, null, false, 12);
    }

    public static boolean I2(String str, String str2) {
        Boolean boolValueOf = (str.length() <= 0 || str2.length() <= 0) ? null : Boolean.valueOf(str.equals(str2));
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f3973p;
    }
}
