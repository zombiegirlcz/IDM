package u1m;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2m.a f276443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f276444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276445c;
    public final a0 d;

    public a(w2m.a aVar, u uVar, String str, a0 a0Var) {
        this.f276443a = aVar;
        this.f276444b = uVar;
        this.f276445c = str;
        this.d = a0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f276443a, aVar.f276443a) && Intrinsics.f(this.f276444b, aVar.f276444b) && Intrinsics.f(this.f276445c, aVar.f276445c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        w2m.a aVar = this.f276443a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        u uVar = this.f276444b;
        int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str = this.f276445c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        a0 a0Var = this.d;
        return iHashCode3 + (a0Var != null ? a0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SavedState(args=" + this.f276443a + ", processState=" + this.f276444b + ", lastVerificationId=" + this.f276445c + ", sessionMetadata=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
