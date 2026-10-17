package com.revolut.feature.payments.groups.impl.ui_new.group_creation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.l;
import java.util.List;
import jii.z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nn7.d;
import nt9.c;
import nt9.f;
import nt9.i;
import nt9.j;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_new/group_creation/GroupCreationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnt9/j;", "<init>", "()V", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupCreationScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(GroupCreationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarvaultsActionFooterBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final InputTextDelegate L = new InputTextDelegate(null);
    public final SuggestionsBarDelegate M = new SuggestionsBarDelegate();
    public final ListSubheaderDelegate N = new ListSubheaderDelegate();
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final int P = R$layout.screen_recycler_navbarvaults_action_footer;
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, z.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarvaultsActionFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return z.a(p0);
        }
    }

    public GroupCreationScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: nt9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupCreationScreen f218998b;

            {
                this.f218998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GroupCreationScreen groupCreationScreen = this.f218998b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GroupCreationScreen.T;
                        GroupCreationScreen groupCreationScreen2 = this.f218998b;
                        return dli.f.a(groupCreationScreen2, groupCreationScreen2.R2(), v.k(groupCreationScreen2.L, groupCreationScreen2.M, groupCreationScreen2.N, groupCreationScreen2.O, new RowLoadingDelegate()), R$id.screenRecyclerNavbarVaultsActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = GroupCreationScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(groupCreationScreen.m2()).a().get(kr9.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new kr9.e(((kr9.l) aVar2.b()).F, groupCreationScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", kr9.l.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = GroupCreationScreen.T;
                        return (i) ((kr9.e) groupCreationScreen.R.getValue()).f188726q.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: nt9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupCreationScreen f218998b;

            {
                this.f218998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GroupCreationScreen groupCreationScreen = this.f218998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GroupCreationScreen.T;
                        GroupCreationScreen groupCreationScreen2 = this.f218998b;
                        return dli.f.a(groupCreationScreen2, groupCreationScreen2.R2(), v.k(groupCreationScreen2.L, groupCreationScreen2.M, groupCreationScreen2.N, groupCreationScreen2.O, new RowLoadingDelegate()), R$id.screenRecyclerNavbarVaultsActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = GroupCreationScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(groupCreationScreen.m2()).a().get(kr9.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new kr9.e(((kr9.l) aVar2.b()).F, groupCreationScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", kr9.l.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = GroupCreationScreen.T;
                        return (i) ((kr9.e) groupCreationScreen.R.getValue()).f188726q.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: nt9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupCreationScreen f218998b;

            {
                this.f218998b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GroupCreationScreen groupCreationScreen = this.f218998b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GroupCreationScreen.T;
                        GroupCreationScreen groupCreationScreen2 = this.f218998b;
                        return dli.f.a(groupCreationScreen2, groupCreationScreen2.R2(), v.k(groupCreationScreen2.L, groupCreationScreen2.M, groupCreationScreen2.N, groupCreationScreen2.O, new RowLoadingDelegate()), R$id.screenRecyclerNavbarVaultsActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = GroupCreationScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(groupCreationScreen.m2()).a().get(kr9.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new kr9.e(((kr9.l) aVar2.b()).F, groupCreationScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", kr9.l.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = GroupCreationScreen.T;
                        return (i) ((kr9.e) groupCreationScreen.R.getValue()).f188726q.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174578b.setModel(new e(false, null, null, new n6(new TextLocalisedClause(R$string.payments_groups_actions_create_group, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "CREATE_GROUP_CTA_ID", uiState.f219006c, null, null, 972), null, null, 55));
        Image image = uiState.f219005b;
        if (image != null) {
            d3().f174579c.setBackgroundImage(image);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (kr9.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarVaults navBarVaults = d3().f174579c;
        navBarVaults.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarVaults.setToolbarTitle(new TextLocalisedClause(R$string.payments_groups_actions_create_group, null, null, 14));
        navBarVaults.setDescription(new TextLocalisedClause(R$string.payments_groups_actions_create_group, null, null, 14));
        navBarVaults.setEndBottomIconImage(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_camera, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), R$attr.uikit_colorAccentNeutral, 4.0f, null, null, 48));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        z zVarD3 = d3();
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(zVarD3.f174579c.f59328m), new nt9.b(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(zVarD3.f174579c.u.k), new nt9.b(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(zVarD3.f174578b.f), new nt9.b(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.L.e.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.M.p().d, new nrb.c(23))), new d(this, continuation, 20), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new nt9.d(this, null), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, l.y(rowDelegate.f53218h, rowDelegate.f53220l, "merge(...)"), new nt9.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new f(this, null), 3);
    }

    public final z d3() {
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (z) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
