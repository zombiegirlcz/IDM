package f2e;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j5 {

    @NotNull
    public static final i5 Companion = new i5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f131637c;
    public final Long d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.a f131638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.a f131639h;
    public final String i;

    public /* synthetic */ j5(int i, String str, String str2, Long l2, Long l3, String str3, String str4, jo3.a aVar, jo3.a aVar2, String str5) {
        if (371 != (i & 371)) {
            qlm.j1.f(h5.f131619a.getDescriptor(), i, 371);
            throw null;
        }
        this.f131635a = str;
        this.f131636b = str2;
        if ((i & 4) == 0) {
            this.f131637c = null;
        } else {
            this.f131637c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        this.e = str3;
        this.f = str4;
        this.f131638g = aVar;
        if ((i & 128) == 0) {
            this.f131639h = null;
        } else {
            this.f131639h = aVar2;
        }
        this.i = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj2;
        return Intrinsics.f(this.f131635a, j5Var.f131635a) && Intrinsics.f(this.f131636b, j5Var.f131636b) && Intrinsics.f(this.f131637c, j5Var.f131637c) && Intrinsics.f(this.d, j5Var.d) && Intrinsics.f(this.e, j5Var.e) && Intrinsics.f(this.f, j5Var.f) && Intrinsics.f(this.f131638g, j5Var.f131638g) && Intrinsics.f(this.f131639h, j5Var.f131639h) && Intrinsics.f(this.i, j5Var.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f131635a.hashCode() * 31, 31, this.f131636b);
        Long l2 = this.f131637c;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iJ = v7.j(this.f131638g, p.a.c(p.a.c((iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.e), 31, this.f), 31);
        jo3.a aVar = this.f131639h;
        return this.i.hashCode() + ((iJ + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }
}
