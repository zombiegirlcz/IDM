package uha;

import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f280160c = {yhm.j.c(yhm.k.PUBLICATION, new u9a.b(24)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtendedSubaccountType f280161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f280162b;

    public /* synthetic */ a0(int i, ExtendedSubaccountType extendedSubaccountType, p pVar) {
        if (3 != (i & 3)) {
            j1.f(y.f280186a.getDescriptor(), i, 3);
            throw null;
        }
        this.f280161a = extendedSubaccountType;
        this.f280162b = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f280161a, a0Var.f280161a) && Intrinsics.f(this.f280162b, a0Var.f280162b);
    }

    public final int hashCode() {
        return this.f280162b.hashCode() + (this.f280161a.hashCode() * 31);
    }

    public a0(ExtendedSubaccountType type, p productArticleParams) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(productArticleParams, "productArticleParams");
        this.f280161a = type;
        this.f280162b = productArticleParams;
    }
}
