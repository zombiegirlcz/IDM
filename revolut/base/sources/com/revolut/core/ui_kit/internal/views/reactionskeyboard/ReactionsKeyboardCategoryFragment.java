package com.revolut.core.ui_kit.internal.views.reactionskeyboard;

import a08.g0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.ReactionsKeyboardItemDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import efm.c0;
import efm.r;
import ihm.f;
import ip0.u90;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import lak.l;
import le.u1;
import lr9.m;
import lu0.d;
import lu0.g;
import lu0.h;
import lu0.v;
import ms0.h4;
import no.d1;
import org.jetbrains.annotations.NotNull;
import r9i.e;
import te0.w;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/ReactionsKeyboardCategoryFragment;", "Landroidx/fragment/app/Fragment;", "Lno/d1;", "<init>", "()V", "Companion", "lu0/d", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactionsKeyboardCategoryFragment extends Fragment implements d1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f57480o0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final j90.c f57481a0 = u1.x(this, R$id.ReactionsKeyboardView_fullScreenState);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final j90.c f57482b0 = u1.x(this, R$id.ReactionsKeyboardView_contentRecyclerView);
    public final j90.c c0 = u1.x(this, R$id.ReactionsKeyboardView_loadingView);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f57483d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f57484e0;
    public Clause f0;
    public Clause g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ReactionsKeyboardItemDelegate f57485h0;
    public final j i0;
    public final h j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final h f57486k0;
    public final h l0;
    public final f m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public d f57487n0;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardCategoryFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        h0 h0Var = new h0(ReactionsKeyboardCategoryFragment.class, "fullScreenState", "getFullScreenState()Lcom/revolut/core/ui_kit/views/FullScreenStateView;", 0);
        p0 p0Var = o0.f186429a;
        f57480o0 = new KProperty[]{p0Var.j(h0Var), p.a.y(ReactionsKeyboardCategoryFragment.class, "contentRecyclerView", "getContentRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, p0Var), p.a.y(ReactionsKeyboardCategoryFragment.class, "loadingView", "getLoadingView()Landroidx/recyclerview/widget/RecyclerView;", 0, p0Var), v0.a.s(ReactionsKeyboardCategoryFragment.class, "itemsDisposable", "getItemsDisposable()Lio/reactivex/disposables/Disposable;", 0, p0Var), v0.a.s(ReactionsKeyboardCategoryFragment.class, "itemsClickDisposable", "getItemsClickDisposable()Lio/reactivex/disposables/Disposable;", 0, p0Var), v0.a.s(ReactionsKeyboardCategoryFragment.class, "errorButtonDisposable", "getErrorButtonDisposable()Lio/reactivex/disposables/Disposable;", 0, p0Var)};
        INSTANCE = new Companion();
    }

    public ReactionsKeyboardCategoryFragment() {
        ReactionsKeyboardItemDelegate reactionsKeyboardItemDelegate = new ReactionsKeyboardItemDelegate();
        this.f57485h0 = reactionsKeyboardItemDelegate;
        this.i0 = new j(new koi.c(u.c(reactionsKeyboardItemDelegate)), false, 14);
        this.j0 = new h(null, 0);
        this.f57486k0 = new h(null, 0);
        this.l0 = new h(null, 0);
        this.m0 = v0.a.d("create(...)");
    }

    public final FullScreenStateView A() {
        return (FullScreenStateView) this.f57481a0.getValue(this, f57480o0[0]);
    }

    public final RecyclerView B() {
        return (RecyclerView) this.c0.getValue(this, f57480o0[2]);
    }

    public final void d(e eVar) {
        r rVarJust;
        String typeId = this.f57483d0;
        if (typeId == null) {
            Intrinsics.r("typeId");
            throw null;
        }
        String categoryId = this.f57484e0;
        if (categoryId == null) {
            Intrinsics.r("categoryId");
            throw null;
        }
        Intrinsics.checkNotNullParameter(typeId, "reactionTypeId");
        Intrinsics.checkNotNullParameter(categoryId, "reactionTypeCategoryId");
        q9i.b bVar = eVar.f252732a;
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        if (typeId.equals("type_gif")) {
            rVarJust = bVar.f243906a.a(categoryId);
        } else if (typeId.equals("type_sticker")) {
            rVarJust = bVar.f243907b.a(categoryId);
        } else {
            rVarJust = r.just(zi0.c.O(new IllegalStateException("Unknown type id: ".concat(typeId))));
            Intrinsics.h(rVarJust);
        }
        r rVarF = m70.a.f(rVarJust, new qk2.h(eVar, 15), new r6d.h(23), r9i.d.f252731a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r rVarDistinctUntilChanged = w.y(rVarF, 50L).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarRepeatWhen = rVarDistinctUntilChanged.repeatWhen(new m(new lu0.c(this, 2), 14));
        c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        r rVarObserveOn = rVarRepeatWhen.observeOn(c0Var);
        Intrinsics.checkNotNullExpressionValue(rVarObserveOn, "observeOn(...)");
        lu0.c cVar = new lu0.c(this, 3);
        r rVarOnErrorResumeNext = rVarObserveOn.onErrorResumeNext(new lhi.b(1, new l(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g0(28, cVar), new g0(28, lu0.e.f199989a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        this.j0.setValue(this, f57480o0[3], cVarSubscribe);
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ARG_TYPE_ID") : null;
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f57483d0 = string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("ARG_CATEGORY_ID") : null;
        if (string2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f57484e0 = string2;
        Bundle arguments3 = getArguments();
        Clause clause = arguments3 != null ? (Clause) arguments3.getParcelable("ARG_ERROR_MESSAGE") : null;
        if (clause == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f0 = clause;
        Bundle arguments4 = getArguments();
        Clause clause2 = arguments4 != null ? (Clause) arguments4.getParcelable("ARG_ERROR_ACTION") : null;
        if (clause2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.g0 = clause2;
        f fVar = (f) this.f57485h0.f53148c.getValue();
        lu0.c cVar = new lu0.c(this, 1);
        r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new lhi.b(1, new l(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g0(28, cVar), new g0(28, lu0.f.f199990a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        this.f57486k0.setValue(this, f57480o0[4], cVarSubscribe);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.internal_reactions_keyboard_category_fragment_view, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        KProperty[] kPropertyArr = f57480o0;
        this.f57486k0.setValue(this, kPropertyArr[4], null);
        this.l0.setValue(this, kPropertyArr[5], null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        d dVar = this.f57487n0;
        if (dVar != null) {
            e eVar = dVar.f199986a;
            RecyclerView.OnScrollListener onScrollListener = dVar.f199988c;
            d(eVar);
            z().addOnScrollListener(onScrollListener);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.j0.setValue(this, f57480o0[3], null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView recyclerViewZ = z();
        recyclerViewZ.setAdapter(this.i0);
        recyclerViewZ.setHasFixedSize(true);
        recyclerViewZ.setItemAnimator(null);
        Context context = recyclerViewZ.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerViewZ.addItemDecoration(new v(kli.a.k(context, 1.0f)));
        recyclerViewZ.setLayoutManager(new StaggeredGridLayoutManager(3, 1));
        int dimensionPixelSize = recyclerViewZ.getContext().getResources().getDimensionPixelSize(R$dimen.internal_reactions_keyboard_bottom_bar_height);
        int paddingLeft = recyclerViewZ.getPaddingLeft();
        Context context2 = recyclerViewZ.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerViewZ.setPadding(paddingLeft, kli.a.k(context2, 44.0f), recyclerViewZ.getPaddingRight(), dimensionPixelSize);
        recyclerViewZ.setClipToPadding(false);
        FullScreenStateView fullScreenStateViewA = A();
        fullScreenStateViewA.setTitleText(null);
        FullScreenStateView.setCaptionText$default(fullScreenStateViewA, null, null, 2, null);
        fullScreenStateViewA.setMainAction(null);
        int paddingLeft2 = fullScreenStateViewA.getPaddingLeft();
        Context context3 = fullScreenStateViewA.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        fullScreenStateViewA.setPadding(paddingLeft2, kli.a.k(context3, 44.0f), fullScreenStateViewA.getPaddingRight(), fullScreenStateViewA.getPaddingBottom());
        FullScreenStateView.setImage$default(fullScreenStateViewA, null, null, 2, null);
        j jVar = new j(new koi.c(u.c(new ReactionsKeyboardItemDelegate())), false, 14);
        RecyclerView recyclerViewB = B();
        recyclerViewB.setItemAnimator(null);
        recyclerViewB.setHasFixedSize(true);
        Context context4 = recyclerViewB.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        recyclerViewB.addItemDecoration(new v(kli.a.k(context4, 1.0f)));
        recyclerViewB.setLayoutManager(new StaggeredGridLayoutManager() { // from class: com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardCategoryFragment$initLoadingView$1$1
            @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return false;
            }
        });
        recyclerViewB.setAdapter(jVar);
        IntRange intRangeO = kotlin.ranges.f.o(0, 21);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new u90(null, 1, 1, false, false, a0.d.n("LOADING_ITEM_", it8.nextInt()), null));
        }
        jVar.c(arrayList);
        int paddingLeft3 = recyclerViewB.getPaddingLeft();
        Context context5 = recyclerViewB.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        recyclerViewB.setPadding(paddingLeft3, kli.a.k(context5, 44.0f), recyclerViewB.getPaddingRight(), recyclerViewB.getPaddingBottom());
        recyclerViewB.setClipToPadding(false);
        FullScreenStateView fullScreenStateViewA2 = A();
        Clause clause = this.f0;
        if (clause == null) {
            Intrinsics.r("errorMessage");
            throw null;
        }
        FullScreenStateView.setCaptionText$default(fullScreenStateViewA2, clause, null, 2, null);
        FullScreenStateView fullScreenStateViewA3 = A();
        Clause clause2 = this.g0;
        if (clause2 == null) {
            Intrinsics.r("errorAction");
            throw null;
        }
        fullScreenStateViewA3.setMainAction(new l6(12, clause2, null, h4.ACCENT));
        f fVar = A().getSmallActionButton().f56386h;
        lu0.c cVar = new lu0.c(this, 0);
        r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new lhi.b(1, new l(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g0(28, cVar), new g0(28, g.f199991a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        this.l0.setValue(this, f57480o0[5], cVarSubscribe);
        z().setVisibility(8);
        B().setVisibility(8);
        A().setVisibility(8);
    }

    public final RecyclerView z() {
        return (RecyclerView) this.f57482b0.getValue(this, f57480o0[1]);
    }
}
