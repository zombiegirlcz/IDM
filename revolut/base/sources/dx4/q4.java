package dx4;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q4 implements Serializable, n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f120727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f120728c;
    public final List d;

    public q4(String text, boolean z, l lVar, List links) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f120726a = text;
        this.f120727b = z;
        this.f120728c = lVar;
        this.d = links;
    }

    @Override // dx4.n1
    public final List a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj2;
        return Intrinsics.f(this.f120726a, q4Var.f120726a) && this.f120727b == q4Var.f120727b && Intrinsics.f(this.f120728c, q4Var.f120728c) && Intrinsics.f(this.d, q4Var.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f120726a.hashCode() * 31, 31, this.f120727b);
        l lVar = this.f120728c;
        return this.d.hashCode() + ((iC + (lVar == null ? 0 : lVar.hashCode())) * 31);
    }
}
