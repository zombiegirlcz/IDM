package gc1;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.card_reader_settings.CardReaderSettingsScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardReaderSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CardReaderSettingsScreen cardReaderSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardReaderSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarG3 = this.v.T2();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice");
        CardReaderDevice cardReader = (CardReaderDevice) obj3;
        q qVar = (q) lVarG3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(cardReader, "cardReader");
        Iterator it8 = ((j) qVar.t2()).f142303b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((fa1.p) next).f133205a, cardReader)) {
                break;
            }
        }
        fa1.p pVar = (fa1.p) next;
        if (pVar != null) {
            lw0.a aVar2 = new lw0.a(new TextClause(cardReader.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30);
            boolean z = pVar.f133206b;
            n nVar = qVar.f142309r;
            aim.e eVarB = u.b();
            if (z) {
                ((o) nVar).getClass();
                eVarB.add(new eii.l((Clause) new TextLocalisedClause(R$string.merchant_card_reader_settings_more_options_disconnect, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_16_canceled, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 60), true, false, (RowDelegate.Model.c) null, (Object) a.DISCONNECT, 232));
            }
            ((o) nVar).getClass();
            eVarB.add(new eii.l((Clause) new TextLocalisedClause(R$string.merchant_card_reader_settings_more_options_forget, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_16_cross, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 60), true, false, (RowDelegate.Model.c) null, (Object) a.FORGET, 232));
            qVar.f2(new RowActionsBottomSheetController(new eii.c(aVar2, null, u.a(eVarB), new AnalyticsProduct.Shared(k9.CardReader, x0.CardReader, q6.CardReader, w2.CardReader, od.Terminal), null)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new gbi.c(qVar, cardReader, 2));
        }
        return Unit.f186387a;
    }
}
