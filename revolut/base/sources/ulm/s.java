package ulm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f281132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mmm.m f281133c;

    public s(String pattern, String pin) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(pin, "pin");
        if ((!kotlin.text.a0.H(pattern, "*.", false) || kotlin.text.d0.T(pattern, "*", 1, false, 4) != -1) && ((!kotlin.text.a0.H(pattern, "**.", false) || kotlin.text.d0.T(pattern, "*", 2, false, 4) != -1) && kotlin.text.d0.T(pattern, "*", 0, false, 6) != -1)) {
            throw new IllegalArgumentException("Unexpected pattern: ".concat(pattern).toString());
        }
        String strC = vlm.g.c(pattern);
        if (strC == null) {
            throw new IllegalArgumentException("Invalid pattern: ".concat(pattern));
        }
        this.f281131a = strC;
        if (kotlin.text.a0.H(pin, "sha1/", false)) {
            this.f281132b = "sha1";
            mmm.l lVar = mmm.m.Companion;
            String strSubstring = pin.substring(5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            lVar.getClass();
            mmm.m mVarA = mmm.l.a(strSubstring);
            if (mVarA == null) {
                throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
            }
            this.f281133c = mVarA;
            return;
        }
        if (!kotlin.text.a0.H(pin, "sha256/", false)) {
            throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(pin));
        }
        this.f281132b = "sha256";
        mmm.l lVar2 = mmm.m.Companion;
        String strSubstring2 = pin.substring(7);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        lVar2.getClass();
        mmm.m mVarA2 = mmm.l.a(strSubstring2);
        if (mVarA2 == null) {
            throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
        }
        this.f281133c = mVarA2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f281131a, sVar.f281131a) && Intrinsics.f(this.f281132b, sVar.f281132b) && Intrinsics.f(this.f281133c, sVar.f281133c);
    }

    public final int hashCode() {
        return this.f281133c.hashCode() + p.a.c(this.f281131a.hashCode() * 31, 31, this.f281132b);
    }

    public final String toString() {
        return this.f281132b + '/' + this.f281133c.a();
    }
}
