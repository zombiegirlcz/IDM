package oc3;

import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreen;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreenContract$InputData;
import kl.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashTopUpLocationsMapScreen f224050b;

    public /* synthetic */ a(CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen, int i) {
        this.f224049a = i;
        this.f224050b = cashTopUpLocationsMapScreen;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f224049a;
        CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen = this.f224050b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = CashTopUpLocationsMapScreen.f65677a0;
                mb3.r rVar = (mb3.r) cashTopUpLocationsMapScreen.Y.getValue();
                mb3.p pVar = rVar.f204101b;
                ub3.g gVar = new ub3.g((ub3.m) pVar.f204096j.get());
                ub3.h hVar = new ub3.h();
                ub3.j jVar = new ub3.j();
                ub3.i iVar = new ub3.i();
                l80.e eVarH = pVar.d.h();
                vc.s.j(eVarH);
                ub3.e eVar = new ub3.e(gVar, hVar, jVar, iVar, eVarH);
                CashTopUpLocationsMapScreenContract$InputData cashTopUpLocationsMapScreenContract$InputData = rVar.f204100a;
                d0 d0Var = new d0(eVar, cashTopUpLocationsMapScreenContract$InputData);
                mb3.i iVar2 = pVar.f204093c;
                nb3.b bVarC = iVar2.c();
                t1 t1VarB = iVar2.b();
                w39.b bVarA = pVar.f.a();
                vc.s.j(bVarA);
                return new a0(d0Var, bVarC, t1VarB, bVarA, cashTopUpLocationsMapScreenContract$InputData);
            default:
                KProperty[] kPropertyArr2 = CashTopUpLocationsMapScreen.f65677a0;
                BottomExpandableDialogView bottomExpandableDialogViewB3 = cashTopUpLocationsMapScreen.b3();
                cr0.h hVar2 = cr0.h.COLLAPSED;
                BottomExpandableDialogView.Companion companion = BottomExpandableDialogView.INSTANCE;
                bottomExpandableDialogViewB3.r0(hVar2, false);
                return Unit.f186387a;
        }
    }
}
