package ymk;

import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanPageScreen f315031w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(PlanPageScreen planPageScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f315031w = planPageScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f315031w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f315031w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i(this.f315031w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i(this.f315031w, continuation, 3);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i(this.f315031w, continuation, 4);
                iVar5.v = obj2;
                return iVar5;
            default:
                i iVar6 = new i(this.f315031w, continuation, 5);
                iVar6.v = obj2;
                return iVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((t60.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((Integer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((enk.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017c  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ymk.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
