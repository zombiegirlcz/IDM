package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0004\u0003\b\t\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ActionCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ActionCardDelegate$Model;", "Lip0/e;", "Lix0/c1;", "<init>", "()V", "Companion", "Model", "ip0/d", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionCardDelegate extends BaseRecyclerViewDelegate<Model, ip0.e> implements ix0.c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextPaint f51566c;
    public final TextPaint d;
    public final TextPaint e;
    public final SpannableStringBuilder f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SpannableStringBuilder f51567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SpannableStringBuilder f51568h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f51569j;
    public DynamicLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DynamicLayout f51570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public DynamicLayout f51571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f51572n;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ActionCardDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/f", "com/revolut/core/ui_kit/delegates/d", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f51574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f51575c;
        public final Image d;
        public final TagViewData e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f51576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f51577h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f51578j;
        public final Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f51579l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public qv0.c f51580m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f51581n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f51582p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f51583q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f51584r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f51585s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f51586t;
        public final int u;

        public Model(String listId, Clause clause, Image icon, d ratio, f fVar, Object obj2, MoneyClause moneyClause, boolean z, int i) {
            ratio = (i & 8) != 0 ? d.DEFAULT : ratio;
            int i2 = (i & 128) != 0 ? 2 : 3;
            obj2 = (i & 256) != 0 ? null : obj2;
            moneyClause = (i & 1024) != 0 ? null : moneyClause;
            z = (i & 2048) != 0 ? true : z;
            String str = (i & 8192) != 0 ? null : "profileScreen-planItem";
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            int i3 = R$attr.uikit_dp0;
            this.f51573a = listId;
            this.f51574b = clause;
            this.f51575c = fVar;
            this.d = icon;
            this.e = null;
            this.f = i2;
            this.f51576g = moneyClause;
            this.f51577h = z;
            this.i = str;
            this.f51578j = ratio;
            this.k = obj2;
            this.f51579l = null;
            this.f51580m = c.d.f249513a;
            this.f51581n = null;
            this.o = null;
            this.f51582p = null;
            this.f51583q = null;
            this.f51584r = i3;
            this.f51585s = i3;
            this.f51586t = i3;
            this.u = i3;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ActionCardDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getD() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55034b() {
            return this.f51573a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51573a, model.f51573a) && Intrinsics.f(this.f51574b, model.f51574b) && Intrinsics.f(this.f51575c, model.f51575c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f51576g, model.f51576g) && this.f51577h == model.f51577h && Intrinsics.f(this.i, model.i) && this.f51578j == model.f51578j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51579l, model.f51579l) && Intrinsics.f(this.f51580m, model.f51580m) && Intrinsics.f(this.f51581n, model.f51581n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f51582p, model.f51582p) && Intrinsics.f(this.f51583q, model.f51583q) && this.f51584r == model.f51584r && this.f51585s == model.f51585s && this.f51586t == model.f51586t && this.u == model.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF55039l() {
            return this.f51584r;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51584r = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55035c() {
            return this.f51579l;
        }

        public final int hashCode() {
            int iHashCode = this.f51573a.hashCode() * 31;
            Clause clause = this.f51574b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            f fVar = this.f51575c;
            int iC = a10.b.c(this.d, (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
            TagViewData tagViewData = this.e;
            int iB = j6.a.b(this.f, (iC + (tagViewData == null ? 0 : tagViewData.hashCode())) * 961, 31);
            Clause clause2 = this.f51576g;
            int iC2 = j6.a.c(j6.a.c((iB + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f51577h), 31, false);
            String str = this.i;
            int iHashCode3 = (this.f51578j.hashCode() + ((iC2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Object obj2 = this.k;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51579l;
            int i = h30.l.i(this.f51580m, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f51581n;
            int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.o;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51582p;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51583q;
            return Integer.hashCode(this.u) + j6.a.b(this.f51586t, j6.a.b(this.f51585s, j6.a.b(this.f51584r, (iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55036g() {
            return this.f51581n;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51580m = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF55037h() {
            return this.o;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51582p = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF55040m() {
            return this.f51585s;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.u;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51585s = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF() {
            return this.f51580m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55038j() {
            return this.f51583q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getI() {
            return this.f51582p;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51581n = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51579l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55041n() {
            return this.f51586t;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51583q = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            Clause clause = model.f51574b;
            f fVar = model.f51575c;
            boolean z = !Intrinsics.f(clause, this.f51574b);
            Clause clause2 = fVar != null ? fVar.f54135a : null;
            f fVar2 = this.f51575c;
            return new ip0.d(z, !Intrinsics.f(clause2, fVar2 != null ? fVar2.f54135a : null), (fVar != null ? fVar.f54136b : null) != (fVar2 != null ? fVar2.f54136b : null), !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.e, this.e), or0.b.l(this, (qv0.i) oldItem), model.f != this.f, !Intrinsics.f(model.f51576g, this.f51576g), model.f51577h != this.f51577h, !Intrinsics.f(model.i, this.i), model.f51578j != this.f51578j);
        }
    }

    public ActionCardDelegate() {
        super(R$layout.internal_delegate_action_card, new ip0.c(0));
        this.f51566c = new TextPaint(1);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new SpannableStringBuilder();
        this.f51567g = new SpannableStringBuilder();
        this.f51568h = new SpannableStringBuilder();
        this.f51572n = v0.a.d("create(...)");
        v0.a.d("create(...)");
    }

    public static DynamicLayout p(Context context, TextPaint textPaint, int i, float f, SpannableStringBuilder spannableStringBuilder) {
        DynamicLayout dynamicLayoutBuild = DynamicLayout.Builder.obtain(spannableStringBuilder, textPaint, i).setEllipsize(TextUtils.TruncateAt.END).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(kli.a.B(context, f), 1.0f).build();
        Intrinsics.h(dynamicLayoutBuild);
        return dynamicLayoutBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    @Override // ix0.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(android.content.Context r21, int r22, koi.j r23) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.ActionCardDelegate.e(android.content.Context, int, koi.j):int");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.e(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_action_card));
    }

    @Override // ix0.c1
    public final boolean l(koi.j model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return model instanceof Model;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.e holder, Model data, int i, List payloads) {
        boolean z;
        int i2;
        aw0.d0 d0Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TagView tagView = holder.f163984j;
        TextView textView = holder.f163983h;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        boolean zN6 = ue0.e.n(payloads);
        boolean zN7 = ue0.e.n(payloads);
        boolean zN8 = ue0.e.n(payloads);
        boolean zN9 = ue0.e.n(payloads);
        boolean zN10 = ue0.e.n(payloads);
        boolean zN11 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            z = zN;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            Iterator it9 = it8;
            if (next instanceof ip0.d) {
                boolean z3 = z || ((ip0.d) next).f163809a;
                zN2 = zN2 || ((ip0.d) next).f163810b;
                zN3 = zN3 || ((ip0.d) next).f163811c;
                zN4 = zN4 || ((ip0.d) next).f163812g;
                zN5 = zN5 || ((ip0.d) next).d;
                zN6 = zN6 || ((ip0.d) next).e;
                zN7 = zN7 || ((ip0.d) next).f;
                zN8 = zN8 || ((ip0.d) next).f163813h;
                zN9 = zN9 || ((ip0.d) next).i;
                zN10 = zN10 || ((ip0.d) next).f163814j;
                zN11 = zN11 || ((ip0.d) next).k;
                zN = z3;
            } else {
                zN = z;
            }
            it8 = it9;
        }
        if (z) {
            kli.a.b(holder.f163982g, data.f51574b, ty0.f.f275450a);
        }
        if (zN2) {
            f fVar = data.f51575c;
            kli.a.b(textView, fVar != null ? fVar.f54135a : null, ty0.f.f275450a);
        }
        if (zN4) {
            textView.setMaxLines(data.f);
        }
        if (zN3) {
            f fVar2 = data.f51575c;
            jb3.l.e(textView, (fVar2 != null ? fVar2.f54136b : null) == e.CAPTION ? R$attr.internal_textAppearanceBody2 : R$attr.internal_textAppearanceBody3);
        }
        if (zN8) {
            kli.a.b(holder.k, data.f51576g, ty0.f.f275450a);
        }
        if (zN5) {
            zi0.c.g(holder.i, data.d);
        }
        if (zN6) {
            TagViewData tagViewData = data.e;
            tagView.setVisibility(tagViewData == null ? 8 : 0);
            if (tagViewData != null) {
                tagView.setContent(tagViewData);
            }
        }
        if (zN7 || zN9) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            i2 = 1;
            or0.b.c(this, data, itemView, data.f51577h, null, 24);
        } else {
            i2 = 1;
        }
        if (zN11) {
            UIKitConstraintLayout uIKitConstraintLayout = holder.f;
            int i3 = g.f54173b[data.f51578j.ordinal()];
            if (i3 == i2) {
                d0Var = null;
            } else if (i3 == 2) {
                aw0.d0.Companion.getClass();
                d0Var = aw0.d0.f10273c;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                d0Var = new aw0.d0(167, 142);
            }
            uIKitConstraintLayout.setAspectRatioConfig(d0Var != null ? new ut0.e(d0Var, ut0.a.ADJUST_HEIGHT) : null);
        }
        if (zN10) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            hx7.b.v(itemView2, data.i);
        }
        if (!data.f51577h) {
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            or0.u.o(itemView3);
            View itemView4 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
            or0.u.p(itemView4);
            return;
        }
        View itemView5 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView5, "itemView");
        Clause clause = data.f51574b;
        py0.c cVar = clause != null ? new py0.c(clause) : null;
        or0.m.a(itemView5);
        itemView5.setOnClickListener(new au0.i3(data, cVar, this, data, 2));
        View itemView6 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView6, "itemView");
        or0.u.p(itemView6);
    }
}
