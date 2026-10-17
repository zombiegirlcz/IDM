package vx0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.transition.revolut.RevGhostViewFacade;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.AvatarView;
import jo0.g;
import kotlin.jvm.internal.Intrinsics;
import th9.t;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f292777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AvatarView f292778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f292779c;
    public final ConstraintLayout d;
    public final ConstraintLayout e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f292780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RevGhostViewFacade f292781h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f292782j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f292783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f292784m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RectF f292785n;
    public final RectF o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f292786p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f292787q;

    public e(Context context, AvatarView headerLargeImage, ConstraintLayout headerContainerLayout, ConstraintLayout navBarLayout, ConstraintLayout menuLayout, TextView toolbarTitle, t dispatchLastExpandRatio) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(headerLargeImage, "headerLargeImage");
        Intrinsics.checkNotNullParameter(headerContainerLayout, "headerContainerLayout");
        Intrinsics.checkNotNullParameter(navBarLayout, "navBarLayout");
        Intrinsics.checkNotNullParameter(menuLayout, "menuLayout");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(dispatchLastExpandRatio, "dispatchLastExpandRatio");
        this.f292777a = context;
        this.f292778b = headerLargeImage;
        this.f292779c = headerContainerLayout;
        this.d = navBarLayout;
        this.e = menuLayout;
        this.f = toolbarTitle;
        this.f292780g = dispatchLastExpandRatio;
        this.i = 1.0f;
        this.k = 1.0f;
        this.f292785n = new RectF();
        this.o = new RectF();
        this.f292786p = new Rect();
    }

    public final void a(float f, int i) {
        if (this.f292787q) {
            this.k = f;
            this.f292783l = i;
            ConstraintLayout constraintLayout = this.f292779c;
            if (f >= 1.0f) {
                RevGhostViewFacade revGhostViewFacade = this.f292781h;
                if (revGhostViewFacade != null) {
                    if (revGhostViewFacade != null) {
                        revGhostViewFacade.detach();
                    }
                    this.f292781h = null;
                    constraintLayout.setClipBounds(null);
                    return;
                }
                return;
            }
            RevGhostViewFacade revGhostViewFacade2 = this.f292781h;
            RectF rectF = this.f292785n;
            ConstraintLayout constraintLayout2 = this.e;
            if (revGhostViewFacade2 == null) {
                AvatarView avatarView = this.f292778b;
                if (avatarView.isLaidOut()) {
                    RevGhostViewFacade revGhostViewFacade3 = new RevGhostViewFacade(avatarView);
                    revGhostViewFacade3.attach(this.d);
                    revGhostViewFacade3.getCapturedGlobalBounds(rectF);
                    if (rectF.width() <= BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) {
                        revGhostViewFacade3.detach();
                    } else {
                        int iK = kli.a.k(this.f292777a, 44.0f);
                        float fHeight = rectF.height();
                        this.i = iK / fHeight;
                        this.f292782j = (rectF.centerY() - ((constraintLayout2.getHeight() / 2.0f) + constraintLayout2.getTop())) + (((1.0f - this.i) * fHeight) / 2.0f);
                        this.f292781h = revGhostViewFacade3;
                    }
                } else if (!this.f292784m) {
                    this.f292784m = true;
                    OneShotPreDrawListener.add(avatarView, new r8.d(18, avatarView, false, this));
                }
            }
            RevGhostViewFacade revGhostViewFacade4 = this.f292781h;
            if (revGhostViewFacade4 == null) {
                return;
            }
            float f4 = this.f292782j;
            float fA = j6.a.a(this.i, 1.0f, f4 > BitmapDescriptorFactory.HUE_RED ? kotlin.ranges.f.f((-i) / f4, BitmapDescriptorFactory.HUE_RED, 1.0f) : 1.0f, 1.0f);
            float f5 = (-this.f292782j) - i;
            if (f5 < BitmapDescriptorFactory.HUE_RED) {
                f5 = 0.0f;
            }
            float fWidth = rectF.width() * fA;
            float fHeight2 = rectF.height() * fA;
            float fCenterX = rectF.centerX();
            float f6 = rectF.bottom + f5;
            float f32 = fWidth / 2.0f;
            float f35 = fCenterX + f32;
            RectF rectF2 = this.o;
            rectF2.set(fCenterX - f32, f6 - fHeight2, f35, f6);
            revGhostViewFacade4.setCurrentBounds(rectF2);
            float top = (-i) - (constraintLayout.getTop() - constraintLayout2.getBottom());
            if (top < BitmapDescriptorFactory.HUE_RED) {
                top = 0.0f;
            }
            if (top <= BitmapDescriptorFactory.HUE_RED) {
                constraintLayout.setClipBounds(null);
                return;
            }
            int width = constraintLayout.getWidth();
            int height = constraintLayout.getHeight();
            Rect rect = this.f292786p;
            rect.set(0, (int) top, width, height);
            constraintLayout.setClipBounds(rect);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(boolean z) {
        if ((!z || ((Boolean) g.H.getValue()).booleanValue()) && this.f292787q != z) {
            this.f292787q = z;
            ConstraintLayout constraintLayout = this.f292779c;
            if (z) {
                this.f.setAlpha(BitmapDescriptorFactory.HUE_RED);
                constraintLayout.setAlpha(1.0f);
            } else {
                RevGhostViewFacade revGhostViewFacade = this.f292781h;
                if (revGhostViewFacade != null) {
                    revGhostViewFacade.detach();
                }
                this.f292781h = null;
                constraintLayout.setClipBounds(null);
                this.i = 1.0f;
                this.f292782j = BitmapDescriptorFactory.HUE_RED;
            }
            this.f292780g.invoke();
        }
    }
}
