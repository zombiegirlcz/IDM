package ccg;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.model.checkout.RevolutCardWithBalanceCheck;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment$Card;
import dec.o;
import dec.q;
import h93.f0;
import ia3.r;
import ip0.y10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f23102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.d f23103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mag.a f23104c;
    public final q d;

    public g(r cardsMapper, m93.d cardThumbnailImageProvider, mag.a travelHotelsCardMapper, q paymentMethodsCommonMapper) {
        Intrinsics.checkNotNullParameter(cardsMapper, "cardsMapper");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        Intrinsics.checkNotNullParameter(travelHotelsCardMapper, "travelHotelsCardMapper");
        Intrinsics.checkNotNullParameter(paymentMethodsCommonMapper, "paymentMethodsCommonMapper");
        this.f23102a = cardsMapper;
        this.f23103b = cardThumbnailImageProvider;
        this.f23104c = travelHotelsCardMapper;
        this.d = paymentMethodsCommonMapper;
    }

    public static ListSubheaderDelegate.Model b(PropertyPayment$Card propertyPayment$Card) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_checkout_cards_section_title, null, null, 14);
        List list = propertyPayment$Card.f93916b;
        return new ListSubheaderDelegate.Model("RESERVE_WITH_CARD_SUBHEADER_ITEM_ID", (Image) null, (Clause) textLocalisedClause, (ResourceImage) null, false, false, (Clause) (list.size() > 1 ? new TextLocalisedClause(R$string.hotels_checkout_pay_with_action, null, null, 14) : null), list.size() > 1, (Object) propertyPayment$Card, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
    }

    public final List a(Data propertyPayment, cgi.e ratesType) {
        List listR;
        ArrayList arrayList;
        ListSubheaderDelegate.Model modelB;
        Object next;
        Intrinsics.checkNotNullParameter(propertyPayment, "propertyPayment");
        Intrinsics.checkNotNullParameter(ratesType, "ratesType");
        ecg.j jVar = (ecg.j) propertyPayment.getContent();
        if (jVar != null) {
            if (jVar instanceof ecg.g) {
                ecg.g gVar = (ecg.g) jVar;
                o oVar = gVar.f124733b ? o.DEFAULT : o.INSUFFICIENT_FUNDS;
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("BALANCE_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.hotels_checkout_pay_with_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                RowDelegate.Model modelC = q.c(this.d, gVar.f124732a, true, oVar, false, 24);
                yp0.b.l(modelC, 0, 0, 0, 0, null, false, 63);
                listR = v.k(model, modelC);
            } else if (jVar instanceof PropertyPayment$Card) {
                PropertyPayment$Card propertyPayment$Card = (PropertyPayment$Card) jVar;
                List list = propertyPayment$Card.f93916b;
                if (list.isEmpty()) {
                    ListSubheaderDelegate.Model modelB2 = b(propertyPayment$Card);
                    sa saVar = new sa("NO_SUPPORTED_CARDS_ITEM_ID", (Clause) new TextLocalisedClause(R$string.hotels_checkout_cards_section_no_cards_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.hotels_checkout_cards_section_no_cards_message, null, null, 14), u.c(new ActionsView.Item("ORDER_CARD_ITEM_ID", null, false, null, null, new TextLocalisedClause(R$string.hotels_checkout_cards_section_no_cards_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32670)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
                    yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
                    listR = i2b.a.r(modelB2, saVar);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int i = f.f23101a[ratesType.ordinal()];
                    if (i == 1) {
                        arrayList = arrayList2;
                        modelB = b(propertyPayment$Card);
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList = arrayList2;
                        modelB = new ListSubheaderDelegate.Model("RESERVE_WITH_CARD_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.hotels_checkout_pay_with_title, null, null, 14), (ResourceImage) null, false, false, (Clause) (list.size() > 1 ? new TextLocalisedClause(R$string.hotels_checkout_pay_with_action, null, null, 14) : null), list.size() > 1, (Object) propertyPayment$Card, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
                    }
                    arrayList.add(modelB);
                    RevolutCardWithBalanceCheck revolutCardWithBalanceCheck = propertyPayment$Card.f93915a;
                    if (revolutCardWithBalanceCheck != null) {
                        f0 f0Var = revolutCardWithBalanceCheck.f93666a;
                        yt8.i iVar = propertyPayment$Card.f93917c;
                        Iterator it8 = propertyPayment$Card.d.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it8.next();
                            if (Intrinsics.f(com.revolut.feature.checkout.models.a.c((CheckoutOrder) next), f0Var.f150110a)) {
                                break;
                            }
                        }
                        r rVar = this.f23102a;
                        RowDelegate.Model model2 = new RowDelegate.Model(f0Var.f150110a, ((ia3.h) this.f23103b).c(f0Var), null, null, m93.f.b(rVar, f0Var, null, null, 14), this.f23104c.a(f0Var), null, null, 0, null, false, false, rVar.j(f0Var, iVar, (CheckoutOrder) next), null, null, null, null, revolutCardWithBalanceCheck.f93666a, null, 0, 0, 0, 0, 1056935788);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        arrayList.add(model2);
                    }
                    listR = arrayList;
                }
            } else {
                if (!(jVar instanceof ecg.h) && !(jVar instanceof ecg.f) && !(jVar instanceof ecg.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                listR = zhm.f0.f322471a;
            }
            if (listR != null) {
                return listR;
            }
        }
        return zhm.f0.f322471a;
    }
}
