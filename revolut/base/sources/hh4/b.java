package hh4;

import ax4.j;
import dx4.d3;
import dx4.k3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f152248a = new b();

    private b() {
    }

    @Override // hh4.f
    public final boolean a(k3 inputItem, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        d3 d3Var = (d3) inputItem.d;
        return new Regex(d3Var.f120575b).f(b(inputItem, constructorState));
    }

    @Override // hh4.f
    public final String b(k3 inputItem, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        d3 d3Var = (d3) inputItem.d;
        j jVar = (j) constructorState.f.get(inputItem.f120651a);
        String str = jVar != null ? jVar.f10883b : null;
        if (str != null) {
            String str2 = d3Var.d;
            return (str2 != null ? str2 : "").concat(str);
        }
        String str3 = d3Var.f120574a;
        return str3 == null ? "" : str3;
    }
}
