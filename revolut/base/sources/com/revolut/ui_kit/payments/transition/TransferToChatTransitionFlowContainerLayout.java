package com.revolut.ui_kit.payments.transition;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.c;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import dyl.f;
import dyl.i;
import dyl.l;
import dyl.o;
import gw0.t;
import h01.g;
import java.util.Iterator;
import koi.b;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.s;
import lki.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003012B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/revolut/ui_kit/payments/transition/TransferToChatTransitionFlowContainerLayout;", "Lcom/revolut/kompot/view/ControllerContainerFrameLayout;", "Lcom/revolut/kompot/navigable/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llki/z;", "transitionListener", "", "setTransitionListener", "(Llki/z;)V", "Lh01/g;", "l", "Lh01/g;", "getSensitiveDataManager", "()Lh01/g;", "setSensitiveDataManager", "(Lh01/g;)V", "sensitiveDataManager", "Lr70/c;", "m", "Lr70/c;", "getHapticEngine", "()Lr70/c;", "setHapticEngine", "(Lr70/c;)V", "hapticEngine", "", "n", "J", "getP2pChatBubbleAnimationTimeout", "()J", "setP2pChatBubbleAnimationTimeout", "(J)V", "p2pChatBubbleAnimationTimeout", "Ldyl/f;", "o", "Ldyl/f;", "getTransitionConfig", "()Ldyl/f;", "setTransitionConfig", "(Ldyl/f;)V", "transitionConfig", "dyl/k", "dyl/j", "a", "ui_kit_payments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferToChatTransitionFlowContainerLayout extends ControllerContainerFrameLayout implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f107124p = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107125c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f107126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f107127h;
    public Bitmap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f107128j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public g sensitiveDataManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public r70.c hapticEngine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long p2pChatBubbleAnimationTimeout;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public f transitionConfig;

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f107132a = new a();

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferToChatTransitionFlowContainerLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final Pair a(TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout, RecyclerView recyclerView, String str) throws a {
        Object next;
        j jVar;
        Iterator it8 = ViewGroupKt.getChildren(recyclerView).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder((View) next);
            b bVar = childViewHolder instanceof b ? (b) childViewHolder : null;
            if (Intrinsics.f((bVar == null || (jVar = bVar.e) == null) ? null : jVar.getF52956a(), str)) {
                break;
            }
        }
        View view = (View) next;
        if (view == null) {
            throw a.f107132a;
        }
        RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(view);
        b bVar2 = childViewHolder2 instanceof b ? (b) childViewHolder2 : null;
        j jVar2 = bVar2 != null ? bVar2.e : null;
        Intrinsics.i(jVar2, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.chat.ChatListItem");
        t tVar = (t) ((oq0.b) jVar2).getF52080c().f22677a;
        View viewFindViewById = view.findViewById(transferToChatTransitionFlowContainerLayout.f);
        if (viewFindViewById == null) {
            viewFindViewById = view.findViewById(transferToChatTransitionFlowContainerLayout.f107126g);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        }
        return new Pair(tVar, viewFindViewById);
    }

    public static final void b(TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout, View view) {
        transferToChatTransitionFlowContainerLayout.k = false;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new xv0.a(null, new i(transferToChatTransitionFlowContainerLayout, 2), 5));
        view.startAnimation(alphaAnimation);
    }

    public static int d(View view) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.s(R$attr.uikit_colorGreyTone8, context);
    }

    @Override // com.revolut.kompot.navigable.c
    public final void Y(boolean z, TransitionAnimation.ViewDelegated animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (!(animation instanceof TransferToChatTransition)) {
            throw new IllegalStateException("Animation should be TransferToChatTransition");
        }
        z zVar = this.f107127h;
        if (zVar != null) {
            zVar.o();
        }
        f fVar = this.transitionConfig;
        if (fVar == null) {
            this.k = false;
            r6.b.D("Transition config is not set");
            z zVar2 = this.f107127h;
            if (zVar2 != null) {
                zVar2.p();
            }
            z zVar3 = this.f107127h;
            if (zVar3 != null) {
                zVar3.r();
            }
            z zVar4 = this.f107127h;
            if (zVar4 != null) {
                zVar4.q();
                return;
            }
            return;
        }
        View viewFindViewById = findViewById(fVar.f121142b);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        if (z) {
            this.k = false;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new xv0.a(new i(this, 0), new i(this, 1), 4));
            viewGroup.startAnimation(alphaAnimation);
            return;
        }
        View viewFindViewById2 = findViewById(fVar.f121141a);
        if (viewFindViewById2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        String str = ((TransferToChatTransition) animation).f107123b;
        this.k = true;
        z zVar5 = this.f107127h;
        if (zVar5 != null) {
            zVar5.p();
        }
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(fVar.f121143c);
        recyclerView.scrollToPosition(0);
        View viewI = s.i(viewGroup2, new Class[]{LegacyButtonContainerConstraintLayout.class}, null);
        if (viewI != null) {
            viewI.setVisibility(4);
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        com.revolut.ui_kit.payments.transition.a aVar = new com.revolut.ui_kit.payments.transition.a(this, recyclerView, str, ref$BooleanRef, viewGroup2, fVar);
        recyclerView.addOnLayoutChangeListener(aVar);
        postDelayed(new o(ref$BooleanRef, this, recyclerView, aVar, viewGroup2), this.p2pChatBubbleAnimationTimeout);
    }

    public final void c(float f, float f4, float f5, t tVar, float[] fArr) {
        int i;
        int i2;
        int i3 = l.f121162a[tVar.ordinal()];
        int i5 = this.f107125c;
        if (i3 == 1 || i3 == 2) {
            i = i5;
            i2 = i;
        } else {
            i2 = this.d;
            if (i3 == 3) {
                i = i2;
                i2 = i5;
            } else if (i3 == 4) {
                i = i2;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = i5;
            }
        }
        float f6 = f / f4;
        float f32 = f / f5;
        float f35 = i5;
        float f36 = f35 * f6;
        fArr[0] = f36;
        float f37 = f35 * f32;
        fArr[1] = f37;
        float f41 = i2;
        fArr[2] = f41 * f6;
        fArr[3] = f41 * f32;
        float f42 = i;
        fArr[4] = f6 * f42;
        fArr[5] = f42 * f32;
        fArr[6] = f36;
        fArr[7] = f37;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Rect rect;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        Bitmap bitmap = this.i;
        if (bitmap == null || (rect = this.f107128j) == null) {
            return;
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return this.k ? (i - 1) - i2 : i2;
    }

    public final r70.c getHapticEngine() {
        return this.hapticEngine;
    }

    public final long getP2pChatBubbleAnimationTimeout() {
        return this.p2pChatBubbleAnimationTimeout;
    }

    public final g getSensitiveDataManager() {
        return this.sensitiveDataManager;
    }

    public final f getTransitionConfig() {
        return this.transitionConfig;
    }

    public final void setHapticEngine(r70.c cVar) {
        this.hapticEngine = cVar;
    }

    public final void setP2pChatBubbleAnimationTimeout(long j2) {
        this.p2pChatBubbleAnimationTimeout = j2;
    }

    public final void setSensitiveDataManager(g gVar) {
        this.sensitiveDataManager = gVar;
    }

    public final void setTransitionConfig(f fVar) {
        this.transitionConfig = fVar;
    }

    @Override // com.revolut.kompot.navigable.c
    public void setTransitionListener(z transitionListener) {
        this.f107127h = transitionListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransferToChatTransitionFlowContainerLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferToChatTransitionFlowContainerLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setChildrenDrawingOrderEnabled(true);
        this.f107125c = kli.a.k(context, 20.0f);
        this.d = kli.a.k(context, 20.0f);
        this.e = kli.a.k(context, 5.0f);
        this.f = R$id.chatPaymentBubbleDelegate_bubbleView;
        this.f107126g = R$id.chatBubbleDelegate_bubbleView;
        this.f107128j = new Rect();
        this.p2pChatBubbleAnimationTimeout = 200L;
    }

    public /* synthetic */ TransferToChatTransitionFlowContainerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
