package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawAccentBadge;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.qa0;
import ip0.t90;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0003\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RewardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/RewardDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/oe;", "Companion", "Model", "a", "c", "ip0/qa0", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardDelegate extends BaseRecyclerViewDelegate<Model, oe> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53190c;
    public final ihm.f d;
    public final ihm.f e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RewardDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AvatarModel f53192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53193c;
        public final Clause d;
        public final c e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f53195h;
        public Parcelable i;

        public /* synthetic */ Model(String str, AvatarModel.Default r122, TextClause textClause, zm3.a aVar) {
            this(str, (AvatarModel) r122, (Clause) textClause, (Clause) null, (c) c.a.f53197a, true, true, (Object) aVar, (Parcelable) null);
        }

        public static Model e(Model model, c cVar, boolean z, Object obj2, int i) {
            String listId = model.f53191a;
            AvatarModel avatarModel = model.f53192b;
            Clause title = model.f53193c;
            Clause clause = model.d;
            if ((i & 16) != 0) {
                cVar = model.e;
            }
            c notification = cVar;
            if ((i & 32) != 0) {
                z = model.f;
            }
            boolean z3 = z;
            boolean z4 = model.f53194g;
            if ((i & 128) != 0) {
                obj2 = model.f53195h;
            }
            Parcelable parcelable = model.i;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(notification, "notification");
            return new Model(listId, avatarModel, title, clause, notification, z3, z4, obj2, parcelable);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new RewardDelegate(1);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52715m() {
            return this.f53195h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF58157b() {
            return this.f53191a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53191a, model.f53191a) && Intrinsics.f(this.f53192b, model.f53192b) && Intrinsics.f(this.f53193c, model.f53193c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f53194g == model.f53194g && Intrinsics.f(this.f53195h, model.f53195h) && Intrinsics.f(this.i, model.i);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF58158c() {
            return this.i;
        }

        public final int hashCode() {
            int iA = p.a.a((this.f53192b.hashCode() + (this.f53191a.hashCode() * 31)) * 31, 31, this.f53193c);
            Clause clause = this.d;
            int iC = j6.a.c(j6.a.c((this.e.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.f), 31, this.f53194g);
            Object obj2 = this.f53195h;
            int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.i;
            return iHashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            return new qa0(!Intrinsics.f(this.f53192b, model.f53192b), !Intrinsics.f(this.f53193c, model.f53193c), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.d, model.d), this.f != model.f, this.f53194g != model.f53194g);
        }

        public Model(String listId, AvatarModel avatarModel, Clause title, Clause clause, c notification, boolean z, boolean z3, Object obj2, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(notification, "notification");
            this.f53191a = listId;
            this.f53192b = avatarModel;
            this.f53193c = title;
            this.d = clause;
            this.e = notification;
            this.f = z;
            this.f53194g = z3;
            this.f53195h = obj2;
            this.i = parcelable;
        }

        public Model(String listId, Image icon, Clause title, CompositeClause compositeClause, a aVar, boolean z, Object obj2, AnalyticsContext analyticsContext, int i) {
            CircleBadgeModel rawImageBadge = null;
            CompositeClause compositeClause2 = (i & 8) != 0 ? null : compositeClause;
            a badge = (i & 16) != 0 ? a.b.f53196a : aVar;
            boolean z3 = (i & 128) != 0 ? true : z;
            Object obj3 = (i & 256) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i & 512) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(badge, "badge");
            c.a notification = c.a.f53197a;
            Intrinsics.checkNotNullParameter(notification, "notification");
            if (!(badge instanceof a.b)) {
                if (badge instanceof a.C0420a) {
                    rawImageBadge = new RawAccentBadge(R$drawable.uikit_icn_24_cashback);
                } else if (badge instanceof a.c) {
                    rawImageBadge = new AccentCircleBadge(dw0.a.SpareChange);
                } else if (badge instanceof me) {
                    Image image = ((me) badge).f54477a;
                    if (image != null) {
                        rawImageBadge = new RawImageBadge(image);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this(listId, (AvatarModel) new AvatarModel.Default(icon, null, rawImageBadge, null, 494), title, (Clause) compositeClause2, (c) notification, true, z3, obj3, (Parcelable) analyticsContext2);
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.RewardDelegate$a$a, reason: collision with other inner class name */
        public static final class C0420a extends a {
            private C0420a() {
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f53196a = new b();

            private b() {
            }
        }

        public static final class c extends a {
            private c() {
            }
        }

        private a() {
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f53197a = new a();

            private a() {
            }
        }

        private c() {
        }
    }

    public RewardDelegate() {
        this(1);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AvatarView avatarView = new AvatarView(context, null, 6, 0);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        appCompatTextView.setMaxLines(this.f53190c);
        appCompatTextView.setGravity(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceBody1);
        appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context2));
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), kli.a.k(context2, 8.0f), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        appCompatTextView.setTextSize(12.0f);
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context3);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setEllipsize(truncateAt);
        jb3.l.e(appCompatTextView2, R$attr.internal_textAppearanceBody2);
        appCompatTextView2.setPadding(appCompatTextView2.getPaddingLeft(), kli.a.k(context3, 8.0f), appCompatTextView2.getPaddingRight(), appCompatTextView2.getPaddingBottom());
        appCompatTextView2.setTextSize(12.0f);
        Context context4 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        LinearLayout linearLayout = new LinearLayout(context4);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int iK = kli.a.k(context4, 8.0f);
        marginLayoutParams.topMargin = iK;
        marginLayoutParams.bottomMargin = iK;
        linearLayout.setLayoutParams(marginLayoutParams);
        linearLayout.addView(avatarView);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(appCompatTextView2);
        Context context5 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, kli.a.k(context5, 20.0f));
        layoutParams.gravity = 8388613;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context5);
        appCompatTextView3.setMaxLines(1);
        appCompatTextView3.setGravity(16);
        appCompatTextView3.setEllipsize(truncateAt);
        appCompatTextView3.setLayoutParams(layoutParams);
        jb3.l.e(appCompatTextView3, R$attr.internal_textAppearanceEmphasis4);
        appCompatTextView3.setTextColor(kli.a.s(R$attr.uikit_colorBackground, context5));
        appCompatTextView3.setBackgroundResource(com.revolut.core.ui_kit.R$drawable.internal_extra_small_action_background_accent);
        appCompatTextView3.setPadding(kli.a.k(context5, 8.0f), appCompatTextView3.getPaddingTop(), kli.a.k(context5, 8.0f), appCompatTextView3.getPaddingBottom());
        appCompatTextView3.setTextSize(10.0f);
        Context context6 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        FrameLayout frameLayout = new FrameLayout(context6);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(kli.a.k(context6, 72.0f), -2));
        frameLayout.addView(linearLayout);
        frameLayout.addView(appCompatTextView3);
        return new oe(frameLayout, avatarView, appCompatTextView, appCompatTextView3, appCompatTextView2);
    }

    public final void p(oe oeVar, Model model) {
        boolean z = model.f53194g && model.f;
        oeVar.itemView.setClickable(z);
        oeVar.itemView.setBackgroundResource(z ? com.revolut.core.ui_kit.R$drawable.internal_box_background_ripple_transparent_with_paddings : com.revolut.core.ui_kit.R$drawable.internal_box_background_transparent);
        if (!z) {
            oeVar.itemView.setOnClickListener(null);
            oeVar.itemView.setOnLongClickListener(null);
            return;
        }
        View itemView = oeVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.m.a(itemView);
        itemView.setOnClickListener(new au0.t1(model, 17, this, model));
        oeVar.itemView.setOnLongClickListener(new ip0.xe(this, model, 1));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(oe holder, Model data, int i, List list) {
        String str;
        String str2;
        int i2;
        qa0 qa0Var;
        List<qa0> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        AppCompatTextView appCompatTextView = holder.f54560j;
        AppCompatTextView appCompatTextView2 = holder.f54559h;
        AvatarView avatarView = holder.f54558g;
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof qa0)) {
                payloads = null;
                break;
            }
            i3++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        String str3 = "title";
        String str4 = "avatarModel";
        if (payloads.isEmpty()) {
            AvatarModel avatarModel = data.f53192b;
            Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
            avatarView.setModel(avatarModel);
            Clause title = data.f53193c;
            Intrinsics.checkNotNullParameter(title, "title");
            ty0.c.b(holder.k, title, appCompatTextView2, null, null, 12);
            holder.F(data.e);
            Clause clause = data.d;
            if (clause != null) {
                ty0.c.b(holder.k, clause, appCompatTextView, null, null, 12);
                appCompatTextView.setVisibility(0);
            } else {
                appCompatTextView.setVisibility(8);
            }
            holder.itemView.setAlpha(data.f ? 1.0f : 0.5f);
            p(holder, data);
            return;
        }
        int i5 = 8;
        for (qa0 qa0Var2 : payloads) {
            if (qa0Var2.f165949a) {
                AvatarModel avatarModel2 = data.f53192b;
                Intrinsics.checkNotNullParameter(avatarModel2, str4);
                avatarView.setModel(avatarModel2);
            }
            if (qa0Var2.f165950b) {
                String str5 = str4;
                Clause clause2 = data.f53193c;
                Intrinsics.checkNotNullParameter(clause2, str3);
                str = str3;
                str2 = str5;
                ty0.c.b(holder.k, clause2, appCompatTextView2, null, null, 12);
            } else {
                str = str3;
                str2 = str4;
            }
            AppCompatTextView appCompatTextView3 = appCompatTextView2;
            if (qa0Var2.d) {
                Clause clause3 = data.d;
                if (clause3 != null) {
                    i2 = i5;
                    qa0Var = qa0Var2;
                    ty0.c.b(holder.k, clause3, appCompatTextView, null, null, 12);
                    appCompatTextView.setVisibility(0);
                } else {
                    i2 = i5;
                    qa0Var = qa0Var2;
                    appCompatTextView.setVisibility(i2);
                }
            } else {
                i2 = i5;
                qa0Var = qa0Var2;
            }
            if (qa0Var.f165951c) {
                holder.F(data.e);
            }
            if (qa0Var.e) {
                holder.itemView.setAlpha(data.f ? 1.0f : 0.5f);
            }
            p(holder, data);
            appCompatTextView2 = appCompatTextView3;
            i5 = i2;
            str3 = str;
            str4 = str2;
        }
    }

    public RewardDelegate(int i) {
        super(R$id.internal_reward_delegate_view_type, new t90(6));
        this.f53190c = i;
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }
}
