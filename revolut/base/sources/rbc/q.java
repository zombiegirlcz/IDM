package rbc;

import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.o9;
import aw0.t0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryAddress;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCheckpoint;
import ip0.b50;
import ip0.c50;
import ip0.f50;
import ip0.h50;
import ip0.j50;
import ip0.zj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import tsk.t;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbc.c f253021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbc.b f253022b;

    public q(tbc.c sectionMapper, tbc.b itemMapper, kbc.b deliveryMapper) {
        Intrinsics.checkNotNullParameter(sectionMapper, "sectionMapper");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(deliveryMapper, "deliveryMapper");
        this.f253021a = sectionMapper;
        this.f253022b = deliveryMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r29v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v29 */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g gVar;
        List list;
        DeliveryAddress deliveryAddress;
        int i;
        ?? r4;
        Image layeredImage;
        ?? model;
        Delivery delivery;
        List listC;
        Clause textLocalisedClause;
        MeasureUnit MILLIGRAM;
        String country;
        String city;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Delivery delivery2 = domainState.f253011a;
        aim.e eVarB = u.b();
        Intrinsics.checkNotNullParameter(delivery2, "trackingInfo");
        DeliveryCarrier deliveryCarrier = delivery2.e;
        List list2 = delivery2.f84648n;
        DeliveryAddress deliveryAddress2 = delivery2.d;
        String str = deliveryCarrier.f84656c;
        if (str != null) {
            gVar = domainState;
            deliveryAddress = deliveryAddress2;
            i = 14;
            list = list2;
            r4 = 0;
            layeredImage = new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), 40, 40, false, false, 409598);
        } else {
            gVar = domainState;
            list = list2;
            deliveryAddress = deliveryAddress2;
            i = 14;
            r4 = 0;
            layeredImage = new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(R$attr.uikit_colorForeground_10), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_delivery_car, Integer.valueOf(R$attr.uikit_colorForeground), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14);
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(layeredImage, null, null, false, null, false, 30);
        TextClause textClause = new TextClause(delivery2.e.f84655b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(delivery2.f84641b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        yy0.i iVar = yy0.l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_link_external_simple, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        iVar.getClass();
        RowDelegate.Model model2 = new RowDelegate.Model("TRACKING_DELIVERY_COMPANY_LIST_ID", image40, textClause, null, 0, textClause2, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        tbc.b bVar = this.f253021a.f269518a;
        Intrinsics.checkNotNullParameter(delivery2, "delivery");
        ?? B = u.b();
        String trackingNumber = delivery2.f84641b;
        Intrinsics.checkNotNullParameter(trackingNumber, "trackingNumber");
        B.add(new CellDetailsActionDelegate.Model("TRACKING_NUMBER_LIST_ID", new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_tracking, r4, r4, i), 0, new ResourceImage(R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(trackingNumber, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, null, new f(trackingNumber), 0, 0, 32224));
        DeliveryAddress deliveryAddress3 = deliveryAddress;
        if (deliveryAddress3 == null || (country = deliveryAddress3.f84652b) == null || (city = deliveryAddress3.f84651a) == null) {
            model = r4;
        } else {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(city, "city");
            model = new CellDetailsDelegate.Model("TRACKING_DELIVERY_ADDRESS_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_destination, r4, r4, i), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_destination_value, v.k(country, city), r4, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        if (model != 0) {
            B.add(model);
        }
        Delivery.Weight weight = delivery2.f;
        if (weight != null) {
            Intrinsics.checkNotNullParameter(weight, "weight");
            t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_weight, r4, r4, i), (Image) null, 0, false, 30);
            t tVar = bVar.f269517a;
            delivery = delivery2;
            Double value = Double.valueOf(weight.f84649a);
            wbc.n unit = weight.f84650b;
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unit, "unit");
            MeasureFormat measureFormat = (MeasureFormat) tVar.f274170b;
            switch (ubc.a.f278814a[unit.ordinal()]) {
                case 1:
                    MILLIGRAM = MeasureUnit.MILLIGRAM;
                    Intrinsics.checkNotNullExpressionValue(MILLIGRAM, "MILLIGRAM");
                    break;
                case 2:
                    MILLIGRAM = MeasureUnit.GRAM;
                    Intrinsics.checkNotNullExpressionValue(MILLIGRAM, "GRAM");
                    break;
                case 3:
                    MILLIGRAM = MeasureUnit.KILOGRAM;
                    Intrinsics.checkNotNullExpressionValue(MILLIGRAM, "KILOGRAM");
                    break;
                case 4:
                    MILLIGRAM = MeasureUnit.OUNCE;
                    Intrinsics.checkNotNullExpressionValue(MILLIGRAM, "OUNCE");
                    break;
                case 5:
                    MILLIGRAM = MeasureUnit.POUND;
                    Intrinsics.checkNotNullExpressionValue(MILLIGRAM, "POUND");
                    break;
                case 6:
                    MILLIGRAM = MeasureUnit.STONE;
                    Intrinsics.checkNotNullExpressionValue(MILLIGRAM, "STONE");
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String measures = measureFormat.formatMeasures(new Measure(value, MILLIGRAM));
            Intrinsics.checkNotNullExpressionValue(measures, "formatMeasures(...)");
            B.add(new CellDetailsDelegate.Model("TRACKING_WEIGHT_LIST_ID", t0Var, new TextClause(measures, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
        } else {
            delivery = delivery2;
        }
        if (delivery.f84647m) {
            B.add(new CellDetailsDelegate.Model("ORDER_ADDED_MANUALLY_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_order, r4, r4, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_added_manually, r4, r4, 14), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        aim.e eVarA = u.a(B);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        eVarB.add(new ListSubheaderDelegate.Model("ACTIVITY_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_activity, r4, r4, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338));
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        if (list.isEmpty()) {
            ?? r292 = r4;
            FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("SHIPPING_TRACKING_ADD_TRACKING_ID", new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_empty_title, r292, r292, 14), new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_empty_subtitle, r292, r292, 14), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_delivery_car, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.CenterInside, null, 52, 52, 23), (Clause) null, 190)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model3);
        } else {
            aim.e eVarB2 = u.b();
            ?? rawAddress = deliveryAddress3 != null ? deliveryAddress3.f84653c : r4;
            int i2 = (delivery.f84643g.a() || rawAddress == 0) ? 0 : 1;
            if (i2 != 0) {
                Intrinsics.checkNotNullParameter(rawAddress, "rawAddress");
                eVarB2.add(new ProgressStepVerticalV2Delegate.Model("TRACKING_CHECKPOINT_DELIVERY_TO_LIST_ID", new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_delivery_to, r4, r4, 14), new TextClause((String) rawAddress, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new h50(j50.PENDING, c50.FIRST), false, null, R$attr.uikit_dp8, R$attr.uikit_dp4, 0, null, false, false, 32368));
            }
            int size = list.size() + i2;
            int i3 = size - 1;
            List list3 = list;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            int i5 = 0;
            ?? r42 = r4;
            for (Object obj2 : list3) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    ?? r293 = r42;
                    v.s();
                    throw r293;
                }
                DeliveryCheckpoint checkpoint = (DeliveryCheckpoint) obj2;
                int i21 = i5 + i2;
                Intrinsics.checkNotNullParameter(checkpoint, "checkpoint");
                c50.Companion.getClass();
                c50 c50VarA = b50.a(i21, size);
                ?? r294 = r42;
                int i22 = size;
                arrayList.add(new ProgressStepVerticalV2Delegate.Model(a0.d.n("TRACKING_CHECKPOINT_LIST_ID_", i21), new TimeClause(oi0.d.R(checkpoint.f84657a), new TimeClause.Format.Pretty(0), null, null, 12), new TextClause(checkpoint.f84658b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i21 == i3 ? new f50(j50.NORMAL, c50VarA, false) : new h50(j50.PENDING, c50VarA), false, null, i21 == 0 ? R$attr.uikit_dp8 : R$attr.uikit_dp4, i21 == i3 ? R$attr.uikit_dp8 : R$attr.uikit_dp4, 0, null, false, false, 32368));
                i5 = i6;
                size = i22;
                r42 = r294;
            }
            eVarB2.addAll(arrayList);
            listC = u.a(eVarB2);
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        }
        eVarB.addAll(listC);
        aim.e eVarA2 = u.a(eVarB);
        Delivery delivery3 = gVar.f253011a;
        LocalDate localDateL = c6d.b.l(delivery3);
        wbc.c cVar = delivery3.f84643g;
        if (localDateL == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_shipping_tracking_subtitle_waiting_for_updates, null, null, 14);
        } else if (cVar.a()) {
            com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
            LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT);
            jVar2.getClass();
            textLocalisedClause = com.revolut.core.ui_kit.models.j.a(localDateL, dayAndMonth, null);
        } else {
            int i32 = R$string.revolut_pay_shipping_tracking_subtitle_estimated_delivery;
            com.revolut.core.ui_kit.models.j jVar3 = c7.Companion;
            LocalDateClause$DateFormat.DayAndMonth dayAndMonth2 = new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT);
            jVar3.getClass();
            textLocalisedClause = new TextLocalisedClause(i32, u.c(com.revolut.core.ui_kit.models.j.a(localDateL, dayAndMonth2, null)), null, 12);
        }
        return new p(new h(textLocalisedClause, this.f253022b.e(cVar), u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_TRACKING_THREE_DOTS", new ResourceImage(R$drawable.uikit_icn_24_more_dots, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124))), eVarA2);
    }
}
