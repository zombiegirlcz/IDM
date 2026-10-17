package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.AddNewOptionsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import lrd.c;
import lrd.d;
import ppd.g;
import ppd.n;
import ppd.u0;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_new_options/AddNewOptionsContract$OutputData;", "Ldli/a;", "Llrd/d;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddNewOptionsController extends ViewController<AddNewOptionsContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AddNewOptionsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object P;
    public final int K = R$layout.screen_bottom_sheet_list;
    public final h L = s.t(this, a.f);
    public final RowDelegate O = new RowDelegate(null, null, 7);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return f.a(p0);
        }
    }

    public AddNewOptionsController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lrd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewOptionsController f199498b;

            {
                this.f199498b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddNewOptionsController addNewOptionsController = this.f199498b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddNewOptionsController.Q;
                        qji.b bVarU2 = addNewOptionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.di.AddNewOptionsScreenInjector");
                        n nVar = ((u0) bVarU2).f238558b;
                        ppd.g gVar = new ppd.g();
                        int i3 = 21;
                        gVar.f238413a = e4m.b.b(new pa6.f(nVar, gVar, 1, i3));
                        gVar.f238414b = e4m.b.b(new pa6.f(nVar, gVar, 0, i3));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddNewOptionsController.Q;
                        return (c) ((ppd.g) addNewOptionsController.M.getValue()).f238414b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddNewOptionsController.Q;
                        AddNewOptionsController addNewOptionsController2 = this.f199498b;
                        return dli.f.a(addNewOptionsController2, addNewOptionsController2.d(), u.c(addNewOptionsController2.O), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lrd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewOptionsController f199498b;

            {
                this.f199498b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddNewOptionsController addNewOptionsController = this.f199498b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddNewOptionsController.Q;
                        qji.b bVarU2 = addNewOptionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.di.AddNewOptionsScreenInjector");
                        n nVar = ((u0) bVarU2).f238558b;
                        ppd.g gVar = new ppd.g();
                        int i3 = 21;
                        gVar.f238413a = e4m.b.b(new pa6.f(nVar, gVar, 1, i3));
                        gVar.f238414b = e4m.b.b(new pa6.f(nVar, gVar, 0, i3));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddNewOptionsController.Q;
                        return (c) ((ppd.g) addNewOptionsController.M.getValue()).f238414b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddNewOptionsController.Q;
                        AddNewOptionsController addNewOptionsController2 = this.f199498b;
                        return dli.f.a(addNewOptionsController2, addNewOptionsController2.d(), u.c(addNewOptionsController2.O), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: lrd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewOptionsController f199498b;

            {
                this.f199498b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddNewOptionsController addNewOptionsController = this.f199498b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddNewOptionsController.Q;
                        qji.b bVarU2 = addNewOptionsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_new_options.di.AddNewOptionsScreenInjector");
                        n nVar = ((u0) bVarU2).f238558b;
                        ppd.g gVar = new ppd.g();
                        int i32 = 21;
                        gVar.f238413a = e4m.b.b(new pa6.f(nVar, gVar, 1, i32));
                        gVar.f238414b = e4m.b.b(new pa6.f(nVar, gVar, 0, i32));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddNewOptionsController.Q;
                        return (c) ((ppd.g) addNewOptionsController.M.getValue()).f238414b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddNewOptionsController.Q;
                        AddNewOptionsController addNewOptionsController2 = this.f199498b;
                        return dli.f.a(addNewOptionsController2, addNewOptionsController2.d(), u.c(addNewOptionsController2.O), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((f) value).f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.analytics_total_wealth_add_new_title, null, null, 14), null, null, null, false, 30));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new lrd.g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final c d() {
        return (c) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
