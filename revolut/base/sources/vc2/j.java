package vc2;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewAliasNavigation$InputData;
import com.revolut.feature.apm.qvik.api.R$string;
import com.revolut.feature.apm.qvik.impl.ui.settings.QvikSettingsScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ QvikSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(QvikSettingsScreen qvikSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = qvikSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        QvikSettingsScreen qvikSettingsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qvikSettingsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) qvikSettingsScreen.d();
                wc2.g gVar = uVar.f287641r;
                gVar.getClass();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.qvik_si_new_alias_title, null, null, 14);
                ApmQvik apmQvik = ApmQvik.f61823c;
                int i2 = R$string.qvik_si_new_alias_disclaimer;
                int i3 = R$string.qvik_si_new_alias_disclaimer_privacy;
                Intrinsics.checkNotNullParameter("https://www.revolut.com/en-HU/legal/privacy/", "url");
                uVar.C1(new com.revolut.kompot.common.b(uVar.e1(new c12.b(new ApmNewAliasNavigation$InputData(textLocalisedClause, apmQvik, (ApmAliasRegistrationMode) null, new ApmFooterContent.TextOnly(new TextLocalisedClause(i2, zhm.u.c(new TextLocalisedClause(i3, null, new Click(28, (Integer) null, (Object) new a12.r(), "QVIK_NEW_ALIAS_FOOTER_ID", false), 10)), null, 12)), 12), gVar.f296323a)), (ModalDestination.Style) null, 6));
                break;
        }
        return Unit.f186387a;
    }
}
