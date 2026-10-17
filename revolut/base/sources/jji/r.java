package jji;

import android.graphics.RectF;
import androidx.transition.revolut.RevGhostViewFacade;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import ix0.b2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends lki.b {

    @NotNull
    private static final p Companion = new p();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f174980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f174981h;
    public RevGhostViewFacade i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RevGhostViewFacade f174982j;
    public final RectF k;

    public r(ParcelableViewTarget avatarKey) {
        Intrinsics.checkNotNullParameter(avatarKey, "avatarKey");
        this.f174980g = avatarKey;
        this.f174981h = 1.0f;
        this.k = new RectF();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[PHI: r3
      0x0018: PHI (r3v5 android.view.ViewGroup) = (r3v2 android.view.ViewGroup), (r3v20 android.view.ViewGroup) binds: [B:18:0x0027, B:9:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // lki.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.view.View r19, android.view.View r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jji.r.a(android.view.View, android.view.View, boolean):android.animation.Animator");
    }

    public final void d() {
        RevGhostViewFacade revGhostViewFacade = this.i;
        if (revGhostViewFacade != null) {
            revGhostViewFacade.view.setAlpha(1.0f);
            revGhostViewFacade.detach();
        }
        this.i = null;
        RevGhostViewFacade revGhostViewFacade2 = this.f174982j;
        if (revGhostViewFacade2 != null) {
            revGhostViewFacade2.view.setAlpha(1.0f);
            revGhostViewFacade2.detach();
        }
        this.f174982j = null;
    }

    @Override // lki.b, lki.x
    public final void g() {
        super.g();
        d();
    }
}
