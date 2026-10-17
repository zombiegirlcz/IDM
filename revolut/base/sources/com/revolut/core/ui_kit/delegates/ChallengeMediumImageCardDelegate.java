package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.FadeBottomImageView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChallengeMediumImageCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ChallengeMediumImageCardDelegate$Model;", "Lip0/y9;", "<init>", "()V", "Companion", "Model", "ip0/x9", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengeMediumImageCardDelegate extends BaseRecyclerViewDelegate<Model, ip0.y9> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52013c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChallengeMediumImageCardDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lgx0/a;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/e3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem, gx0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UrlImage f52015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextClause f52016c;
        public final e3 d;
        public final TagViewData e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f52017g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f52018h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f52019j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52020l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52021m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52022n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final vtj.a f52023p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Parcelable f52024q;

        public Model(String listId, UrlImage image, TextClause title, e3 e3Var, TagViewData tagViewData, boolean z, vtj.a aVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            int i = R$attr.uikit_dp0;
            this.f52014a = listId;
            this.f52015b = image;
            this.f52016c = title;
            this.d = e3Var;
            this.e = tagViewData;
            this.f = z;
            this.f52017g = c.d.f249513a;
            this.f52018h = null;
            this.i = null;
            this.f52019j = null;
            this.k = null;
            this.f52020l = i;
            this.f52021m = i;
            this.f52022n = i;
            this.o = i;
            this.f52023p = aVar;
            this.f52024q = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChallengeMediumImageCardDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF51674g() {
            return this.f52023p;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51671a() {
            return this.f52014a;
        }

        @Override // gx0.a
        public final py0.d d() {
            return new py0.c(this.f52016c);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52014a, model.f52014a) && this.f52015b.equals(model.f52015b) && this.f52016c.equals(model.f52016c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52017g, model.f52017g) && Intrinsics.f(this.f52018h, model.f52018h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52019j, model.f52019j) && Intrinsics.f(this.k, model.k) && this.f52020l == model.f52020l && this.f52021m == model.f52021m && this.f52022n == model.f52022n && this.o == model.o && this.f52023p.equals(model.f52023p) && Intrinsics.f(this.f52024q, model.f52024q);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52211g() {
            return this.f52020l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52020l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f52024q;
        }

        public final int hashCode() {
            int iB = ip0.v7.b(ip0.v7.g(this.f52015b, this.f52014a.hashCode() * 31, 31), 31, this.f52016c);
            e3 e3Var = this.d;
            int iHashCode = (iB + (e3Var == null ? 0 : e3Var.hashCode())) * 31;
            TagViewData tagViewData = this.e;
            int i = h30.l.i(this.f52017g, j6.a.c((iHashCode + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31, 31, this.f), 31);
            p31.c cVar = this.f52018h;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.i;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52019j;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.k;
            int iHashCode5 = (this.f52023p.f292125a.hashCode() + j6.a.b(this.o, j6.a.b(this.f52022n, j6.a.b(this.f52021m, j6.a.b(this.f52020l, (iHashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31)) * 31;
            Parcelable parcelable = this.f52024q;
            return iHashCode5 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52214l() {
            return this.f52018h;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52017g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52215m() {
            return this.i;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52019j = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52212h() {
            return this.f52021m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52213j() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52021m = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getK() {
            return this.f52017g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getO() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52216n() {
            return this.f52019j;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52018h = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52024q = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getI() {
            return this.f52022n;
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
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new ip0.x9(!model.f52015b.equals(this.f52015b), !model.f52016c.equals(this.f52016c), !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.e, this.e), model.f != this.f, or0.b.l(this, model));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ChallengeMediumImageCardDelegate() {
        super(R$layout.internal_delegate_challenge_medium_image_card, new ip0.h8(12));
        this.f52013c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.y9(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_challenge_medium_image_card));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ip0.y9 y9Var = holder instanceof ip0.y9 ? (ip0.y9) holder : null;
        if (y9Var != null) {
            y9Var.f167288j = null;
            Context context = y9Var.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            j70.a aVarA = wr0.a.a(context);
            if (aVarA == null) {
                return;
            }
            kp0.w0.e(y9Var.f, aVarA);
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.y9 holder, Model model, int i, List list) {
        Model data = model;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, list);
        TagView tagView = holder.i;
        FadeBottomImageView fadeBottomImageView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.x9)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        for (int i3 = 0; i3 < size2; i3++) {
            ip0.x9 x9Var = (ip0.x9) payloads.get(i3);
            z = z || x9Var.f167111a;
            z3 = z3 || x9Var.f167112b;
            z4 = z4 || x9Var.f167113c;
            z6 = z6 || x9Var.d;
            z11 = z11 || x9Var.e;
            z12 = z12 || x9Var.f;
        }
        if (z) {
            zi0.c.g(fadeBottomImageView, data.f52015b);
        }
        if (z3) {
            kli.a.b(holder.f167286g, data.f52016c, ty0.f.f275450a);
        }
        if (z4) {
            ProgressBar progressBar = holder.f167287h;
            e3 e3Var = data.d;
            progressBar.setVisibility(e3Var != null ? 0 : 8);
            if (e3Var != null) {
                progressBar.setMax(e3Var.f54078b);
                progressBar.setProgress(e3Var.f54077a);
            }
        }
        if (z6) {
            tagView.setVisibility(data.e != null ? 0 : 8);
            TagViewData tagViewData = data.e;
            if (tagViewData != null) {
                tagView.setContent(tagViewData);
            }
        }
        if (z11) {
            float f = data.f ? 1.0f : 0.4f;
            if (zIsEmpty) {
                fadeBottomImageView.animate().cancel();
                fadeBottomImageView.setAlpha(f);
            } else {
                fadeBottomImageView.animate().alpha(f).setDuration(300L).start();
            }
        }
        if (z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 24);
            data = data;
        }
        fp0.p pVar = holder.k;
        py0.c cVar = new py0.c(data.f52016c);
        fp0.p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new au0.i3(data, cVar, this, model, 18));
    }
}
