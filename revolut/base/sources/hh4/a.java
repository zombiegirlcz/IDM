package hh4;

import ax4.i;
import dx4.c3;
import dx4.k3;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f152247a = new a();

    private a() {
    }

    @Override // hh4.f
    public final boolean a(k3 inputItem, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        i iVar = (i) constructorState.f10860h.get(inputItem.f120651a);
        return (iVar != null ? iVar.f10880b : null) != null;
    }

    @Override // hh4.f
    public final String b(k3 inputItem, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(inputItem, "inputItem");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        c3 c3Var = (c3) inputItem.d;
        i iVar = (i) constructorState.f10860h.get(inputItem.f120651a);
        String str = iVar != null ? iVar.f10881c : null;
        if (str != null) {
            return str;
        }
        LocalDate localDate = c3Var.f120565a;
        String str2 = localDate != null ? localDate.format(c3Var.f120567c) : null;
        return str2 == null ? "" : str2;
    }
}
