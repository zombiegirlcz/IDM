package a35;

import a5e.m;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.e9;
import com.revolut.core.ui_kit.delegates.pe;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.youTransactor.uCube.rpc.Constants;
import f3e.h;
import ip0.co;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.v4;
import ip0.w4;
import ip0.za0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.v2;
import jel.w2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.ranges.IntRange;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1054a;

    public /* synthetic */ b(int i) {
        this.f1054a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        a5e.e eVar;
        List list;
        boolean z = false;
        z = false;
        Integer numValueOf = null;
        arrayList = null;
        arrayList = null;
        ArrayList arrayList = null;
        switch (this.f1054a) {
            case 0:
                List models = (List) obj2;
                Intrinsics.checkNotNullParameter(models, "models");
                em4.a aVar = (em4.a) d0.d0(models);
                if (aVar == null) {
                    return null;
                }
                TextLocalisedClause textLocalisedClause = aVar.f127604c;
                Clause clause = aVar.d;
                if (clause == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Clause clause2 = aVar.f;
                if (clause2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Image image = aVar.f127602a;
                ResourceImage resourceImage = image instanceof ResourceImage ? (ResourceImage) image : null;
                if (resourceImage != null) {
                    numValueOf = Integer.valueOf(resourceImage.f59995a);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("CreditCardEntryPointUiModel: expected ResourceImage but got ", o0.f186429a.b(image.getClass()).m()));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return new qf1.m(textLocalisedClause, clause, clause2, numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_credit_card, aVar.f127603b, new qf1.a(new CdnImage("credit", "mobile/cross_sell/products_for_you", null, null, null, null, Constants.TAG_FC_SPEED_MODE)), null, SyslogConstants.LOG_LOCAL2);
            case 1:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new x15.q((List) pair.f186385a, (List) pair.f186386b);
            case 3:
                x15.p it8 = (x15.p) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it8);
            case 4:
                List products = (List) obj2;
                Intrinsics.checkNotNullParameter(products, "products");
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = products.iterator();
                while (it9.hasNext()) {
                    x15.p pVar = (x15.p) ((od0.i) it9.next()).g();
                    if (pVar != null) {
                        arrayList2.add(pVar);
                    }
                }
                return arrayList2;
            case 5:
                List availabilityList = (List) obj2;
                Intrinsics.checkNotNullParameter(availabilityList, "availabilityList");
                List list2 = availabilityList;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it10 = list2.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            if (((Boolean) ((Pair) it10.next()).f186386b).booleanValue()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                cs3.b it11 = (cs3.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f.f108445a;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                v4 v4Var = new v4("STORE_DEALS_LOADING_HERO", w4.SQUARE, 60);
                yp0.b.l(v4Var, 0, 0, 0, 0, null, false, 63);
                gu guVar = new gu("STORE_DEALS_LOADING_BRANDS_SUBHEADER", 0, 0, 30);
                ArrayList arrayList3 = new ArrayList(6);
                for (int i = 0; i < 6; i++) {
                    arrayList3.add(new pe(a0.d.n("STORE_DEALS_LOADING_BRANDS_GRID_ITEM_", i)));
                }
                za0 za0Var = new za0("STORE_DEALS_LOADING_BRANDS_GRID", arrayList3);
                yp0.b.l(za0Var, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
                MapPlainLoadingDelegate.INSTANCE.getClass();
                return v.k(v4Var, guVar, za0Var, new e9("STORE_DEALS_LOADING_NEARBY_MAP", MapPlainLoadingDelegate.d, false, null, 506));
            case 8:
                return a3e.c.a((a3e.c) obj2, null, h.a.f131970a, null, 5);
            case 9:
                String it12 = (String) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return "\"" + it12 + "\"";
            case 10:
                Integer num = (Integer) obj2;
                if (num != null && num.intValue() == 3) {
                    return "3";
                }
                if (num != null && num.intValue() == 4) {
                    return "EXTERNAL";
                }
                if (num != null && num.intValue() == 1) {
                    return "FULL";
                }
                if (num != null && num.intValue() == 2) {
                    return "LEGACY";
                }
                if (num != null && num.intValue() == 0) {
                    return "LIMITED";
                }
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CameraRidge", "Unexpected hardware level " + num, null, h0Var2);
                return null;
            case 11:
                int[] iArr = (int[]) obj2;
                if (iArr == null) {
                    return null;
                }
                ArrayList arrayList4 = new ArrayList(iArr.length);
                for (int i2 : iArr) {
                    if (i2 == 0) {
                        str = "OFF";
                    } else if (i2 == 1) {
                        str = "SIMPLE";
                    } else if (i2 != 2) {
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "CameraRidge", a0.d.n("Unexpected face detection mode ", i2), null, h0Var3);
                        str = null;
                    } else {
                        str = "FULL";
                    }
                    arrayList4.add(str);
                }
                return d0.k0(d0.Z(arrayList4), ",", "[", "]", 0, new b(15), 24);
            case 12:
                Integer num2 = (Integer) obj2;
                if (num2 != null && num2.intValue() == 1) {
                    return "BACK";
                }
                if (num2 != null && num2.intValue() == 0) {
                    return "FRONT";
                }
                if (num2 != null && num2.intValue() == 2) {
                    return "EXTERNAL";
                }
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CameraRidge", "Unexpected lense facing " + num2, null, h0Var4);
                return null;
            case 13:
                Integer num3 = (Integer) obj2;
                if (num3 != null && num3.intValue() == 1) {
                    return "REALTIME";
                }
                if (num3 != null && num3.intValue() == 0) {
                    return "UNKNOWN";
                }
                h0 h0Var5 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CameraRidge", "Unexpected sensor timestamp source " + num3, null, h0Var5);
                return null;
            case 14:
                float[] fArr = (float[]) obj2;
                if (fArr == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                Intrinsics.checkNotNullParameter(",", "separator");
                Intrinsics.checkNotNullParameter("[", "prefix");
                Intrinsics.checkNotNullParameter("]", "postfix");
                Intrinsics.checkNotNullParameter("...", "truncated");
                StringBuilder buffer = new StringBuilder();
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                Intrinsics.checkNotNullParameter(",", "separator");
                Intrinsics.checkNotNullParameter("[", "prefix");
                Intrinsics.checkNotNullParameter("]", "postfix");
                Intrinsics.checkNotNullParameter("...", "truncated");
                buffer.append((CharSequence) "[");
                int i3 = 0;
                for (float f : fArr) {
                    i3++;
                    if (i3 > 1) {
                        buffer.append((CharSequence) ",");
                    }
                    buffer.append((CharSequence) String.valueOf(f));
                }
                buffer.append((CharSequence) "]");
                return buffer.toString();
            case 15:
                String it13 = (String) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return "\"" + it13 + "\"";
            case 16:
                String it14 = (String) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return "\"" + it14 + "\"";
            case 17:
                return String.valueOf(((Float) obj2).floatValue());
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return h0.f322473a;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return a4b.p.f1249a;
            case 20:
                RowDelegate.Model it15 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj3 = it15.u;
                if (obj3 instanceof v2h.d) {
                    return (v2h.d) obj3;
                }
                return null;
            case 21:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 0, 2, 1);
                ArrayList arrayList5 = new ArrayList(w.t(intRangeU, 10));
                vim.f it16 = intRangeU.iterator();
                while (it16.f289625c) {
                    arrayList5.add(nb0.b(pb0.Companion, a0.d.n("LIST_ID_DOCUMENTS_WIDGET_ITEM_LOADING", it16.nextInt()), false, 0, false, 28));
                }
                return yp0.b.h(arrayList5, new gu("LIST_ID_DOCUMENTS_WIDGET_HEADER_LOADING", 0, 0, 30), null, 0, 126);
            case 22:
                wel.e it17 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(i2b.a.m(it17));
            case 23:
                Pair it18 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Optional.of(it18);
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new co("homeScreenPreviewLoadingDelegate"));
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 26:
                a5e.f it19 = (a5e.f) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Data data = it19.f1366a;
                if (data != null && (eVar = (a5e.e) data.getContent()) != null && (list = eVar.f1363a) != null) {
                    List list3 = list;
                    arrayList = new ArrayList(w.t(list3, 10));
                    Iterator it20 = list3.iterator();
                    while (it20.hasNext()) {
                        arrayList.add(((v2) it20.next()).f173579a);
                    }
                }
                return arrayList == null ? f0.f322471a : arrayList;
            case 27:
                List data2 = (List) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                List list4 = data2;
                int iB = q0.b(w.t(list4, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list4) {
                    linkedHashMap.put(((InstrumentTicker) obj4).f105112b, obj4);
                }
                return linkedHashMap;
            case 28:
                jel.c it21 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                if (it21 instanceof w2) {
                    return (w2) it21;
                }
                return null;
            default:
                m.a aVar2 = a5e.m.Companion;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f1054a = i;
    }
}
