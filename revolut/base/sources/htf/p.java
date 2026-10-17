package htf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f155376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f155378c;

    public p(ArrayList items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f155376a = items;
        this.f155377b = z;
        this.f155378c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f155376a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f155376a.equals(pVar.f155376a) && this.f155377b == pVar.f155377b && this.f155378c == pVar.f155378c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f155378c) + j6.a.c(this.f155376a.hashCode() * 31, 31, this.f155377b);
    }
}
