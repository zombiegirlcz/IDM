package com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.contributions;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.contributions.ContributionsTabScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import gc6.d;
import gc6.f;
import gc6.j;
import gc6.l;
import gc6.m;
import java.util.List;
import jki.h;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pa6.i;
import rd0.e;
import sji.b;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/overview/tab/contributions/ContributionsTabScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lgc6/m;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lgc6/j;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContributionsTabScreen extends BaseRecyclerViewScreen<m, IOData$EmptyInput, j> {
    public final ListSubheaderDelegate U;
    public final RowDelegate V;
    public final TextDelegate W;
    public final LargeActionButtonDelegate X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f72097a0;

    public ContributionsTabScreen() {
        super(IOData$EmptyInput.f98299a);
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.U = listSubheaderDelegate;
        CounterTextDelegate counterTextDelegate = new CounterTextDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.V = rowDelegate;
        final int i = 0;
        SwipeToActionDelegate swipeToActionDelegate = new SwipeToActionDelegate(rowDelegate, false);
        TextDelegate textDelegate = new TextDelegate();
        this.W = textDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.X = largeActionButtonDelegate;
        this.Y = w.y0(new Function0(this) { // from class: gc6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContributionsTabScreen f142348b;

            {
                this.f142348b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ContributionsTabScreen contributionsTabScreen = this.f142348b;
                        qji.b bVarQ2 = contributionsTabScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.contributions.di.ContributionsTabScreenInjector");
                        pa6.b bVar = (pa6.b) bVarQ2;
                        return new pa6.i(bVar.f234348a, bVar.f234349b, contributionsTabScreen);
                    default:
                        return (l) ((pa6.i) this.f142348b.Y.getValue()).f234376g.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: gc6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContributionsTabScreen f142348b;

            {
                this.f142348b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ContributionsTabScreen contributionsTabScreen = this.f142348b;
                        qji.b bVarQ2 = contributionsTabScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.contributions.di.ContributionsTabScreenInjector");
                        pa6.b bVar = (pa6.b) bVarQ2;
                        return new pa6.i(bVar.f234348a, bVar.f234349b, contributionsTabScreen);
                    default:
                        return (l) ((pa6.i) this.f142348b.Y.getValue()).f234376g.get();
                }
            }
        });
        this.f72097a0 = v.k(listSubheaderDelegate, counterTextDelegate, rowDelegate, swipeToActionDelegate, textDelegate, largeActionButtonDelegate, new ListSubheaderLoadingDelegate(), new ExpandableCellLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (i) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (l) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(this.V.f53218h), null, new d(this, null), 3);
        a.g2(this, e.b(this.U.f52707c), null, new gc6.e(this, null), 3);
        a.g2(this, e.b(this.X.d.f121375b), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((i) this.Y.getValue()).d.get()).d(v.k(this.X, this.W));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF72097a0() {
        return this.f72097a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(m uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        RecyclerView recyclerViewH = h();
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(boh.f.p(context), recyclerViewH);
        h().setClipToPadding(false);
    }
}
