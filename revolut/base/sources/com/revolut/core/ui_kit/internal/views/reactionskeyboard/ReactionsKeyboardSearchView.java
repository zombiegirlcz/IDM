package com.revolut.core.ui_kit.internal.views.reactionskeyboard;

import a0.d;
import a0d.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.ReactionsKeyboardItemDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FullScreenStateView;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import efm.c0;
import efm.r;
import ihm.f;
import ip0.u90;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.z;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import lkf.f0;
import lu0.h;
import lu0.k;
import lu0.l;
import lu0.o;
import lu0.v;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import z4l.j;
import zhm.u;
import zhm.w;
import zx0.i;
import zx0.m;
import zx0.n;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 =2\u00020\u0001:\u0002>\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R/\u0010/\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R/\u00103\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R/\u00107\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R$\u0010<\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0006\u0012\u0004\u0018\u00010'088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/ReactionsKeyboardSearchView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "", "setEmptySearchTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "message", "action", "setErrorMessage", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit/views/FullScreenStateView;", "a", "Le8/q;", "getFullScreenState", "()Lcom/revolut/core/ui_kit/views/FullScreenStateView;", "fullScreenState", "Landroidx/recyclerview/widget/RecyclerView;", "b", "getContentRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "contentRecyclerView", "c", "getLoadingView", "loadingView", "Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Regular;", "g", "Lkotlin/Lazy;", "getEmptySearchImage", "()Lcom/revolut/core/ui_kit/image/type/complex/ComplexImage$Regular;", "emptySearchImage", "Lifm/c;", "<set-?>", "j", "Lkotlin/properties/ReadWriteProperty;", "getItemsDisposable", "()Lifm/c;", "setItemsDisposable", "(Lifm/c;)V", "itemsDisposable", "k", "getItemsClickDisposable", "setItemsClickDisposable", "itemsClickDisposable", "l", "getErrorButtonDisposable", "setErrorButtonDisposable", "errorButtonDisposable", "Lkotlin/properties/ReadWriteProperty;", "", "getDisposableDelegate", "()Lkotlin/properties/ReadWriteProperty;", "disposableDelegate", "Companion", "lu0/l", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactionsKeyboardSearchView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f57488n;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q fullScreenState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q contentRecyclerView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q loadingView;
    public Clause d;
    public Clause e;
    public Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Lazy emptySearchImage;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReactionsKeyboardItemDelegate f57493h;
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final ReadWriteProperty itemsDisposable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final ReadWriteProperty itemsClickDisposable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final ReadWriteProperty errorButtonDisposable;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f57496m;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardSearchView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        z zVar = new z(ReactionsKeyboardSearchView.class, "itemsDisposable", "getItemsDisposable()Lio/reactivex/disposables/Disposable;", 0);
        p0 p0Var = o0.f186429a;
        f57488n = new KProperty[]{p0Var.f(zVar), v0.a.s(ReactionsKeyboardSearchView.class, "itemsClickDisposable", "getItemsClickDisposable()Lio/reactivex/disposables/Disposable;", 0, p0Var), v0.a.s(ReactionsKeyboardSearchView.class, "errorButtonDisposable", "getErrorButtonDisposable()Lio/reactivex/disposables/Disposable;", 0, p0Var)};
        INSTANCE = new Companion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionsKeyboardSearchView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(ReactionsKeyboardSearchView reactionsKeyboardSearchView, Pair pair) {
        String str = (String) pair.f186385a;
        n nVar = (n) pair.f186386b;
        if (str.length() == 0) {
            reactionsKeyboardSearchView.getContentRecyclerView().setVisibility(8);
            reactionsKeyboardSearchView.getFullScreenState().setVisibility(8);
            reactionsKeyboardSearchView.getLoadingView().setVisibility(8);
        } else if (nVar instanceof n.b) {
            reactionsKeyboardSearchView.getContentRecyclerView().setVisibility(8);
            reactionsKeyboardSearchView.getFullScreenState().setVisibility(8);
            reactionsKeyboardSearchView.getLoadingView().setVisibility(0);
        } else if (nVar instanceof n.a) {
            reactionsKeyboardSearchView.getContentRecyclerView().setVisibility(8);
            reactionsKeyboardSearchView.getLoadingView().setVisibility(8);
            FullScreenStateView fullScreenState = reactionsKeyboardSearchView.getFullScreenState();
            FullScreenStateView.setCaptionText$default(fullScreenState, reactionsKeyboardSearchView.d, null, 2, null);
            Clause clause = reactionsKeyboardSearchView.e;
            fullScreenState.setMainAction(clause != null ? new l6(12, clause, null, h4.ACCENT) : null);
            fullScreenState.setTitleText(null);
            FullScreenStateView.setImage$default(fullScreenState, null, null, 2, null);
            reactionsKeyboardSearchView.getFullScreenState().setVisibility(0);
        } else {
            boolean z = nVar instanceof m;
            if (z && ((m) nVar).f326006a.isEmpty()) {
                reactionsKeyboardSearchView.getContentRecyclerView().setVisibility(8);
                reactionsKeyboardSearchView.getLoadingView().setVisibility(8);
                FullScreenStateView fullScreenState2 = reactionsKeyboardSearchView.getFullScreenState();
                fullScreenState2.setTitleText(reactionsKeyboardSearchView.f);
                FullScreenStateView.setImage$default(fullScreenState2, reactionsKeyboardSearchView.getEmptySearchImage(), null, 2, null);
                FullScreenStateView.setCaptionText$default(fullScreenState2, null, null, 2, null);
                fullScreenState2.setMainAction(null);
                reactionsKeyboardSearchView.getFullScreenState().setVisibility(0);
            } else if (z) {
                reactionsKeyboardSearchView.getContentRecyclerView().setVisibility(0);
                reactionsKeyboardSearchView.getLoadingView().setVisibility(8);
                reactionsKeyboardSearchView.getFullScreenState().setVisibility(8);
                ArrayList<i> arrayList = ((m) nVar).f326006a;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (i iVar : arrayList) {
                    arrayList2.add(new u90(iVar.f325997a, iVar.f325998b, iVar.f325999c, iVar.d, iVar.e, iVar.f, iVar.f326000g));
                }
                reactionsKeyboardSearchView.i.c(arrayList2);
            }
        }
        return Unit.f186387a;
    }

    private final RecyclerView getContentRecyclerView() {
        return (RecyclerView) this.contentRecyclerView.f();
    }

    private final ReadWriteProperty getDisposableDelegate() {
        return new h(null, 1);
    }

    private final ComplexImage.Regular getEmptySearchImage() {
        return (ComplexImage.Regular) this.emptySearchImage.getValue();
    }

    private final ifm.c getErrorButtonDisposable() {
        return (ifm.c) this.errorButtonDisposable.getValue(this, f57488n[2]);
    }

    private final FullScreenStateView getFullScreenState() {
        return (FullScreenStateView) this.fullScreenState.f();
    }

    private final ifm.c getItemsClickDisposable() {
        return (ifm.c) this.itemsClickDisposable.getValue(this, f57488n[1]);
    }

    private final ifm.c getItemsDisposable() {
        return (ifm.c) this.itemsDisposable.getValue(this, f57488n[0]);
    }

    private final RecyclerView getLoadingView() {
        return (RecyclerView) this.loadingView.f();
    }

    private final void setErrorButtonDisposable(ifm.c cVar) {
        this.errorButtonDisposable.setValue(this, f57488n[2], cVar);
    }

    private final void setItemsClickDisposable(ifm.c cVar) {
        this.itemsClickDisposable.setValue(this, f57488n[1], cVar);
    }

    private final void setItemsDisposable(ifm.c cVar) {
        this.itemsDisposable.setValue(this, f57488n[0], cVar);
    }

    public final void b(r rVar) {
        c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        r rVarObserveOn = rVar.observeOn(c0Var);
        Intrinsics.checkNotNullExpressionValue(rVarObserveOn, "observeOn(...)");
        k kVar = new k(this, 2);
        r rVarOnErrorResumeNext = rVarObserveOn.onErrorResumeNext(new g(24, new lak.l(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.p0(23, kVar), new a08.p0(23, lu0.m.f199999a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        setItemsDisposable(cVarSubscribe);
    }

    public final void c() {
        setItemsDisposable(null);
        this.f57496m = null;
        this.i.d();
        getContentRecyclerView().setVisibility(8);
        getLoadingView().setVisibility(8);
        getFullScreenState().setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f fVar = (f) this.f57493h.f53148c.getValue();
        k kVar = new k(this, 0);
        r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new g(24, new lak.l(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.p0(23, kVar), new a08.p0(23, lu0.n.f200000a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        setItemsClickDisposable(cVarSubscribe);
        f fVar2 = getFullScreenState().getSmallActionButton().f56386h;
        k kVar2 = new k(this, 1);
        r rVarOnErrorResumeNext2 = fVar2.onErrorResumeNext(new g(24, new lak.l(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a08.p0(23, kVar2), new a08.p0(23, o.f200001a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe2, "subscribe(...)");
        setErrorButtonDisposable(cVarSubscribe2);
        l lVar = this.f57496m;
        if (lVar != null) {
            b(lVar.f199996a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setItemsDisposable(null);
        setItemsClickDisposable(null);
        setErrorButtonDisposable(null);
    }

    public final void setEmptySearchTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f = title;
    }

    public final void setErrorMessage(@NotNull Clause message, @NotNull Clause action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        this.d = message;
        this.e = action;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionsKeyboardSearchView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsKeyboardSearchView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.fullScreenState = kli.a.J(R$id.ReactionsKeyboardView_fullScreenState, this);
        this.contentRecyclerView = kli.a.J(R$id.ReactionsKeyboardView_contentRecyclerView, this);
        this.loadingView = kli.a.J(R$id.ReactionsKeyboardView_loadingView, this);
        this.emptySearchImage = yhm.j.b(new f0(22));
        ReactionsKeyboardItemDelegate reactionsKeyboardItemDelegate = new ReactionsKeyboardItemDelegate();
        this.f57493h = reactionsKeyboardItemDelegate;
        j jVar = new j(new koi.c(u.c(reactionsKeyboardItemDelegate)), false, 14);
        this.i = jVar;
        this.itemsDisposable = getDisposableDelegate();
        this.itemsClickDisposable = getDisposableDelegate();
        this.errorButtonDisposable = getDisposableDelegate();
        View.inflate(context, R$layout.internal_reactions_keyboard_category_fragment_view, this);
        setBackgroundColor(kli.a.s(R$attr.uikit_colorGroupedBackground, context));
        RecyclerView contentRecyclerView = getContentRecyclerView();
        contentRecyclerView.setAdapter(jVar);
        contentRecyclerView.setHasFixedSize(true);
        contentRecyclerView.setItemAnimator(null);
        Context context2 = contentRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        contentRecyclerView.addItemDecoration(new v(kli.a.k(context2, 1.0f)));
        contentRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, 1));
        contentRecyclerView.setClipToPadding(false);
        j jVar2 = new j(new koi.c(u.c(new ReactionsKeyboardItemDelegate())), false, 14);
        RecyclerView loadingView = getLoadingView();
        loadingView.setItemAnimator(null);
        loadingView.setHasFixedSize(true);
        Context context3 = loadingView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        loadingView.addItemDecoration(new v(kli.a.k(context3, 1.0f)));
        loadingView.setLayoutManager(new StaggeredGridLayoutManager() { // from class: com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardSearchView$initLoadingView$1$1
            @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return false;
            }
        });
        loadingView.setAdapter(jVar2);
        IntRange intRangeO = kotlin.ranges.f.o(0, 21);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new u90(null, 1, 1, false, false, d.n("LOADING_ITEM_", it8.nextInt()), null));
        }
        jVar2.c(arrayList);
        loadingView.setClipToPadding(false);
        getContentRecyclerView().setVisibility(8);
        getLoadingView().setVisibility(8);
        getFullScreenState().setVisibility(8);
        getFullScreenState().setPadding(getFullScreenState().getPaddingLeft(), 0, getFullScreenState().getPaddingRight(), getFullScreenState().getPaddingBottom());
        pd.b.p(this, new TextLocalisedClause(R$string.gif_select_image_form_title, null, null, 14));
        setOnClickListener(new lu0.j(0));
    }

    public /* synthetic */ ReactionsKeyboardSearchView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
