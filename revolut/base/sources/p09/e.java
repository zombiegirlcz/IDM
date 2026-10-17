package p09;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreenContract$InputData;
import com.revolut.kompot.common.R$string;
import ip0.gu;
import ip0.nf0;
import ip0.of0;
import ip0.v4;
import ip0.xc;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import jki.i;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n09.a0;
import n09.c0;
import n09.l;
import n09.x;
import n09.y;
import n09.z;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements p {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h09.d f231485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LearnHomeScreenContract$InputData f231486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f231487c;
    public final List d;

    public e(b footerMapper, h09.d courseMapper, LearnHomeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(courseMapper, "courseMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f231485a = courseMapper;
        this.f231486b = inputData;
        gu guVar = new gu("LOADING_LARGE_COURSE_ID_HEADER", 0, 0, 30);
        v4 v4Var = new v4("LOADING_LARGE_COURSE_ID", null, 62);
        yp0.b.l(v4Var, 0, 0, 0, 0, null, false, 63);
        gu guVar2 = new gu("LOADING_SMALL_COURSE_ID_HEADER", 0, 0, 30);
        nf0 nf0Var = new nf0("LOADING_SMALL_COURSE_ID", of0.PURPLE);
        yp0.b.l(nf0Var, 0, 0, 0, 0, null, false, 63);
        this.f231487c = v.k(guVar, v4Var, guVar2, nf0Var);
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        this.d = u.c(model);
    }

    @Override // jki.p
    public final m a(i iVar) {
        Clause textLocalisedClause;
        l domainState = (l) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f210952a;
        List<a0> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (a0 a0Var : list2) {
            arrayList.add(new xc(a0Var.f210923a.a(), (List) iii.c.f(a0Var.f210925c, new oxd.m(this, 11), new or4.i(this, 20), new d8d.a(this, a0Var, domainState.f210954c, domainState.d, 8)), 0, null, null, 0, 0, 0, 1020));
        }
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                for (a0 a0Var2 : list2) {
                    if (a0Var2.f210924b) {
                        String strA = a0Var2.f210923a.a();
                        Iterator it9 = list.iterator();
                        int i = 0;
                        while (true) {
                            if (!it9.hasNext()) {
                                i = -1;
                            } else if (!((a0) it9.next()).f210924b) {
                                i++;
                            }
                        }
                        int i2 = i;
                        IconNavBarMenuItem iconNavBarMenuItemA = domainState.f210953b ? IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MENU_ITEM_ID_GLOSSARY", new ResourceImage(R$drawable.uikit_icn_24_library, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124) : null;
                        LearnHomeScreenContract$InputData learnHomeScreenContract$InputData = this.f231486b;
                        IconNavBarMenuItem[] elements = {iconNavBarMenuItemA, learnHomeScreenContract$InputData.f78012b ? IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MENU_ITEM_ID_REWARDS", new ResourceImage(R$drawable.uikit_icn_24_present, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124) : null};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return new c0(kotlin.collections.d.L(elements), arrayList, arrayList2, strA, i2, learnHomeScreenContract$InputData.f78013c);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            a0 a0Var3 = (a0) it8.next();
            String strA2 = a0Var3.f210923a.a();
            z zVar = a0Var3.f210923a;
            if (zVar instanceof x) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.investmentlearncatalogue_learn_tab_all_title, null, null, 14);
            } else {
                if (!(zVar instanceof y)) {
                    throw new NoWhenBranchMatchedException();
                }
                u09.v vVar = ((y) zVar).f210971a;
                switch (d.f231484b[vVar.ordinal()]) {
                    case 1:
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.wealth_crypto_investmentlearn_learn_tab_crypto_title, null, null, 14);
                        break;
                    case 2:
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.retail_tips_learn_tab_title, null, null, 14);
                        break;
                    case 3:
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.fraud_learn_tab_title, null, null, 14);
                        break;
                    case 4:
                        String lowerCase = vVar.name().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        textLocalisedClause = new TextClause(kotlin.text.a0.o(lowerCase), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        break;
                    case 5:
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.youth_trading_learn_tab_title, null, null, 14);
                        break;
                    case 6:
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.freelancer_learn_tab_title, null, null, 14);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            arrayList2.add(new q(strA2, new t(textLocalisedClause), 58));
        }
    }
}
