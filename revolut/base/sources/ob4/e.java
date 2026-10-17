package ob4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreenContract$ModalStep;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import dx4.z2;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xu3.n;
import xu3.p;
import xu3.q;
import xu3.v;
import yhm.o;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EvidenceTypeSelectionScreen f223876w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(EvidenceTypeSelectionScreen evidenceTypeSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f223876w = evidenceTypeSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f223876w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f223876w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((z2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listC;
        xu3.f fVar;
        ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.CantLinkAccountItem cantLinkAccountItem;
        int i = this.u;
        EvidenceTypeSelectionScreen evidenceTypeSelectionScreen = this.f223876w;
        switch (i) {
            case 0:
                z2 info = (z2) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.a) ((j) evidenceTypeSelectionScreen.O.getValue());
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(info, "info");
                oki.h.v2(aVar2.f67710r, new EvidenceTypeSelectionScreenContract$ModalStep.Info(info), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            default:
                q action = (q) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.a aVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.a) ((j) evidenceTypeSelectionScreen.O.getValue());
                EvidenceTypeSelectionScreenContract$InputData evidenceTypeSelectionScreenContract$InputData = aVar4.o;
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof n) {
                    ArrayList arrayList = evidenceTypeSelectionScreenContract$InputData.f67705b.e;
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(((v) it8.next()).e);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (obj3 instanceof p) {
                            arrayList3.add(obj3);
                        }
                    }
                    p pVar = (p) d0.d0(arrayList3);
                    String str = evidenceTypeSelectionScreenContract$InputData.f67706c.f66892b;
                    n nVar = (n) action;
                    xu3.h hVar = nVar.f308931b;
                    Style style = null;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.financial_evidence_linked_accounts_consents_title, u.c(hVar.f308901a), null, 12);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.financial_evidence_linked_accounts_consents_description, u.c(hVar.f308902b), null, 12);
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.financial_evidence_linked_accounts_consents_disclaimer, u.c(hVar.d), null, 12);
                    ArrayList arrayList4 = hVar.e;
                    ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                    Iterator it9 = arrayList4.iterator();
                    while (it9.hasNext()) {
                        xu3.g gVar = (xu3.g) it9.next();
                        arrayList5.add(new ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration.ConsentItem(new TextLocalisedClause(R$string.financial_evidence_linked_accounts_consents_item_title, u.c(gVar.f308896b), null, 12), new TextLocalisedClause(R$string.financial_evidence_linked_accounts_consents_item_description, u.c(gVar.f308897c), null, 12), gVar.f308895a.d()));
                        style = null;
                        it9 = it9;
                        str = str;
                        textLocalisedClause = textLocalisedClause;
                    }
                    String str2 = str;
                    ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration externalConsentConfiguration = new ExternalAccountsFeatureConfig.Configuration.ExternalConsentConfiguration(textLocalisedClause, textLocalisedClause2, arrayList5, textLocalisedClause3, new TextLocalisedClause(R$string.financial_evidence_linked_accounts_consents_button_title, u.c(hVar.f308903c), style, 12));
                    boolean z = nVar.f308930a;
                    xu3.e eVar = nVar.f308932c;
                    boolean z3 = pVar != null;
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.financial_evidence_bank_selection_title_v2, u.c(eVar.f308887a), null, 12);
                    if (z) {
                        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.financial_evidence_bank_selection_revolut, null, null, 14);
                        String string = aVar4.f67708p.b(textLocalisedClause5).toString();
                        listC = u.c(new ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.ExternalAccountItem(string, string, textLocalisedClause5, LayeredImage.Companion.a(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_revolut, new Color.Solid(R$attr.uikit_colorBlack), new Color.Solid(R$attr.uikit_colorWhite), 8.0f, null, 48), null));
                    } else {
                        listC = null;
                    }
                    if (z3) {
                        fVar = null;
                        cantLinkAccountItem = new ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.CantLinkAccountItem(new TextLocalisedClause(R$string.financial_evidence_bank_selection_cant_find_bank_v2, u.c(eVar.f308888b), null, 12), null);
                    } else {
                        fVar = null;
                        cantLinkAccountItem = null;
                    }
                    ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration = new ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration(textLocalisedClause4, null, listC, cantLinkAccountItem, false, 102);
                    k9 value = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    AnalyticsProduct.Retail retail = new AnalyticsProduct.Retail(value);
                    xu3.f fVar2 = fVar;
                    aVar4.C2(new f(new ExternalAccountsFeatureConfig.Configuration.TrueLayer(null, null, str2, externalConsentConfiguration, externalInstitutionsConfiguration, retail, false, null, 14631), pVar != null ? nVar.d : fVar2, pVar != null ? pVar.f308938a : fVar2));
                } else if (action instanceof p) {
                    aVar4.C2(new h(((p) action).f308938a));
                } else {
                    if (!(action instanceof xu3.o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.C2(new g(((xu3.o) action).f308937a));
                }
                return Unit.f186387a;
        }
    }
}
