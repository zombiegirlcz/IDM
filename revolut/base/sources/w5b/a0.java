package w5b;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f294770c = {yhm.j.c(yhm.k.PUBLICATION, new w56.a(7)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294772b;

    public /* synthetic */ a0(int i, List list, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(y.f295078a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294771a = list;
        this.f294772b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f294771a, a0Var.f294771a) && Intrinsics.f(this.f294772b, a0Var.f294772b);
    }

    public final int hashCode() {
        return this.f294772b.hashCode() + (this.f294771a.hashCode() * 31);
    }

    public a0(List features, String code) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f294771a = features;
        this.f294772b = code;
    }
}
