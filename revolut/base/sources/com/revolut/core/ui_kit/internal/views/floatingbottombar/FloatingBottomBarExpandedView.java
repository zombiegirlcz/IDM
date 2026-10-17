package com.revolut.core.ui_kit.internal.views.floatingbottombar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomBarExpandedView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mt0.p;
import or0.u;
import org.jetbrains.annotations.NotNull;
import qv0.n;
import te0.w;
import yp0.y;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0004\n\u001b\u001c\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/FloatingBottomBarExpandedView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmt0/p;", "model", "", "setModel", "(Lmt0/p;)V", "Ltw0/n;", "d", "Lkotlin/Lazy;", "getRecyclerDragHelper", "()Ltw0/n;", "recyclerDragHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "e", "getItemTouchHelper", "()Landroidx/recyclerview/widget/ItemTouchHelper;", "itemTouchHelper", "Companion", "ItemDelegate", "DividerDelegate", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FloatingBottomBarExpandedView extends RecyclerView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ItemDelegate f57024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z4l.j f57025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f57026c;
    public final Object d;
    public final Object e;
    public final ifm.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f57027g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/FloatingBottomBarExpandedView$DividerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/b;", "Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/c;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DividerDelegate extends BaseRecyclerViewDelegate<b, c> {
        public DividerDelegate() {
            super(R$id.floatingBottomBarExpandedView_divider_viewType, new mqg.a(14));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View itemView = new View(parent.getContext());
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, kli.a.k(context, 1.0f)));
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            itemView.setBackgroundColor(io0.a.d(0.2f, kli.a.s(R$attr.uikit_colorForeground, context2)));
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            return new c(itemView);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/FloatingBottomBarExpandedView$ItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/FloatingBottomBarExpandedView$ItemDelegate$Model;", "Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/f;", "<init>", "()V", "Model", "com/revolut/core/ui_kit/internal/views/floatingbottombar/e", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ItemDelegate extends BaseRecyclerViewDelegate<Model, f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ihm.f f57028c;
        public final ihm.f d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/FloatingBottomBarExpandedView$ItemDelegate$Model;", "Lkoi/j;", "Lqv0/n;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Model implements koi.j, n, TrackableItem {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f57029a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TextLocalisedClause f57030b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ResourceImage f57031c;
            public final boolean d;
            public final boolean e;
            public p31.c f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public p31.c f57032g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public p31.c f57033h;
            public p31.c i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public Parcelable f57034j;

            public Model(TextLocalisedClause title, ResourceImage image, String listId, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(image, "image");
                this.f57029a = listId;
                this.f57030b = title;
                this.f57031c = image;
                this.d = z;
                this.e = z3;
            }

            @Override // koi.j
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF55201b() {
                return this.f57029a;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Model)) {
                    return false;
                }
                Model model = (Model) obj2;
                return Intrinsics.f(this.f57029a, model.f57029a) && this.f57030b.equals(model.f57030b) && this.f57031c.equals(model.f57031c) && this.d == model.d && this.e == model.e;
            }

            @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
            /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
            public final Parcelable getF55204h() {
                return this.f57034j;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + j6.a.c(org.bouncycastle.jcajce.provider.digest.a.b(this.f57031c, t61.a.a(this.f57029a.hashCode() * 31, 31, this.f57030b), 31), 31, this.d);
            }

            @Override // o31.c
            /* JADX INFO: renamed from: i, reason: from getter */
            public final p31.c getF51761p() {
                return this.f;
            }

            @Override // o31.c
            /* JADX INFO: renamed from: k, reason: from getter */
            public final p31.c getF51759m() {
                return this.f57032g;
            }

            @Override // qv0.n
            public final void l(p31.c cVar) {
                this.f57033h = cVar;
            }

            @Override // o31.c
            /* JADX INFO: renamed from: q, reason: from getter */
            public final p31.c getO() {
                return this.i;
            }

            @Override // o31.c
            /* JADX INFO: renamed from: r, reason: from getter */
            public final p31.c getF51760n() {
                return this.f57033h;
            }

            @Override // o31.c
            public final void s(p31.c cVar) {
                this.f = cVar;
            }

            @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
            public final void setAnalyticsContext(Parcelable parcelable) {
                this.f57034j = parcelable;
            }

            @Override // o31.c
            public final void u(p31.c cVar) {
                this.f57032g = cVar;
            }

            @Override // qv0.n
            public final void w(p31.c cVar) {
                this.i = cVar;
            }

            @Override // koi.j
            public final Object z(Object oldItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                    return null;
                }
                return new e(!r6.f57030b.equals(this.f57030b), !r6.f57031c.equals(this.f57031c), ((Model) oldItem).d != this.d);
            }
        }

        public ItemDelegate() {
            super(R$layout.internal_delegate_floating_bottom_tab_expanded, new mqg.a(15));
            this.f57028c = v0.a.d("create(...)");
            this.d = v0.a.d("create(...)");
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new f(s.r(parent, R$layout.internal_delegate_floating_bottom_tab_expanded));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(f holder, final Model data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            int size = payloads.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (!(payloads.get(i2) instanceof e)) {
                    payloads = null;
                    break;
                }
                i2++;
            }
            if (payloads == null) {
                payloads = f0.f322471a;
            }
            boolean zIsEmpty = payloads.isEmpty();
            int size2 = payloads.size();
            boolean z = zIsEmpty;
            boolean z3 = z;
            for (int i3 = 0; i3 < size2; i3++) {
                e eVar = (e) payloads.get(i3);
                zIsEmpty = zIsEmpty || eVar.f57064a;
                z = z || eVar.f57065b;
                z3 = z3 || eVar.f57066c;
            }
            if (zIsEmpty) {
                kli.a.b(holder.f, data.f57030b, ty0.f.f275450a);
            }
            if (z) {
                yy0.f.e(u.k(holder.f57067g).Q(), data.f57031c, holder.f57067g, null, null, 12);
            }
            if (z3) {
                holder.itemView.setSelected(data.d);
            }
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            py0.c cVar = new py0.c(data.f57030b);
            or0.m.a(itemView);
            itemView.setOnClickListener(new g(data, cVar, this, data));
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.revolut.core.ui_kit.internal.views.floatingbottombar.d
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    this.f57062a.d.onNext(data);
                    return true;
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomBarExpandedView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingBottomBarExpandedView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit c(FloatingBottomBarExpandedView floatingBottomBarExpandedView, ItemDelegate.Model model) {
        koi.b bVarF;
        if (!model.e && (bVarF = y.f(floatingBottomBarExpandedView, model.f57029a)) != null) {
            floatingBottomBarExpandedView.getItemTouchHelper().startDrag(bVarF);
        }
        return Unit.f186387a;
    }

    public static ItemTouchHelper d(FloatingBottomBarExpandedView floatingBottomBarExpandedView) {
        return new ItemTouchHelper(floatingBottomBarExpandedView.getRecyclerDragHelper());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ItemTouchHelper getItemTouchHelper() {
        return (ItemTouchHelper) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final tw0.n getRecyclerDragHelper() {
        return (tw0.n) this.d.getValue();
    }

    public final r f() {
        return w.a0(this.f57024a.f57028c, new mt0.n(this, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w.j0(this.f, this.f57024a.d.subscribe(new msb.e(4, new mt0.n(this, 0))));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.d();
    }

    public final void setModel(@NotNull p model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model, this.f57027g)) {
            return;
        }
        if (model.f208718b <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        aim.e eVarB = zhm.u.b();
        List list = model.f208717a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            FloatingBottomBarView.Item item = (FloatingBottomBarView.Item) list.get(i);
            String str = item.f58588a;
            eVarB.add(new ItemDelegate.Model(item.f58589b, item.f58590c, str, Intrinsics.f(str, model.f208719c), item.d));
        }
        int size2 = eVarB.size();
        int i2 = model.f208718b;
        if (size2 > i2) {
            Intrinsics.checkNotNullParameter("dividerListId", "listId");
            b bVar = new b();
            int i3 = R$attr.uikit_dp8;
            int i5 = R$attr.uikit_dp24;
            yp0.b.p(bVar, i3, i3, i5, i5);
            eVarB.add(i2, bVar);
        }
        this.f57025b.c(zhm.u.a(eVarB));
        this.f57027g = model;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingBottomBarExpandedView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingBottomBarExpandedView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ItemDelegate itemDelegate = new ItemDelegate();
        this.f57024a = itemDelegate;
        final int i2 = 0;
        final int i3 = 1;
        z4l.j jVar = new z4l.j(7, v.k(itemDelegate, new DividerDelegate()), false);
        this.f57025b = jVar;
        this.f57026c = v0.a.d("create(...)");
        this.d = w.y0(new Function0(this) { // from class: mt0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FloatingBottomBarExpandedView f208716b;

            {
                this.f208716b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                FloatingBottomBarExpandedView floatingBottomBarExpandedView = this.f208716b;
                switch (i5) {
                    case 0:
                        FloatingBottomBarExpandedView.Companion companion = FloatingBottomBarExpandedView.INSTANCE;
                        return new tw0.n(new com.revolut.core.ui_kit.internal.views.floatingbottombar.h(floatingBottomBarExpandedView));
                    default:
                        return FloatingBottomBarExpandedView.d(floatingBottomBarExpandedView);
                }
            }
        });
        this.e = w.y0(new Function0(this) { // from class: mt0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FloatingBottomBarExpandedView f208716b;

            {
                this.f208716b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                FloatingBottomBarExpandedView floatingBottomBarExpandedView = this.f208716b;
                switch (i5) {
                    case 0:
                        FloatingBottomBarExpandedView.Companion companion = FloatingBottomBarExpandedView.INSTANCE;
                        return new tw0.n(new com.revolut.core.ui_kit.internal.views.floatingbottombar.h(floatingBottomBarExpandedView));
                    default:
                        return FloatingBottomBarExpandedView.d(floatingBottomBarExpandedView);
                }
            }
        });
        this.f = new ifm.b();
        setAdapter(jVar);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        setOverScrollMode(2);
        addItemDecoration(new o31.b());
        int iW = kli.a.w(R$attr.uikit_dp4, context);
        setPadding(iW, iW, iW, iW);
        getItemTouchHelper().attachToRecyclerView(this);
    }

    public /* synthetic */ FloatingBottomBarExpandedView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
