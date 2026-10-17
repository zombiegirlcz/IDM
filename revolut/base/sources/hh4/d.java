package hh4;

import dx4.i3;
import dx4.k3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f152250a = new d();

    private d() {
    }

    @Override // hh4.f
    public final boolean a(k3 inputItem, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        i3 i3Var = (i3) inputItem.d;
        return new Regex(i3Var.f120627b).f(b(inputItem, constructorState));
    }

    @Override // hh4.f
    public final String b(k3 inputItem, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        i3 i3Var = (i3) inputItem.d;
        String str = (String) constructorState.f10859g.get(inputItem.f120651a);
        if (str != null) {
            return str;
        }
        String str2 = i3Var.f120626a;
        return str2 == null ? "" : str2;
    }
}
