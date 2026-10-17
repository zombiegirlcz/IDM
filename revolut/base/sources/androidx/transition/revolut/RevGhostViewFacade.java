package androidx.transition.revolut;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import h30.l;
import ix0.b2;
import js0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0007R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/transition/revolut/RevGhostViewFacade;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "globalBounds", "Landroid/graphics/RectF;", "localBounds", "matrix", "Landroid/graphics/Matrix;", "viewGroup", "Landroid/view/ViewGroup;", "attach", "", "root", "detach", "captureValues", "setCurrentBounds", "bounds", "centerXDiff", "", "other", "centerYDiff", "getCapturedGlobalBounds", "out", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevGhostViewFacade {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final RectF globalBounds;

    @NotNull
    private final RectF localBounds;

    @NotNull
    private final Matrix matrix;

    @NotNull
    public final View view;
    private ViewGroup viewGroup;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/transition/revolut/RevGhostViewFacade$Companion;", "", "<init>", "()V", "Lix0/b2;", "target", "Landroid/view/ViewGroup;", "root", "Landroidx/transition/revolut/RevGhostViewFacade;", "create", "(Lix0/b2;Landroid/view/ViewGroup;)Landroidx/transition/revolut/RevGhostViewFacade;", "from", "to", "Landroid/graphics/RectF;", "out", "", "progress", "", "lerpBounds", "(Landroidx/transition/revolut/RevGhostViewFacade;Landroidx/transition/revolut/RevGhostViewFacade;Landroid/graphics/RectF;F)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RevGhostViewFacade create(@NotNull b2 target, @NotNull ViewGroup root) {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(root, "root");
            View viewA = d.a(target, root);
            if (viewA != null) {
                return new RevGhostViewFacade(viewA);
            }
            throw new IllegalStateException(l.r("Can't find view: ", target.j()));
        }

        public final void lerpBounds(@NotNull RevGhostViewFacade from, @NotNull RevGhostViewFacade to6, @NotNull RectF out, float progress) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            Intrinsics.checkNotNullParameter(out, "out");
            RectF rectF = from.globalBounds;
            RectF rectF2 = to6.globalBounds;
            out.left = AnimationUtils.lerp(rectF.left, rectF2.left, progress);
            out.top = AnimationUtils.lerp(rectF.top, rectF2.top, progress);
            out.right = AnimationUtils.lerp(rectF.right, rectF2.right, progress);
            out.bottom = AnimationUtils.lerp(rectF.bottom, rectF2.bottom, progress);
        }

        private Companion() {
        }
    }

    public RevGhostViewFacade(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.globalBounds = new RectF();
        this.localBounds = new RectF();
        this.matrix = new Matrix();
    }

    private final void captureValues() {
        ViewGroup viewGroup = this.viewGroup;
        if (viewGroup != null) {
            RevGhostView.calculateMatrix(this.view, viewGroup, this.matrix);
            this.localBounds.set(this.view.getLeft(), this.view.getTop(), this.view.getRight(), this.view.getBottom());
            this.globalBounds.set(this.localBounds);
            this.matrix.mapRect(this.globalBounds);
        }
    }

    public final void attach(@NotNull ViewGroup root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (this.viewGroup != null) {
            detach();
        }
        this.viewGroup = root;
        captureValues();
        RevGhostView.addGhost(this.view, root, this.matrix);
    }

    public final float centerXDiff(@NotNull RectF other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.centerX() - this.globalBounds.centerX();
    }

    public final float centerYDiff(@NotNull RectF other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.centerY() - this.globalBounds.centerY();
    }

    public final void detach() {
        if (this.viewGroup != null) {
            this.viewGroup = null;
            RevGhostView.removeGhost(this.view);
        }
    }

    public final void getCapturedGlobalBounds(@NotNull RectF out) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.set(this.globalBounds);
    }

    public final void setCurrentBounds(@NotNull RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.matrix.setRectToRect(this.localBounds, bounds, Matrix.ScaleToFit.CENTER);
    }
}
