package it4;

import al4.f;
import al4.g;
import al4.h;
import al4.i;
import al4.j;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import d9.t0;
import dx4.d1;
import dx4.j1;
import ft3.q0;
import grl.r2;
import is6.t;
import it3.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ll4.c;
import org.bouncycastle.asn1.BERTags;
import wp3.d;
import wp3.e;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f168339b;

    public /* synthetic */ a(b bVar, int i) {
        this.f168338a = i;
        this.f168339b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterator it8;
        k kVar;
        TextLocalisedClause textLocalisedClause;
        RawImageBadge rawImageBadge;
        switch (this.f168338a) {
            case 0:
                i availability = (i) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                if (!(availability instanceof f)) {
                    if ((availability instanceof g) || (availability instanceof h)) {
                        return f0.f322471a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                List<e> list = ((f) availability).f6141a;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (e eVar : list) {
                    Image imageA = this.f168339b.d.a(eVar.f);
                    j1 j1Var = eVar.f299022g;
                    CircleBadgeModel circleBadgeModelP = j1Var != null ? t0.p(j1Var) : null;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_entry_points_cards_widget_title, u.c(eVar.f299019a), null, 12);
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_entry_points_cards_widget_subtitle, u.c(eVar.f299020b), null, 12);
                    AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                    CreditApplicationCommonContext creditApplicationCommonContextC = zr3.b.c(r2.CARDS_WIDGET, eVar.f299021c, eVar.d);
                    companion.getClass();
                    arrayList.add(new em4.a(imageA, circleBadgeModelP, textLocalisedClause2, textLocalisedClause3, AnalyticsContext.Companion.a(creditApplicationCommonContextC), (TextLocalisedClause) null, (q0) null, BERTags.FLAGS));
                }
                return arrayList;
            case 1:
                i entryPointAvailability = (i) obj2;
                Intrinsics.checkNotNullParameter(entryPointAvailability, "entryPointAvailability");
                boolean z = entryPointAvailability instanceof f;
                b bVar = this.f168339b;
                if (!z) {
                    if ((entryPointAvailability instanceof g) || Intrinsics.f(entryPointAvailability, h.f6143a)) {
                        return nim.a.v(j.b(bVar.f168342c, c.CARDS_LIST), new a(bVar, 2));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                List list2 = ((f) entryPointAvailability).f6141a;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    e eVar2 = (e) it9.next();
                    mx4.u uVar = bVar.d;
                    d1 d1Var = eVar2.f;
                    gt3.f fVar = eVar2.d;
                    ft3.j1 j1Var2 = eVar2.f299021c;
                    Image imageA2 = uVar.a(d1Var);
                    j1 j1Var3 = eVar2.f299022g;
                    CircleBadgeModel circleBadgeModelP2 = j1Var3 != null ? t0.p(j1Var3) : null;
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_entry_points_cards_list_title, u.c(eVar2.f299019a), null, 12);
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_application_entry_points_cards_list_subtitle, u.c(eVar2.f299020b), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
                    AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                    CreditApplicationCommonContext creditApplicationCommonContextC2 = zr3.b.c(r2.CARDS_LIST, j1Var2, fVar);
                    companion2.getClass();
                    w0 w0VarA = AnalyticsContext.Companion.a(creditApplicationCommonContextC2);
                    String str = eVar2.f299023h;
                    if (str != null) {
                        it8 = it9;
                        kVar = null;
                        textLocalisedClause = new TextLocalisedClause(R$string.credit_application_entry_points_cards_list_button, u.c(str), null, 12);
                    } else {
                        it8 = it9;
                        kVar = null;
                        textLocalisedClause = null;
                    }
                    ArrayList arrayListA = pm4.b.a(eVar2.i);
                    ft3.e eVar3 = q0.Companion;
                    ft3.d1 d1Var2 = new ft3.d1(j1Var2, fVar, kVar);
                    String str2 = eVar2.f299024j;
                    eVar3.getClass();
                    arrayList2.add(new em4.a(imageA2, circleBadgeModelP2, textLocalisedClause4, textLocalisedClause5, w0VarA, textLocalisedClause, arrayListA, ft3.e.a(d1Var2, str2)));
                    it9 = it8;
                }
                return new go.g(new Data(arrayList2, null, false, 6, null), 2);
            case 2:
                List details = (List) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                List list3 = details;
                int i = 10;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    ll4.f fVar2 = (ll4.f) it10.next();
                    this.f168339b.getClass();
                    Image imageE = ll4.h.e(fVar2, R$drawable.uikit_icn_40_revolut_card_placeholder);
                    gt3.f fVar3 = fVar2.i;
                    ft3.j1 j1Var4 = fVar2.f196520h;
                    Integer numA = ll4.h.a(fVar2);
                    if (numA != null) {
                        int iIntValue = numA.intValue();
                        LayeredImage.Companion companion3 = LayeredImage.INSTANCE;
                        int iD = ll4.h.d(fVar2);
                        int i2 = R$attr.uikit_colorPopoverBackground;
                        rawImageBadge = new RawImageBadge(companion3.d(iIntValue, iD, i2, Integer.valueOf(i2), 2.0f, 2.0f, Float.valueOf(8.0f)));
                    } else {
                        rawImageBadge = null;
                    }
                    TextLocalisedClause textLocalisedClauseF = ll4.h.f(fVar2);
                    TextLocalisedClause textLocalisedClauseC = ll4.h.c(fVar2);
                    AnalyticsContext.Companion companion4 = AnalyticsContext.INSTANCE;
                    CreditApplicationCommonContext creditApplicationCommonContextC3 = zr3.b.c(r2.CARDS_LIST, j1Var4, fVar3);
                    companion4.getClass();
                    w0 w0VarA2 = AnalyticsContext.Companion.a(creditApplicationCommonContextC3);
                    TextLocalisedClause textLocalisedClauseB = ll4.h.b(fVar2);
                    List<ll4.e> list4 = fVar2.f;
                    ArrayList arrayList4 = new ArrayList(w.t(list4, i));
                    for (ll4.e eVar4 : list4) {
                        arrayList4.add(new d(eVar4.f196514a, eVar4.f196515b, wp3.c.PURPLE));
                        it10 = it10;
                        imageE = imageE;
                    }
                    Iterator it11 = it10;
                    Image image = imageE;
                    ArrayList arrayListA2 = pm4.b.a(arrayList4);
                    ft3.e eVar5 = q0.Companion;
                    ft3.d1 d1Var3 = new ft3.d1(j1Var4, fVar3, null);
                    String str3 = fVar2.f196521j;
                    eVar5.getClass();
                    arrayList3.add(new em4.a(image, rawImageBadge, textLocalisedClauseF, textLocalisedClauseC, w0VarA2, textLocalisedClauseB, arrayListA2, ft3.e.a(d1Var3, str3)));
                    it10 = it11;
                    i = 10;
                }
                return arrayList3;
            case 3:
                b bVar2 = this.f168339b;
                j jVar = bVar2.f168342c;
                i availability2 = (i) obj2;
                Intrinsics.checkNotNullParameter(availability2, "availability");
                if (!(availability2 instanceof f)) {
                    if (availability2 instanceof g) {
                        return nim.a.v(j.b(jVar, c.CARD_ORDERING), new t(bVar2, availability2, 9));
                    }
                    if (Intrinsics.f(availability2, h.f6143a)) {
                        return nim.a.v(j.b(jVar, c.CARD_ORDERING), new a(bVar2, 4));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                List<e> list5 = ((f) availability2).f6141a;
                ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
                for (e eVar6 : list5) {
                    mx4.u uVar2 = bVar2.d;
                    d1 d1Var4 = eVar6.f;
                    gt3.f fVar4 = eVar6.d;
                    ft3.j1 j1Var5 = eVar6.f299021c;
                    Image imageA3 = uVar2.a(d1Var4);
                    j1 j1Var6 = eVar6.f299022g;
                    CircleBadgeModel circleBadgeModelP3 = j1Var6 != null ? t0.p(j1Var6) : null;
                    TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.credit_application_entry_points_card_ordering_title, u.c(eVar6.f299019a), null, 12);
                    TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.credit_application_entry_points_card_ordering_subtitle, u.c(eVar6.f299020b), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
                    AnalyticsContext.Companion companion5 = AnalyticsContext.INSTANCE;
                    CreditApplicationCommonContext creditApplicationCommonContextC4 = zr3.b.c(r2.CARD_ORDERING, j1Var5, fVar4);
                    companion5.getClass();
                    w0 w0VarA3 = AnalyticsContext.Companion.a(creditApplicationCommonContextC4);
                    String str4 = eVar6.f299023h;
                    TextClause textClause = str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    ArrayList arrayListA3 = pm4.b.a(eVar6.i);
                    ft3.e eVar7 = q0.Companion;
                    ft3.d1 d1Var5 = new ft3.d1(j1Var5, fVar4, null);
                    String str5 = eVar6.f299024j;
                    eVar7.getClass();
                    arrayList5.add(new em4.a(imageA3, circleBadgeModelP3, textLocalisedClause6, textLocalisedClause7, w0VarA3, textClause, arrayListA3, ft3.e.a(d1Var5, str5)));
                }
                return new go.g(new Data(arrayList5, null, false, 6, null), 2);
            default:
                List details2 = (List) obj2;
                Intrinsics.checkNotNullParameter(details2, "details");
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : details2) {
                    if (((ll4.f) obj3).f196520h == ft3.j1.FAMILY_CREDIT_CARD) {
                        arrayList6.add(obj3);
                    }
                }
                ArrayList arrayList7 = new ArrayList(w.t(arrayList6, 10));
                Iterator it12 = arrayList6.iterator();
                while (it12.hasNext()) {
                    arrayList7.add(this.f168339b.a((ll4.f) it12.next()));
                }
                return arrayList7;
        }
    }
}
