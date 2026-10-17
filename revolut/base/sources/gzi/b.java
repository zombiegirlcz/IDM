package gzi;

import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.AccessPassWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressEmptyWidgetDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import do3.n;
import gim.i;
import grl.t9;
import java.util.List;
import kii.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import svi.j;
import svi.k;
import svi.l;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f148133w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f148133w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f148133w, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.core.ui_kit.delegates.widgets.c cVar;
        com.revolut.core.ui_kit.delegates.widgets.d dVar;
        com.revolut.core.ui_kit.delegates.widgets.d dVar2;
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) pair.f186385a;
        n nVar = (n) pair.f186386b;
        boolean zM = cp5.d.m(kVar);
        String str = this.f148133w;
        if (!zM) {
            w0 w0VarE = e.e(RevPointsGenericWidgetContext.newBuilder(), t9.EMPTY, AnalyticsContext.INSTANCE);
            return new GoalProgressEmptyWidgetDelegate.Model(str, new TextLocalisedClause(R$string.airport_lounges_widget_title, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_widget_empty_description, null, null, 14), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_lounges, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), new AnalyticsContext(w0VarE), new zn.b(str, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE)));
        }
        w0 w0VarE2 = e.e(RevPointsGenericWidgetContext.newBuilder(), t9.DATA, AnalyticsContext.INSTANCE);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.airport_lounges_widget_title, null, null, 14);
        TextClause textClause = new TextClause(w.I(nVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        AvatarModel.Default r102 = new AvatarModel.Default(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_qr, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorGreyTone10, 8.0f, Float.valueOf(24.0f), null, 32), null, null, null, null, null, 126);
        if (kVar instanceof k.a) {
            dVar2 = new com.revolut.core.ui_kit.delegates.widgets.d(new com.revolut.core.ui_kit.delegates.widgets.c(new NumberClause(0, (NumberClause.Format.Compact) null, (Custom) null, 6), new TextLocalisedClause(R$string.airport_lounges_widget_entries, null, null, 14)), null, 6);
        } else {
            if (!(kVar instanceof j)) {
                if (!(kVar instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i = ((l) kVar).f265936b;
                com.revolut.core.ui_kit.delegates.widgets.c cVar2 = new com.revolut.core.ui_kit.delegates.widgets.c(new TextLocalisedClause(R$string.airport_lounges_pass_details_your_entries_unlimited, null, null, 14), new TextLocalisedClause(R$string.airport_lounges_pass_details_your_entries_title, null, null, 14));
                if (i > 0) {
                    cVar = new com.revolut.core.ui_kit.delegates.widgets.c(new NumberClause(i, (NumberClause.Format.Compact) null, (Custom) null, 6), new TextLocalisedClause(R$string.airport_lounges_pass_details_guest_entries_title, null, null, 14));
                } else {
                    cVar = null;
                }
                dVar = new com.revolut.core.ui_kit.delegates.widgets.d(cVar2, cVar, 4);
                return new AccessPassWidgetDelegate.Model(str, textLocalisedClause, textClause, r102, dVar, new AnalyticsContext(w0VarE2), new zn.b(str, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE2)));
            }
            dVar2 = new com.revolut.core.ui_kit.delegates.widgets.d(new com.revolut.core.ui_kit.delegates.widgets.c(new NumberClause(((j) kVar).f265925b, (NumberClause.Format.Compact) null, (Custom) null, 6), new TextLocalisedClause(R$string.airport_lounges_widget_entries, null, null, 14)), null, 6);
        }
        dVar = dVar2;
        return new AccessPassWidgetDelegate.Model(str, textLocalisedClause, textClause, r102, dVar, new AnalyticsContext(w0VarE2), new zn.b(str, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarE2)));
    }
}
