package gd2;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.services.ideal.api.R$string;
import f28.b0;
import ip0.qd0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.f0;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(g02.a aVar) {
        TextLocalisedClause textLocalisedClause;
        Image imageC;
        String strQ = j6.a.q("POCKET_ID_", aVar.f139251b);
        g02.b bVar = aVar.f139250a;
        int[] iArr = l.f143047b;
        int i = iArr[bVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.ideal_add_account_account_type_personal, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.ideal_add_account_account_type_pro, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.ideal_add_account_account_type_joint, null, null, 14);
        }
        String str = aVar.f139252c;
        Regex regex = jli.g.f175847a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(" ", "separator");
        TextClause textClause = new TextClause(y.u(y.y(f0.L0(str), new b0(str, 4)), "", null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i2 = iArr[bVar.ordinal()];
        if (i2 == 1) {
            imageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D202", null, null, null, 30);
        } else if (i2 == 2) {
            imageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D206", null, null, null, 30);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            imageC = new GlyphImage(R$drawable.uikit_icn_24_joint, null, null, 6);
        }
        return new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(imageC, null, null, false, null, false, 60), textLocalisedClause, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar.f139251b, null, 0, 0, 0, 0, 532676568);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        AbstractList abstractListA;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        int i;
        aw0.i eVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f143035a;
        boolean z3 = domainState.f143035a;
        List list = domainState.d;
        List list2 = domainState.f143037c;
        d dVar = domainState.f143036b;
        if (z) {
            abstractListA = iii.c.c(2);
        } else {
            aim.e eVarB = u.b();
            if (dVar == d.CONFIRM_PAYMENT) {
                eVarB.add(new ListSubheaderDelegate.Model("ADD_ACCOUNTS_SUBTITLE_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.ideal_add_account_subtitle, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            }
            if (list2.size() == 1) {
                RowDelegate.Model modelA = a((g02.a) d0.b0(list2));
                yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
                eVarB.add(modelA);
            } else {
                List<g02.a> list3 = list2;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                for (g02.a aVar : list3) {
                    arrayList.add(new SelectableDelegate.Model(j6.a.q("SELECTABLE_POCKET_ID_", aVar.f139251b), a(aVar), list.contains(aVar.f139251b) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
            }
            abstractListA = u.a(eVarB);
        }
        int[] iArr = l.f143046a;
        int i2 = iArr[dVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.ideal_add_account_select_title, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.ideal_payment_confirmation_title, null, null, 14);
        }
        int i3 = iArr[dVar.ordinal()];
        if (i3 == 1) {
            i = 14;
            textLocalisedClause2 = new TextLocalisedClause(R$string.ideal_select_accounts_subtitle, null, null, 14);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = null;
            i = 14;
        }
        int i5 = iArr[dVar.ordinal()];
        if (i5 == 1) {
            eVar = new aw0.e(true, new TextLocalisedClause(R$string.ideal_add_account_disclaimer, null, null, 14), null, new n6(new TextLocalisedClause(R$string.ideal_select_accounts_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, new ResourceImage(R$drawable.uikit_icn_24_link_external, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "PRIMARY_BUTTON_LOADING_TAG", (z3 || list2.isEmpty() || list.isEmpty()) ? false : true, null, null, 968), null, null, 52);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new aw0.h(true, new n6(new TextLocalisedClause(R$string.ideal_add_account_button_title, null, null, i), LargeActionButton.ButtonStyle.f58725a, new ResourceImage(R$drawable.uikit_icn_24_link_external, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "PRIMARY_BUTTON_LOADING_TAG", (z3 || list2.isEmpty() || list.isEmpty()) ? false : true, null, null, 968), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new TextLocalisedClause(R$string.ideal_add_account_disclaimer, null, null, 14), null, null, 112);
        }
        return new f(abstractListA, textLocalisedClause, textLocalisedClause2, eVar);
    }
}
