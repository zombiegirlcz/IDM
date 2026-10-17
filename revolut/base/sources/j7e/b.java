package j7e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.retail.feature.actions.api.retail_accounts.ui.bills_widget.ManageBillsData;
import gim.i;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function3 {
    public /* synthetic */ List u;
    public /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f171904w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f171905x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f171906y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, String str2, int i, Continuation continuation) {
        super(3, continuation);
        this.f171904w = dVar;
        this.f171905x = str;
        this.f171906y = str2;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = this.f171906y;
        int i = this.z;
        b bVar = new b(this.f171904w, this.f171905x, str, i, (Continuation) obj4);
        bVar.u = (List) obj2;
        bVar.v = (q) obj3;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listC;
        List recurringPayments = this.u;
        q transactionsExtraData = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = this.f171904w.f171910c;
        Intrinsics.h(transactionsExtraData);
        String id10 = this.f171905x;
        Intrinsics.checkNotNullParameter(id10, "id");
        String subaccountId = this.f171906y;
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        if (recurringPayments.isEmpty()) {
            listC = u.c(new RowDelegate.Model("LIST_ID_ADD_RECURRING_PAYMENT", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.bills_widget_empty_title, null, null, 14), new TextLocalisedClause(R$string.bills_widget_empty_subtitle, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, false, null, null, null, null, null, new ManageBillsData(subaccountId, f0.f322471a), null, 0, 0, 0, 0, 1056958316));
        } else {
            ZonedDateTime zonedDateTimeK = ((l80.f) hVar.f171914a).k();
            List<p> list = recurringPayments;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (p pVar : list) {
                arrayList.add(a9e.a.b(hVar.f171915b, pVar, qua.u.h(pVar, zonedDateTimeK), true, transactionsExtraData));
            }
            listC = arrayList;
        }
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bills_widget_header_title, null, null, 14);
        boolean z = !recurringPayments.isEmpty();
        int i = this.z;
        return RowsWidgetDelegate.Model.Companion.a(companion, id10, textLocalisedClause, d0.V0(listC, i), z, listC.size() > i ? new n3(new TextLocalisedClause(R$string.bills_widget_action_see_all, null, null, 14), null) : null, 96);
    }
}
