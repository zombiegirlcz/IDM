package byl;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit.internal.views.linearlayout.UIKitLinearLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import cr0.m;
import cs0.a;
import et0.w;
import hx0.y;
import iv0.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import lki.z;
import lq0.p;
import ux0.s0;
import yr0.o;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19873c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj2, int i, Object obj3, Object obj4) {
        this.f19871a = i;
        this.f19872b = obj2;
        this.f19873c = obj3;
        this.d = obj4;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f19871a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((Function0) this.d).invoke();
                break;
            case 8:
                ((Ref$BooleanRef) this.d).f186407a = true;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f19871a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((Function0) this.f19873c).invoke();
                return;
            case 1:
                cr0.k kVar = (cr0.k) this.f19872b;
                if (kVar.f108176c) {
                    return;
                }
                m mVar = kVar.f108175b;
                mVar.f108182a = 0;
                mVar.f108183b = 0;
                ((UIKitLinearLayout) this.f19873c).requestLayout();
                ((cf6.a) this.d).invoke();
                return;
            case 2:
                TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout = (TransferToChatTransitionFlowContainerLayout) this.d;
                RecyclerView recyclerView = (RecyclerView) this.f19872b;
                Object obj2 = ((Ref$ObjectRef) this.f19873c).f186409a;
                if (obj2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                recyclerView.removeItemDecoration((RecyclerView.ItemDecoration) obj2);
                z zVar = transferToChatTransitionFlowContainerLayout.f107127h;
                if (zVar != null) {
                    zVar.r();
                }
                z zVar2 = transferToChatTransitionFlowContainerLayout.f107127h;
                if (zVar2 != null) {
                    zVar2.q();
                    return;
                }
                return;
            case 3:
                View view = (View) this.f19872b;
                if (view.getForeground() instanceof RevolutShimmerDrawable) {
                    view.setForeground(null);
                    return;
                }
                return;
            case 4:
                iv0.j jVar = (iv0.j) this.f19872b;
                jVar.d((uw0.i) this.f19873c, (View) this.d);
                jVar.e.i(false);
                jVar.f168682h = null;
                return;
            case 5:
                return;
            case 6:
                s0 s0Var = (s0) this.f19872b;
                s0Var.getProductIntroContentView().setTranslationY(BitmapDescriptorFactory.HUE_RED);
                View view2 = (View) this.f19873c;
                if (view2 != null) {
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                }
                s0Var.getAccountsSelectionView().setTranslationY(BitmapDescriptorFactory.HUE_RED);
                s0Var.getAccountsSelectionView().setContentTranslationY(BitmapDescriptorFactory.HUE_RED);
                View view3 = (View) ((Ref$ObjectRef) this.d).f186409a;
                if (view3 != null) {
                    view3.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    return;
                }
                return;
            case 7:
                View view4 = (View) this.d;
                view4.setAlpha(1.0f);
                view4.setVisibility(4);
                ((Function0) this.f19872b).invoke();
                ((Function0) this.f19873c).invoke();
                return;
            case 8:
                if (((Ref$BooleanRef) this.f19872b).f186407a) {
                    return;
                }
                ((vt0.h) this.f19873c).setState(vt0.b.LIST_SCREEN);
                return;
            case 9:
                yr0.k kVar2 = (yr0.k) this.f19872b;
                yr0.h callback = kVar2.getCallback();
                if (callback != null) {
                    o oVar = (o) callback;
                    s sVar = oVar.f316078c;
                    sVar.f168698c = -1;
                    sVar.d = -1;
                    yr0.k kVar3 = oVar.d;
                    kVar3.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    kVar3.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    yr0.a aVar = oVar.e;
                    if (aVar != null) {
                        aVar.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    }
                    if (aVar != null) {
                        aVar.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    }
                    int childCount = kVar3.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        kVar3.getChildAt(i).setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    }
                    oVar.f316084n = null;
                    oVar.o = null;
                }
                kVar2.f = false;
                ((View) this.f19873c).setBackgroundColor(0);
                kVar2.removeView((View) this.d);
                return;
            default:
                ((p) this.f19872b).a();
                ((yw0.f) this.f19873c).o = null;
                ((yq0.e) this.d).invoke();
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        switch (this.f19871a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        RevolutShimmerDrawable revolutShimmerDrawable;
        switch (this.f19871a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((Function0) this.f19872b).invoke();
                break;
            case 3:
                View view = (View) this.d;
                if (((y) this.f19873c).f()) {
                    revolutShimmerDrawable = new RevolutShimmerDrawable();
                    a.c cVar = new a.c();
                    cVar.f108423a.e = -1;
                    a.c cVar2 = (a.c) cVar.c(BitmapDescriptorFactory.HUE_RED);
                    cVar2.k(cs0.b.MASKED);
                    cVar2.f108423a.f108420r = true;
                    a.c cVar3 = (a.c) cVar2.i(50.0f);
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    cVar3.f108423a.d = kli.a.s(R$attr.uikit_colorGrey20_30, context);
                    a.c cVar4 = (a.c) cVar3.f(2000L);
                    cVar4.f108423a.f108417n = 0;
                    revolutShimmerDrawable.a(((a.c) cVar4.j()).a());
                } else {
                    revolutShimmerDrawable = null;
                }
                view.setForeground(revolutShimmerDrawable);
                break;
            case 5:
                mt0.g gVar = (mt0.g) this.f19872b;
                ShadowLayout shadowLayout = gVar.f208693a;
                Rect rect = new Rect(shadowLayout.getLeft(), (shadowLayout.getTop() + gVar.i) - gVar.f208697h, shadowLayout.getRight(), (shadowLayout.getBottom() + gVar.i) - gVar.f208697h);
                float cornersRadius = shadowLayout.getCornersRadius();
                gVar.f208694b.setVisibility(0);
                gVar.f208695c.setVisibility(0);
                OneShotPreDrawListener.add(shadowLayout, new w(shadowLayout, 6, gVar, rect));
                gVar.a((ValueAnimator) this.f19873c, new mt0.e(gVar, cornersRadius, rect, (Rect) this.d));
                break;
        }
    }

    public i(View view, Function0 function0, Function0 function02) {
        this.f19871a = 7;
        this.d = view;
        this.f19872b = function0;
        this.f19873c = function02;
    }
}
