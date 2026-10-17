package com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.charities;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import boh.f;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.charities.CharitiesTabScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ea4.d;
import ec6.j;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nb6.h;
import pa6.c;
import rd0.e;
import sji.b;
import te0.w;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/overview/tab/charities/CharitiesTabScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lec6/j;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lnb6/h;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CharitiesTabScreen extends BaseRecyclerViewScreen<j, IOData$EmptyInput, h> {
    public final Object U;
    public final Object V;
    public final BigTileDelegate W;
    public final FullScreenStateDelegate X;
    public final LargeVoucherTileDelegate Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f72096a0;

    public CharitiesTabScreen() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: ec6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharitiesTabScreen f124446b;

            {
                this.f124446b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarQ2 = this.f124446b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.charities.di.CharitiesTabScreenInjector");
                        pa6.b bVar = (pa6.b) bVarQ2;
                        return new pa6.c(bVar.f234348a, bVar.f234349b);
                    default:
                        return (f) ((pa6.c) this.f124446b.U.getValue()).f234353c.get();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: ec6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharitiesTabScreen f124446b;

            {
                this.f124446b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarQ2 = this.f124446b.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.charities.di.CharitiesTabScreenInjector");
                        pa6.b bVar = (pa6.b) bVarQ2;
                        return new pa6.c(bVar.f234348a, bVar.f234349b);
                    default:
                        return (f) ((pa6.c) this.f124446b.U.getValue()).f234353c.get();
                }
            }
        });
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        BigTileDelegate bigTileDelegate = new BigTileDelegate();
        this.W = bigTileDelegate;
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(u.c(bigTileDelegate), true);
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.X = fullScreenStateDelegate;
        LargeVoucherTileDelegate largeVoucherTileDelegate = new LargeVoucherTileDelegate();
        this.Y = largeVoucherTileDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        this.f72096a0 = v.k(listSubheaderDelegate, bigTileDelegate, scrollerDelegate, fullScreenStateDelegate, largeVoucherTileDelegate, rowDelegate, new BigTileLoadingDelegate(), new LargeVoucherLoadingDelegate(), new ListSubheaderLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(this.Y.d), null, new d(this, null, 5), 3);
        a.g2(this, e.b(this.W.d), null, new ec6.b(this, null), 3);
        a.g2(this, e.b(this.Z.f53218h), null, new ec6.c(this, null), 3);
        a.g2(this, e.b(this.X.f52371h.f121375b), null, new ec6.d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF72096a0() {
        return this.f72096a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        RecyclerView recyclerViewH = h();
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(f.p(context), recyclerViewH);
        h().setClipToPadding(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final ec6.f T2() {
        return (ec6.f) this.V.getValue();
    }
}
