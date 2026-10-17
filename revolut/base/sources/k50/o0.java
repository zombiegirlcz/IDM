package k50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f181192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f181193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v20.n f181194c;
    public final String d;
    public final boolean e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x30.c f181195g;

    public o0() {
        this(0);
    }

    public static o0 a(o0 o0Var, CharSequence charSequence, long j2, v20.n nVar, String str, boolean z, List list, x30.c cVar, int i) {
        if ((i & 1) != 0) {
            charSequence = o0Var.f181192a;
        }
        CharSequence inputMessageText = charSequence;
        if ((i & 2) != 0) {
            j2 = o0Var.f181193b;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            nVar = o0Var.f181194c;
        }
        v20.n nVar2 = nVar;
        if ((i & 8) != 0) {
            str = o0Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = o0Var.e;
        }
        boolean z3 = z;
        List pendingAttachments = (i & 32) != 0 ? o0Var.f : list;
        x30.c cVar2 = (i & 64) != 0 ? o0Var.f181195g : cVar;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(inputMessageText, "inputMessageText");
        Intrinsics.checkNotNullParameter(pendingAttachments, "pendingAttachments");
        return new o0(inputMessageText, j3, nVar2, str2, z3, pendingAttachments, cVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f181192a, o0Var.f181192a) && this.f181193b == o0Var.f181193b && Intrinsics.f(this.f181194c, o0Var.f181194c) && Intrinsics.f(this.d, o0Var.d) && this.e == o0Var.e && Intrinsics.f(this.f, o0Var.f) && Intrinsics.f(this.f181195g, o0Var.f181195g);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f181192a.hashCode() * 31, 31, this.f181193b);
        v20.n nVar = this.f181194c;
        int iHashCode = (iC + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str = this.d;
        int iD = p.a.d(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        x30.c cVar = this.f181195g;
        return iD + (cVar != null ? cVar.hashCode() : 0);
    }

    public o0(int i) {
        this("", -1L, null, null, true, zhm.f0.f322471a, null);
    }

    public o0(CharSequence inputMessageText, long j2, v20.n nVar, String str, boolean z, List pendingAttachments, x30.c cVar) {
        Intrinsics.checkNotNullParameter(inputMessageText, "inputMessageText");
        Intrinsics.checkNotNullParameter(pendingAttachments, "pendingAttachments");
        this.f181192a = inputMessageText;
        this.f181193b = j2;
        this.f181194c = nVar;
        this.d = str;
        this.e = z;
        this.f = pendingAttachments;
        this.f181195g = cVar;
    }
}
