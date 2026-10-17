package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import aw0.m1;
import aw0.m3;
import aw0.v1;
import aw0.y6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.internal.views.CircleActionView;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.core.ui_kit.internal.views.framelayout.NestedScrollableHost;
import com.revolut.core.ui_kit.internal.views.navbar.HeaderDisclaimerTextView;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.TickerTapeView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.oe0;
import ip0.xe;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.e1;
import tnb.g0;
import tx0.d5;
import tx0.u2;
import tx0.v2;
import tx0.x2;
import ux0.d1;
import yp0.j0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0005:\u000fabcd3&eTfghijLkB\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J!\u0010*\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u000e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0,2\b\b\u0002\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b.\u0010/J+\u0010.\u001a\u00020\u000e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020&0,2\u0006\u00101\u001a\u0002002\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b.\u00102J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010'\u001a\u000203¢\u0006\u0004\b*\u00104J%\u00109\u001a\u00020\u000e2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001052\u0006\u00108\u001a\u00020\f¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u000e2\u0006\u0010;\u001a\u000206H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00020\u000e2\b\b\u0001\u0010>\u001a\u00020\u0014H\u0000¢\u0006\u0004\b?\u0010\u0017J\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u0018H\u0000¢\u0006\u0004\bB\u0010\u001bJ\u0017\u0010E\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u0018H\u0000¢\u0006\u0004\bD\u0010\u001bJ\u0011\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bG\u0010HR>\u0010R\u001a\u001e\u0012\b\u0012\u000606j\u0002`J\u0012\b\u0012\u00060\u0014j\u0002`K\u0012\u0004\u0012\u00020\u000e\u0018\u00010I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010X\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0013\u0010\\\u001a\u0004\u0018\u00010Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006l"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/AccountSelectionNavBarContentView;", "Landroid/widget/FrameLayout;", "Ltx0/x2;", "Lur0/b;", "", "Lsxl/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "", "setPageChangeTrackingEnabled", "(Z)V", "visible", "setSensitiveBalanceVisible$ui_kit_components_release", "setSensitiveBalanceVisible", "", "offset", "setBackgroundOffset", "(I)V", "", "translationY", "setContentTranslationY", "(F)V", "hasTransientState", "setHasTransientState", "Ltx0/u2;", "listener", "setColorSchemeListener", "(Ltx0/u2;)V", "Ltx0/v2;", "alignment", "setContentAlignment", "(Ltx0/v2;)V", "Ltx0/r;", "model", "Ltx0/q;", "pagerIndicatorType", "setModel", "(Ltx0/r;Ltx0/q;)V", "", "models", "setModels", "(Ljava/util/List;Ltx0/q;)V", "Lux0/d1;", "productIntroStateProvider", "(Ljava/util/List;Lux0/d1;Ltx0/q;)V", "Ltx0/y;", "(Ltx0/y;)V", "", "", "hiddenPageIds", "updateBackgroundForHiddenPage", "setHiddenPageIds", "(Ljava/util/Set;Z)V", "modelId", "setCurrentPage", "(Ljava/lang/String;)V", "color", "setDefaultBackgroundColor$ui_kit_components_release", "setDefaultBackgroundColor", "alpha", "setContentAlpha$ui_kit_components_release", "setContentAlpha", "setBackgroundAlpha$ui_kit_components_release", "setBackgroundAlpha", "Landroid/view/View;", "getActionsForTransition", "()Landroid/view/View;", "Lkotlin/Function2;", "Lcom/revolut/core/ui_kit/views/navbar/PageId;", "Lcom/revolut/core/ui_kit/views/navbar/PagerScrollState;", "a", "Lkotlin/jvm/functions/Function2;", "getOnPagingStateChanged$ui_kit_components_release", "()Lkotlin/jvm/functions/Function2;", "setOnPagingStateChanged$ui_kit_components_release", "(Lkotlin/jvm/functions/Function2;)V", "onPagingStateChanged", "Lcom/revolut/core/ui_kit/internal/views/navbar/WallpaperView;", "b", "Lcom/revolut/core/ui_kit/internal/views/navbar/WallpaperView;", "getBackgroundView$ui_kit_components_release", "()Lcom/revolut/core/ui_kit/internal/views/navbar/WallpaperView;", "backgroundView", "Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "getCurrentBackground", "()Lcom/revolut/core/ui_kit/models/NavBarWithContainerBackground;", "currentBackground", "getPagerIndicatorTargetAlpha", "()F", "pagerIndicatorTargetAlpha", "Companion", "tx0/w", "PageViewHolder", "PageDelegate", "tx0/v", "tx0/b", "tx0/c", "tx0/u", "com/revolut/core/ui_kit/views/navbar/c", "tx0/a0", "tx0/z", "tx0/x", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountSelectionNavBarContentView extends FrameLayout implements x2, ur0.b, sxl.b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final ifm.b A;
    public u2 B;
    public boolean C;
    public boolean D;
    public int E;
    public v2 F;
    public int G;
    public int H;
    public List I;
    public final tx0.c J;
    public v1 K;
    public int L;
    public int M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public final vx0.d R;
    public View S;
    public tx0.q T;
    public Set U;
    public boolean V;
    public float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Function2 onPagingStateChanged;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f59164a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final WallpaperView backgroundView;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public d1 f59166b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NestedScrollableHost f59167c;
    public final ViewPager2 d;
    public final RecyclerView e;
    public final z4l.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f59168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f59169h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f59170j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f59171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f59172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f59173n;
    public final ihm.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.b f59174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f59175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f59176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ihm.f f59177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.f f59178t;
    public final ihm.f u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f59179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f59180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f59181y;
    public boolean z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/AccountSelectionNavBarContentView$PageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Ltx0/w;", "Lcom/revolut/core/ui_kit/views/navbar/AccountSelectionNavBarContentView$PageViewHolder;", "Lcom/revolut/core/ui_kit/views/navbar/AccountSelectionNavBarContentView;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class PageDelegate extends BaseRecyclerViewDelegate<tx0.w, PageViewHolder> {
        public PageDelegate() {
            super(0, new tw8.g(2));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AccountSelectionNavBarContentView accountSelectionNavBarContentView = AccountSelectionNavBarContentView.this;
            PageViewHolder pageViewHolder = new PageViewHolder(accountSelectionNavBarContentView, context);
            NavBarContentCenterView navBarContentCenterView = pageViewHolder.f;
            navBarContentCenterView.f57298c.f56386h.subscribe(new twl.h(11, new a(pageViewHolder, accountSelectionNavBarContentView, 4)));
            navBarContentCenterView.u.subscribe(new twl.h(13, new a(pageViewHolder, accountSelectionNavBarContentView, 1)));
            navBarContentCenterView.f57310w.subscribe(new twl.h(14, new a(pageViewHolder, accountSelectionNavBarContentView, 2)));
            navBarContentCenterView.f57311x.subscribe(new twl.h(15, new a(pageViewHolder, accountSelectionNavBarContentView, 3)));
            navBarContentCenterView.f57312y.subscribe(new twl.h(16, new tx0.a(accountSelectionNavBarContentView, 4)));
            navBarContentCenterView.z.subscribe(new twl.h(17, new tx0.a(accountSelectionNavBarContentView, 5)));
            navBarContentCenterView.v.subscribe(new twl.h(18, new tx0.a(accountSelectionNavBarContentView, 6)));
            pageViewHolder.i.f58296a.f121375b.subscribe(new twl.h(19, new tx0.a(accountSelectionNavBarContentView, 7)));
            LineChartView lineChartView = pageViewHolder.f59183g;
            efm.i observeClicks = lineChartView.getObserveClicks();
            twl.h hVar = new twl.h(9, new a(accountSelectionNavBarContentView, pageViewHolder, 5));
            ch.b bVar = mfm.f.e;
            en.a aVar = mfm.f.f205043c;
            e1 e1Var = e1.INSTANCE;
            observeClicks.m(hVar, bVar, aVar, e1Var);
            lineChartView.getObserveScrollingStateChanges().m(new twl.h(10, new a(accountSelectionNavBarContentView, pageViewHolder, 0)), bVar, aVar, e1Var);
            pageViewHolder.f59184h.f58903a.d.subscribe(new twl.h(12, new tx0.a(accountSelectionNavBarContentView, 3)));
            pageViewHolder.f59187m.f58608l.subscribe(accountSelectionNavBarContentView.u);
            return pageViewHolder;
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
        /* JADX INFO: renamed from: k */
        public final void n(RecyclerView.ViewHolder viewHolder) {
            PageViewHolder holder = (PageViewHolder) viewHolder;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(holder, "holder");
            p(holder);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void n(koi.b bVar) {
            PageViewHolder holder = (PageViewHolder) bVar;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(holder, "holder");
            p(holder);
        }

        public final void p(PageViewHolder pageViewHolder) {
            NavBarContentCenterView navBarContentCenterView = pageViewHolder.f;
            AccountSelectionNavBarContentView accountSelectionNavBarContentView = AccountSelectionNavBarContentView.this;
            navBarContentCenterView.setSensitiveBalanceVisible$ui_kit_components_release(accountSelectionNavBarContentView.z);
            pageViewHolder.F();
            AccountSelectionNavBarContentView accountSelectionNavBarContentView2 = pageViewHolder.f59196y;
            accountSelectionNavBarContentView2.requestLayout();
            int i = accountSelectionNavBarContentView2.H;
            ActionsView actionsView = pageViewHolder.i;
            if (actionsView.getPaddingBottom() != i) {
                actionsView.setPadding(actionsView.getPaddingLeft(), actionsView.getPaddingTop(), actionsView.getPaddingRight(), i);
            }
            if (accountSelectionNavBarContentView2.F != null) {
                accountSelectionNavBarContentView2.requestLayout();
                if (!pageViewHolder.itemView.isLayoutRequested()) {
                    pageViewHolder.itemView.requestLayout();
                }
            }
            vx0.d dVar = accountSelectionNavBarContentView.R;
            float f = (-dVar.f292775b) * 0.08f;
            float fA = vx0.c.a(dVar.f292776c);
            for (View view : pageViewHolder.f59194w) {
                view.setTranslationY(f);
                view.setAlpha(fA);
            }
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final void p(PageViewHolder holder, tx0.w data, int i, List payloads) throws Throwable {
            boolean z;
            boolean z3;
            int i2;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            TickerTapeView tickerTapeView = holder.f59184h;
            LineChartView lineChartView = holder.f59183g;
            NavBarContentCenterView navBarContentCenterView = holder.f;
            FooterTextView footerTextView = holder.f59187m;
            HeaderDisclaimerTextView headerDisclaimerTextView = holder.f59186l;
            ActionsView actionsView = holder.i;
            boolean z4 = !payloads.isEmpty();
            tx0.r rVar = data.f275255b;
            boolean z6 = rVar instanceof tx0.g;
            AccountSelectionNavBarContentView accountSelectionNavBarContentView = AccountSelectionNavBarContentView.this;
            if (z6) {
                tx0.g gVar = (tx0.g) rVar;
                Clause clause = gVar.i;
                NavBarCenterViewModel navBarCenterViewModel = gVar.f275128b;
                gVar.e.a(actionsView);
                if (navBarCenterViewModel.d != null && (accountSelectionNavBarContentView.T instanceof tx0.o)) {
                    wp5.y.B("CenteredViewModel.Button must not be displayed along with ButtonIndicator");
                }
                navBarContentCenterView.setContent(navBarCenterViewModel, z4);
                actionsView.j(gVar.f275129c.f275099a, z4);
                tx0.e eVar = gVar.f275130g;
                if (eVar != null) {
                    List<y6> list = eVar.f275107a;
                    lineChartView.setColorScheme(eVar.f275108b);
                    lineChartView.setContextualColorSchemeEnabled(true);
                    lineChartView.setChartItems(list);
                    lineChartView.setInterpolationStrategy(m1.a(eVar.f275109c, accountSelectionNavBarContentView));
                    lineChartView.setVisibility(!list.isEmpty() ? 0 : 8);
                    lineChartView.setDrawingDelegateModel(new bt0.n(eVar.d ? oe0.ALWAYS : oe0.NEVER, 0));
                    lineChartView.setApplyAlphaGradientAroundSelectedPoint(eVar.e);
                }
                tickerTapeView.setModel(gVar.f275131h);
                if (gVar.f) {
                    holder.itemView.setOnLongClickListener(new xe(accountSelectionNavBarContentView, rVar, 6));
                } else {
                    holder.itemView.setOnLongClickListener(null);
                }
                if (gVar.f275132j != null) {
                    headerDisclaimerTextView.setVisibility(0);
                    ty0.c.b(or0.u.k(accountSelectionNavBarContentView).b0(), gVar.f275132j, holder.f59186l, null, null, 12);
                    i2 = 8;
                } else {
                    i2 = 8;
                    headerDisclaimerTextView.setVisibility(8);
                }
                if (clause != null) {
                    footerTextView.setVisibility(0);
                    footerTextView.setTextClause(clause);
                } else {
                    footerTextView.setVisibility(i2);
                }
                if (Intrinsics.f(accountSelectionNavBarContentView.v, data.f275254a)) {
                    accountSelectionNavBarContentView.e(holder, gVar);
                }
            } else if (rVar instanceof tx0.l) {
                navBarContentCenterView.setShimmerTextsVisible(true);
                tx0.q qVar = accountSelectionNavBarContentView.T;
                if (qVar instanceof tx0.o) {
                    z3 = false;
                } else {
                    if (!(qVar instanceof tx0.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z3 = true;
                }
                navBarContentCenterView.setShimmerButtonVisible(z3);
                navBarContentCenterView.setLoading(true);
                actionsView.m(((tx0.l) rVar).f275179b, z4);
                accountSelectionNavBarContentView.setOnLongClickListener(null);
                lineChartView.setVisibility(8);
                tickerTapeView.setModel(f0.f322471a);
                headerDisclaimerTextView.setVisibility(8);
                footerTextView.setVisibility(8);
            } else {
                if (!(rVar instanceof tx0.m)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarContentCenterView.setShimmerTextsVisible(false);
                tx0.q qVar2 = accountSelectionNavBarContentView.T;
                if (qVar2 instanceof tx0.o) {
                    z = false;
                } else {
                    if (!(qVar2 instanceof tx0.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                navBarContentCenterView.setShimmerButtonVisible(z);
                navBarContentCenterView.setLoading(true);
                actionsView.m(((tx0.m) rVar).f275193b, z4);
                accountSelectionNavBarContentView.setOnLongClickListener(null);
                lineChartView.setVisibility(8);
                tickerTapeView.setModel(f0.f322471a);
                headerDisclaimerTextView.setVisibility(8);
                footerTextView.setVisibility(8);
            }
            holder.f59185j = hx7.l.a(data.f275255b);
            p(holder);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/AccountSelectionNavBarContentView$PageViewHolder;", "Lkoi/b;", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class PageViewHolder extends koi.b implements View.OnLayoutChangeListener, TrackableItem {
        public static final /* synthetic */ int z = 0;
        public final NavBarContentCenterView f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LineChartView f59183g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TickerTapeView f59184h;
        public final ActionsView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public NavBarWithContainerBackground f59185j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final HeaderDisclaimerTextView f59186l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final FooterTextView f59187m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public v1 f59188n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f59189p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f59190q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f59191r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f59192s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f59193t;
        public final int u;
        public final Lazy v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final View[] f59194w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Parcelable f59195x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ AccountSelectionNavBarContentView f59196y;

        public PageViewHolder(AccountSelectionNavBarContentView accountSelectionNavBarContentView, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f59196y = accountSelectionNavBarContentView;
            AttributeSet attributeSet = null;
            tr0.a itemView = new tr0.a(context, null);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            super(itemView);
            this.f59191r = kli.a.k(context, 54.0f);
            this.f59192s = kli.a.k(context, 8.0f);
            this.f59193t = kli.a.k(context, 16.0f);
            int iK = kli.a.k(context, 16.0f);
            this.u = kli.a.k(context, 24.0f);
            this.v = yhm.j.b(new Function0() { // from class: com.revolut.core.ui_kit.views.navbar.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = AccountSelectionNavBarContentView.PageViewHolder.z;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
                    int i2 = this.f59514a.f59192s;
                    layoutParams.setMargins(0, i2, 0, i2);
                    return layoutParams;
                }
            });
            View view = this.itemView;
            Intrinsics.i(view, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.layouts.PermissiveFrameLayout");
            tr0.a aVar = (tr0.a) view;
            int i = 0;
            aVar.setClipChildren(false);
            aVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            NavBarContentCenterView navBarContentCenterView = new NavBarContentCenterView(context, null);
            navBarContentCenterView.setId(R$id.accountSelectionNavBarContent_centerView);
            navBarContentCenterView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f = navBarContentCenterView;
            int i2 = 6;
            LineChartView lineChartView = new LineChartView(context, attributeSet, i2, i);
            lineChartView.setId(R$id.accountSelectionNavBarContent_lineChartView);
            lineChartView.setPadding(kli.a.k(context, BitmapDescriptorFactory.HUE_RED), kli.a.k(context, 8.0f), kli.a.k(context, BitmapDescriptorFactory.HUE_RED), kli.a.k(context, 16.0f));
            lineChartView.setGraphLineWidth(kli.a.k(context, 3.0f));
            lineChartView.setClipChartLineHorizontally(true);
            lineChartView.setHoverLineIgnoresVerticalChartPadding(true);
            lineChartView.setVisibility(8);
            lineChartView.setDataChangeAnimationRequest(new uw0.i("AccountSelectionNavBarContentView_LineChartView_Appearing", uw0.g.UNTIL_ANY_FINISHED, false));
            this.f59183g = lineChartView;
            ActionsView actionsView = new ActionsView(context, attributeSet, i2, i);
            actionsView.setId(R$id.accountSelectionNavBarContent_actions);
            actionsView.setLayoutType(mx0.l.HEADER_CIRCLE_ACTIONS);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            actionsView.setLayoutParams(layoutParams);
            actionsView.setPadding(actionsView.getPaddingLeft(), kli.a.k(context, 16.0f), actionsView.getPaddingRight(), actionsView.getPaddingBottom());
            actionsView.setLongClickable(true);
            this.i = actionsView;
            TickerTapeView tickerTapeView = new TickerTapeView(context, null);
            tickerTapeView.setId(R$id.accountSelectionNavBarContent_tickerTapeView);
            tickerTapeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.f59184h = tickerTapeView;
            HeaderDisclaimerTextView headerDisclaimerTextView = new HeaderDisclaimerTextView(context, attributeSet, i2, 0);
            headerDisclaimerTextView.setId(R$id.internal_accountSelectionNavBarContent_headerDisclaimerTextView);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(iK, kli.a.k(context, 8.0f), iK, kli.a.k(context, 4.0f));
            headerDisclaimerTextView.setLayoutParams(layoutParams2);
            this.f59186l = headerDisclaimerTextView;
            FooterTextView footerTextView = new FooterTextView(context, attributeSet, i2, 0);
            footerTextView.setId(R$id.internal_accountSelectionNavBarContent_disclaimerTextView);
            footerTextView.setPadding(iK, footerTextView.getPaddingTop(), iK, footerTextView.getPaddingBottom());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 80;
            footerTextView.setLayoutParams(layoutParams3);
            this.f59187m = footerTextView;
            aVar.addView(tickerTapeView);
            aVar.addView(navBarContentCenterView);
            aVar.addView(lineChartView);
            aVar.addView(actionsView);
            aVar.addView(footerTextView);
            aVar.addView(headerDisclaimerTextView);
            aVar.setTag(this);
            aVar.addOnLayoutChangeListener(this);
            this.f59194w = new View[]{navBarContentCenterView, lineChartView, tickerTapeView, footerTextView};
        }

        public final void F() {
            AccountSelectionNavBarContentView accountSelectionNavBarContentView = this.f59196y;
            v1 v1Var = accountSelectionNavBarContentView.K;
            int i = accountSelectionNavBarContentView.L;
            int i2 = accountSelectionNavBarContentView.M;
            int i3 = accountSelectionNavBarContentView.N;
            if (v1Var != null) {
                if (v1Var == this.f59188n && i == this.o && i2 == this.f59189p && i3 == this.f59190q) {
                    return;
                }
                this.f59188n = v1Var;
                this.o = i;
                this.f59189p = i2;
                this.f59190q = i3;
                View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                foh.i.e(itemView, v1Var, i, i2, i3);
            }
        }

        public final void H(int i) {
            int paddingTop;
            if (i <= 0) {
                return;
            }
            AccountSelectionNavBarContentView accountSelectionNavBarContentView = this.f59196y;
            int height = accountSelectionNavBarContentView.getHeight();
            int i2 = accountSelectionNavBarContentView.H;
            CircleActionView.Companion aVar = CircleActionView.INSTANCE;
            Context context = accountSelectionNavBarContentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iA = CircleActionView.Companion.a(aVar, context) + i2;
            Context context2 = accountSelectionNavBarContentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = (height - (kli.a.k(context2, 16.0f) + iA)) - i;
            LineChartView lineChartView = this.f59183g;
            int iQ = (lineChartView.getVisibility() != 0 || lineChartView.getParent() == null) ? kotlin.jvm.internal.s.q(this.f) : lineChartView.getBottom();
            Context context3 = accountSelectionNavBarContentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iK2 = kli.a.k(context3, 12.0f);
            FooterTextView footerTextView = this.f59187m;
            if (footerTextView.getVisibility() == 0) {
                paddingTop = footerTextView.getTop();
            } else {
                ActionsView actionsView = this.i;
                paddingTop = actionsView.getPaddingTop() + actionsView.getTop();
            }
            this.k = Math.max(((paddingTop + iQ) - i) / 2, Math.min((paddingTop - iK2) - i, iK));
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52474l() {
            return this.f59195x;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, tx0.x] */
        /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, tx0.x] */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View v, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
            ActionsView actionsView;
            int i33;
            int top;
            View view;
            View view2;
            Intrinsics.checkNotNullParameter(v, "v");
            int measuredHeight = this.itemView.getMeasuredHeight();
            AccountSelectionNavBarContentView accountSelectionNavBarContentView = this.f59196y;
            Context context = accountSelectionNavBarContentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iC = measuredHeight - d5.c(context);
            ?? r3 = accountSelectionNavBarContentView.S;
            int measuredHeight2 = (r3 == 0 || (view2 = r3.getView()) == null) ? 0 : view2.getMeasuredHeight();
            ActionsView actionsView2 = this.i;
            ActionsView actionsView3 = actionsView2.getVisibility() == 0 ? actionsView2 : null;
            int paddingTop = actionsView3 != null ? actionsView3.getPaddingTop() + actionsView3.getTop() : this.itemView.getMeasuredHeight();
            int height = accountSelectionNavBarContentView.getHeight();
            int i43 = accountSelectionNavBarContentView.H;
            CircleActionView.Companion aVar = CircleActionView.INSTANCE;
            Context context2 = accountSelectionNavBarContentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iA = CircleActionView.Companion.a(aVar, context2) + i43;
            Context context3 = accountSelectionNavBarContentView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iK = (height - (kli.a.k(context3, 16.0f) + iA)) - measuredHeight2;
            ?? r4 = accountSelectionNavBarContentView.S;
            if (r4 == 0 || (view = r4.getView()) == null || view.getVisibility() != 0) {
                iK = paddingTop;
            }
            int i59 = this.f59191r;
            int i66 = this.f59192s;
            int i74 = i66 * 2;
            int i92 = (iK - i59) - i74;
            LineChartView lineChartView = this.f59183g;
            int visibility = lineChartView.getVisibility();
            NavBarContentCenterView navBarContentCenterView = this.f;
            if (visibility == 0) {
                View view3 = this.itemView;
                Intrinsics.i(view3, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.layouts.PermissiveFrameLayout");
                tr0.a aVar2 = (tr0.a) view3;
                actionsView = actionsView2;
                i33 = paddingTop;
                int iQ = kotlin.jvm.internal.s.q(navBarContentCenterView) + navBarContentCenterView.d(v2.TOP, accountSelectionNavBarContentView.G, aVar2.getMeasuredHeight(), i92);
                int i96 = (iK - iQ) - i74;
                if (i96 >= i59) {
                    lineChartView.measure(View.MeasureSpec.makeMeasureSpec((aVar2.getMeasuredWidth() - aVar2.getPaddingStart()) - aVar2.getPaddingEnd(), 1073741824), View.MeasureSpec.makeMeasureSpec(i96, 1073741824));
                    if (lineChartView.getParent() == null) {
                        aVar2.addViewInLayout(lineChartView, -1, (FrameLayout.LayoutParams) this.v.getValue(), true);
                    }
                    lineChartView.layout(aVar2.getPaddingLeft(), iQ + i66, aVar2.getWidth() - aVar2.getPaddingRight(), iK - i66);
                } else if (lineChartView.getParent() != null) {
                    aVar2.removeViewInLayout(lineChartView);
                }
            } else {
                actionsView = actionsView2;
                i33 = paddingTop;
            }
            HeaderDisclaimerTextView headerDisclaimerTextView = this.f59186l;
            int measuredHeight3 = headerDisclaimerTextView.getVisibility() == 0 ? headerDisclaimerTextView.getMeasuredHeight() : 0;
            boolean z3 = lineChartView.getVisibility() == 0 && lineChartView.getParent() != null;
            if (!z3) {
                i92 = (i33 - (measuredHeight2 * 2)) - this.u;
            }
            v2 contentAlignment = z3 ? v2.TOP : accountSelectionNavBarContentView.F;
            int i99 = accountSelectionNavBarContentView.G + measuredHeight3;
            navBarContentCenterView.getClass();
            Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
            navBarContentCenterView.offsetTopAndBottom(navBarContentCenterView.d(contentAlignment, i99, iC, i92));
            if (headerDisclaimerTextView.getVisibility() == 0 && (top = accountSelectionNavBarContentView.G - headerDisclaimerTextView.getTop()) != 0) {
                headerDisclaimerTextView.offsetTopAndBottom(top);
            }
            if (this.f59187m.getVisibility() == 0) {
                or0.u.y(this.f59187m, 0, 0, 0, actionsView.getMeasuredHeight() + this.f59193t, 7);
            }
            H(measuredHeight2);
            View view4 = this.itemView;
            Intrinsics.i(view4, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.layouts.PermissiveFrameLayout");
            tr0.a aVar3 = (tr0.a) view4;
            int top2 = navBarContentCenterView.getTop() - accountSelectionNavBarContentView.G;
            TickerTapeView tickerTapeView = this.f59184h;
            boolean z4 = top2 >= tickerTapeView.getMeasuredHeight();
            if (z4) {
                tickerTapeView.measure(View.MeasureSpec.makeMeasureSpec((aVar3.getMeasuredWidth() - aVar3.getPaddingStart()) - aVar3.getPaddingEnd(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                if (tickerTapeView.getParent() == null) {
                    aVar3.addViewInLayout(tickerTapeView, -1, tickerTapeView.getLayoutParams(), true);
                }
                tickerTapeView.layout(aVar3.getPaddingLeft(), aVar3.getPaddingTop(), tickerTapeView.getMeasuredWidth() + aVar3.getPaddingLeft(), tickerTapeView.getMeasuredHeight() + aVar3.getPaddingTop());
            } else if (tickerTapeView.getParent() != null) {
                accountSelectionNavBarContentView.removeViewInLayout(tickerTapeView);
            }
            if (z4) {
                tickerTapeView.offsetTopAndBottom(accountSelectionNavBarContentView.G - tickerTapeView.getTop());
            }
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f59195x = parcelable;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b {

        @NotNull
        public static final a Companion = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59197a;

        public static final class a {
            private a() {
            }
        }

        public b() {
            this(-1);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && this.f59197a == ((b) obj2).f59197a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f59197a);
        }

        public b(int i) {
            this.f59197a = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountSelectionNavBarContentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        z4l.j jVar = new z4l.j(7, zhm.u.c(new PageDelegate()), false);
        this.f = jVar;
        this.f59168g = v0.a.d("create(...)");
        this.f59169h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f59170j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        this.f59171l = v0.a.d("create(...)");
        this.f59172m = v0.a.d("create(...)");
        this.f59173n = v0.a.d("create(...)");
        this.o = v0.a.d("create(...)");
        ihm.b bVarE = ihm.b.e(new tx0.z("ID_NULL_PAGE", true));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f59174p = bVarE;
        this.f59175q = v0.a.d("create(...)");
        this.f59176r = v0.a.d("create(...)");
        this.f59177s = v0.a.d("create(...)");
        this.f59178t = v0.a.d("create(...)");
        this.u = v0.a.d("create(...)");
        this.v = "ID_NULL_PAGE";
        this.f59180x = "ID_NULL_PAGE";
        this.f59181y = true;
        this.z = true;
        this.A = new ifm.b();
        this.F = v2.CENTER;
        this.I = f0.f322471a;
        this.J = tx0.c.STANDARD;
        this.Q = 1.0f;
        this.R = new vx0.d();
        this.T = tx0.p.f275219a;
        WallpaperView wallpaperView = new WallpaperView(context, null, Integer.valueOf(R$id.accountsNavBarContent_navBarProjection), false, 58);
        wallpaperView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        wallpaperView.setId(R$id.accountSelectionNavBarContent_backgroundView);
        wallpaperView.c();
        this.backgroundView = wallpaperView;
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewPager2.setAdapter(jVar);
        this.d = viewPager2;
        viewPager2.registerOnPageChangeCallback(new tx0.v(this));
        RecyclerView recyclerViewA = j0.a(viewPager2);
        this.e = recyclerViewA;
        recyclerViewA.setOverScrollMode(2);
        recyclerViewA.setItemAnimator(null);
        NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(context, null, 6, 0 == true ? 1 : 0);
        nestedScrollableHost.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        nestedScrollableHost.addView(viewPager2);
        this.f59167c = nestedScrollableHost;
        addView(wallpaperView);
        addView(nestedScrollableHost);
    }

    public static ViewGroup.LayoutParams c(Context context, tx0.c cVar) {
        int iB;
        Intrinsics.checkNotNullParameter(context, "context");
        if ((cVar == null ? -1 : tx0.b0.f275085a[cVar.ordinal()]) == 1) {
            int iA = CircleActionView.Companion.a(CircleActionView.INSTANCE, context);
            Intrinsics.checkNotNullParameter(context, "context");
            iB = kotlin.ranges.f.g(((int) (c8g.c.G(context) * 0.6f)) - iA, kli.a.k(context, 396.0f), kli.a.k(context, 600.0f));
        } else {
            iB = d5.b(context);
        }
        return new ViewGroup.LayoutParams(-1, d5.c(context) + iB);
    }

    private final float getPagerIndicatorTargetAlpha() {
        return vx0.c.a(this.R.f292776c) * this.Q;
    }

    public static /* synthetic */ void setModel$default(AccountSelectionNavBarContentView accountSelectionNavBarContentView, tx0.r rVar, tx0.q qVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            qVar = tx0.p.f275219a;
        }
        accountSelectionNavBarContentView.setModel(rVar, qVar);
    }

    public static /* synthetic */ void setModels$default(AccountSelectionNavBarContentView accountSelectionNavBarContentView, List list, tx0.q qVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            qVar = tx0.p.f275219a;
        }
        accountSelectionNavBarContentView.setModels(list, qVar);
    }

    @Override // tx0.x2
    public final void H(int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 16.0f) + i;
        if (this.H != iK) {
            this.H = iK;
            RecyclerView recyclerView = this.e;
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Object tag2 = recyclerView.getChildAt(i2).getTag();
                Intrinsics.i(tag2, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.PageViewHolder");
                PageViewHolder pageViewHolder = (PageViewHolder) tag2;
                int i3 = pageViewHolder.f59196y.H;
                ActionsView actionsView = pageViewHolder.i;
                if (actionsView.getPaddingBottom() != i3) {
                    actionsView.setPadding(actionsView.getPaddingLeft(), actionsView.getPaddingTop(), actionsView.getPaddingRight(), i3);
                }
            }
        }
    }

    @Override // tx0.x2
    public final ViewGroup.LayoutParams N(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c(context, this.J);
    }

    public final void a() {
        RecyclerView recyclerView = this.e;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object tag2 = recyclerView.getChildAt(i).getTag();
            Intrinsics.i(tag2, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.PageViewHolder");
            ((PageViewHolder) tag2).f.setSensitiveBalanceVisible$ui_kit_components_release(this.z);
        }
    }

    @Override // sxl.b
    public final void b(txl.e nudge) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        ViewPager2 viewPager2 = this.d;
        if (viewPager2.isFakeDragging()) {
            viewPager2.endFakeDrag();
            if (viewPager2.beginFakeDrag()) {
                viewPager2.endFakeDrag();
            }
        }
        this.W = BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View, tx0.x] */
    @Override // tx0.x2
    public final void d(float f, int i) {
        View view;
        this.f59164a0 = i;
        this.backgroundView.d(f, i);
        RecyclerView recyclerView = this.e;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Object tag2 = recyclerView.getChildAt(i2).getTag();
            Intrinsics.i(tag2, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.PageViewHolder");
            float f4 = (-i) * 0.08f;
            float fA = vx0.c.a(f);
            for (View view2 : ((PageViewHolder) tag2).f59194w) {
                view2.setTranslationY(f4);
                view2.setAlpha(fA);
            }
        }
        vx0.d dVar = this.R;
        dVar.f292775b = i;
        dVar.f292776c = f;
        float f5 = dVar.f292774a;
        float f6 = (-i) * 0.08f;
        dVar.f292774a = f6;
        float f32 = f6 - f5;
        ?? r112 = this.S;
        if (r112 == 0 || (view = r112.getView()) == null) {
            return;
        }
        view.setTranslationY(view.getTranslationY() + f32);
        view.setAlpha(getPagerIndicatorTargetAlpha());
    }

    @Override // tx0.x2
    public final void d0(int i) {
        if (this.G != i) {
            this.G = i;
            RecyclerView recyclerView = this.e;
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Object tag2 = recyclerView.getChildAt(i2).getTag();
                Intrinsics.i(tag2, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.PageViewHolder");
                ((PageViewHolder) tag2).f59196y.requestLayout();
            }
        }
    }

    public final void e(PageViewHolder pageViewHolder, tx0.g gVar) {
        tx0.k kVar = gVar.k;
        if (kVar == null) {
            return;
        }
        if (!(kVar instanceof tx0.i)) {
            if (!(kVar instanceof tx0.j)) {
                throw new NoWhenBranchMatchedException();
            }
            tx0.j jVar = (tx0.j) kVar;
            AnimationRequest animationRequest = jVar.f275164a;
            if (animationRequest.f57724a) {
                return;
            }
            ActionsView actionsView = pageViewHolder.i;
            Set ids = jVar.f275165b;
            actionsView.getClass();
            Intrinsics.checkNotNullParameter(ids, "ids");
            actionsView.h(ids, mx0.y.f);
            animationRequest.f57724a = true;
            return;
        }
        d1 d1Var = this.f59166b0;
        if (d1Var == null) {
            return;
        }
        tx0.i iVar = (tx0.i) kVar;
        m3 product = iVar.f275155a;
        g0 g0Var = (g0) d1Var;
        if (g0Var.f(product) && isAttachedToWindow() && !this.C && !hasTransientState() && this.E == 0) {
            Intrinsics.checkNotNullParameter(product, "product");
            ((AccountsNavBarContentView) g0Var.f272384b).setIntroViewed(product);
            ActionsView actionsView2 = pageViewHolder.i;
            Set ids2 = iVar.f275156b;
            actionsView2.getClass();
            Intrinsics.checkNotNullParameter(ids2, "ids");
            actionsView2.h(ids2, mx0.y.f);
        }
    }

    @Override // sxl.b
    public final void f(txl.e nudge, float f) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        ViewPager2 viewPager2 = this.d;
        if (viewPager2.isFakeDragging()) {
            float f4 = viewPager2.getLayoutDirection() == 1 ? 1.0f : -1.0f;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fL = kli.a.l(context, 126.0f);
            RecyclerView recyclerView = this.e;
            float width = (recyclerView.getWidth() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd();
            if (width > BitmapDescriptorFactory.HUE_RED) {
                fL = Math.min(fL, (width / 2.0f) - 1.0f);
            }
            float f5 = f4 * fL * f;
            if (viewPager2.fakeDragBy(f5 - this.W)) {
                this.W = f5;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, tx0.x] */
    @Override // sxl.b
    public final sxl.a g(txl.e nudge) {
        View view;
        float fL;
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        ?? r56 = this.S;
        if (r56 == 0 || (view = r56.getView()) == null) {
            return null;
        }
        float y2 = view.getY() + view.getHeight();
        View childAt = this.e.getChildAt(0);
        Object tag2 = childAt != null ? childAt.getTag() : null;
        PageViewHolder pageViewHolder = tag2 instanceof PageViewHolder ? (PageViewHolder) tag2 : null;
        if ((pageViewHolder != null ? pageViewHolder.i : null) != null) {
            fL = ((y2 + r0.getTop()) + r0.getPaddingTop()) / 2.0f;
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fL = y2 + kli.a.l(context, 22.0f);
        }
        float width = getWidth();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new sxl.a(width - kli.a.l(context2, 32.0f), fL);
    }

    public View getActionsForTransition() {
        View childAt = this.e.getChildAt(0);
        Object tag2 = childAt != null ? childAt.getTag() : null;
        PageViewHolder pageViewHolder = tag2 instanceof PageViewHolder ? (PageViewHolder) tag2 : null;
        if (pageViewHolder != null) {
            return pageViewHolder.i;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getBackgroundView$ui_kit_components_release, reason: from getter */
    public final WallpaperView getBackgroundView() {
        return this.backgroundView;
    }

    public final NavBarWithContainerBackground getCurrentBackground() {
        return this.backgroundView.getCurrentBackground();
    }

    public final Function2<String, Integer, Unit> getOnPagingStateChanged$ui_kit_components_release() {
        return this.onPagingStateChanged;
    }

    public final View h() {
        NavBarContentCenterView navBarContentCenterView;
        PageViewHolder pageViewHolderL = l();
        if (pageViewHolderL == null || (navBarContentCenterView = pageViewHolderL.f) == null) {
            return null;
        }
        return navBarContentCenterView.getContentBoundsView$ui_kit_components_release();
    }

    @Override // sxl.b
    public final boolean i(txl.e nudge) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        if (!Intrinsics.f(((lie.a) nudge).c(), txl.c.f275435a) || this.f59164a0 != 0) {
            return false;
        }
        z4l.j jVar = this.f;
        if (jVar.f319395l.size() <= 1) {
            return false;
        }
        ViewPager2 viewPager2 = this.d;
        return viewPager2.getCurrentItem() < jVar.f319395l.size() - 1 && this.E == 0 && !viewPager2.isFakeDragging();
    }

    @Override // sxl.b
    public final void j(txl.e nudge) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        this.d.beginFakeDrag();
        this.W = BitmapDescriptorFactory.HUE_RED;
    }

    public final View k() {
        NavBarContentCenterView navBarContentCenterView;
        PageViewHolder pageViewHolderL = l();
        if (pageViewHolderL == null || (navBarContentCenterView = pageViewHolderL.f) == null) {
            return null;
        }
        return navBarContentCenterView.getMainTextBoundsView$ui_kit_components_release();
    }

    public final PageViewHolder l() {
        Iterator it8 = this.I.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((tx0.r) it8.next()).getId(), this.v)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.e.findViewHolderForAdapterPosition(numValueOf != null ? numValueOf.intValue() : this.d.getCurrentItem());
        if (viewHolderFindViewHolderForAdapterPosition instanceof PageViewHolder) {
            return (PageViewHolder) viewHolderFindViewHolderForAdapterPosition;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View, tx0.x] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View, tx0.x] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, tx0.x] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View, tx0.x] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, tx0.x] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.view.View, tx0.x] */
    /* JADX WARN: Type inference failed for: r13v6, types: [android.view.View, tx0.x] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.util.List r12, ux0.d1 r13, tx0.q r14) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.m(java.util.List, ux0.d1, tx0.q):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, tx0.x] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, tx0.x] */
    public final void o(v1 v1Var, int i, int i2, int i3) {
        View view;
        tx0.q qVar = this.T;
        if (qVar instanceof tx0.o) {
            ?? r06 = this.S;
            if (r06 == 0 || (view = r06.getView()) == null) {
                return;
            }
            foh.i.e(view, v1Var, i, i2, i3);
            return;
        }
        if (!(qVar instanceof tx0.p)) {
            throw new NoWhenBranchMatchedException();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(v1Var.a(), context);
        ?? r4 = this.S;
        if (r4 != 0) {
            r4.setIndicatorColors(iS, iS);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sxl.c cVar = sxl.e.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cVar.getClass();
        sxl.c.a(context).a(this);
        ifm.c cVarSubscribe = this.backgroundView.f57381b.h().subscribe(new twl.h(7, new tx0.a(this, 1)));
        ifm.b bVar = this.A;
        te0.w.j0(bVar, cVarSubscribe);
        AnimatedBackgroundView animatedBackgroundViewI = jb3.l.i(js0.f.Companion, this);
        if (animatedBackgroundViewI != null) {
            te0.w.j0(bVar, animatedBackgroundViewI.f51492b.subscribe(new twl.h(8, new tx0.a(this, 2))));
        }
        p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A.d();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, tx0.x] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int measuredHeight;
        this.C = true;
        super.onLayout(z, i, i2, i3, i5);
        boolean z3 = this.D;
        RecyclerView recyclerView = this.e;
        if (z3) {
            if (recyclerView.canScrollHorizontally(1)) {
                recyclerView.scrollBy(1, 0);
                recyclerView.scrollBy(-1, 0);
            } else if (recyclerView.canScrollHorizontally(-1)) {
                recyclerView.scrollBy(-1, 0);
                recyclerView.scrollBy(1, 0);
            }
            this.D = false;
        }
        ?? r56 = this.S;
        View view = r56 != 0 ? r56.getView() : null;
        if (view != null && view.getVisibility() == 0 && (measuredHeight = view.getMeasuredHeight()) > 0) {
            int childCount = recyclerView.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                Object tag2 = recyclerView.getChildAt(i6).getTag();
                Intrinsics.i(tag2, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.PageViewHolder");
                ((PageViewHolder) tag2).H(measuredHeight);
            }
        }
        this.C = false;
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.view.View, tx0.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.p():void");
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.K = colorScheme;
        this.L = i;
        this.M = i2;
        this.N = i3;
        RecyclerView recyclerView = this.e;
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            Object tag2 = recyclerView.getChildAt(i5).getTag();
            Intrinsics.i(tag2, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.PageViewHolder");
            ((PageViewHolder) tag2).F();
        }
        o(colorScheme, i, i2, i3);
    }

    public final void setBackgroundAlpha$ui_kit_components_release(float alpha) {
        this.backgroundView.setAlpha(alpha);
    }

    @Override // tx0.x2
    public void setBackgroundOffset(int offset) {
        setClipChildren(offset == 0);
        this.backgroundView.setOffset(offset);
    }

    @Override // tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.B = listener;
    }

    public final void setContentAlignment(@NotNull v2 alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        if (this.F != alignment) {
            this.F = alignment;
            RecyclerView recyclerView = this.e;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Object tag2 = recyclerView.getChildAt(i).getTag();
                Intrinsics.i(tag2, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.PageViewHolder");
                PageViewHolder pageViewHolder = (PageViewHolder) tag2;
                AccountSelectionNavBarContentView accountSelectionNavBarContentView = pageViewHolder.f59196y;
                if (accountSelectionNavBarContentView.F != null) {
                    accountSelectionNavBarContentView.requestLayout();
                    if (!pageViewHolder.itemView.isLayoutRequested()) {
                        pageViewHolder.itemView.requestLayout();
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, tx0.x] */
    public final void setContentAlpha$ui_kit_components_release(float alpha) {
        View view;
        this.Q = alpha;
        this.f59167c.setAlpha(alpha);
        ?? r2 = this.S;
        if (r2 == 0 || (view = r2.getView()) == null) {
            return;
        }
        view.setAlpha(getPagerIndicatorTargetAlpha());
    }

    public final void setContentTranslationY(float translationY) {
        this.d.setTranslationY(translationY);
    }

    public void setCurrentPage(@NotNull String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        if (this.E != 0) {
            this.f59179w = true;
            return;
        }
        Iterator it8 = this.I.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.f(((tx0.r) it8.next()).getId(), modelId)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            ViewPager2 viewPager2 = this.d;
            if (i != viewPager2.getCurrentItem() || Intrinsics.f(this.v, modelId)) {
                viewPager2.setCurrentItem(i, false);
            } else {
                viewPager2.setCurrentItem((i != 0 || this.I.size() <= 1) ? 0 : this.I.size() - 1, false);
                viewPager2.setCurrentItem(i, false);
            }
            if (isLayoutRequested()) {
                this.f59179w = true;
                this.f59174p.onNext(new tx0.z(this.v, true));
            }
            Function2 function2 = this.onPagingStateChanged;
            if (function2 != null) {
                function2.invoke(modelId, Integer.valueOf(this.E));
            }
        }
    }

    public final void setDefaultBackgroundColor$ui_kit_components_release(int color) {
        this.backgroundView.setDefaultBackgroundColor(color);
    }

    @Override // android.view.View
    public void setHasTransientState(boolean hasTransientState) {
        super.setHasTransientState(hasTransientState);
        if (hasTransientState()) {
            return;
        }
        p();
    }

    public final void setHiddenPageIds(Set<String> hiddenPageIds, boolean updateBackgroundForHiddenPage) {
        if (Intrinsics.f(this.U, hiddenPageIds) && this.V == updateBackgroundForHiddenPage) {
            return;
        }
        this.U = hiddenPageIds;
        this.V = updateBackgroundForHiddenPage;
        p();
    }

    public final void setModel(@NotNull tx0.r model, @NotNull tx0.q pagerIndicatorType) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        m(zhm.u.c(model), null, pagerIndicatorType);
    }

    public final void setModels(@NotNull List<? extends tx0.r> models, @NotNull tx0.q pagerIndicatorType) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        m(models, null, pagerIndicatorType);
    }

    public final void setOnPagingStateChanged$ui_kit_components_release(Function2<? super String, ? super Integer, Unit> function2) {
        this.onPagingStateChanged = function2;
    }

    public void setPageChangeTrackingEnabled(boolean enabled) {
        this.f59181y = enabled;
    }

    public final void setSensitiveBalanceVisible$ui_kit_components_release(boolean visible) {
        this.z = visible;
        a();
    }

    public final void setModels(@NotNull List<? extends tx0.r> models, @NotNull d1 productIntroStateProvider, @NotNull tx0.q pagerIndicatorType) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(productIntroStateProvider, "productIntroStateProvider");
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        m(models, productIntroStateProvider, pagerIndicatorType);
    }

    public final void setModel(@NotNull tx0.y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountSelectionNavBarContentView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
