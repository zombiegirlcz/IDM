package qbd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class r {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f244204b;

    public /* synthetic */ r(int i, String str, q qVar) {
        if (3 != (i & 3)) {
            j1.f(m.f244198a.getDescriptor(), i, 3);
            throw null;
        }
        this.f244203a = str;
        this.f244204b = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f244203a, rVar.f244203a) && Intrinsics.f(this.f244204b, rVar.f244204b);
    }

    public final int hashCode() {
        return this.f244204b.hashCode() + (this.f244203a.hashCode() * 31);
    }

    public r(String title, q maturity) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(maturity, "maturity");
        this.f244203a = title;
        this.f244204b = maturity;
    }
}
