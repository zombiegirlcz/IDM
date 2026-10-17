package yff;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction.troubleshooter.impl.R$string;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import xo8.j0;
import yed.g0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements jki.p {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f313351a = new b();

        private b() {
        }
    }

    public static RowDelegate.Model b(String str, String str2) {
        RowDelegate.Model model = new RowDelegate.Model("HELP_BUTTON_LIST_ID", null, new TextLocalisedClause(R$string.troubleshooter_list_help_button, null, null, 14), null, 0, null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true), false, null, false, null, null, null, null, null, null, b.f313351a, l7d.a.d(4, str, str2), 0, 0, 0, 0, 524286970);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static List c(String str, String str2, boolean z) {
        s0 s0Var = new s0(2);
        IntRange intRange = new IntRange(0, 5, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("ISSUE_LOADING_", it8.nextInt())));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        s0Var.b(arrayList.toArray(new pb0[0]));
        s0Var.a(!z ? b(str, str2) : null);
        ArrayList arrayList2 = s0Var.f186433a;
        return v.m(arrayList2.toArray(new koi.j[arrayList2.size()]));
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l(domainState.e, (List) iii.c.f(domainState.f313339c, new g0(this, domainState), new y8a.g(this, domainState, 25), new j0(this, domainState, 22)), zhm.u.c(new TextNavBarMenuItem("DONE_ACTION_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, 12)));
    }
}
