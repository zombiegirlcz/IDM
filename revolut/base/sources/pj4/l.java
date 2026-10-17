package pj4;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import dx4.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static au3.k a(au3.k kVar, boolean z, boolean z3) {
        if (kVar instanceof au3.i) {
            au3.i iVar = (au3.i) kVar;
            au3.h hVar = iVar.d;
            if (Intrinsics.f(hVar, au3.e.f9474a)) {
                if (!z) {
                    kVar = null;
                }
                return (au3.i) kVar;
            }
            if (!Intrinsics.f(hVar, au3.g.f9476a)) {
                return iVar;
            }
            if (!z3) {
                kVar = null;
            }
            return (au3.i) kVar;
        }
        if (!(kVar instanceof au3.j)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = ((au3.j) kVar).f9480a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            au3.k kVarA = a((au3.k) it8.next(), z, z3);
            if (kVarA != null) {
                arrayList2.add(kVarA);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            return new au3.j(arrayList2);
        }
        return null;
    }

    public static List b(au3.k kVar) {
        if (kVar instanceof au3.i) {
            return u.c(kVar);
        }
        if (!(kVar instanceof au3.j)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = ((au3.j) kVar).f9480a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            a0.x(b((au3.k) it8.next()), arrayList2);
        }
        return arrayList2;
    }

    public static RowDelegate.Model d(au3.i iVar) {
        RowDelegate.Model.MainImage.Image40 image40;
        String strG = a0.d.g(iVar.f9477a.hashCode(), iVar.f9478b.hashCode(), "waiting-list-dashboard-cell-", "-");
        a1 a1Var = iVar.f9479c;
        if (a1Var != null) {
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int iC = a1Var.c();
            int i = R$attr.uikit_colorAccentNeutral;
            image40 = new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i), 0.1f, companion, iC, new Color.Solid(i)), null, null, false, null, false, 62);
        } else {
            image40 = null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_waiting_list_dashboard_info_item_title, u.c(new TextClause(iVar.f9477a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_waiting_list_dashboard_info_item_description, u.c(new TextClause(iVar.f9478b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        tf tfVar = iVar.d != null ? new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))) : null;
        au3.h hVar = iVar.d;
        return new RowDelegate.Model(strG, image40, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, tfVar, hVar != null, null, false, null, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 532673496);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f236666a, new pij.d(this, 27), new pch.f(this, 29), new p2b.a(this, 11));
    }
}
