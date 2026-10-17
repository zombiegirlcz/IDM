package com.revolut.core.ui_kit.internal.dialogs;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au0.b2;
import bx0.v;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.BaseTextDelegate;
import com.revolut.core.ui_kit.delegates.DialogHeaderSubtitleDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.DialogHeaderView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import cr0.g;
import cr0.h;
import cr0.i;
import cr0.n;
import dr0.l;
import e8.q;
import efm.r;
import gq0.e;
import ihm.f;
import iv0.s;
import ix0.c2;
import ix0.w0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import koi.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.p5;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rr0.o;
import te0.w;
import z4l.j;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\f\u0096\u0001:\u0097\u0001\u0098\u0001'\u0099\u0001\u009a\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0012\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J/\u0010\u001f\u001a\u00020\u000f2\u0014\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"0!2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010$J%\u0010)\u001a\u00020\u000f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0!2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\t¢\u0006\u0004\b.\u0010-J\u0015\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\b0\u0010-J\u0015\u00101\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\b1\u0010-J\u0015\u00104\u001a\u00020\u000f2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u000202¢\u0006\u0004\b7\u00105J\u0015\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u000202¢\u0006\u0004\b9\u00105J\r\u0010;\u001a\u00020:¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u0004\u0018\u00010:¢\u0006\u0004\b=\u0010<J!\u0010A\u001a\u00020\u000f2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f0>¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\u000f2\u0006\u0010C\u001a\u000202¢\u0006\u0004\bD\u00105J%\u0010F\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020%\u0012\u0006\b\u0001\u0012\u00020E0\"\u0018\u00010!¢\u0006\u0004\bF\u0010GJ\u0019\u0010J\u001a\u00020\u000f2\b\u0010I\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\bL\u0010MJ\u001d\u0010N\u001a\u00020\u000f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0!H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RR)\u0010Y\u001a\u0010\u0012\f\u0012\n T*\u0004\u0018\u00010\u000f0\u000f0S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020:0Z8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\"\u0010e\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u00105R\"\u0010i\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010a\u001a\u0004\bg\u0010c\"\u0004\bh\u00105R\"\u0010m\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010a\u001a\u0004\bk\u0010c\"\u0004\bl\u00105R\"\u0010q\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010a\u001a\u0004\bo\u0010c\"\u0004\bp\u00105R\"\u0010u\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010a\u001a\u0004\bs\u0010c\"\u0004\bt\u00105R\u001b\u0010{\u001a\u00020v8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001c\u0010\u0080\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010x\u001a\u0004\b~\u0010\u007fR \u0010\u0085\u0001\u001a\u00030\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0082\u0001\u0010x\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008a\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0087\u0001\u0010x\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010\u008e\u0001\u001a\u0002028\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010a\u001a\u0005\b\u008c\u0001\u0010c\"\u0005\b\u008d\u0001\u00105R\u001f\u0010\u0092\u0001\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008f\u0001\u0010V\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0086\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0089\u0001¨\u0006\u009b\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/internal/dialogs/BottomExpandableDialogView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "Lgq0/e;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/internal/dialogs/MiddleStateBottomSheetBehavior;", "behavior", "", "setCustomBehavior$ui_kit_components_release", "(Lcom/revolut/core/ui_kit/internal/dialogs/MiddleStateBottomSheetBehavior;)V", "setCustomBehavior", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "Lcom/revolut/core/ui_kit/internal/dialogs/BottomExpandableDialogView$b;", "config", "setupDialog", "(Lcom/revolut/core/ui_kit/internal/dialogs/BottomExpandableDialogView$b;)V", "Lz4l/j;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;", "itemAnimator", "setupRecyclerView", "(Lz4l/j;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V", "", "Lkoi/k;", "adapterDelegates", "(Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V", "Lkoi/j;", "items", "Lcr0/g;", "headerModel", "setItems", "(Ljava/util/List;Lcr0/g;)V", "bottomPaddingPx", "setRecyclerBottomPadding", "(I)V", "setBottomDialogBottomPadding", "offset", "setExpandedStateOffset", "setAnchoredStateOffset", "", "hideable", "setHideable", "(Z)V", "hasCollapsedState", "setHasCollapsedState", "hasExpandedState", "setHasExpandedState", "Lcr0/h;", "getState", "()Lcr0/h;", "getFurtherState", "Lkotlin/Function1;", "", "offsetChangeListener", "setOnOffsetChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "closeAutomaticallyByChevron", "setCloseAutomaticallyByChevron", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getDelegates", "()Ljava/util/List;", "Lmx0/p5;", "anchorParams", "setupBehavior", "(Lmx0/p5;)V", "setupTextDelegate", "(Lz4l/j;)V", "setupFirstContentItemSpacing", "(Ljava/util/List;)V", "Lcr0/n;", "getStatusBarDimContainer", "()Lcr0/n;", "Lihm/f;", "kotlin.jvm.PlatformType", "o", "Lkotlin/Lazy;", "getChevronClickSubject", "()Lihm/f;", "chevronClickSubject", "Lefm/r;", "r", "Lefm/r;", "getStateChangeEvents", "()Lefm/r;", "stateChangeEvents", "s", "Z", "getDisableExpandingForShortContent", "()Z", "setDisableExpandingForShortContent", "disableExpandingForShortContent", "t", "getCalculateHeightOnce", "setCalculateHeightOnce", "calculateHeightOnce", "u", "getNeedDrawToolbarShadow", "setNeedDrawToolbarShadow", "needDrawToolbarShadow", "v", "getSupportBackButtonHideDialog", "setSupportBackButtonHideDialog", "supportBackButtonHideDialog", "w", "getHideAnchorInExpandedState", "setHideAnchorInExpandedState", "hideAnchorInExpandedState", "Landroidx/recyclerview/widget/RecyclerView;", "F", "Le8/q;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/ImageView;", "G", "getAnchorView", "()Landroid/widget/ImageView;", "anchorView", "Lcom/revolut/core/ui_kit/views/DialogHeaderView;", "H", "getHeaderView", "()Lcom/revolut/core/ui_kit/views/DialogHeaderView;", "headerView", "Landroid/view/View;", "I", "getShadowView", "()Landroid/view/View;", "shadowView", "U", "getUpdateImportantForAccessibilityOnSiblings", "setUpdateImportantForAccessibilityOnSiblings", "updateImportantForAccessibilityOnSiblings", "W", "getDefaultBottomSheetPadding", "()I", "defaultBottomSheetPadding", "getContentRootForAccessibility", "contentRootForAccessibility", "Companion", "com/revolut/core/ui_kit/internal/dialogs/a", "b", "com/revolut/core/ui_kit/internal/dialogs/c", "cr0/i", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class BottomExpandableDialogView extends ConstraintLayout implements View.OnClickListener, e, w0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public MiddleStateBottomSheetBehavior A;
    public boolean B;
    public DialogHeaderSubtitleDelegate C;
    public BaseTextDelegate D;
    public final cr0.d E;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final q recyclerView;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final q anchorView;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final q headerView;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final q shadowView;
    public View J;
    public View K;
    public c L;
    public boolean M;
    public boolean N;
    public s O;
    public Window P;
    public boolean Q;
    public ifm.c R;
    public final f S;
    public final c2 T;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public boolean updateImportantForAccessibilityOnSiblings;
    public final as0.a V;
    public final Object W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f55899a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f55900b;
    public Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f55901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f55902h;
    public Parcelable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f55903j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f55904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f55905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f55906n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f55907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f55908q;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final r stateChangeEvents;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean disableExpandingForShortContent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean calculateHeightOnce;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean needDrawToolbarShadow;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean supportBackButtonHideDialog;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean hideAnchorInExpandedState;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f55913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f55914y;
    public final float z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f55915a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final p5 f55916b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.revolut.core.ui_kit.internal.dialogs.b f55917c;

            public a() {
                this(0, (p5) null, 7);
            }

            @Override // com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView.b
            public final int a() {
                return this.f55915a;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return this.f55915a == aVar.f55915a && Intrinsics.f(this.f55916b, aVar.f55916b) && this.f55917c == aVar.f55917c;
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f55915a) * 31;
                p5 p5Var = this.f55916b;
                return this.f55917c.hashCode() + ((iHashCode + (p5Var == null ? 0 : p5Var.hashCode())) * 31);
            }

            public a(int i, p5 p5Var, com.revolut.core.ui_kit.internal.dialogs.b mode) {
                Intrinsics.checkNotNullParameter(mode, "mode");
                this.f55915a = i;
                this.f55916b = p5Var;
                this.f55917c = mode;
            }

            public /* synthetic */ a(int i, p5 p5Var, int i2) {
                this((i2 & 1) != 0 ? R$attr.uikit_colorElevatedBackground : i, (i2 & 2) != 0 ? null : p5Var, com.revolut.core.ui_kit.internal.dialogs.b.FIXED_SIZE);
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class C0433b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f55918a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f55919b;

            public C0433b() {
                this(3);
            }

            @Override // com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView.b
            public final int a() {
                return this.f55918a;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0433b)) {
                    return false;
                }
                C0433b c0433b = (C0433b) obj2;
                return this.f55918a == c0433b.f55918a && this.f55919b == c0433b.f55919b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f55919b) + (Integer.hashCode(this.f55918a) * 31);
            }

            public C0433b(int i) {
                int i2 = R$attr.uikit_colorElevatedGroupedBackground;
                boolean z = (i & 2) != 0;
                this.f55918a = i2;
                this.f55919b = z;
            }
        }

        private b() {
        }

        public abstract int a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomExpandableDialogView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getAnchorView() {
        return (ImageView) this.anchorView.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final f getChevronClickSubject() {
        return (f) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getDefaultBottomSheetPadding() {
        return ((Number) this.W.getValue()).intValue();
    }

    private final DialogHeaderView getHeaderView() {
        return (DialogHeaderView) this.headerView.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getShadowView() {
        return this.shadowView.f();
    }

    private final n getStatusBarDimContainer() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        if (activityI == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        View decorView = activityI.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) decorView;
        n nVar = (n) viewGroup.findViewById(R$id.internal_bottom_dialog_dim_container);
        if (nVar != null) {
            return nVar;
        }
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        n nVar2 = new n(context2);
        viewGroup.addView(nVar2, new ViewGroup.LayoutParams(-1, -2));
        return nVar2;
    }

    public static h l0(int i) {
        switch (i) {
            case 1:
                return h.DRAGGING;
            case 2:
                return h.SETTLING;
            case 3:
                return h.EXPANDED;
            case 4:
                return h.COLLAPSED;
            case 5:
                return h.HIDDEN;
            case 6:
                return h.ANCHORED;
            default:
                throw new IllegalStateException(a0.d.n("Unknown state ", i));
        }
    }

    public static void q0(View view, boolean z, boolean z3) {
        float f = BitmapDescriptorFactory.HUE_RED;
        if (z3) {
            if (!z) {
                view.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(300L).setListener(new cr0.j(view));
                return;
            } else {
                view.setVisibility(0);
                view.animate().alpha(1.0f).setDuration(300L).setListener(null);
                return;
            }
        }
        view.animate().cancel();
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
        view.setVisibility(z ? 0 : 4);
    }

    private final void setupBehavior(p5 anchorParams) {
        int dimensionPixelSize;
        int i;
        if (anchorParams != null) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(anchorParams.f209925b);
        } else {
            dimensionPixelSize = this.f55904l;
        }
        if (anchorParams != null) {
            i = -getContext().getResources().getDimensionPixelSize(anchorParams.f209924a);
        } else {
            i = 0;
        }
        this.A.setPeekHeight(dimensionPixelSize);
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.A;
        middleStateBottomSheetBehavior.d = true;
        middleStateBottomSheetBehavior.o = new WeakReference(getRecyclerView());
        this.A.u = Integer.valueOf(i);
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior2 = this.A;
        a callback = new a(this);
        middleStateBottomSheetBehavior2.getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        middleStateBottomSheetBehavior2.f55890p.add(callback);
        this.A.g(5, false);
    }

    private final void setupFirstContentItemSpacing(List<? extends koi.j> items) {
        if (items.isEmpty()) {
            return;
        }
        koi.j jVar = (koi.j) d0.b0(items);
        if (jVar instanceof qv0.i) {
            qv0.i iVar = (qv0.i) jVar;
            if (iVar.getF52018h() instanceof sq0.j) {
                p31.c o = iVar.getF52018h();
                Intrinsics.i(o, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.delegates.decorations.PaddingDecorationDelegate");
                int i = ((sq0.j) o).f264986b;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iW = kli.a.w(i, context);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iK = iW - kli.a.k(context2, 16.0f);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int iK2 = kli.a.k(context3, 8.0f);
                this.V.f8736b = Math.max(iK2, iK);
            }
        }
    }

    public static /* synthetic */ void setupRecyclerView$default(BottomExpandableDialogView bottomExpandableDialogView, j jVar, RecyclerView.ItemAnimator itemAnimator, int i, Object obj2) {
        if ((i & 2) != 0) {
            itemAnimator = new DefaultItemAnimator();
        }
        bottomExpandableDialogView.setupRecyclerView(jVar, itemAnimator);
    }

    private final void setupTextDelegate(j adapter) {
        Object next;
        Iterator it8 = adapter.f.e().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (next instanceof TextDelegate) {
                    break;
                }
            }
        }
        if (((TextDelegate) (next instanceof TextDelegate ? next : null)) == null) {
            adapter.f.a(new TextDelegate());
        }
    }

    public final void g0(h hVar, h hVar2) {
        if (this.hideAnchorInExpandedState) {
            getAnchorView().animate().alpha(hVar == h.EXPANDED ? BitmapDescriptorFactory.HUE_RED : 1.0f).setDuration(300L);
        }
        if (hVar2 == h.EXPANDED) {
            if (hVar == h.DRAGGING || hVar == h.SETTLING) {
                getRecyclerView().smoothScrollToPosition(0);
            }
        }
    }

    public final boolean getCalculateHeightOnce() {
        return this.calculateHeightOnce;
    }

    @Override // gq0.e
    public View getContentRootForAccessibility() {
        ViewParent parent;
        View view = this.K;
        if (view == null || (parent = view.getParent()) == null) {
            parent = getParent();
        }
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public final List<k> getDelegates() {
        j jVar = this.f55902h;
        if (jVar != null) {
            return d0.d1(jVar.f.e());
        }
        return null;
    }

    public final boolean getDisableExpandingForShortContent() {
        return this.disableExpandingForShortContent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cr0.h getFurtherState() {
        /*
            r3 = this;
            com.revolut.core.ui_kit.internal.dialogs.MiddleStateBottomSheetBehavior r0 = r3.A
            cr0.b r1 = r0.D
            r2 = 0
            if (r1 == 0) goto Le
            int r0 = r1.d
        L9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L16
        Le:
            cr0.b r0 = r0.C
            if (r0 == 0) goto L15
            int r0 = r0.d
            goto L9
        L15:
            r0 = r2
        L16:
            if (r0 == 0) goto L21
            int r0 = r0.intValue()
            cr0.h r0 = l0(r0)
            return r0
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView.getFurtherState():cr0.h");
    }

    public final boolean getHideAnchorInExpandedState() {
        return this.hideAnchorInExpandedState;
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    public final boolean getNeedDrawToolbarShadow() {
        return this.needDrawToolbarShadow;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.f();
    }

    @NotNull
    public final h getState() {
        return l0(this.A.i);
    }

    @NotNull
    public final r<h> getStateChangeEvents() {
        return this.stateChangeEvents;
    }

    public final boolean getSupportBackButtonHideDialog() {
        return this.supportBackButtonHideDialog;
    }

    @Override // gq0.e
    public boolean getUpdateImportantForAccessibilityOnSiblings() {
        return this.updateImportantForAccessibilityOnSiblings;
    }

    public final void h0(View dimOverlayView) {
        Intrinsics.checkNotNullParameter(dimOverlayView, "dimOverlayView");
        if (Intrinsics.f(this.K, dimOverlayView)) {
            return;
        }
        j0();
        View view = new View(getContext());
        view.setAlpha(dimOverlayView.getAlpha());
        this.J = view;
        getStatusBarDimContainer().addView(this.J, new FrameLayout.LayoutParams(-1, -1));
        this.K = dimOverlayView;
        dimOverlayView.setOnClickListener(new b2(this, 19));
        cr0.d dVar = new cr0.d(this, 2);
        if (isLaidOut()) {
            dVar.invoke(getState());
        } else {
            addOnLayoutChangeListener(new v(dVar, this, 2));
        }
        c callback = new c(this, dVar);
        this.L = callback;
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.A;
        middleStateBottomSheetBehavior.getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        middleStateBottomSheetBehavior.f55890p.add(callback);
    }

    public final void i0() {
        this.A.f55881a = true;
    }

    public final void j0() {
        View view = this.J;
        if (view != null) {
            view.animate().cancel();
            getStatusBarDimContainer().removeView(view);
        }
        View view2 = this.K;
        if (view2 != null) {
            view2.animate().cancel();
            view2.setOnClickListener(null);
        }
        c callback = this.L;
        if (callback != null) {
            callback.f55922b = true;
            MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.A;
            middleStateBottomSheetBehavior.getClass();
            Intrinsics.checkNotNullParameter(callback, "callback");
            middleStateBottomSheetBehavior.f55890p.remove(callback);
        }
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = false;
        this.N = false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean m0() {
        b bVar = this.f55913x;
        if (bVar != null) {
            return (bVar instanceof b.a) && ((Boolean) jo0.g.k.getValue()).booleanValue();
        }
        Intrinsics.r("config");
        throw null;
    }

    public final f n0() {
        return getHeaderView().f58514l;
    }

    public final r o0() {
        return this.S;
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        p0();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.T.a(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View decorView;
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        Window window = activityI != null ? activityI.getWindow() : null;
        this.P = window;
        if (window != null && (decorView = window.getDecorView()) != null) {
            u.b(decorView, true, this.E);
        }
        ViewCompat.requestApplyInsets(this);
        ifm.c cVar = this.R;
        if (cVar != null) {
            cVar.dispose();
        }
        DialogHeaderSubtitleDelegate dialogHeaderSubtitleDelegate = this.C;
        if (dialogHeaderSubtitleDelegate != null) {
            this.R = dialogHeaderSubtitleDelegate.f52189c.subscribe(new com.onfido.android.sdk.capture.ui.userconsent.c(new cr0.d(this, 1), 22));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null && view.getId() == R$id.bottomExpandableDialog_anchorView && this.f55900b) {
            r0(h.HIDDEN, false);
        } else {
            if (view == null || view.getId() != R$id.bottomExpandableDialog_anchorView || this.f55900b) {
                return;
            }
            getChevronClickSubject().onNext(Unit.f186387a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View decorView;
        Window window = this.P;
        if (window != null && (decorView = window.getDecorView()) != null) {
            u.q(decorView, this.E);
        }
        this.P = null;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        tri.c cVarA = ue8.c.A(context);
        if (cVarA != null) {
            cVarA.b(this);
        }
        ifm.c cVar = this.R;
        if (cVar != null) {
            cVar.dispose();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        b bVar = this.f55913x;
        if (bVar == null) {
            Intrinsics.r("config");
            throw null;
        }
        if (bVar instanceof b.C0433b) {
            size -= this.f55905m;
        } else if (!(bVar instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Intrinsics.i(parcelable, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        Parcelable parcelable3 = bundle.getParcelable("recycler");
        super.onRestoreInstanceState(parcelable2);
        this.i = parcelable3;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        Parcelable parcelableOnSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        Parcelable parcelableOnSaveInstanceState2 = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState2 != null) {
            bundle.putParcelable("super", parcelableOnSaveInstanceState2);
        }
        if (parcelableOnSaveInstanceState != null) {
            bundle.putParcelable("recycler", parcelableOnSaveInstanceState);
        }
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        p0();
    }

    public final void p0() {
        if (m0()) {
            b bVar = this.f55913x;
            if (bVar == null) {
                Intrinsics.r("config");
                throw null;
            }
            b.a aVar = bVar instanceof b.a ? (b.a) bVar : null;
            if ((aVar != null ? aVar.f55917c : null) == com.revolut.core.ui_kit.internal.dialogs.b.FIXED_SIZE) {
                s sVar = this.O;
                if (sVar == null) {
                    r6.b.r("outlineProvider not configured");
                    return;
                }
                int iMin = Math.min(getBottom() - getHeight(), getHeight() - (getHeight() - this.A.z));
                if (iMin < 0) {
                    iMin = 0;
                }
                int i = iMin * (-1);
                Rect rect = sVar.e;
                if (rect.bottom != i) {
                    rect.bottom = i;
                    invalidateOutline();
                }
            }
        }
    }

    public final void r0(h state, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        h state2 = getState();
        if (state == state2) {
            return;
        }
        if (state == h.DRAGGING || state == h.SETTLING) {
            throw new IllegalArgumentException((state + " cannot be set").toString());
        }
        h hVar = h.HIDDEN;
        if (state2 == hVar) {
            this.f55914y = false;
        }
        int i = 1;
        if ((state2 == hVar || state2 == h.COLLAPSED) && getRecyclerView().canScrollVertically(1)) {
            getRecyclerView().scrollToPosition(0);
        }
        if (z && isLaidOut()) {
            requestLayout();
        }
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.A;
        switch (d.f55925b[state.ordinal()]) {
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                break;
            case 6:
                i = 2;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        middleStateBottomSheetBehavior.g(i, z);
        if (isLaidOut()) {
            return;
        }
        g0(state, state2);
    }

    public final void setAnchoredStateOffset(int offset) {
        if (offset != this.f55905m) {
            this.f55905m = offset;
            this.A.f(offset);
            requestLayout();
        }
    }

    public final void setBottomDialogBottomPadding(int bottomPaddingPx) {
        this.f55899a0 = bottomPaddingPx;
        b bVar = this.f55913x;
        if (bVar == null) {
            Intrinsics.r("config");
            throw null;
        }
        if (bVar instanceof b.a) {
            knm.b.v(getDefaultBottomSheetPadding() + bottomPaddingPx, getRecyclerView());
        } else {
            if (!(bVar instanceof b.C0433b)) {
                throw new NoWhenBranchMatchedException();
            }
            knm.b.v(bottomPaddingPx, getRecyclerView());
        }
    }

    public final void setCalculateHeightOnce(boolean z) {
        this.calculateHeightOnce = z;
    }

    public final void setCloseAutomaticallyByChevron(boolean closeAutomaticallyByChevron) {
        this.f55900b = closeAutomaticallyByChevron;
    }

    public final void setCustomBehavior$ui_kit_components_release(@NotNull MiddleStateBottomSheetBehavior<?> behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.A = behavior;
        this.B = true;
    }

    public final void setDisableExpandingForShortContent(boolean z) {
        this.disableExpandingForShortContent = z;
    }

    public final void setExpandedStateOffset(int offset) {
        this.A.u = Integer.valueOf(-offset);
        requestLayout();
    }

    public final void setHasCollapsedState(boolean hasCollapsedState) {
        this.A.d = !hasCollapsedState;
    }

    public final void setHasExpandedState(boolean hasExpandedState) {
        this.A.e = !hasExpandedState;
    }

    public final void setHideAnchorInExpandedState(boolean z) {
        this.hideAnchorInExpandedState = z;
    }

    public final void setHideable(boolean hideable) {
        this.A.f55882b = hideable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List, java.util.List<? extends koi.j>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [z4l.j] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setItems(@org.jetbrains.annotations.NotNull java.util.List<? extends koi.j> r10, cr0.g r11) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView.setItems(java.util.List, cr0.g):void");
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        if (!this.B) {
            if (!(params instanceof CoordinatorLayout.LayoutParams)) {
                throw new IllegalStateException("BottomExpandableDialogView must be a direct child of Coordinator layout");
            }
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) params;
            if (layoutParams.getBehavior() != null && !Intrinsics.f(layoutParams.getBehavior(), this.A)) {
                throw new IllegalStateException("BottomExpandableDialogView has behavior inside, you don't have to set it explicitly");
            }
            layoutParams.setBehavior(this.A);
        }
        super.setLayoutParams(params);
    }

    public final void setNeedDrawToolbarShadow(boolean z) {
        this.needDrawToolbarShadow = z;
    }

    public final void setOnOffsetChangeListener(@NotNull Function1<? super Float, Unit> offsetChangeListener) {
        Intrinsics.checkNotNullParameter(offsetChangeListener, "offsetChangeListener");
        this.f = offsetChangeListener;
    }

    public final void setRecyclerBottomPadding(int bottomPaddingPx) {
        knm.b.v(bottomPaddingPx, getRecyclerView());
    }

    public final void setSupportBackButtonHideDialog(boolean z) {
        this.supportBackButtonHideDialog = z;
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    public final void setupDialog(@NotNull b config) {
        int iK;
        float f;
        Integer num;
        int i;
        Intrinsics.checkNotNullParameter(config, "config");
        this.f55913x = config;
        int i2 = 0;
        if (config instanceof b.C0433b) {
            if (((Boolean) jo0.g.k.getValue()).booleanValue()) {
                MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior = this.A;
                DynamicMarginBottomSheetBehavior dynamicMarginBottomSheetBehavior = middleStateBottomSheetBehavior instanceof DynamicMarginBottomSheetBehavior ? (DynamicMarginBottomSheetBehavior) middleStateBottomSheetBehavior : null;
                if (dynamicMarginBottomSheetBehavior != null) {
                    dynamicMarginBottomSheetBehavior.L = 0;
                    dynamicMarginBottomSheetBehavior.K = 0;
                }
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fW = kli.a.w(R$attr.uikit_prompt_corner_radius, context);
            this.f55904l = getContext().getResources().getDimensionPixelSize(R$dimen.internal_bottom_sheet_anchor_view_height);
            getAnchorView().setImageResource(0);
            getAnchorView().getLayoutParams().height = this.f55904l;
            getAnchorView().setVisibility(((b.C0433b) config).f55919b ? 0 : 8);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.f55905m = kli.a.k(context2, 24.0f);
            knm.b.v(0, getRecyclerView());
            y0.b(h.HIDDEN);
            f = fW;
        } else {
            if (!(config instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            o oVar = o.BOTTOM_SHEET;
            int iD = rr0.q.d(context3, oVar);
            if (m0()) {
                MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior2 = this.A;
                DynamicMarginBottomSheetBehavior dynamicMarginBottomSheetBehavior2 = middleStateBottomSheetBehavior2 instanceof DynamicMarginBottomSheetBehavior ? (DynamicMarginBottomSheetBehavior) middleStateBottomSheetBehavior2 : null;
                if (dynamicMarginBottomSheetBehavior2 != null) {
                    int i3 = d.f55924a[((b.a) config).f55917c.ordinal()];
                    if (i3 == 1) {
                        i = 0;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = iD;
                    }
                    dynamicMarginBottomSheetBehavior2.L = i;
                    dynamicMarginBottomSheetBehavior2.K = i;
                }
            }
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            float fB = rr0.q.b(context4, oVar);
            this.f55904l = getContext().getResources().getDimensionPixelSize(R$dimen.internal_bottom_sheet_anchor_view_with_thicker_height);
            getAnchorView().setVisibility(0);
            getAnchorView().setImageResource(R$drawable.internal_ticker_marker_gray);
            getAnchorView().getLayoutParams().height = this.f55904l;
            p5 p5Var = ((b.a) config).f55916b;
            if (p5Var == null || (num = p5Var.f209926c) == null) {
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                iK = kli.a.k(context5, 200.0f);
            } else {
                iK = getContext().getResources().getDimensionPixelSize(num.intValue());
            }
            this.f55905m = iK;
            knm.b.v(getDefaultBottomSheetPadding(), getRecyclerView());
            h[] elements = {h.EXPANDED, h.HIDDEN};
            Intrinsics.checkNotNullParameter(elements, "elements");
            kotlin.collections.d.y0(elements);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = iD;
            marginLayoutParams.rightMargin = iD;
            marginLayoutParams.bottomMargin = iD;
            setLayoutParams(marginLayoutParams);
            f = fB;
        }
        s sVar = new s(f, true);
        boolean zM0 = m0();
        if (!zM0) {
            if (zM0) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = (int) f;
        }
        sVar.e.bottom = i2;
        this.O = sVar;
        setOutlineProvider(sVar);
        setClipToOutline(true);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        setBackground(l.i(context6, f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Color.Solid(R$attr.uikit_colorElevatedBackground), Constants.TAG_EMV_L2_CHECKSUM));
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        knm.b.A(kli.a.s(config.a(), context7), this);
        getAnchorView().requestLayout();
        b.a aVar = config instanceof b.a ? (b.a) config : null;
        setupBehavior(aVar != null ? aVar.f55916b : null);
    }

    public final void setupRecyclerView(@NotNull j adapter, RecyclerView.ItemAnimator itemAnimator) {
        Object next;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f55902h = adapter;
        Iterator it8 = adapter.f.e().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((k) next) instanceof DialogHeaderSubtitleDelegate) {
                    break;
                }
            }
        }
        DialogHeaderSubtitleDelegate dialogHeaderSubtitleDelegate = next instanceof DialogHeaderSubtitleDelegate ? (DialogHeaderSubtitleDelegate) next : null;
        if (dialogHeaderSubtitleDelegate == null) {
            dialogHeaderSubtitleDelegate = new DialogHeaderSubtitleDelegate();
            adapter.f.a(dialogHeaderSubtitleDelegate);
        }
        this.C = dialogHeaderSubtitleDelegate;
        setupTextDelegate(adapter);
        ifm.c cVar = this.R;
        if (cVar != null) {
            cVar.dispose();
        }
        DialogHeaderSubtitleDelegate dialogHeaderSubtitleDelegate2 = this.C;
        if (dialogHeaderSubtitleDelegate2 != null) {
            this.R = dialogHeaderSubtitleDelegate2.f52189c.subscribe(new com.onfido.android.sdk.capture.ui.userconsent.c(new cr0.d(this, 1), 22));
        }
        getRecyclerView().setAdapter(adapter);
        getRecyclerView().setItemAnimator(itemAnimator);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomExpandableDialogView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public BottomExpandableDialogView(@NotNull Context context, AttributeSet attributeSet, int i) {
        MiddleStateBottomSheetBehavior middleStateBottomSheetBehavior;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55900b = true;
        f fVarD = v0.a.d("create(...)");
        this.f55906n = fVarD;
        this.o = yhm.j.c(yhm.k.NONE, new cpi.b(4));
        this.f55908q = i.INITIAL;
        r rVarDistinctUntilChanged = fVarD.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        this.stateChangeEvents = rVarDistinctUntilChanged;
        this.needDrawToolbarShadow = true;
        this.supportBackButtonHideDialog = true;
        this.z = rr0.q.b(context, o.BOTTOM_SHEET);
        if (((Boolean) jo0.g.k.getValue()).booleanValue()) {
            middleStateBottomSheetBehavior = new DynamicMarginBottomSheetBehavior(context, attributeSet);
        } else {
            middleStateBottomSheetBehavior = new MiddleStateBottomSheetBehavior(context, attributeSet);
        }
        this.A = middleStateBottomSheetBehavior;
        this.E = new cr0.d(this, 0);
        this.recyclerView = kli.a.J(R$id.bottomExpandableDialog_recyclerView, this);
        this.anchorView = kli.a.J(R$id.bottomExpandableDialog_anchorView, this);
        this.headerView = kli.a.J(R$id.bottomExpandableDialog_header, this);
        this.shadowView = kli.a.J(R$id.bottomExpandableDialog_shadowView, this);
        this.S = v0.a.d("create(...)");
        this.T = new c2(this);
        as0.a aVar = new as0.a();
        this.V = aVar;
        this.W = w.y0(new b0.b(context, 6));
        LayoutInflater.from(context).inflate(R$layout.internal_view_bottom_expandable_dialog, (ViewGroup) this, true);
        setClipToOutline(true);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(context));
        getRecyclerView().addItemDecoration(aVar);
        getRecyclerView().addOnScrollListener(new cr0.e(this));
        getAnchorView().setOnClickListener(this);
        getAnchorView().setOnTouchListener(new j01.e(new View[]{getAnchorView()}));
        setImportantForAccessibility(1);
    }

    public static /* synthetic */ void setupRecyclerView$default(BottomExpandableDialogView bottomExpandableDialogView, List list, RecyclerView.ItemAnimator itemAnimator, int i, Object obj2) {
        if ((i & 2) != 0) {
            itemAnimator = new DefaultItemAnimator();
        }
        bottomExpandableDialogView.setupRecyclerView((List<? extends k>) list, itemAnimator);
    }

    public final void setupRecyclerView(@NotNull List<? extends k> adapterDelegates, RecyclerView.ItemAnimator itemAnimator) {
        Intrinsics.checkNotNullParameter(adapterDelegates, "adapterDelegates");
        setupRecyclerView(new j(new koi.c(adapterDelegates), false, 14), itemAnimator);
    }

    public /* synthetic */ BottomExpandableDialogView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
