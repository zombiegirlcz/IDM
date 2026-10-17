package m6g;

import android.os.Parcelable;
import aw0.c7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import ip0.kr;
import ip0.mr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import p6g.a0;
import p6g.c0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0e.w f203118a;

    public w(a0e.w fieldValidator, o6g.c listItemMapper) {
        Intrinsics.checkNotNullParameter(fieldValidator, "fieldValidator");
        Intrinsics.checkNotNullParameter(listItemMapper, "listItemMapper");
        this.f203118a = fieldValidator;
    }

    public final aim.e a(a0 a0Var, int i, boolean z, boolean z3) {
        TextClause textClause;
        Clause clauseB;
        ResourceImage resourceImage;
        boolean z4;
        mr mrVar;
        zp0.v vVar;
        u uVar;
        Clause textLocalisedClause;
        aim.e eVarB = zhm.u.b();
        if (z) {
            int i2 = v.f203117a[a0Var.f233267b.ordinal()];
            if (i2 == 1) {
                uVar = new u(R$string.travel_flights_passenger_details_section_title, null);
            } else if (i2 == 2) {
                uVar = new u(R$string.travel_flights_passenger_details_section_title_child, null);
            } else if (i2 == 3) {
                uVar = new u(R$string.travel_flights_passenger_details_section_title_child, Integer.valueOf(R$string.travel_flights_passenger_details_section_title_infant));
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected traveller type: " + a0Var.f233267b);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "TravelFlightsPassengersDetailsStateMapper", null, illegalArgumentException, h0Var);
                uVar = null;
            }
            if (uVar != null) {
                int i3 = uVar.f203115a;
                int i5 = i + 1;
                String strQ = j6.a.q("PASSENGER_SUBHEADER_ID_", a0Var.f233266a);
                int i6 = z3 ? R$attr.uikit_dp16 : R$attr.uikit_dp24;
                int i21 = R$attr.uikit_dp12;
                Integer num = uVar.f203116b;
                if (num != null) {
                    List listK = zhm.v.k(new TextLocalisedClause(i3, zhm.u.c(Integer.valueOf(i5)), null, 12), new TextLocalisedClause(num.intValue(), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
                    m70.a.t(t0.f186434a);
                    textLocalisedClause = new CompositeClause(listK, new TextClause(kotlin.text.a0.C(" ", 2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                } else {
                    textLocalisedClause = new TextLocalisedClause(i3, zhm.u.c(Integer.valueOf(i5)), null, 12);
                }
                eVarB.add(new ListSubheaderDelegate.Model(strQ, (Image) null, textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i6, i21, 0, 0, 53242));
            }
        }
        ArrayList<p6g.w> arrayList = a0Var.f233268c;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (p6g.w field : arrayList) {
            Intrinsics.checkNotNullParameter(field, "field");
            String strD = field.d();
            Clause clauseC = field.c();
            boolean z6 = field instanceof p6g.b;
            if (z6) {
                p6g.a aVar = ((p6g.b) field).d;
                clauseB = aVar != null ? new CountryClause(aVar.f233265a, null) : null;
            } else if (field instanceof p6g.n) {
                p6g.m mVar = ((p6g.n) field).d;
                if (mVar instanceof p6g.k) {
                    clauseB = com.revolut.core.ui_kit.models.j.b(c7.Companion, ((p6g.k) mVar).f233288a, LocalDateClause$DateFormat.DateEditable.f57802a);
                } else if (mVar instanceof p6g.l) {
                    textClause = new TextClause(((p6g.l) mVar).f233289a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    clauseB = textClause;
                } else if (mVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (field instanceof p6g.p) {
                p6g.o oVar = ((p6g.p) field).d;
                if (oVar != null) {
                    clauseB = oVar.f233294b;
                }
            } else {
                if (!(field instanceof p6g.v)) {
                    throw new NoWhenBranchMatchedException();
                }
                p6g.u uVar2 = ((p6g.v) field).d;
                if (uVar2 != null) {
                    textClause = new TextClause(uVar2.f233303a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    clauseB = textClause;
                }
            }
            if (z6 || (field instanceof p6g.p)) {
                resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246);
            } else {
                if (!(field instanceof p6g.v) && !(field instanceof p6g.n)) {
                    throw new NoWhenBranchMatchedException();
                }
                resourceImage = null;
            }
            boolean z11 = field instanceof p6g.v;
            if (z11 || (field instanceof p6g.n)) {
                z4 = true;
            } else {
                if (!z6 && !(field instanceof p6g.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                z4 = false;
            }
            if (z11) {
                mrVar = ((p6g.v) field).f233307g;
            } else {
                if (!z6 && !(field instanceof p6g.n) && !(field instanceof p6g.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                mrVar = kr.f165065a;
            }
            mr mrVar2 = mrVar;
            if (field instanceof p6g.n) {
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                vVar = new zp0.v(null);
            } else {
                if (!z6 && !(field instanceof p6g.p) && !z11) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar = null;
            }
            InputTextDelegate.Model model = new InputTextDelegate.Model(strD, clauseB, clauseC, null, false, null, false, field.b(), null, null, null, resourceImage, null, false, null, null, field.b() != null, false, false, false, mrVar2, 0, null, null, z4, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, vVar, null, null, 0, 0, 0, 0, -35786888, 65023);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
        }
        Object objD0 = d0.d0(arrayList2);
        qv0.n nVar = objD0 instanceof qv0.n ? (qv0.n) objD0 : null;
        if (nVar != null) {
            nVar.s(null);
        }
        eVarB.addAll(arrayList2);
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.d, new m62.l(2), new m56.g(3), new s(this, domainState, 0));
        List list2 = domainState.f203094b;
        if (list2.isEmpty()) {
            z = false;
            break loop0;
        }
        List list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it8 = list3.iterator();
            loop0: while (it8.hasNext()) {
                ArrayList arrayList = ((a0) it8.next()).f233268c;
                if (!arrayList.isEmpty()) {
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        if (!(this.f203118a.h((p6g.w) it9.next()) instanceof c0)) {
                            z = false;
                            break loop0;
                        }
                    }
                }
            }
        }
        z = true;
        return new o(list, z);
    }
}
