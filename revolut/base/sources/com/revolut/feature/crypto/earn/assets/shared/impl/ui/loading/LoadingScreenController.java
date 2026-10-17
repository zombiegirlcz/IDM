package com.revolut.feature.crypto.earn.assets.shared.impl.ui.loading;

import a0.d;
import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ip0.pb0;
import java.util.ArrayList;
import jii.d0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import o31.b;
import vc.s;
import vim.f;
import z4l.j;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/earn/assets/shared/impl/ui/loading/LoadingScreenController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "<init>", "()V", "feature_crypto_earn_assets_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoadingScreenController extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(LoadingScreenController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final int N = R$layout.screen_recycler_navbarwithbigtile;
    public final h O = s.t(this, a.f);
    public final j P = new j(7, u.c(new RowLoadingDelegate()), false);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, d0.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return d0.a(p0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = Q;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.O;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((d0) value).f174510b.setLoadingState(true);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView screenContentRecyclerView = ((d0) value2).f174511c;
        j jVar = this.P;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        screenContentRecyclerView.setVisibility(0);
        screenContentRecyclerView.addItemDecoration(new b());
        IntRange intRange = new IntRange(1, 5, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(d.n("LOADING_ITEM_", it8.nextInt())));
        }
        jVar.c(arrayList);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }
}
