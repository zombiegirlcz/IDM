package com.revolut.core.ui_kit.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import au0.c4;
import aw0.o9;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.internal.views.CircleActionView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.framelayout.NestedScrollableHost;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.recyclerkit.UIKitRecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ms0.a0;
import ms0.e4;
import ms0.h4;
import ms0.v4;
import mx0.v8;
import org.jetbrains.annotations.NotNull;
import rp0.l0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0019\u0017;<=>?,@ABCDEFGHIJKLMNO3PB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001bH\u0007¢\u0006\u0004\b \u0010\u001eJ\u001b\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0!H\u0000¢\u0006\u0004\b#\u0010$J\u0011\u0010)\u001a\u0004\u0018\u00010&H\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010\u001eJ\u001d\u0010.\u001a\u00020\u000f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0!H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102R$\u00109\u001a\u0002032\u0006\u00104\u001a\u0002038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006Q"}, d2 = {"Lcom/revolut/core/ui_kit/views/ActionsView;", "Landroid/widget/FrameLayout;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "left", "top", "right", "bottom", "", "setPadding", "(IIII)V", "getPaddingLeft", "()I", "getPaddingTop", "getPaddingRight", "getPaddingBottom", "Lmx0/l;", "layoutType", "setLayoutType", "(Lmx0/l;)V", "", "isBrightDark", "setBrightDark", "(Z)V", "scrollable", "setScrollable", "", "Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "getHiddenActions$ui_kit_components_release", "()Ljava/util/List;", "getHiddenActions", "Lrp0/l0;", "getPopupMenuDisplayer$ui_kit_components_release", "()Lrp0/l0;", "getPopupMenuDisplayer", "enabled", "setInternalMarginEnabled", "Lmx0/j;", "items", "setItemsInternal", "(Ljava/util/List;)V", "Lrp0/m;", "getBottomDialogDisplayer", "()Lrp0/m;", "Lmx0/p;", "value", "t", "Lmx0/p;", "getMoreActionState$ui_kit_components_release", "()Lmx0/p;", "moreActionState", "Companion", "mx0/v", "Item", "mx0/d", "mx0/e", "mx0/r", "ActionLoadingDelegate", "ActionCircleLoadingDelegate", "ActionDelegate", "CircleActionDelegate", "LargeButtonActionDelegate", "LargeButtonActionLoadingDelegate", "mx0/n", "mx0/m", "mx0/w", "mx0/g", "mx0/k", "mx0/q", "c", "mx0/f", "a", "mx0/h", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionsView extends FrameLayout implements ur0.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public int A;
    public c4 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e01.a f58296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e01.a f58297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f58298c;
    public final e01.a d;
    public mx0.l e;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f58299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f58300h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f58301j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f58302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f58303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f58304n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final UIKitRecyclerView f58305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z4l.j f58306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f58307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DefaultItemAnimator f58308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public mx0.p moreActionState;
    public rp0.m u;
    public l0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v1 f58310w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f58311x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f58312y;
    public Integer z;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/ActionsView$ActionCircleLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lmx0/i;", "Lmx0/m;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ActionCircleLoadingDelegate extends BaseRecyclerViewDelegate<mx0.i, mx0.m> {
        public ActionCircleLoadingDelegate() {
            super(3, new mv5.h(2));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new mx0.m(kotlin.jvm.internal.s.r(parent, R$layout.internal_action_circle_loading_view));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(mx0.m holder, mx0.i data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            ActionsView actionsView = ActionsView.this;
            v1 v1Var = actionsView.f58310w;
            Integer num = actionsView.f58311x;
            Integer num2 = actionsView.f58312y;
            Integer num3 = actionsView.z;
            if (v1Var == null || num == null || num2 == null || num3 == null) {
                return;
            }
            holder.f.r(v1Var, num.intValue(), num2.intValue(), num3.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/ActionsView$ActionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/c;", "Lmx0/w;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ActionDelegate extends BaseRecyclerViewDelegate<com.revolut.core.ui_kit.views.c, mx0.w> {
        public ActionDelegate() {
            super(0, new mv5.h(3));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new mx0.w(kotlin.jvm.internal.s.r(parent, R$layout.internal_action_view));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(mx0.w holder, com.revolut.core.ui_kit.views.c data, int i, List payloads) {
            h4 h4Var;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            Item item = data.f59026a;
            boolean zIsEmpty = payloads.isEmpty();
            SmallActionButton smallActionButton = holder.f;
            smallActionButton.setAnalyticsContext(item.o);
            String str = item.f58322l;
            smallActionButton.setLoadingButtonTag(str);
            ActionsView actionsView = ActionsView.this;
            e01.a aVar = actionsView.f58296a;
            efm.r map = smallActionButton.f56386h.map(new mfm.d(item));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            aVar.a(ActionsView.b(actionsView, map), holder);
            e01.a aVar2 = actionsView.f58297b;
            efm.r map2 = smallActionButton.i.map(new mfm.d(item));
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            aVar2.a(ActionsView.b(actionsView, map2), holder);
            Iterator it8 = payloads.iterator();
            boolean z = zIsEmpty;
            boolean z3 = z;
            boolean z4 = z3;
            boolean z6 = z4;
            boolean z11 = z6;
            boolean z12 = z11;
            boolean z29 = z12;
            boolean z31 = z29;
            boolean z41 = z31;
            boolean z49 = z41;
            boolean z54 = z49;
            while (it8.hasNext()) {
                Iterator it9 = it8;
                Object next = it9.next();
                boolean z74 = zIsEmpty;
                if (next instanceof mx0.r) {
                    zIsEmpty = z74 || ((mx0.r) next).f209966a;
                    z6 = z6 || ((mx0.r) next).f209967b;
                    z3 = z3 || ((mx0.r) next).f209968c;
                    z4 = z4 || ((mx0.r) next).d;
                    z = z || ((mx0.r) next).e;
                    z11 = z11 || ((mx0.r) next).f;
                    boolean z83 = z49 || ((mx0.r) next).f209969g;
                    z12 = z12 || ((mx0.r) next).f209970h;
                    boolean z89 = z83;
                    boolean z96 = z41 || ((mx0.r) next).i;
                    z29 = z29 || ((mx0.r) next).f209971j;
                    z31 = z31 || ((mx0.r) next).k;
                    z41 = z96;
                    z49 = z89;
                    z54 = z54 || ((mx0.r) next).f209972l;
                } else {
                    zIsEmpty = z74;
                }
                it8 = it9;
            }
            if (zIsEmpty) {
                mx0.d dVar = item.f58317b;
                boolean z100 = item.f58318c;
                if (actionsView.e != mx0.l.HEADER_CIRCLE_ACTIONS || z100) {
                    switch (com.revolut.core.ui_kit.views.a.f58931a[ActionsView.c(actionsView, dVar).ordinal()]) {
                        case 1:
                            h4Var = h4.ACCENT;
                            break;
                        case 2:
                            h4Var = !actionsView.f58301j ? h4.SEMIACCENT : h4.SEMIACCENT_BRIGHT_DARK;
                            break;
                        case 3:
                            h4Var = h4.NEGATIVE;
                            break;
                        case 4:
                            h4Var = h4.NEGATIVE_ACCENT;
                            break;
                        case 5:
                            h4Var = h4.SEMIBLACK;
                            break;
                        case 6:
                            h4Var = h4.SEMIACCENT_BRIGHT_DARK;
                            break;
                        case 7:
                            h4Var = h4.DARK_ON_ACCENT;
                            break;
                        case 8:
                            h4Var = h4.LIGHT_ON_ACCENT;
                            break;
                        case 9:
                            h4Var = h4.BLACK;
                            break;
                        case 10:
                            h4Var = h4.WHITE;
                            break;
                        case 11:
                            h4Var = h4.SECONDARY_WHITE;
                            break;
                        case 12:
                            h4Var = h4.WHITE_OR_BLACK;
                            break;
                        case 13:
                        case 14:
                            h4Var = h4.CONTEXTUAL;
                            break;
                        case 15:
                        case 16:
                            h4Var = h4.INVERTED_PRIMARY;
                            break;
                        case 17:
                            h4Var = h4.PRIMARY_NEUTRAL;
                            break;
                        case 18:
                            h4Var = h4.FLAT;
                            break;
                        case 19:
                            h4Var = h4.SHIMMER;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    h4Var = h4.CONTEXTUAL;
                }
                smallActionButton.i(h4Var);
            }
            if (z) {
                smallActionButton.setIconsColorFilterEnabled(item.k);
            }
            if (z3) {
                smallActionButton.setText(item.f);
            }
            if (z4) {
                smallActionButton.setIcon(item.f58319g);
            }
            if (z11) {
                smallActionButton.setEndIcon(item.f58320h);
            }
            if (z6) {
                smallActionButton.setState(item.d);
            }
            if (z12) {
                mx0.e eVar = item.i;
                if (!(eVar instanceof mx0.e)) {
                    eVar = null;
                }
                smallActionButton.setBadgeContent(eVar != null ? eVar.f209663a : null);
            }
            if (z41) {
                ms0.n nVar = item.f58321j;
                if (nVar == null) {
                    nVar = ms0.l.f208314a;
                }
                smallActionButton.setBadgeMode(nVar);
            }
            if (z29) {
                smallActionButton.setMaxButtonWidth(item.f58323m);
            }
            if (z31) {
                View itemView = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                pd.b.p(itemView, item.e);
            }
            v1 v1Var = actionsView.f58310w;
            Integer num = actionsView.f58311x;
            Integer num2 = actionsView.f58312y;
            Integer num3 = actionsView.z;
            if (v1Var != null && num != null && num2 != null && num3 != null) {
                smallActionButton.r(v1Var, num.intValue(), num2.intValue(), num3.intValue());
            }
            if (z54) {
                smallActionButton.setTag(str);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/ActionsView$ActionLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lmx0/i;", "Lmx0/n;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ActionLoadingDelegate extends BaseRecyclerViewDelegate<mx0.i, mx0.n> {
        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new mx0.n(kotlin.jvm.internal.s.r(parent, R$layout.internal_action_loading_view));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(mx0.n holder, mx0.i data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            ifk.b.r(holder.f);
            Context context = holder.itemView.getContext();
            ViewGroup.LayoutParams layoutParams = holder.f209845g.getLayoutParams();
            Intrinsics.h(context);
            layoutParams.width = kli.a.k(context, data.f209746c ? 48.0f : 99.0f);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/ActionsView$CircleActionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/c;", "Lmx0/g;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class CircleActionDelegate extends BaseRecyclerViewDelegate<com.revolut.core.ui_kit.views.c, mx0.g> {
        public CircleActionDelegate() {
            super(2, new mv5.h(5));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new mx0.g(new CircleActionView(context, null, 6, 0));
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(mx0.g holder, com.revolut.core.ui_kit.views.c data, int i, List payloads) {
            a0 a0Var;
            boolean z;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            Item item = data.f59026a;
            boolean zIsEmpty = payloads.isEmpty();
            boolean z3 = zIsEmpty;
            boolean z4 = z3;
            boolean z6 = z4;
            boolean z11 = z6;
            boolean z12 = z11;
            boolean z29 = z12;
            boolean z31 = z29;
            boolean z41 = z31;
            boolean z49 = z41;
            boolean z54 = z49;
            for (Object obj2 : payloads) {
                if (obj2 instanceof mx0.r) {
                    z4 = z4 || ((mx0.r) obj2).f209966a;
                    z6 = z6 || ((mx0.r) obj2).f209967b;
                    zIsEmpty = zIsEmpty || ((mx0.r) obj2).f209968c;
                    z3 = z3 || ((mx0.r) obj2).d;
                    z29 = z29 || ((mx0.r) obj2).e;
                    z41 = z41 || ((mx0.r) obj2).f;
                    z49 = z49 || ((mx0.r) obj2).f209969g;
                    z11 = z11 || ((mx0.r) obj2).f209970h;
                    z54 = z54 || ((mx0.r) obj2).f209971j;
                    z12 = z12 || ((mx0.r) obj2).k;
                    z31 = z31 || ((mx0.r) obj2).f209972l;
                }
            }
            CircleActionView circleActionView = holder.f;
            ihm.f fVar = circleActionView.f56119a;
            ActionsView actionsView = ActionsView.this;
            efm.r map = fVar.map(new mv9.h(16, new moe.c(item, 8, actionsView, holder)));
            e01.a aVar = actionsView.f58296a;
            Intrinsics.h(map);
            aVar.a(ActionsView.b(actionsView, map), holder);
            if (zIsEmpty) {
                circleActionView.setLabel(item.f);
            }
            if (z3) {
                circleActionView.setIcon(item.f58319g);
            }
            if (z6 || z4) {
                e4 e4Var = item.d;
                circleActionView.setEnabled(v4.b(e4Var));
                mx0.d dVar = item.f58317b;
                boolean z74 = item.f58318c;
                if (actionsView.e != mx0.l.HEADER_CIRCLE_ACTIONS || z74) {
                    switch (b.f58951a[ActionsView.c(actionsView, dVar).ordinal()]) {
                        case 1:
                            a0Var = a0.ACCENT_HIGHLIGHTED;
                            break;
                        case 2:
                        case 3:
                            a0Var = a0.CONTEXTUAL;
                            break;
                        case 4:
                        case 5:
                            a0Var = a0.INVERTED_PRIMARY;
                            break;
                        case 6:
                            a0Var = a0.PRIMARY_NEUTRAL;
                            break;
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            a0Var = a0.ACCENT;
                            break;
                        case 19:
                            a0Var = a0.ELEVATED;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    a0Var = a0.CONTEXTUAL;
                }
                circleActionView.setStyle(a0Var, v4.c(e4Var), v4.b(e4Var));
            }
            if (z11) {
                mx0.e eVar = item.i;
                if (eVar instanceof mx0.e) {
                    z = true;
                } else {
                    if (eVar != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = jli.h.f175850a;
                    z = false;
                }
                circleActionView.setNotificationDotVisible(z);
                circleActionView.setBadgeModel(null);
            }
            if (z12) {
                View itemView = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                pd.b.p(itemView, item.e);
            }
            v1 v1Var = actionsView.f58310w;
            Integer num = actionsView.f58311x;
            Integer num2 = actionsView.f58312y;
            Integer num3 = actionsView.z;
            if (v1Var != null && num != null && num2 != null && num3 != null) {
                circleActionView.r(v1Var, num.intValue(), num2.intValue(), num3.intValue());
            }
            if (z31) {
                circleActionView.setTag(item.f58322l);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/ActionsView$LargeButtonActionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/views/c;", "Lmx0/k;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class LargeButtonActionDelegate extends BaseRecyclerViewDelegate<com.revolut.core.ui_kit.views.c, mx0.k> {
        public LargeButtonActionDelegate() {
            super(4, new mv5.h(6));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            LargeActionButton largeActionButton = new LargeActionButton(context, null, 6, 0);
            largeActionButton.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            largeActionButton.setAccessibilityDelegate(null);
            largeActionButton.setOnTouchListener(null);
            return new mx0.k(largeActionButton);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(mx0.k holder, com.revolut.core.ui_kit.views.c data, int i, List payloads) {
            boolean z;
            LargeActionButton.ButtonStyle buttonStyle;
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            LargeActionButton largeActionButton = holder.f;
            Item item = data.f59026a;
            boolean zIsEmpty = payloads.isEmpty();
            Iterator it8 = payloads.iterator();
            boolean z3 = zIsEmpty;
            boolean z4 = z3;
            boolean z6 = z4;
            boolean z11 = z6;
            boolean z12 = z11;
            boolean z29 = z12;
            boolean z31 = z29;
            boolean z41 = z31;
            boolean z49 = z41;
            while (true) {
                Iterator it9 = it8;
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it9.next();
                if (next instanceof mx0.r) {
                    boolean z54 = z3 || ((mx0.r) next).f209966a;
                    boolean z74 = z11 || ((mx0.r) next).f209967b;
                    z6 = z6 || ((mx0.r) next).f209968c;
                    boolean z83 = z12 || ((mx0.r) next).d;
                    z4 = z4 || ((mx0.r) next).e;
                    boolean z89 = z31 || ((mx0.r) next).f;
                    boolean z96 = z41 || ((mx0.r) next).f209969g;
                    boolean z100 = z49 || ((mx0.r) next).f209971j;
                    z29 = z29 || ((mx0.r) next).k;
                    z49 = z100;
                    zIsEmpty = zIsEmpty || ((mx0.r) next).f209972l;
                    z41 = z96;
                    z31 = z89;
                    z12 = z83;
                    z11 = z74;
                    z3 = z54;
                }
                it8 = it9;
            }
            if (zIsEmpty) {
                largeActionButton.setLoadingButtonTag(data.f59026a.f58322l);
            }
            ActionsView actionsView = ActionsView.this;
            if (z3) {
                mx0.d dVar = item.f58317b;
                boolean z101 = item.f58318c;
                mx0.d dVarC = ActionsView.c(actionsView, dVar);
                if (actionsView.e != mx0.l.HEADER_CIRCLE_ACTIONS || z101) {
                    z = true;
                    switch (com.revolut.core.ui_kit.views.d.f59051a[dVarC.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            buttonStyle = LargeActionButton.ButtonStyle.f58725a;
                            break;
                        case 7:
                        case 8:
                            buttonStyle = LargeActionButton.ButtonStyle.f58726b;
                            break;
                        case 9:
                            buttonStyle = LargeActionButton.ButtonStyle.f58731l;
                            break;
                        case 10:
                            LargeActionButton.ButtonStyle.INSTANCE.getClass();
                            buttonStyle = LargeActionButton.ButtonStyle.f58736r;
                            break;
                        case 11:
                        case 12:
                            buttonStyle = LargeActionButton.ButtonStyle.f58727c;
                            break;
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            buttonStyle = LargeActionButton.ButtonStyle.d;
                            break;
                        case 17:
                            buttonStyle = LargeActionButton.ButtonStyle.f58732m;
                            break;
                        case 18:
                            buttonStyle = LargeActionButton.ButtonStyle.f58733n;
                            break;
                        case 19:
                            buttonStyle = LargeActionButton.ButtonStyle.f58737s;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (dVarC == mx0.d.CONTEXTUAL_SOLID) {
                        Iterator it10 = actionsView.f.iterator();
                        int size = 0;
                        while (it10.hasNext()) {
                            size += ((List) it10.next()).size();
                        }
                        z = true;
                        if (size == 1) {
                            buttonStyle = LargeActionButton.ButtonStyle.f58733n;
                        }
                    } else {
                        z = true;
                    }
                    buttonStyle = LargeActionButton.ButtonStyle.f58732m;
                }
                largeActionButton.o(buttonStyle);
            } else {
                z = true;
            }
            if (z6) {
                largeActionButton.setText(item.f);
            }
            if (z12) {
                largeActionButton.setIcon(item.f58319g);
            }
            if (z11) {
                if (!v4.b(item.d) && !v4.c(item.d)) {
                    z = false;
                }
                largeActionButton.setEnabled(z);
            }
            if (z29) {
                View itemView = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                pd.b.p(itemView, item.e);
            }
            v1 v1Var = actionsView.f58310w;
            Integer num = actionsView.f58311x;
            Integer num2 = actionsView.f58312y;
            Integer num3 = actionsView.z;
            if (v1Var != null && num != null && num2 != null && num3 != null) {
                largeActionButton.r(v1Var, num.intValue(), num2.intValue(), num3.intValue());
            }
            largeActionButton.setAnalyticsContext(item.o);
            efm.r map = largeActionButton.o.map(new mfm.d(item));
            e01.a aVar = actionsView.f58296a;
            Intrinsics.h(map);
            aVar.a(ActionsView.b(actionsView, map), holder);
            actionsView.d.a(largeActionButton.A.f256627t, holder);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/ActionsView$LargeButtonActionLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lmx0/i;", "Lmx0/k;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class LargeButtonActionLoadingDelegate extends BaseRecyclerViewDelegate<mx0.i, mx0.k> {
        public LargeButtonActionLoadingDelegate() {
            super(5, new mv5.h(7));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            LargeActionButton largeActionButton = new LargeActionButton(context, null, 6, 0);
            largeActionButton.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new mx0.k(largeActionButton);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(mx0.k holder, mx0.i data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            LargeActionButton largeActionButton = holder.f;
            largeActionButton.G = v8.COLORED;
            largeActionButton.n(largeActionButton.f58720s);
            largeActionButton.o(LargeActionButton.ButtonStyle.f58737s);
            ActionsView actionsView = ActionsView.this;
            v1 v1Var = actionsView.f58310w;
            Integer num = actionsView.f58311x;
            Integer num2 = actionsView.f58312y;
            Integer num3 = actionsView.z;
            if (v1Var == null || num == null || num2 == null || num3 == null) {
                return;
            }
            largeActionButton.r(v1Var, num.intValue(), num2.intValue(), num3.intValue());
        }
    }

    public static final class a extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f58327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f58328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f58329c;
        public boolean d;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            this.f58328b = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            this.f58328b = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            this.f58329c = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            this.f58327a = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            this.d = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj2) {
            this.f58328b = true;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.ActionsView$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class c extends RecyclerView.LayoutManager implements mx0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58330a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f58331b = -1;

        @Override // mx0.h
        public final IntRange a() {
            int i = this.f58330a;
            if (i >= 0 && i <= this.f58331b - 2) {
                return new IntRange(this.f58330a + 1, this.f58331b - 2, 1);
            }
            IntRange.INSTANCE.getClass();
            return IntRange.d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
            return new RecyclerView.LayoutParams(-2, -2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean isAutoMeasureEnabled() {
            return true;
        }

        public final int m(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            return getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }

        public final int n(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            return getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
        
            if (r14 != 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0094, code lost:
        
            measureChildWithMargins(r1, r11, 0);
            r3 = n(r1);
            r4 = m(r1);
            addView(r1);
            r5 = r3 + r2;
            or0.g.a(r17, r1, r2, getPaddingTop(), r5, getPaddingTop() + r4);
            r17.f58330a = r14;
            r2 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
        
            addView(r8);
            or0.g.a(r17, r8, r2, getPaddingTop(), r2 + r11, getPaddingTop() + r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
        
            return;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ActionsView.c.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
        }
    }

    public static final class d extends DefaultItemAnimator {
        @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
        public final boolean animateAdd(RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            boolean zAnimateAdd = super.animateAdd(holder);
            holder.itemView.setAlpha(1.0f);
            return zAnimateAdd;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.revolut.core.ui_kit.views.ActionsView r27, com.revolut.core.ui_kit.views.ActionsView.Item r28) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ActionsView.a(com.revolut.core.ui_kit.views.ActionsView, com.revolut.core.ui_kit.views.ActionsView$Item):boolean");
    }

    public static final efm.r b(ActionsView actionsView, efm.r rVar) {
        efm.r rVarFilter = rVar.filter(new mv9.h(13, new mx0.b(actionsView, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        return rVarFilter;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final mx0.d c(ActionsView actionsView, mx0.d dVar) {
        return (dVar != mx0.d.ON_MEDIA_STATIC || ((Boolean) jo0.g.M.getValue()).booleanValue()) ? dVar : mx0.d.SEMIBLACK;
    }

    private final rp0.m getBottomDialogDisplayer() {
        rp0.m mVar = this.u;
        if (mVar != null) {
            return mVar;
        }
        rp0.m mVar2 = new rp0.m();
        this.u = mVar2;
        AccountCellItemDelegate accountCellItemDelegate = new AccountCellItemDelegate();
        mVar2.i(new maa.r(accountCellItemDelegate, 23));
        mVar2.d(this);
        accountCellItemDelegate.f51551c.f53218h.subscribe(new mv9.h(14, new mx0.b(this, 1)));
        return mVar2;
    }

    private final void setInternalMarginEnabled(boolean enabled) {
        UIKitRecyclerView uIKitRecyclerView = this.f58305p;
        if (!enabled) {
            ViewGroup.LayoutParams layoutParams = uIKitRecyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
            uIKitRecyclerView.setLayoutParams(marginLayoutParams);
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = -kli.a.k(context, 4.0f);
        ViewGroup.LayoutParams layoutParams2 = uIKitRecyclerView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = i;
        marginLayoutParams2.bottomMargin = i;
        marginLayoutParams2.leftMargin = i;
        marginLayoutParams2.rightMargin = i;
        uIKitRecyclerView.setLayoutParams(marginLayoutParams2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setItemsInternal(java.util.List<? extends mx0.j> r13) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ActionsView.setItemsInternal(java.util.List):void");
    }

    public final koi.b d(int i) {
        UIKitRecyclerView uIKitRecyclerView = this.f58305p;
        View childAt = uIKitRecyclerView.getChildAt(i);
        if (childAt == null) {
            return null;
        }
        RecyclerView.ViewHolder childViewHolder = uIKitRecyclerView.getChildViewHolder(childAt);
        Intrinsics.i(childViewHolder, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.BaseRecyclerViewHolder");
        return (koi.b) childViewHolder;
    }

    public final int e(int i) {
        switch (mx0.x.f210097a[this.e.ordinal()]) {
            case 8:
                if (i >= 2) {
                    return 1;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 0;
            case 9:
            case 10:
                return i >= 2 ? 1 : 2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void f() {
        this.k = true;
        requestLayout();
    }

    public final void g() {
        c4 c4Var = this.B;
        if (c4Var != null) {
            c4Var.cancel();
        }
        this.B = null;
        UIKitRecyclerView uIKitRecyclerView = this.f58305p;
        int childCount = uIKitRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childViewHolder = uIKitRecyclerView.getChildViewHolder(uIKitRecyclerView.getChildAt(i));
            if (childViewHolder instanceof koi.b) {
                Object obj2 = (koi.b) childViewHolder;
                if (obj2 instanceof jr0.i) {
                    ((jr0.i) obj2).Q();
                }
            }
        }
    }

    @NotNull
    public final List<List<Item>> getHiddenActions$ui_kit_components_release() {
        List list = this.f;
        Object layoutManager = this.f58305p.getLayoutManager();
        mx0.h hVar = layoutManager instanceof mx0.h ? (mx0.h) layoutManager : null;
        if (hVar == null) {
            return f0.f322471a;
        }
        IntRange intRangeA = hVar.a();
        if (!intRangeA.isEmpty()) {
            Iterator it8 = list.iterator();
            int size = 0;
            while (it8.hasNext()) {
                size += ((List) it8.next()).size();
            }
            if (size > intRangeA.f186449b) {
                ArrayList arrayList = new ArrayList();
                int size2 = list.size();
                int i = 0;
                for (int i2 = 0; i2 < size2; i2++) {
                    List list2 = (List) list.get(i2);
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        Item item = (Item) list2.get(i3);
                        if (intRangeA.d(i)) {
                            arrayList2.add(item);
                        }
                        i++;
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(arrayList2);
                    }
                }
                return arrayList;
            }
        }
        return f0.f322471a;
    }

    @NotNull
    /* JADX INFO: renamed from: getMoreActionState$ui_kit_components_release, reason: from getter */
    public final mx0.p getMoreActionState() {
        return this.moreActionState;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return this.f58305p.getPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return this.f58305p.getPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return this.f58305p.getPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return this.f58305p.getPaddingTop();
    }

    public final l0 getPopupMenuDisplayer$ui_kit_components_release() {
        l0 l0Var = this.v;
        if (l0Var != null) {
            return l0Var;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        if (activityI == null) {
            return null;
        }
        l0 l0Var2 = new l0(activityI);
        this.v = l0Var2;
        l0Var2.f256113c.subscribe(new mv9.h(15, new mx0.b(this, 2)));
        return l0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Set set, Function1 function1) {
        c4 c4Var;
        c4 c4Var2 = this.B;
        if (c4Var2 != null) {
            c4Var2.cancel();
        }
        if (!ViewCompat.isLaidOut(this) || isLayoutRequested()) {
            c4Var = new c4(this, this, set, function1);
            addOnLayoutChangeListener(c4Var);
        } else {
            c4Var = null;
            this.B = null;
            UIKitRecyclerView uIKitRecyclerView = this.f58305p;
            int childCount = uIKitRecyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.ViewHolder childViewHolder = uIKitRecyclerView.getChildViewHolder(uIKitRecyclerView.getChildAt(i));
                if (childViewHolder instanceof koi.b) {
                    koi.b bVar = (koi.b) childViewHolder;
                    if (bVar instanceof jr0.i) {
                        Set set2 = set;
                        koi.j jVar = bVar.e;
                        if (d0.T(set2, jVar != null ? jVar.getF52244a() : null)) {
                            function1.invoke(((jr0.i) bVar).getGlowHighlightManager());
                        } else {
                            ((jr0.i) bVar).Q();
                        }
                    }
                }
            }
        }
        this.B = c4Var;
    }

    public final void i(List actions, mx0.v scrollTarget, boolean z) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(scrollTarget, "scrollTarget");
        boolean z3 = scrollTarget instanceof mx0.u;
        mx0.s sVar = scrollTarget instanceof mx0.s ? (mx0.s) scrollTarget : null;
        String str = sVar != null ? sVar.f209980a : null;
        if (Intrinsics.f(actions, this.f) && z3 == this.f58300h && (str == null || str.equals(this.f58304n))) {
            return;
        }
        this.f = actions;
        this.f58299g = -1;
        this.f58304n = str;
        boolean z4 = false;
        this.o = str != null;
        this.f58300h = z3;
        if (this.i && z) {
            z4 = true;
        }
        this.i = z4;
        f();
    }

    public final void j(List actions, boolean z) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        i(actions, mx0.t.f210002a, z);
    }

    public final void k(List actions, mx0.v scrollTarget) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(scrollTarget, "scrollTarget");
        i(zhm.u.c(actions), scrollTarget, true);
    }

    public final void m(int i, boolean z) {
        if (this.f58299g == i) {
            return;
        }
        this.f = f0.f322471a;
        boolean z3 = false;
        if (i < 0) {
            i = 0;
        }
        this.f58299g = i;
        this.f58304n = null;
        this.o = false;
        this.f58300h = false;
        if (this.i && z) {
            z3 = true;
        }
        this.i = z3;
        f();
    }

    public final void n(RecyclerView.ItemDecoration itemDecoration) {
        UIKitRecyclerView uIKitRecyclerView;
        while (true) {
            uIKitRecyclerView = this.f58305p;
            if (uIKitRecyclerView.getItemDecorationCount() <= 0) {
                break;
            } else {
                uIKitRecyclerView.removeItemDecorationAt(0);
            }
        }
        if (itemDecoration != null) {
            uIKitRecyclerView.addItemDecoration(itemDecoration);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027e  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ActionsView.onMeasure(int, int):void");
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f58310w = colorScheme;
        this.f58311x = Integer.valueOf(i);
        this.f58312y = Integer.valueOf(i2);
        this.z = Integer.valueOf(i3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f58302l) {
            return;
        }
        super.requestLayout();
    }

    public final void setBrightDark(boolean isBrightDark) {
        this.f58301j = isBrightDark;
        z4l.j jVar = this.f58306q;
        jVar.notifyItemRangeChanged(0, jVar.f319395l.size());
    }

    public final void setLayoutType(@NotNull mx0.l layoutType) {
        DefaultItemAnimator dVar;
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        if (this.e == layoutType) {
            return;
        }
        this.e = layoutType;
        if (layoutType == mx0.l.HEADER_CIRCLE_ACTIONS || layoutType == mx0.l.HEADER_STYLED_CIRCLE_ACTIONS) {
            dVar = new d();
            dVar.setSupportsChangeAnimations(false);
        } else {
            dVar = new DefaultItemAnimator();
        }
        this.f58308s = dVar;
        f();
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        this.f58305p.setPadding(left, top, right, bottom);
    }

    @yhm.d
    public final void setScrollable(boolean scrollable) {
        setLayoutType(scrollable ? mx0.l.SCROLLABLE : mx0.l.NON_SCROLLABLE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final mx0.d f58317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f58318c;
        public final e4 d;
        public final Clause e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Image f58319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Image f58320h;
        public final mx0.e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ms0.n f58321j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f58322l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Float f58323m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f58324n;
        public Parcelable o;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Item(String listId, mx0.d style, String str, ResourceImage resourceImage) {
            this(listId, style, true, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, resourceImage, null, 576);
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
        }

        public static Item e(Item item, mx0.d dVar, e4 e4Var, int i) {
            String listId = item.f58316a;
            mx0.d style = (i & 2) != 0 ? item.f58317b : dVar;
            boolean z = item.f58318c;
            e4 state = (i & 8) != 0 ? item.d : e4Var;
            Clause clause = item.e;
            Clause clause2 = item.f;
            Image image = item.f58319g;
            Image image2 = item.f58320h;
            mx0.e eVar = item.i;
            ms0.n nVar = item.f58321j;
            boolean z3 = item.k;
            String str = item.f58322l;
            Float f = item.f58323m;
            Object obj2 = item.f58324n;
            Parcelable parcelable = item.o;
            item.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(state, "state");
            return new Item(listId, style, z, state, clause, clause2, image, image2, eVar, nVar, z3, str, f, obj2, parcelable);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52249j() {
            return this.f58324n;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52244a() {
            return this.f58316a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Item)) {
                return false;
            }
            Item item = (Item) obj2;
            return Intrinsics.f(this.f58316a, item.f58316a) && this.f58317b == item.f58317b && this.f58318c == item.f58318c && this.d == item.d && Intrinsics.f(this.e, item.e) && Intrinsics.f(this.f, item.f) && Intrinsics.f(this.f58319g, item.f58319g) && Intrinsics.f(this.f58320h, item.f58320h) && Intrinsics.f(this.i, item.i) && Intrinsics.f(this.f58321j, item.f58321j) && this.k == item.k && Intrinsics.f(this.f58322l, item.f58322l) && Intrinsics.f(this.f58323m, item.f58323m) && Intrinsics.f(this.f58324n, item.f58324n) && Intrinsics.f(this.o, item.o);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.o;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + j6.a.c((this.f58317b.hashCode() + (this.f58316a.hashCode() * 31)) * 31, 31, this.f58318c)) * 31;
            Clause clause = this.e;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Image image = this.f58319g;
            int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.f58320h;
            int iHashCode5 = (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
            mx0.e eVar = this.i;
            int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            ms0.n nVar = this.f58321j;
            int iC = j6.a.c((iHashCode6 + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.k);
            String str = this.f58322l;
            int iHashCode7 = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Float f = this.f58323m;
            int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            Object obj2 = this.f58324n;
            int iHashCode9 = (iHashCode8 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.o;
            return iHashCode9 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.o = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Item ? (Item) oldItem : null) == null) {
                return null;
            }
            Item item = (Item) oldItem;
            return new mx0.r((this.f58317b == item.f58317b && this.f58318c == item.f58318c) ? false : true, this.d != item.d, !Intrinsics.f(this.f, item.f), !Intrinsics.f(this.f58319g, item.f58319g), this.k != item.k, !Intrinsics.f(this.f58320h, item.f58320h), !Intrinsics.f(this.f58324n, item.f58324n), !Intrinsics.f(this.i, item.i), !Intrinsics.f(this.f58321j, item.f58321j), !Intrinsics.e(this.f58323m, item.f58323m), !Intrinsics.f(this.e, item.e), !Intrinsics.f(this.f58322l, item.f58322l));
        }

        public Item(String listId, mx0.d style, boolean z, e4 state, Clause clause, Clause clause2, Image image, Image image2, mx0.e eVar, ms0.n nVar, boolean z3, String str, Float f, Object obj2, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f58316a = listId;
            this.f58317b = style;
            this.f58318c = z;
            this.d = state;
            this.e = clause;
            this.f = clause2;
            this.f58319g = image;
            this.f58320h = image2;
            this.i = eVar;
            this.f58321j = nVar;
            this.k = z3;
            this.f58322l = str;
            this.f58323m = f;
            this.f58324n = obj2;
            this.o = parcelable;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ Item(java.lang.String r19, mx0.d r20, boolean r21, ms0.e4 r22, com.revolut.core.ui_kit.models.Clause r23, com.revolut.core.ui_kit.models.Clause r24, com.revolut.core.ui_kit_core.displayers.image.Image r25, com.revolut.core.ui_kit_core.displayers.image.Image r26, mx0.e r27, ms0.m r28, boolean r29, java.lang.String r30, java.lang.Float r31, java.lang.Object r32, android.os.Parcelable r33, int r34) {
            /*
                r18 = this;
                r0 = r34
                r1 = r0 & 2
                if (r1 == 0) goto La
                mx0.d r1 = mx0.d.SEMIACCENT
                r4 = r1
                goto Lc
            La:
                r4 = r20
            Lc:
                r1 = r0 & 4
                if (r1 == 0) goto L13
                r1 = 0
                r5 = r1
                goto L15
            L13:
                r5 = r21
            L15:
                r1 = r0 & 8
                if (r1 == 0) goto L1d
                ms0.e4 r1 = ms0.e4.EnabledClickable
                r6 = r1
                goto L1f
            L1d:
                r6 = r22
            L1f:
                r1 = r0 & 16
                r2 = 0
                if (r1 == 0) goto L26
                r7 = r2
                goto L28
            L26:
                r7 = r23
            L28:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L2e
                r10 = r2
                goto L30
            L2e:
                r10 = r26
            L30:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L36
                r11 = r2
                goto L38
            L36:
                r11 = r27
            L38:
                r1 = r0 & 512(0x200, float:7.17E-43)
                if (r1 == 0) goto L3e
                r12 = r2
                goto L40
            L3e:
                r12 = r28
            L40:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L47
                r1 = 1
                r13 = r1
                goto L49
            L47:
                r13 = r29
            L49:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L4f
                r14 = r2
                goto L51
            L4f:
                r14 = r30
            L51:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L57
                r15 = r2
                goto L59
            L57:
                r15 = r31
            L59:
                r1 = r0 & 8192(0x2000, float:1.148E-41)
                if (r1 == 0) goto L60
                r16 = r2
                goto L62
            L60:
                r16 = r32
            L62:
                r0 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r0 == 0) goto L71
                r17 = r2
                r3 = r19
                r8 = r24
                r9 = r25
                r2 = r18
                goto L7b
            L71:
                r17 = r33
                r2 = r18
                r3 = r19
                r8 = r24
                r9 = r25
            L7b:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ActionsView.Item.<init>(java.lang.String, mx0.d, boolean, ms0.e4, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit_core.displayers.image.Image, com.revolut.core.ui_kit_core.displayers.image.Image, mx0.e, ms0.m, boolean, java.lang.String, java.lang.Float, java.lang.Object, android.os.Parcelable, int):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Item(String listId, mx0.d dVar, boolean z, Clause clause, ResourceImage resourceImage, Object obj2, int i) {
            mx0.d style = (i & 2) != 0 ? mx0.d.SEMIACCENT : dVar;
            Object obj3 = (i & 1024) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            this(listId, style, false, z ? e4.EnabledClickable : e4.DisabledNonClickable, null, clause, resourceImage, null, null, obj3, null, 8720);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Item(String listId, mx0.d dVar, boolean z, e4 e4Var, Clause clause, Clause clause2, Image image, NewBadgeContent.Dot dot, String str, Object obj2, Parcelable parcelable, int i) {
            mx0.d style = (i & 2) != 0 ? mx0.d.SEMIACCENT : dVar;
            boolean z3 = (i & 4) != 0 ? false : z;
            e4 state = (i & 8) != 0 ? e4.EnabledClickable : e4Var;
            Clause clause3 = (i & 16) != 0 ? null : clause;
            String str2 = (i & 1024) != 0 ? null : str;
            Object obj3 = (i & 4096) != 0 ? null : obj2;
            Parcelable parcelable2 = (i & 8192) != 0 ? null : parcelable;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(state, "state");
            this(listId, style, z3, state, clause3, clause2, image, null, dot != null ? new mx0.e(dot) : null, null, true, str2, null, obj3, parcelable2, 512);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActionsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58296a = new e01.a();
        this.f58297b = new e01.a();
        this.f58298c = new e01.a();
        this.d = new e01.a();
        this.e = mx0.l.SCROLLABLE;
        this.f = f0.f322471a;
        this.f58299g = -1;
        this.i = true;
        this.k = true;
        this.f58303m = -1;
        int i2 = 6;
        z4l.j jVar = new z4l.j(7, zhm.v.k(new ActionDelegate(), new CircleActionDelegate(), new ActionLoadingDelegate(1, new mv5.h(4)), new ActionCircleLoadingDelegate(), new LargeButtonActionDelegate(), new LargeButtonActionLoadingDelegate()), false);
        this.f58306q = jVar;
        a aVar = new a();
        this.f58307r = aVar;
        this.f58308s = new DefaultItemAnimator();
        mx0.p.Companion.getClass();
        AttributeSet attributeSet2 = null;
        this.moreActionState = new mx0.p("_more_actions_", null, e4.EnabledClickable, null);
        jVar.registerAdapterDataObserver(aVar);
        UIKitRecyclerView uIKitRecyclerView = new UIKitRecyclerView(context, attributeSet2, i2, 0 == true ? 1 : 0);
        uIKitRecyclerView.setOverScrollMode(2);
        uIKitRecyclerView.setClipToPadding(false);
        uIKitRecyclerView.setClipChildren(false);
        uIKitRecyclerView.setNestedScrollingEnabled(false);
        uIKitRecyclerView.setId(R$id.actionsRecyclerView);
        uIKitRecyclerView.setAdapter(jVar);
        uIKitRecyclerView.addOnScrollListener(new mx0.c(this));
        this.f58305p = uIKitRecyclerView;
        NestedScrollableHost nestedScrollableHost = new NestedScrollableHost(context, attributeSet2, i2, 0 == true ? 1 : 0);
        nestedScrollableHost.setClipToPadding(false);
        nestedScrollableHost.setClipChildren(false);
        nestedScrollableHost.addView(uIKitRecyclerView, new FrameLayout.LayoutParams(-1, -2, 17));
        addView(nestedScrollableHost, new FrameLayout.LayoutParams(-1, -2, 17));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.ActionsView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f58301j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ActionsView_internal_brightDark, false);
        float fK = kli.a.k(context, 16.0f);
        uIKitRecyclerView.setPadding((int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ActionsView_internal_paddingStart, fK), (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ActionsView_internal_paddingTop, BitmapDescriptorFactory.HUE_RED), (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.ActionsView_internal_paddingEnd, fK), uIKitRecyclerView.getPaddingBottom());
        Unit unit = Unit.f186387a;
        typedArrayObtainStyledAttributes.recycle();
        setClipToPadding(false);
        setClipChildren(false);
    }

    public /* synthetic */ ActionsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
