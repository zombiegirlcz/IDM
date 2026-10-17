package chc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class w {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f24181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24182c;
    public final double d;
    public final String e;

    public /* synthetic */ w(int i, String str, v vVar, String str2, double d, String str3) {
        if (31 != (i & 31)) {
            j1.f(r.f24176a.getDescriptor(), i, 31);
            throw null;
        }
        this.f24180a = str;
        this.f24181b = vVar;
        this.f24182c = str2;
        this.d = d;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f24180a, wVar.f24180a) && Intrinsics.f(this.f24181b, wVar.f24181b) && Intrinsics.f(this.f24182c, wVar.f24182c) && Double.compare(this.d, wVar.d) == 0 && Intrinsics.f(this.e, wVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + m72.b.c(p.a.c((this.f24181b.hashCode() + (this.f24180a.hashCode() * 31)) * 31, 31, this.f24182c), this.d, 31);
    }

    public w(String id10, v payment, String state, double d, String createdDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f24180a = id10;
        this.f24181b = payment;
        this.f24182c = state;
        this.d = d;
        this.e = createdDate;
    }
}
