package com.revolut.core.ui_kit.internal.delegates.chat;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutShapeableImageView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import et0.o;
import gw0.d;
import gw0.g;
import h30.l;
import j6.a;
import koi.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import or0.b;
import qv0.c;
import qv0.i;
import qv0.p;
import rnd.d0;
import rq0.f;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/chat/ChatAttachmentMediaItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/internal/delegates/chat/ChatAttachmentMediaItemDelegate$Model;", "Lrq0/f;", "<init>", "()V", "Model", "rq0/d", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatAttachmentMediaItemDelegate extends BaseRecyclerViewDelegate<Model, f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f55859c;
    public o d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/chat/ChatAttachmentMediaItemDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements i, p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f55860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f55861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f55862c;
        public Parcelable d;
        public c e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f55863g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f55864h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f55865j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f55866l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f55867m;

        public Model(g mediaAttachment) {
            Intrinsics.checkNotNullParameter(mediaAttachment, "mediaAttachment");
            String str = mediaAttachment.f147236a;
            Object obj2 = mediaAttachment.d;
            int i = R$attr.uikit_dp12;
            int i2 = R$attr.uikit_dp0;
            int i3 = R$attr.uikit_dp8;
            this.f55860a = str;
            this.f55861b = mediaAttachment;
            this.f55862c = obj2;
            this.d = null;
            this.e = c.d.f249513a;
            this.f = i;
            this.f55863g = i;
            this.f55864h = i2;
            this.i = i3;
            this.f55865j = null;
            this.k = null;
            this.f55866l = null;
            this.f55867m = null;
        }

        @Override // koi.j
        public final k T1() {
            return new ChatAttachmentMediaItemDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55862c() {
            return this.f55862c;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53881a() {
            return this.f55860a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55860a, model.f55860a) && Intrinsics.f(this.f55861b, model.f55861b) && Intrinsics.f(this.f55862c, model.f55862c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f55863g == model.f55863g && this.f55864h == model.f55864h && this.i == model.i && Intrinsics.f(this.f55865j, model.f55865j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f55866l, model.f55866l) && Intrinsics.f(this.f55867m, model.f55867m);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53888m() {
            return this.f;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53887l() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f55861b.hashCode() + (this.f55860a.hashCode() * 31)) * 31;
            Object obj2 = this.f55862c;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.d;
            int iB = a.b(this.i, a.b(this.f55864h, a.b(this.f55863g, a.b(this.f, l.i(this.e, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f55865j;
            int iHashCode3 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f55866l;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f55867m;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55865j() {
            return this.f55865j;
        }

        @Override // qv0.i
        public final void j(c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.e = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f55866l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53940r() {
            return this.f55863g;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53942t() {
            return this.i;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f55863g = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final c getE() {
            return this.e;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55867m() {
            return this.f55867m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF55866l() {
            return this.f55866l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f55865j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53941s() {
            return this.f55864h;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f55867m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            g gVar = this.f55861b;
            d dVar = gVar.f147237b;
            return new rq0.d(!dVar.equals(r3.f147237b), gVar.f147238c != ((Model) oldItem).f55861b.f147238c, b.l(this, (i) oldItem));
        }
    }

    public ChatAttachmentMediaItemDelegate() {
        super(R$id.chatAttachmentMediaItemDelegate, new d0(8));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        Intrinsics.h(context);
        CutoutShapeableImageView cutoutShapeableImageView = new CutoutShapeableImageView(context, null, 6, 0);
        cutoutShapeableImageView.setId(View.generateViewId());
        cutoutShapeableImageView.setDuplicateParentStateEnabled(true);
        cutoutShapeableImageView.setImportantForAccessibility(2);
        cutoutShapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        cutoutShapeableImageView.setForeground(ContextCompat.getDrawable(context, typedValue.resourceId));
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setImportantForAccessibility(2);
        CircleBadgeView circleBadgeView = new CircleBadgeView(context, null, 0, null, 14);
        circleBadgeView.setId(View.generateViewId());
        circleBadgeView.setVisibility(8);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(kli.a.k(context, 40.0f), kli.a.k(context, 40.0f));
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        Unit unit = Unit.f186387a;
        constraintLayout.addView(cutoutShapeableImageView, layoutParams);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(kli.a.k(context, 16.0f), kli.a.k(context, 16.0f));
        layoutParams2.topToTop = 0;
        layoutParams2.bottomToBottom = 0;
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = 0;
        constraintLayout.addView(imageView, layoutParams2);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams3.topToTop = cutoutShapeableImageView.getId();
        layoutParams3.endToEnd = cutoutShapeableImageView.getId();
        constraintLayout.addView(circleBadgeView, layoutParams3);
        return new f(constraintLayout, cutoutShapeableImageView, imageView, circleBadgeView);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(rq0.f r17, com.revolut.core.ui_kit.internal.delegates.chat.ChatAttachmentMediaItemDelegate.Model r18, int r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.delegates.chat.ChatAttachmentMediaItemDelegate.p(rq0.f, com.revolut.core.ui_kit.internal.delegates.chat.ChatAttachmentMediaItemDelegate$Model, int, java.util.List):void");
    }
}
