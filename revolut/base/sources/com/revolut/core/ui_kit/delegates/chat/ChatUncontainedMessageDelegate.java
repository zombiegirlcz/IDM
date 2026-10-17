package com.revolut.core.ui_kit.delegates.chat;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import koe.x;
import koe.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.c1;
import kp0.d1;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0007\b\t\n\u000b\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatUncontainedMessageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatUncontainedMessageDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/ChatUncontainedMessageDelegate$ViewHolder;", "<init>", "()V", "Companion", "Model", "ViewHolder", "kp0/c1", "kp0/e1", "kp0/d1", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatUncontainedMessageDelegate extends BaseRecyclerViewDelegate<Model, ViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53915c;
    public final ihm.f d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatUncontainedMessageDelegate$Model;", "Loq0/b;", "Lqv0/o;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements oq0.b, qv0.o, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xo0.a f53918c;
        public final boolean d;
        public final List e;
        public final cam.f f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final v20.n f53919g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f53920h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f53921j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f53922l;

        public Model(String listId, Clause clause, xo0.a accessibilitySender, List actions, cam.f position, v20.n nVar, int i, int i2, int i3) {
            int i5 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(position, "position");
            this.f53916a = listId;
            this.f53917b = clause;
            this.f53918c = accessibilitySender;
            this.d = true;
            this.e = actions;
            this.f = position;
            this.f53919g = nVar;
            this.f53920h = null;
            this.i = i;
            this.f53921j = i2;
            this.k = i3;
            this.f53922l = i5;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatUncontainedMessageDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55256g() {
            return this.f53919g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55254b() {
            return this.f53916a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53916a, model.f53916a) && Intrinsics.f(this.f53917b, model.f53917b) && Intrinsics.f(this.f53918c, model.f53918c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53919g, model.f53919g) && Intrinsics.f(this.f53920h, model.f53920h) && this.i == model.i && this.f53921j == model.f53921j && this.k == model.k && this.f53922l == model.f53922l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF55051q() {
            return this.i;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.i = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f53920h;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF53908c() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = this.f53916a.hashCode() * 31;
            Clause clause = this.f53917b;
            int iE = v7.e(this.f, p.a.d(j6.a.c((this.f53918c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31);
            v20.n nVar = this.f53919g;
            int iHashCode2 = (iE + (nVar == null ? 0 : nVar.hashCode())) * 31;
            Parcelable parcelable = this.f53920h;
            return Integer.hashCode(this.f53922l) + j6.a.b(this.k, j6.a.b(this.f53921j, j6.a.b(this.i, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF55052r() {
            return this.f53921j;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF55054t() {
            return this.f53922l;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53921j = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53920h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55053s() {
            return this.k;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new d1(!Intrinsics.f(model.f53917b, this.f53917b), !Intrinsics.f(model.f, this.f), !Intrinsics.f(model.f53918c, this.f53918c), !Intrinsics.f(model.e, this.e));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/chat/ChatUncontainedMessageDelegate$ViewHolder;", "Lkoi/b;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lioi/c;", "Lfu0/i;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ViewHolder extends koi.b implements TrackableItem, ioi.c, fu0.i {
        public final UIKitTextView f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f53923g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f53924h;
        public y i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final fu0.j f53925j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(UIKitTextView itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "textView");
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f = itemView;
            this.f53924h = f0.f322471a;
            Context context = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 8.0f);
            Context context2 = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK2 = kli.a.k(context2, 8.0f);
            Context context3 = itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            this.f53925j = new fu0.j(itemView, iK, iK2, kli.a.l(context3, 12.0f));
            itemView.setCustomSelectionActionModeCallback(new m(this));
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f53923g;
        }

        @Override // fu0.i
        public final fu0.h getHighlightTarget() {
            return this.f53925j;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53923g = parcelable;
        }
    }

    public ChatUncontainedMessageDelegate() {
        super(R$id.chatUncontainedDelegate_root, new x(17));
        this.f53915c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(parent.getContext(), R$style.UiKitThemeOverlay_AccentActivatedControl);
        UIKitTextView uIKitTextView = new UIKitTextView(contextThemeWrapper, null, R$attr.internal_textAppearanceAirBody1);
        uIKitTextView.setId(R$id.chatUncontainedDelegate_text);
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, contextThemeWrapper));
        uIKitTextView.setTextAlignment(5);
        uIKitTextView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        uIKitTextView.setTextIsSelectable(true);
        uIKitTextView.setHighlightColor(io0.a.d(0.3f, kli.a.s(R.attr.colorControlActivated, contextThemeWrapper)));
        uIKitTextView.setMovementMethod(fs0.g.f137525a);
        return new ViewHolder(uIKitTextView);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: k */
    public final void n(RecyclerView.ViewHolder viewHolder) {
        ViewHolder holder = (ViewHolder) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        UIKitTextView uIKitTextView = holder.f;
        uIKitTextView.setEnabled(false);
        uIKitTextView.setEnabled(true);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void n(koi.b bVar) {
        ViewHolder holder = (ViewHolder) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        UIKitTextView uIKitTextView = holder.f;
        uIKitTextView.setEnabled(false);
        uIKitTextView.setEnabled(true);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ViewHolder holder, Model data, int i, List list) {
        boolean z;
        boolean z3;
        boolean z4;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof d1)) {
                payloads = null;
                break;
            }
            i2++;
        }
        List list2 = payloads;
        boolean z6 = list2 == null || list2.isEmpty();
        if (payloads != null) {
            int size2 = payloads.size();
            z = z6;
            z3 = z;
            z4 = z3;
            for (int i3 = 0; i3 < size2; i3++) {
                d1 d1Var = (d1) payloads.get(i3);
                z6 = z6 || d1Var.f187986a;
                z = z || d1Var.f187987b;
                z4 = z4 || d1Var.f187988c;
                z3 = z3 || d1Var.d;
            }
        } else {
            z = z6;
            z3 = z;
            z4 = z3;
        }
        UIKitTextView uIKitTextView = holder.f;
        oq0.f.a(uIKitTextView, data);
        List list3 = data.e;
        cam.f fVar = data.f;
        UIKitTextView uIKitTextView2 = holder.f;
        if (z6) {
            Clause clause = data.f53917b;
            Object[] tags = {"ChatUncontainedDelegate"};
            Intrinsics.checkNotNullParameter(tags, "tags");
            List tags2 = kotlin.collections.d.v0(tags);
            Intrinsics.checkNotNullParameter(tags2, "tags");
            kli.a.e(uIKitTextView2, clause, new kog.k(this, 7), new ty0.e(tags2), 0, 8);
        }
        if (z) {
            int iB = oq0.f.b(fVar);
            uIKitTextView.setTextAlignment(kotlin.jvm.internal.s.s(fVar) ? 5 : 6);
            uIKitTextView.setGravity(iB);
        }
        if (z3) {
            Intrinsics.checkNotNullParameter(list3, "<set-?>");
            holder.f53924h = list3;
        }
        holder.i = new y(this, data, 2);
        holder.f53923g = data.f53920h;
        if (z6 || z4 || z) {
            xo0.a aVar = data.f53918c;
            if (aVar == null) {
                aVar = null;
            }
            Clause clause2 = aVar != null ? aVar.f307539a : null;
            boolean zS = kotlin.jvm.internal.s.s(fVar);
            List listL = zhm.v.l(uIKitTextView.getText());
            ArrayList arrayList = new ArrayList();
            int size3 = list3.size();
            int i5 = 0;
            while (i5 < size3) {
                c1 c1Var = (c1) list3.get(i5);
                c1Var.getClass();
                String string = uIKitTextView.getContext().getString(c1Var.f187982a);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayList.add(new gq0.a(1, new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new a2.a(holder, this, c1Var, data)));
                i5++;
                list3 = list3;
            }
            hq0.a aVar2 = new hq0.a(clause2, arrayList, listL, zS);
            pd.b.q(uIKitTextView, true);
            uIKitTextView.setAccessibilityDelegate(aVar2);
        }
    }
}
