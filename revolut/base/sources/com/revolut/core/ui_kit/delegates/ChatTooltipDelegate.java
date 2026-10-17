package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatTooltipDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ChatTooltipDelegate$Model;", "Lip0/wa;", "<init>", "()V", "Model", "a", "ip0/va", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatTooltipDelegate extends BaseRecyclerViewDelegate<Model, ip0.wa> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52068c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ChatTooltipDelegate$Model;", "Lkoi/j;", "Lqv0/o;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.o, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f52070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f52071c;
        public Parcelable d;
        public int e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f52072g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f52073h;

        public Model(String listId, Image image, Clause text, int i, int i2, int i3) {
            a.C0398a style = a.C0398a.f52074a;
            i = (i3 & 64) != 0 ? R$attr.uikit_dp8 : i;
            i2 = (i3 & 128) != 0 ? R$attr.uikit_dp8 : i2;
            int i5 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f52069a = listId;
            this.f52070b = image;
            this.f52071c = text;
            this.d = null;
            this.e = i;
            this.f = i2;
            this.f52072g = i5;
            this.f52073h = i5;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ChatTooltipDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55862c() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55091b() {
            return this.f52069a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            if (!this.f52069a.equals(model.f52069a) || !Intrinsics.f(this.f52070b, model.f52070b) || !this.f52071c.equals(model.f52071c)) {
                return false;
            }
            Object obj3 = a.C0398a.f52074a;
            return obj3.equals(obj3) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && this.f52072g == model.f52072g && this.f52073h == model.f52073h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF() {
            return this.e;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.e = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53440j() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = this.f52069a.hashCode() * 31;
            Image image = this.f52070b;
            int iHashCode2 = (a.C0398a.f52074a.hashCode() + p.a.b((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f52071c)) * 961;
            Parcelable parcelable = this.d;
            return Integer.hashCode(this.f52073h) + j6.a.b(this.f52072g, j6.a.b(this.f, j6.a.b(this.e, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53438g() {
            return this.f;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getI() {
            return this.f52073h;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53439h() {
            return this.f52072g;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z = !Intrinsics.f(model.f52070b, this.f52070b);
            boolean z3 = !model.f52071c.equals(this.f52071c);
            Object obj2 = a.C0398a.f52074a;
            return new ip0.va(z, z3, !obj2.equals(obj2));
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ChatTooltipDelegate$a$a, reason: collision with other inner class name */
        public static final class C0398a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0398a f52074a = new C0398a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f52075b = R$attr.uikit_colorWidgetBackground;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f52076c = R$attr.uikit_colorGreyTone50;

            private C0398a() {
            }
        }

        private a() {
        }
    }

    public ChatTooltipDelegate() {
        super(R$layout.internal_delegate_chat_tooltip, new ip0.h8(22));
        this.f52068c = v0.a.d("create(...)");
    }

    public static void p(ip0.wa waVar) {
        Drawable drawableMutate;
        a.C0398a c0398a = a.C0398a.f52074a;
        View view = waVar.f;
        Drawable drawable = ContextCompat.getDrawable(waVar.itemView.getContext(), R$drawable.internal_tooltip_background_rounded);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            drawableMutate = null;
        } else {
            Context context = waVar.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ((GradientDrawable) drawableMutate).setColor(kli.a.s(a.C0398a.f52075b, context));
        }
        view.setBackground(drawableMutate);
        TextView textView = waVar.f166967h;
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setTextColor(kli.a.s(a.C0398a.f52076c, context2));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.wa(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_chat_tooltip));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.wa holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f166967h;
        View view = holder.itemView;
        ImageView imageView = holder.f166966g;
        Context context = view.getContext();
        View view2 = holder.itemView;
        Intrinsics.h(context);
        int i2 = data.f52072g;
        ?? r4 = data.f52071c;
        Image image = data.f52070b;
        view2.setPadding(kli.a.w(i2, context), kli.a.w(data.e, context), kli.a.w(data.f52073h, context), kli.a.w(data.f, context));
        if (payloads.isEmpty()) {
            or0.b.f(this, image, imageView);
            or0.b.e(this, r4, textView, null, 12);
            a.C0398a c0398a = a.C0398a.f52074a;
            p(holder);
        } else {
            for (ip0.va vaVar : zhm.c0.N(payloads, ip0.va.class)) {
                if (vaVar.f166797a) {
                    or0.b.f(this, image, imageView);
                }
                if (vaVar.f166798b) {
                    or0.b.e(this, r4, textView, null, 12);
                }
                if (vaVar.f166799c) {
                    a.C0398a c0398a2 = a.C0398a.f52074a;
                    p(holder);
                }
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        py0.c cVar = new py0.c(r4);
        or0.m.a(itemView);
        itemView.setOnClickListener(new au0.i3(data, cVar, this, data, 19));
    }
}
