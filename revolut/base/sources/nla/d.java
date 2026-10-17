package nla;

import aw0.l6;
import gim.i;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements eq0.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f217108b = new LinkedHashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f217109a;

    public d(kla.a toggleResolver, j errorsStorage) {
        Intrinsics.checkNotNullParameter(toggleResolver, "toggleResolver");
        Intrinsics.checkNotNullParameter(errorsStorage, "errorsStorage");
        this.f217109a = errorsStorage;
    }

    @Override // eq0.a
    public final Object e(l6 l6Var, i iVar) {
        f217108b.add(l6Var.b());
        return Unit.f186387a;
    }

    @Override // eq0.a
    public final void f(l6 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f217109a.f(product.b(), Boolean.TRUE);
    }

    @Override // eq0.b
    public final boolean h(l6 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        if (Intrinsics.f(this.f217109a.get(product.b()), Boolean.TRUE)) {
            return false;
        }
        return !f217108b.contains(product.b());
    }
}
