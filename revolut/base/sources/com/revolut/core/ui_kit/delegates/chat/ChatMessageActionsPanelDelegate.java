package com.revolut.core.ui_kit.delegates.chat;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au0.t1;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import koe.x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kp0.b0;
import kp0.c0;
import kp0.j0;
import kp0.k0;
import kp0.l0;
import kp0.m0;
import tw0.a0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\f\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatMessageActionsPanelDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatMessageActionsPanelDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatMessageActionsPanelDelegate$ViewHolder;", "<init>", "()V", "Companion", "kp0/d0", "a", "Model", "kp0/l0", "OneShotActionDelegate", "ToggleableActionDelegate", "kp0/c0", "kp0/j0", "com/revolut/core/ui_kit/delegates/chat/h", "com/revolut/core/ui_kit/delegates/chat/i", "ViewHolder", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatMessageActionsPanelDelegate extends BaseRecyclerViewDelegate<Model, ViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53852c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatMessageActionsPanelDelegate$Model;", "Loq0/b;", "Lqv0/o;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements oq0.b, qv0.o, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f53854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cam.f f53855c;
        public final v20.n d;
        public Parcelable e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f53856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f53857h;
        public final int i;

        public Model(String listId, List actions, cam.f position, v20.n nVar, int i, int i2) {
            int i3 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f53853a = listId;
            this.f53854b = actions;
            this.f53855c = position;
            this.d = nVar;
            this.e = null;
            this.f = i;
            this.f53856g = i2;
            this.f53857h = i3;
            this.i = i3;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatMessageActionsPanelDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF52567m() {
            return this.d;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55132b() {
            return this.f53853a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53853a, model.f53853a) && Intrinsics.f(this.f53854b, model.f53854b) && Intrinsics.f(this.f53855c, model.f53855c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f53856g == model.f53856g && this.f53857h == model.f53857h && this.i == model.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.f;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.e;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF52080c() {
            return this.f53855c;
        }

        public final int hashCode() {
            int iE = v7.e(this.f53855c, p.a.d(this.f53853a.hashCode() * 31, 31, this.f53854b), 31);
            v20.n nVar = this.d;
            int iHashCode = (iE + (nVar == null ? 0 : nVar.hashCode())) * 31;
            Parcelable parcelable = this.e;
            return Integer.hashCode(this.i) + j6.a.b(this.f53857h, j6.a.b(this.f53856g, j6.a.b(this.f, (iHashCode + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53487j() {
            return this.f53856g;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53488l() {
            return this.i;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53856g = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.f53857h;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new l0(!Intrinsics.f(r4.f53854b, this.f53854b), !Intrinsics.f(r4.f53855c, this.f53855c));
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatMessageActionsPanelDelegate$OneShotActionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/h;", "Lkp0/c0;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OneShotActionDelegate extends BaseRecyclerViewDelegate<h, c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b0 f53858c;

        public OneShotActionDelegate() {
            super(R$id.chatMessageActionsPanelDelegate_oneShotAction, new x(9));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new c0(parent);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
        public final void onViewRecycled(RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            c0 c0Var = holder instanceof c0 ? (c0) holder : null;
            if (c0Var != null) {
                j0 j0Var = c0Var.f;
                j0Var.a();
                j0Var.f188027g = null;
                LottieAnimationView lottieAnimationView = j0Var.f188024a;
                or0.u.k(lottieAnimationView).Q().b(lottieAnimationView);
                lottieAnimationView.removeAllAnimatorListeners();
                lottieAnimationView.cancelAnimation();
            }
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(c0 holder, h data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            j0 j0Var = holder.f;
            int size = payloads.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (!(payloads.get(i2) instanceof k0)) {
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
            for (int i3 = 0; i3 < size2; i3++) {
                zIsEmpty = zIsEmpty || ((k0) payloads.get(i3)).f188030a;
            }
            if (zIsEmpty) {
                ResourceImage image = data.f53972c;
                j0Var.getClass();
                Intrinsics.checkNotNullParameter(image, "image");
                if (!Intrinsics.f(j0Var.f188027g, image)) {
                    j0Var.a();
                    j0Var.c(image);
                }
            }
            fp0.p pVar = holder.f187981g;
            fp0.p.b(pVar, true);
            View view = pVar.f137029a;
            or0.m.a(view);
            view.setOnClickListener(new t1(this, 23, data, j0Var));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatMessageActionsPanelDelegate$ToggleableActionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/i;", "Lkp0/c0;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ToggleableActionDelegate extends BaseRecyclerViewDelegate<i, c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b0 f53859c;

        public ToggleableActionDelegate() {
            super(R$id.chatMessageActionsPanelDelegate_toggleableAction, new x(10));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new c0(parent);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
        public final void onViewRecycled(RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            c0 c0Var = holder instanceof c0 ? (c0) holder : null;
            if (c0Var != null) {
                j0 j0Var = c0Var.f;
                j0Var.a();
                j0Var.f188027g = null;
                LottieAnimationView lottieAnimationView = j0Var.f188024a;
                or0.u.k(lottieAnimationView).Q().b(lottieAnimationView);
                lottieAnimationView.removeAllAnimatorListeners();
                lottieAnimationView.cancelAnimation();
            }
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(c0 holder, i data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            j0 j0Var = holder.f;
            int size = payloads.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (!(payloads.get(i2) instanceof m0)) {
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
            for (int i3 = 0; i3 < size2; i3++) {
                m0 m0Var = (m0) payloads.get(i3);
                zIsEmpty = zIsEmpty || m0Var.f188039a;
                z = z || m0Var.f188040b;
            }
            ResourceImage image = data.e ? data.d : data.f53975c;
            if (zIsEmpty || z) {
                j0Var.getClass();
                Intrinsics.checkNotNullParameter(image, "image");
                if (!Intrinsics.f(j0Var.f188027g, image)) {
                    j0Var.a();
                    j0Var.c(image);
                }
            }
            if (z) {
                pd.b.i(j0Var.f188024a, data.e);
            }
            fp0.p pVar = holder.f187981g;
            fp0.p.b(pVar, true);
            View view = pVar.f137029a;
            or0.m.a(view);
            view.setOnClickListener(new t1(this, 24, data, j0Var));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatMessageActionsPanelDelegate$ViewHolder;", "Lkoi/b;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ViewHolder extends koi.b implements TrackableItem {
        public final RecyclerView f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final OneShotActionDelegate f53860g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ToggleableActionDelegate f53861h;
        public final koi.h i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f53862j;

        public ViewHolder(ViewGroup parent, OneShotActionDelegate oneShotDelegate, ToggleableActionDelegate toggleableDelegate) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(oneShotDelegate, "oneShotDelegate");
            Intrinsics.checkNotNullParameter(toggleableDelegate, "toggleableDelegate");
            LinearLayout itemView = new LinearLayout(parent.getContext());
            itemView.setId(R$id.chatMessageActionsPanelDelegate_root);
            itemView.setOrientation(0);
            itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            RecyclerView recyclerView = new RecyclerView(parent.getContext());
            recyclerView.setId(R$id.chatMessageActionsPanelDelegate_actionsRecyclerView);
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, kli.a.k(context, 16.0f)));
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setOverScrollMode(2);
            Context context2 = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            recyclerView.addItemDecoration(new a0(kli.a.k(context2, 16.0f), 13, 0));
            Unit unit = Unit.f186387a;
            koi.h hVar = new koi.h(new koi.c(zhm.v.k(oneShotDelegate, toggleableDelegate)), false, false, 4);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            super(itemView);
            this.f = recyclerView;
            this.f53860g = oneShotDelegate;
            this.f53861h = toggleableDelegate;
            this.i = hVar;
            itemView.addView(recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setAdapter(hVar);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f53862j;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53862j = parcelable;
        }
    }

    public static abstract class a {
        private a() {
        }
    }

    public ChatMessageActionsPanelDelegate() {
        super(R$id.chatMessageActionsPanelDelegate_root, new x(8));
        this.f53852c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ViewHolder(parent, new OneShotActionDelegate(), new ToggleableActionDelegate());
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ViewHolder holder, Model data, int i, List list) {
        koi.j iVar;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        View itemView = holder.itemView;
        RecyclerView recyclerView = holder.f;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        oq0.f.a(itemView, data);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof l0)) {
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
        for (int i3 = 0; i3 < size2; i3++) {
            l0 l0Var = (l0) payloads.get(i3);
            zIsEmpty = zIsEmpty || l0Var.f188034a;
            z = z || l0Var.f188035b;
        }
        if (zIsEmpty) {
            koi.h hVar = holder.i;
            List<a> list2 = data.f53854b;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (a aVar : list2) {
                if (aVar instanceof f) {
                    f fVar = (f) aVar;
                    iVar = new h(a0.d.n("action_", fVar.f53964a), fVar.f53964a, fVar.f53965b, fVar.f53966c, data.d);
                } else {
                    if (!(aVar instanceof g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g gVar = (g) aVar;
                    iVar = new i(a0.d.n("action_", gVar.f53967a), gVar.f53967a, gVar.f53968b, gVar.f53969c, gVar.d, data.d, gVar.e);
                }
                arrayList.add(iVar);
            }
            hVar.c(arrayList);
        }
        if (z) {
            int iB = oq0.f.b(data.f53855c);
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (layoutParams2.gravity != iB) {
                layoutParams2.gravity = iB;
                recyclerView.setLayoutParams(layoutParams2);
            }
        }
        holder.f53860g.f53858c = new b0(this, data, 0);
        holder.f53861h.f53859c = new b0(this, data, 1);
        holder.f53862j = data.e;
    }
}
