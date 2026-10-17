package ed7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.ke;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.home_feed.api.R$string;
import com.revolut.feature.home_feed.impl.widgets.trendingrewards.BrandCarouselItemParcel;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$ShopsHomeScreenWidgetRedesign;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import efm.r;
import j19.k0;
import j19.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import jkc.e;
import k19.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import m9d.y0;
import org.jmrtd.cbeff.ISO781611;
import skm.p0;
import te0.w;
import z9h.n;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f124924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f124925c;

    public /* synthetic */ d(j jVar, String str, int i) {
        this.f124923a = i;
        this.f124924b = jVar;
        this.f124925c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.revolut.core.ui_kit.models.Style, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.lang.Throwable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object model;
        TagViewData tagViewDataC;
        f19.b bVar;
        int i = this.f124923a;
        int i2 = 14;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        int i3 = 3;
        String listId = this.f124925c;
        j jVar = this.f124924b;
        switch (i) {
            case 0:
                c availability = (c) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                int i5 = g.f124928a[availability.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r rVarError = r.error(new WidgetNotAvailableException(null, 3));
                    Intrinsics.checkNotNullExpressionValue(rVarError, "error(...)");
                    return rVarError;
                }
                if (((jte.d) jVar.f).c(ShopsApi$Toggles$ShopsHomeScreenWidgetRedesign.f86998c)) {
                    r rVarSwitchMap = m70.a.g(rd0.e.c(jVar.f124933g.a(f19.h.HOME_SCREEN_WIDGET, hVar), kotlin.coroutines.g.f186406a), null, new e6e.a(25), 1).switchMap(new e8h.c(27, new d(jVar, listId, 1)));
                    Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                    return ue0.e.H(rVarSwitchMap, h0.f322473a, new d(jVar, listId, 2));
                }
                r rVarQ = jVar.e.q();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                r rVarSwitchMap2 = m70.a.g(w.y(rVarQ, 300L), null, new e6e.a(26), 1).map(new e(new ebi.i(19), 1)).switchMap(new e(new d(jVar, listId, 4), 2));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
                return ue0.e.H(rVarSwitchMap2, h0.f322473a, new d(jVar, listId, 5));
            case 1:
                gc7.h hVar2 = jVar.f124932c;
                f19.g placement = (f19.g) obj2;
                Intrinsics.checkNotNullParameter(placement, "placement");
                List list = placement.f131192b;
                ArrayList slots = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof l0) {
                        slots.add(obj3);
                    }
                }
                boolean zIsEmpty = slots.isEmpty();
                String listId2 = this.f124925c;
                if (zIsEmpty) {
                    WidgetNotAvailableException widgetNotAvailableException = new WidgetNotAvailableException(null, 3);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, widgetNotAvailableException, h0Var);
                    model = hVar2.a(listId2);
                } else {
                    String placementId = placement.f131191a;
                    Intrinsics.checkNotNullParameter(placementId, "placementId");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    ArrayList arrayList = new ArrayList(zhm.w.t(slots, 10));
                    int i6 = 0;
                    for (Object obj4 : slots) {
                        int i21 = i6 + 1;
                        if (i6 < 0) {
                            ?? r272 = continuation;
                            v.s();
                            throw r272;
                        }
                        l0 l0Var = (l0) obj4;
                        k0 k0Var = l0Var.f;
                        if (k0Var == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        Continuation continuation2 = continuation;
                        String strT = v1.c.t(i6, "BRAND_GRID_CAROUSEL_ITEM_ID_", l0Var.f170222a, "_");
                        String str = k0Var.f170215a;
                        String str2 = k0Var.f170216b;
                        String str3 = k0Var.f170217c.f180147a;
                        String str4 = l0Var.f170224c;
                        String str5 = str4 == null ? placementId : str4;
                        String str6 = k0Var.d;
                        q qVar = k0Var.e;
                        String str7 = qVar.f180163a;
                        String str8 = qVar.f180164b;
                        int i22 = hom.b.f154353a[qVar.f180165c.ordinal()];
                        if (i22 == 1) {
                            bVar = f19.b.PLAIN;
                        } else {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = f19.b.GRADIENT_PURPLE;
                        }
                        arrayList.add(new f19.c(strT, str, str2, str3, str5, str6, new f19.a(str7, str8, bVar)));
                        i6 = i21;
                        continuation = continuation2;
                    }
                    ?? r273 = continuation;
                    if (arrayList.isEmpty()) {
                        WidgetNotAvailableException widgetNotAvailableException2 = new WidgetNotAvailableException(r273, 3);
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, r273, r273, widgetNotAvailableException2, h0Var2);
                        model = hVar2.a(listId2);
                    } else {
                        f19.d content = new f19.d(arrayList);
                        TextLocalisedClause title = new TextLocalisedClause(R$string.home_feed_shops_widget_top_brands_title, r273, r273, 14);
                        Intrinsics.checkNotNullParameter(content, "content");
                        Intrinsics.checkNotNullParameter(listId2, "listId");
                        Intrinsics.checkNotNullParameter(title, "title");
                        ContactsWidgetDelegate.Model.Companion companion = ContactsWidgetDelegate.Model.INSTANCE;
                        ArrayList items = new ArrayList(zhm.w.t(arrayList, 10));
                        int i32 = 0;
                        for (Object obj5 : arrayList) {
                            int i33 = i32 + 1;
                            if (i32 < 0) {
                                v.s();
                                throw null;
                            }
                            f19.c cVar = (f19.c) obj5;
                            String str9 = cVar.f131184a;
                            AvatarModel.Default r292 = new AvatarModel.Default(new UrlImage(cVar.f131186c, (String) null, (UrlImageDrawable) null, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), null, null, null, null, null, 126);
                            TextClause textClause = new TextClause(cVar.f131185b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            f19.a aVar = cVar.f131187g;
                            String str10 = aVar.f131181a;
                            int i43 = b.f124922a[aVar.f131183c.ordinal()];
                            if (i43 == 1) {
                                TagViewData.Companion companion2 = TagViewData.INSTANCE;
                                Integer numValueOf = d0.J(aVar.f131182b, "revpoints", true) ? Integer.valueOf(R$drawable.uikit_icn_24_revpoints) : null;
                                int i59 = R$attr.uikit_colorForeground_20;
                                int i66 = R$attr.uikit_colorForeground;
                                companion2.getClass();
                                tagViewDataC = TagViewData.Companion.c(str10, i59, i66, numValueOf);
                            } else {
                                if (i43 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tagViewDataC = TagViewData.Companion.f(TagViewData.INSTANCE, str10, 6);
                            }
                            items.add(new ReferralContactDelegate.Model(str9, r292, textClause, null, null, tagViewDataC, new BrandCarouselItemParcel(cVar.d, cVar.f131186c, cVar.e, cVar.f, i33), null, 5112));
                            i32 = i33;
                        }
                        companion.getClass();
                        Intrinsics.checkNotNullParameter(listId2, "listId");
                        Intrinsics.checkNotNullParameter(items, "items");
                        Intrinsics.checkNotNullParameter(title, "title");
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(items, 10));
                        Iterator it8 = items.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(ReferralContactDelegate.Model.e((ReferralContactDelegate.Model) it8.next(), null, null, null, ke.MATCH_PARENT, false, null, 7591));
                        }
                        model = new ContactsWidgetDelegate.Model(listId2, op0.q.MEDIUM, title, arrayList2, true, false, null, null, 256);
                    }
                }
                return r.just(model);
            case 2:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return jVar.f124932c.a(listId);
            case 3:
                List offers = (List) obj2;
                Intrinsics.checkNotNullParameter(offers, "data");
                gc7.h hVar3 = jVar.f124932c;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(offers, "offers");
                mkc.a aVar2 = hVar3.f142371a;
                List list2 = offers;
                ArrayList items2 = new ArrayList(zhm.w.t(list2, 10));
                int i74 = 0;
                for (Object obj6 : list2) {
                    int i92 = i74 + 1;
                    if (i74 < 0) {
                        v.s();
                        throw null;
                    }
                    ekc.d dVar = (ekc.d) obj6;
                    items2.add(new fkc.a(dVar, new dc7.a(i92, dVar.d, dVar.k, dVar)));
                    i74 = i92;
                }
                Intrinsics.checkNotNullParameter(items2, "items");
                ufm.i iVar = new ufm.i(w.o0(p0.f264003c, new y0(aVar2, continuation, 16)), new mhd.c(new jeg.i(i2, items2), 21), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                ufm.i iVar2 = new ufm.i(iVar, new g9j.v(new g58.h(listId, 3), 9), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 4:
                String planId = (String) obj2;
                Intrinsics.checkNotNullParameter(planId, "planId");
                gkc.b bVar2 = jVar.f124931b;
                Intrinsics.checkNotNullParameter(planId, "planId");
                jkc.h hVar4 = (jkc.h) bVar2.f144371a;
                hVar4.getClass();
                w4l.f fVar = hVar4.f;
                Intrinsics.checkNotNullParameter(planId, "planId");
                ue0.c cVar2 = hVar4.f175157b;
                String str11 = (String) j6.a.k(String.class, cVar2, "CACHE_KEY_TOP_OFFERS_PLAN");
                if (str11 == null || !str11.equals(planId)) {
                    n.l(String.class, cVar2, "CACHE_KEY_TOP_OFFERS_PLAN", planId);
                    fVar.h(e.a.f175153a);
                }
                int iIntValue = ((Number) bVar2.f144373c.getValue()).intValue();
                int i96 = 28;
                r map = fVar.e(new jkc.f(iIntValue), hVar).map(new jeg.h(new a5g.i(iIntValue, i96), 20));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                r map2 = map.map(new e8h.c(i96, new ebi.i(18)));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return m70.a.g(map2, null, null, 3).switchMapSingle(new e8h.c(29, new d(jVar, listId, i3)));
            default:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return jVar.f124932c.a(listId);
        }
    }
}
