package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222090c;
    public final String d;
    public final String e;
    public final b2 f;

    public /* synthetic */ p(int i, String str, String str2, String str3, String str4, String str5, b2 b2Var) {
        if (63 != (i & 63)) {
            qlm.j1.f(n.f222083a.getDescriptor(), i, 63);
            throw null;
        }
        this.f222088a = str;
        this.f222089b = str2;
        this.f222090c = str3;
        this.d = str4;
        this.e = str5;
        this.f = b2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f222088a, pVar.f222088a) && Intrinsics.f(this.f222089b, pVar.f222089b) && Intrinsics.f(this.f222090c, pVar.f222090c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f222088a.hashCode() * 31, 31, this.f222089b), 31, this.f222090c);
        String str = this.d;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        b2 b2Var = this.f;
        return iC2 + (b2Var != null ? b2Var.hashCode() : 0);
    }

    public p(String type, String state, String sourceId, String str, String currency, b2 b2Var) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f222088a = type;
        this.f222089b = state;
        this.f222090c = sourceId;
        this.d = str;
        this.e = currency;
        this.f = b2Var;
    }
}
