package iv0;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f168667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextSwitcher f168668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f168669c;
    public int d;
    public b e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ag.q f168670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f168671h;
    public AnimationSet i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AnimationSet f168672j;
    public AlphaAnimation k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AlphaAnimation f168673l;

    public d(FrameLayout parentView, TextSwitcher textSwitcher) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(textSwitcher, "textSwitcher");
        this.f168667a = parentView;
        this.f168668b = textSwitcher;
        this.f168669c = f0.f322471a;
        b bVar = b.NO_ANIMATION;
        this.e = bVar;
        this.f168670g = new ag.q(this, 20);
        textSwitcher.setAnimateFirstView(false);
        c(bVar);
    }

    public final void a() {
        boolean zIsShown = this.f168668b.isShown();
        FrameLayout frameLayout = this.f168667a;
        boolean z = zIsShown && frameLayout.getWindowVisibility() == 0 && this.f168669c.size() > 1;
        if (z == this.f) {
            return;
        }
        ag.q qVar = this.f168670g;
        if (z) {
            this.f = true;
            frameLayout.postDelayed(qVar, 4000L);
        } else {
            this.f = false;
            frameLayout.removeCallbacks(qVar);
        }
    }

    public final void b(List hints) {
        Intrinsics.checkNotNullParameter(hints, "hints");
        if (Intrinsics.f(hints, this.f168669c)) {
            return;
        }
        int i = 0;
        this.f = false;
        ag.q qVar = this.f168670g;
        FrameLayout frameLayout = this.f168667a;
        frameLayout.removeCallbacks(qVar);
        int size = hints.size();
        TextSwitcher textSwitcher = this.f168668b;
        if (size <= 1) {
            c(b.NO_ANIMATION);
            ty0.c cVarB0 = u.k(frameLayout).b0();
            Clause textClause = (Clause) d0.d0(hints);
            if (textClause == null) {
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            ty0.c.c(cVarB0, textClause, textSwitcher);
        } else {
            c(b.FADE);
            Clause clause = (Clause) d0.e0(this.d, this.f168669c);
            int iIndexOf = clause != null ? hints.indexOf(clause) : -1;
            if (iIndexOf >= 0) {
                i = iIndexOf;
            } else {
                ty0.c.c(u.k(frameLayout).b0(), (Clause) d0.b0(hints), textSwitcher);
            }
            c(b.SLIDE);
        }
        this.f168669c = hints;
        this.d = i;
        a();
    }

    public final void c(b bVar) {
        if (this.e == bVar) {
            return;
        }
        this.e = bVar;
        if (!this.f168671h) {
            this.f168671h = true;
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new TranslateAnimation(0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, 1, 0.75f, 1, BitmapDescriptorFactory.HUE_RED));
            animationSet.addAnimation(new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f));
            animationSet.setDuration(400L);
            this.i = animationSet;
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.addAnimation(new TranslateAnimation(0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, -0.75f));
            animationSet2.addAnimation(new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED));
            animationSet2.setDuration(400L);
            this.f168672j = animationSet2;
            AlphaAnimation alphaAnimation = new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f);
            alphaAnimation.setDuration(400L);
            this.k = alphaAnimation;
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
            alphaAnimation2.setDuration(400L);
            this.f168673l = alphaAnimation2;
        }
        int i = c.f168666a[bVar.ordinal()];
        TextSwitcher textSwitcher = this.f168668b;
        if (i == 1) {
            textSwitcher.setInAnimation(null);
            textSwitcher.setOutAnimation(null);
            return;
        }
        if (i == 2) {
            AnimationSet animationSet3 = this.i;
            if (animationSet3 == null) {
                Intrinsics.r("slideInAnimation");
                throw null;
            }
            textSwitcher.setInAnimation(animationSet3);
            AnimationSet animationSet4 = this.f168672j;
            if (animationSet4 != null) {
                textSwitcher.setOutAnimation(animationSet4);
                return;
            } else {
                Intrinsics.r("slideOutAnimation");
                throw null;
            }
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AlphaAnimation alphaAnimation3 = this.k;
        if (alphaAnimation3 == null) {
            Intrinsics.r("fadeInAnimation");
            throw null;
        }
        textSwitcher.setInAnimation(alphaAnimation3);
        AlphaAnimation alphaAnimation4 = this.f168673l;
        if (alphaAnimation4 != null) {
            textSwitcher.setOutAnimation(alphaAnimation4);
        } else {
            Intrinsics.r("fadeOutAnimation");
            throw null;
        }
    }
}
