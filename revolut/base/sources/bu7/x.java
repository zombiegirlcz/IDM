package bu7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f18744c = {yhm.j.c(yhm.k.PUBLICATION, new br4.e(26)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f18745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18746b;

    public /* synthetic */ x(int i, o oVar, String str) {
        if (3 != (i & 3)) {
            j1.f(v.f18742a.getDescriptor(), i, 3);
            throw null;
        }
        this.f18745a = oVar;
        this.f18746b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f18745a == xVar.f18745a && Intrinsics.f(this.f18746b, xVar.f18746b);
    }

    public final int hashCode() {
        return this.f18746b.hashCode() + (this.f18745a.hashCode() * 31);
    }

    public x(o icon, String value) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f18745a = icon;
        this.f18746b = value;
    }
}
