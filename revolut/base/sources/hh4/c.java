package hh4;

import ax4.k;
import dx4.h3;
import dx4.k3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f152249a = new c();

    private c() {
    }

    @Override // hh4.f
    public final boolean a(k3 inputItem, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Object[] elements = {(k) constructorState.e.get(inputItem.f120651a), ((h3) inputItem.d).f120613a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return !kotlin.collections.d.L(elements).isEmpty();
    }

    @Override // hh4.f
    public final String b(k3 inputItem, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        h3 h3Var = (h3) inputItem.d;
        k kVar = (k) constructorState.e.get(inputItem.f120651a);
        return kVar != null ? kVar.f10885a : h3Var.f120613a;
    }
}
