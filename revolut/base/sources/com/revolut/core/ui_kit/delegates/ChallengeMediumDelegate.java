package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0007\b\t\n\u000b\u0003\f\rB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChallengeMediumDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ChallengeMediumDelegate$Model;", "Lip0/w9;", "Lix0/c1;", "<init>", "()V", "Companion", "Model", "ip0/u9", "c", "ip0/v9", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengeMediumDelegate extends BaseRecyclerViewDelegate<Model, ip0.w9> implements ix0.c1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f51996c;
    public final ihm.f d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChallengeMediumDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ip0.u9 f51998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f51999c;
        public final Object d;
        public final Clause e;
        public final Double f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f52000g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f52001h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f52002j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52003l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52004m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52005n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Parcelable f52006p;

        public Model(String listId, ip0.u9 content, Clause title, c state, TextLocalisedClause textLocalisedClause, int i) {
            state = (i & 16) != 0 ? c.f.f52012a : state;
            textLocalisedClause = (i & 32) != 0 ? null : textLocalisedClause;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            int i2 = R$attr.uikit_dp12;
            this.f51997a = listId;
            this.f51998b = content;
            this.f51999c = state;
            this.d = title;
            this.e = textLocalisedClause;
            this.f = null;
            this.f52000g = c.d.f249513a;
            this.f52001h = null;
            this.i = null;
            this.f52002j = null;
            this.k = null;
            this.f52003l = i2;
            this.f52004m = i2;
            this.f52005n = i2;
            this.o = i2;
            this.f52006p = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChallengeMediumDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF53388p() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51997a() {
            return this.f51997a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51997a, model.f51997a) && this.f51998b.equals(model.f51998b) && Intrinsics.f(this.f51999c, model.f51999c) && this.d.equals(model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52000g, model.f52000g) && Intrinsics.f(this.f52001h, model.f52001h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52002j, model.f52002j) && Intrinsics.f(this.k, model.k) && this.f52003l == model.f52003l && this.f52004m == model.f52004m && this.f52005n == model.f52005n && this.o == model.o && Intrinsics.f(this.f52006p, model.f52006p);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52003l() {
            return this.f52003l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52003l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52006p() {
            return this.f52006p;
        }

        public final int hashCode() {
            int iB = p.a.b((this.f51999c.hashCode() + ((this.f51998b.hashCode() + (this.f51997a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            Clause clause = this.e;
            int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
            Double d = this.f;
            int i = h30.l.i(this.f52000g, j6.a.c((iHashCode + (d == null ? 0 : d.hashCode())) * 31, 961, true), 31);
            p31.c cVar = this.f52001h;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.i;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52002j;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.k;
            int iB2 = j6.a.b(this.o, j6.a.b(this.f52005n, j6.a.b(this.f52004m, j6.a.b(this.f52003l, (iHashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 961);
            Parcelable parcelable = this.f52006p;
            return iB2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52001h() {
            return this.f52001h;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52000g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getI() {
            return this.i;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52002j = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52004m() {
            return this.f52004m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52004m = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52000g() {
            return this.f52000g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52002j() {
            return this.f52002j;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52001h = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52006p = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52086n() {
            return this.f52005n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.k = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.v9(!model.f51998b.equals(this.f51998b), !model.d.equals(this.d), !Intrinsics.f(model.e, this.e), !Intrinsics.c(model.f, this.f), false, !Intrinsics.f(model.f51999c, this.f51999c), or0.b.l(this, (qv0.i) oldItem));
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements ix0.c1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f52007a = new TextPaint(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f52008b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SpannableStringBuilder f52009c = new SpannableStringBuilder();
        public final SpannableStringBuilder d = new SpannableStringBuilder();
        public int e;
        public DynamicLayout f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public DynamicLayout f52010g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public DynamicLayout f52011h;

        public final DynamicLayout a(Context context, int i, SpannableStringBuilder spannableStringBuilder) {
            DynamicLayout dynamicLayoutBuild = DynamicLayout.Builder.obtain(spannableStringBuilder, this.f52007a, i).setEllipsize(TextUtils.TruncateAt.END).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(true).setLineSpacing(kli.a.B(context, 6.0f), 1.0f).build();
            Intrinsics.h(dynamicLayoutBuild);
            return dynamicLayoutBuild;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
        /* JADX WARN: Type inference failed for: r2v11, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        @Override // ix0.c1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int e(android.content.Context r17, int r18, koi.j r19) {
            /*
                Method dump skipped, instruction units count: 339
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate.b.e(android.content.Context, int, koi.j):int");
        }

        @Override // ix0.c1
        public final boolean l(koi.j model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return model instanceof Model;
        }
    }

    public static abstract class c {

        public static final class a extends c {
            private a() {
            }
        }

        public static final class b extends c {
            private b() {
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate$c$c, reason: collision with other inner class name */
        public static final class C0397c extends c {
            private C0397c() {
            }
        }

        public static final class d extends c {
            private d() {
            }
        }

        public static final class e extends c {
            private e() {
            }
        }

        public static final class f extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f52012a = new f();

            private f() {
            }
        }

        private c() {
        }
    }

    public ChallengeMediumDelegate() {
        super(R$layout.internal_delegate_challenge_medium, new ip0.h8(11));
        this.f51996c = new b();
        this.d = v0.a.d("create(...)");
    }

    @Override // ix0.c1
    public final int e(Context context, int i, koi.j model) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        return this.f51996c.e(context, i, model);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.w9(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_challenge_medium));
    }

    @Override // ix0.c1
    public final boolean l(koi.j model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return this.f51996c.l(model);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.w9 holder, Model data, int i, List list) {
        boolean z;
        boolean z3;
        boolean z4;
        int i2;
        GradientDrawable gradientDrawableH;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TextView textView = holder.i;
        TextView textView2 = holder.f166959h;
        ProgressBar progressBar = holder.f166962m;
        ImageView imageView = holder.f166958g;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        boolean zN6 = ue0.e.n(payloads);
        boolean zN7 = ue0.e.n(payloads);
        int size = payloads.size();
        boolean z6 = zN;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = payloads.get(i3);
            if (obj2 instanceof ip0.v9) {
                boolean z11 = z6 || ((ip0.v9) obj2).f166790a;
                zN2 = zN2 || ((ip0.v9) obj2).f166791b;
                zN3 = zN3 || ((ip0.v9) obj2).f166792c;
                zN4 = zN4 || ((ip0.v9) obj2).d;
                zN5 = zN5 || ((ip0.v9) obj2).e;
                zN6 = zN6 || ((ip0.v9) obj2).f;
                z6 = z11;
                zN7 = zN7 || ((ip0.v9) obj2).f166793g;
            }
            i3++;
            payloads = list;
        }
        if (z6) {
            ip0.u9 u9Var = data.f51998b;
            zi0.c.g(imageView, u9Var.getImage());
            if (u9Var.a() != R$attr.uikit_colorTransparent) {
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                z = zN2;
                z3 = zN3;
                z4 = zN4;
                gradientDrawableH = dr0.l.h(context, qv0.h.LARGE.a(), new Color.Solid(u9Var.a()), 0, null);
            } else {
                z = zN2;
                z3 = zN3;
                z4 = zN4;
                gradientDrawableH = null;
            }
            imageView.setBackground(gradientDrawableH);
            holder.setItemRenderState(xv0.h.f309151a);
            if (u9Var instanceof ip0.s9) {
                i2 = 8;
                progressBar.setVisibility(8);
            } else {
                i2 = 8;
                if (!(u9Var instanceof ip0.t9)) {
                    throw new NoWhenBranchMatchedException();
                }
                progressBar.setVisibility(0);
                progressBar.setProgress((int) ((ip0.t9) u9Var).f166489c);
                Context context2 = progressBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                progressBar.setProgressTintList(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorAccent, context2)));
            }
        } else {
            z = zN2;
            z3 = zN3;
            z4 = zN4;
            i2 = 8;
        }
        float f = 0.3f;
        if (z) {
            kli.a.b(textView2, data.d, ty0.f.f275450a);
            textView2.setAlpha(data.f51999c instanceof c.b ? 0.3f : 1.0f);
        }
        if (z3) {
            kli.a.b(textView, data.e, ty0.f.f275450a);
            textView.setAlpha(data.f51999c instanceof c.b ? 0.3f : 1.0f);
        }
        if (z4 || zN6) {
            TextView textView3 = holder.f166960j;
            kli.a.b(textView3, d3.a(data), ty0.f.f275450a);
            c cVar = data.f51999c;
            textView3.setAlpha(((cVar instanceof c.C0397c) || (cVar instanceof c.b)) ? 0.3f : 1.0f);
            textView3.setVisibility(data.f != null ? 0 : i2);
        }
        if (zN5) {
            data.getClass();
            holder.itemView.setEnabled(true);
            View view = holder.itemView;
            Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int iD = 0; iD < childCount; iD = m72.b.d(viewGroup, iD, 1.0f, iD, 1)) {
            }
        }
        if (zN6) {
            c cVar2 = data.f51999c;
            TagView tagView = holder.f166961l;
            SecondaryBackgroundConstraintLayout secondaryBackgroundConstraintLayout = holder.o;
            ix0.l0 l0Var = holder.f166964p;
            CircleBadgeView circleBadgeView = holder.k;
            boolean z12 = cVar2 instanceof c.d;
            tagView.setVisibility((z12 || (cVar2 instanceof c3)) ? 0 : i2);
            boolean z29 = cVar2 instanceof c.a;
            if (z29 || (cVar2 instanceof c.e) || (cVar2 instanceof c.b) || (cVar2 instanceof c.C0397c)) {
                i2 = 0;
            }
            circleBadgeView.setVisibility(i2);
            boolean z31 = cVar2 instanceof c.C0397c;
            if (!z31 && !(cVar2 instanceof c.b)) {
                f = 1.0f;
            }
            progressBar.setAlpha(f);
            if (z29) {
                circleBadgeView.setBadge(new AccentCircleBadge(dw0.a.Checked), l0Var);
            } else if (z12) {
                tagView.setContent(new TagViewData(null, new TextLocalisedClause(R$string.challenge_badge_new, null, null, 14), R$attr.uikit_colorRed, null, R$attr.uikit_colorTransparent, null, 1000));
            } else if (cVar2 instanceof c3) {
                tagView.setContent(((c3) cVar2).f53741a);
            } else if (!(cVar2 instanceof c.f)) {
                if (cVar2 instanceof c.e) {
                    circleBadgeView.setBadge(new InactiveCircleBadge(dw0.a.Pending), l0Var);
                } else if (cVar2 instanceof c.b) {
                    circleBadgeView.setBadge(new InactiveCircleBadge(dw0.a.Cancelled), l0Var);
                } else {
                    if (!z31) {
                        throw new NoWhenBranchMatchedException();
                    }
                    circleBadgeView.setBadge(new AccentCircleBadge(dw0.a.Frozen), l0Var);
                }
            }
            if (z31) {
                Context context3 = secondaryBackgroundConstraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                GradientDrawable gradientDrawableH2 = dr0.l.h(context3, qv0.h.LARGE.a(), new Color.Solid(R$attr.uikit_colorActionBackground_50), 0, null);
                Context context4 = secondaryBackgroundConstraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                int iK = kli.a.k(context4, 4.0f);
                Intrinsics.checkNotNullParameter(gradientDrawableH2, "<this>");
                secondaryBackgroundConstraintLayout.setSecondaryBackground(c6d.b.S(gradientDrawableH2, iK, iK, iK, iK));
            } else {
                secondaryBackgroundConstraintLayout.setSecondaryBackground((Drawable) null);
            }
        }
        if (zN7) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, true, null, 24);
        }
        data.getClass();
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        py0.c cVar3 = new py0.c(data.d);
        or0.m.a(itemView2);
        itemView2.setOnClickListener(new ip0.d6(data, cVar3, holder, data, this, 2));
    }
}
