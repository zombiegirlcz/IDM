package jyk;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f179517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf0.c f179518c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ z(c0 c0Var, jf0.c cVar, boolean z, int i) {
        this.f179516a = i;
        this.f179517b = c0Var;
        this.f179518c = cVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f179516a) {
            case 0:
                Boolean tradingEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(tradingEnabled, "tradingEnabled");
                if (!tradingEnabled.booleanValue()) {
                    ufm.b bVarM = efm.d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                jf0.c cVar = this.f179518c;
                String str = (String) cVar.d.get("prompt");
                boolean zF = Intrinsics.f(str, "FAILED_DOC_PROCESSING");
                c0 c0Var = this.f179517b;
                boolean z = this.d;
                if (zF) {
                    return c0Var.g(bzk.h.INFO_REQUEST, z);
                }
                if (Intrinsics.f(str, "GENERIC_FAILURE")) {
                    return c0Var.g(bzk.h.DECLINED, z);
                }
                efm.d0 d0VarB = c0Var.b(cVar);
                jy2.a aVar = new jy2.a(new jud.d(c0Var, 18), 22);
                d0VarB.getClass();
                ufm.i iVar = new ufm.i(d0VarB, aVar, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                ufm.i iVar2 = new ufm.i(iVar, new jy2.a(new z(c0Var, cVar, z, 1), 23), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            default:
                NaviCommand targetCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(targetCommand, "targetCommand");
                sri.m mVar = this.f179517b.d;
                if (this.f179518c.l() && this.d) {
                    targetCommand = com.revolut.retail.core.navigation.a.c(c0.c(), targetCommand);
                }
                mVar.c(targetCommand);
                return Boolean.TRUE;
        }
    }
}
