package uc1;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import d67.s;
import d67.u;
import fa1.k;
import java.util.List;
import jb3.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ma1.b0;
import ma1.v;
import nii.j1;
import nii.l1;
import nii.n1;
import pfm.m;
import pfm.t;
import uc1.a;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f278965b;

    public /* synthetic */ c(e eVar, int i) {
        this.f278964a = i;
        this.f278965b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.b tVar;
        switch (this.f278964a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                e eVar = this.f278965b;
                if (zBooleanValue) {
                    en.a aVar = mfm.f.f205043c;
                    dfm.c cVar = mfm.f.d;
                    b0 b0Var = eVar.v;
                    PairingInfo pairingInfo = eVar.u.f60662a;
                    b0Var.getClass();
                    Intrinsics.checkNotNullParameter(pairingInfo, "pairingInfo");
                    if (pairingInfo.a()) {
                        ea1.b.a("Update is required", k.INFO);
                        l.f172594a = true;
                        t tVarL = b0Var.f203867b.b(pairingInfo).e(b0Var.f203868c.b(pairingInfo)).e(b0Var.d.b(pairingInfo)).e(b0Var.e.b(pairingInfo)).e(b0Var.f203870h.b(pairingInfo)).e(b0Var.f.b(pairingInfo)).e(b0Var.f203869g.b(pairingInfo)).e(b0Var.f203866a.b()).l(new bji.a(5));
                        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                        tVar = new t(new t(tVarL, new v(9, new lul.d(b0Var, pairingInfo, 29)), cVar, aVar, aVar, aVar, aVar), cVar, cVar, aVar, aVar, new i1i.a(b0Var, 14), aVar);
                    } else {
                        ea1.b.a("Card reader is UP-TO-DATE", k.INFO);
                        tVar = m.f235744a;
                    }
                    t tVar2 = new t(tVar, new ubj.c(9, new c(eVar, 2)), cVar, aVar, aVar, aVar, aVar);
                    Intrinsics.checkNotNullExpressionValue(tVar2, "doOnSubscribe(...)");
                    eVar.y0(tVar2, false, new d(eVar, 0), new c(eVar, 3));
                } else {
                    eVar.f2(new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.merchant_card_reader_flow_updating_insufficient_battery_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_updating_insufficient_battery_description, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D166", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.merchant_card_reader_flow_updating_insufficient_battery_primary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.merchant_card_reader_flow_updating_insufficient_battery_secondary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, 65112)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new c(eVar, 1));
                }
                return Unit.f186387a;
            case 1:
                u output = (u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean zF = Intrinsics.f(output, s.f111464a);
                e eVar2 = this.f278965b;
                if (zF) {
                    eVar2.B2();
                } else {
                    eVar2.v2(a.C1542a.f278960a);
                }
                return Unit.f186387a;
            case 2:
                e eVar3 = this.f278965b;
                eVar3.f278969x.Q(new d(eVar3, 2));
                return Unit.f186387a;
            case 3:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                e eVar4 = this.f278965b;
                eVar4.f278969x.Q(new d(eVar4, 3));
                return Boolean.TRUE;
            default:
                n1 dialogResult = (n1) obj2;
                Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                e eVar5 = this.f278965b;
                eVar5.f278969x.d.onNext(xc1.d.f);
                if (dialogResult instanceof l1) {
                    eVar5.v2(a.c.f278962a);
                } else if (dialogResult instanceof j1) {
                    eVar5.v2(a.b.f278961a);
                } else {
                    eVar5.v2(a.C1542a.f278960a);
                }
                return Unit.f186387a;
        }
    }
}
