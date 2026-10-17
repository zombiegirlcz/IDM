package com.revolut.feature.junior.accounts.impl.ui.saving_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b88.g;
import b88.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.junior.accounts.impl.ui.saving_picker.JuniorSavingChildPickerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior/accounts/impl/ui/saving_picker/JuniorSavingChildPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lb88/g;", "Ldli/a;", "Lb88/i;", "<init>", "()V", "feature_junior_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorSavingChildPickerScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(JuniorSavingChildPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_bottomsheet;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return n.a(p0);
        }
    }

    public JuniorSavingChildPickerScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: b88.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSavingChildPickerScreen f13116b;

            {
                this.f13116b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                JuniorSavingChildPickerScreen juniorSavingChildPickerScreen = this.f13116b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSavingChildPickerScreen.Q;
                        JuniorSavingChildPickerScreen juniorSavingChildPickerScreen2 = this.f13116b;
                        return dli.f.a(juniorSavingChildPickerScreen2, (h) juniorSavingChildPickerScreen2.P.getValue(), v.k(juniorSavingChildPickerScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSavingChildPickerScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSavingChildPickerScreen.m2()).a().get(r68.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r68.b.class, " is not found"));
                        }
                        k78.b bVar = ((k78.b) ((k78.k) aVar2.b())).Q;
                        k78.g gVar = new k78.g();
                        gVar.f181887a = e4m.b.b(new k78.d(bVar, i3));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = JuniorSavingChildPickerScreen.Q;
                        return (h) ((k78.g) juniorSavingChildPickerScreen.O.getValue()).f181887a.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: b88.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSavingChildPickerScreen f13116b;

            {
                this.f13116b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 1;
                JuniorSavingChildPickerScreen juniorSavingChildPickerScreen = this.f13116b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSavingChildPickerScreen.Q;
                        JuniorSavingChildPickerScreen juniorSavingChildPickerScreen2 = this.f13116b;
                        return dli.f.a(juniorSavingChildPickerScreen2, (h) juniorSavingChildPickerScreen2.P.getValue(), v.k(juniorSavingChildPickerScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSavingChildPickerScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSavingChildPickerScreen.m2()).a().get(r68.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r68.b.class, " is not found"));
                        }
                        k78.b bVar = ((k78.b) ((k78.k) aVar2.b())).Q;
                        k78.g gVar = new k78.g();
                        gVar.f181887a = e4m.b.b(new k78.d(bVar, i3));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = JuniorSavingChildPickerScreen.Q;
                        return (h) ((k78.g) juniorSavingChildPickerScreen.O.getValue()).f181887a.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: b88.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorSavingChildPickerScreen f13116b;

            {
                this.f13116b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 1;
                JuniorSavingChildPickerScreen juniorSavingChildPickerScreen = this.f13116b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorSavingChildPickerScreen.Q;
                        JuniorSavingChildPickerScreen juniorSavingChildPickerScreen2 = this.f13116b;
                        return dli.f.a(juniorSavingChildPickerScreen2, (h) juniorSavingChildPickerScreen2.P.getValue(), v.k(juniorSavingChildPickerScreen2.M, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorSavingChildPickerScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(juniorSavingChildPickerScreen.m2()).a().get(r68.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r68.b.class, " is not found"));
                        }
                        k78.b bVar = ((k78.b) ((k78.k) aVar2.b())).Q;
                        k78.g gVar = new k78.g();
                        gVar.f181887a = e4m.b.b(new k78.d(bVar, i32));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = JuniorSavingChildPickerScreen.Q;
                        return (h) ((k78.g) juniorSavingChildPickerScreen.O.getValue()).f181887a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k78.g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (b88.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.junior_saving_child_picker_title, null, null, 14), null, null, null, false, 30));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new b88.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
