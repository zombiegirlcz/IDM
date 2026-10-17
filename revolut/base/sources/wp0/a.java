package wp0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hx0.a0;
import hx0.y;
import kotlin.jvm.internal.Intrinsics;
import qg7.k;
import t70.x;
import vp0.i;
import vp0.j;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298982a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f298983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oii.b f298984c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ViewOutlineProvider f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f298985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f298986h;
    public final /* synthetic */ k i;

    public /* synthetic */ a(View view, Context context, oii.b bVar, boolean z, ViewOutlineProvider viewOutlineProvider, boolean z3, int i, k kVar) {
        this.f298983b = view;
        this.d = context;
        this.f298984c = bVar;
        this.e = z;
        this.f = viewOutlineProvider;
        this.f298985g = z3;
        this.f298986h = i;
        this.i = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f298982a) {
            case 0:
                vp0.h hVar = h.f299001a;
                View view = this.f298983b;
                view.animate().setUpdateListener(null);
                oii.b bVar = this.f298984c;
                Context context = this.d;
                a aVar = new a(view, bVar, context, this.e, this.f, this.f298985g, this.f298986h, this.i);
                long j2 = h.f299002b;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                long jB = (long) (jq0.a.b(context) * j2);
                if (jB < 0) {
                    jB = 0;
                }
                view.postDelayed(aVar, jB);
                break;
            default:
                vp0.h hVar2 = h.f299001a;
                i iVar = vp0.k.Companion;
                final View view2 = this.f298983b;
                ViewParent parent = view2.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                vp0.h hVar3 = h.f299001a;
                b bVar2 = new b(this.f298984c, 0);
                wf5.a aVar2 = new wf5.a(20);
                final Context context2 = this.d;
                final boolean z = this.e;
                final ViewOutlineProvider viewOutlineProvider = this.f;
                final boolean z3 = this.f298985g;
                final int i = this.f298986h;
                final k kVar = this.i;
                j jVar = new j() { // from class: wp0.c
                    @Override // vp0.j
                    public final void b(boolean z4) {
                        final View view3 = view2;
                        final boolean z6 = z;
                        final ViewOutlineProvider viewOutlineProvider2 = viewOutlineProvider;
                        final boolean z11 = z3;
                        final int i2 = i;
                        final k kVar2 = kVar;
                        Runnable runnable = new Runnable() { // from class: wp0.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                vp0.h hVar4 = h.f299001a;
                                View view4 = view3;
                                view4.setVisibility(0);
                                boolean z12 = z6;
                                if (z12) {
                                    view4.setOutlineProvider(viewOutlineProvider2);
                                    view4.setClipToOutline(z11);
                                    view4.setLayerType(i2, null);
                                }
                                k kVar3 = kVar2;
                                if (z12) {
                                    AnimatorSet animatorSetC = a0.c(null, view4, new wf5.a(21), y.REMOVE_PRODUCT, 8);
                                    animatorSetC.addListener(new vt0.f(kVar3, 5));
                                    animatorSetC.start();
                                } else {
                                    view4.setAlpha(BitmapDescriptorFactory.HUE_RED);
                                    view4.setScaleX(0.65f);
                                    view4.setScaleY(0.65f);
                                    view4.animate().alpha(1.0f).setDuration(1000L).scaleX(1.0f).scaleY(1.0f).withEndAction(new x(kVar3, 29)).start();
                                }
                            }
                        };
                        long jA = (long) (h.f299001a.a() * 1000);
                        long j3 = z4 ? 200L : h.f299003c;
                        Context context3 = context2;
                        Intrinsics.checkNotNullParameter(context3, "context");
                        Intrinsics.checkNotNullParameter(context3, "context");
                        long jB2 = (long) (jq0.a.b(context3) * (jA + j3));
                        if (jB2 < 0) {
                            jB2 = 0;
                        }
                        view3.postDelayed(runnable, jB2);
                    }
                };
                iVar.getClass();
                i.a(view2, viewGroup, hVar3, bVar2, aVar2, jVar);
                break;
        }
    }

    public /* synthetic */ a(View view, oii.b bVar, Context context, boolean z, ViewOutlineProvider viewOutlineProvider, boolean z3, int i, k kVar) {
        this.f298983b = view;
        this.f298984c = bVar;
        this.d = context;
        this.e = z;
        this.f = viewOutlineProvider;
        this.f298985g = z3;
        this.f298986h = i;
        this.i = kVar;
    }
}
