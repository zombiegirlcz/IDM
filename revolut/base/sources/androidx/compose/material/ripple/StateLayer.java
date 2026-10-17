package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction$Cancel;
import androidx.compose.foundation.interaction.DragInteraction$Start;
import androidx.compose.foundation.interaction.DragInteraction$Stop;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.FocusInteraction$Unfocus;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.data.database.models.openbanking.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J!\u0010\u0017\u001a\u00020\u0012*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "bounded", "", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "interactions", "", "Landroidx/compose/foundation/interaction/Interaction;", "currentInteraction", "handleInteraction", "", "interaction", "scope", "Lkotlinx/coroutines/CoroutineScope;", "handleInteraction$material_ripple", "drawStateLayer", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "radius", "color", "Landroidx/compose/ui/graphics/Color;", "drawStateLayer-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StateLayer {
    private final boolean bounded;
    private Interaction currentInteraction;

    @NotNull
    private final Function0<RippleAlpha> rippleAlpha;

    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 2, null);

    @NotNull
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z, @NotNull Function0<RippleAlpha> function0) {
        this.bounded = z;
        this.rippleAlpha = function0;
    }

    /* JADX INFO: renamed from: drawStateLayer-mxwnekA, reason: not valid java name */
    public final void m1291drawStateLayermxwnekA(@NotNull DrawScope drawScope, float f, long j2) throws Throwable {
        long j3;
        float fFloatValue = this.animatedAlpha.getValue().floatValue();
        if (fFloatValue <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        long jM1976copywmQWz5c$default = Color.m1976copywmQWz5c$default(j2, fFloatValue, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        if (!this.bounded) {
            DrawScope.m2199drawCircleVaOC9Bg$default(drawScope, jM1976copywmQWz5c$default, f, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 124, null);
            return;
        }
        float fM1869getWidthimpl = Size.m1869getWidthimpl(drawScope.mo2212getSizeNHjbRc());
        float fM1867getHeightimpl = Size.m1867getHeightimpl(drawScope.mo2212getSizeNHjbRc());
        int iM1971getIntersectrtfAjoo = ClipOp.INSTANCE.m1971getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2190getSizeNHjbRc = drawContext.mo2190getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2193clipRectN_I0leg(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fM1869getWidthimpl, fM1867getHeightimpl, iM1971getIntersectrtfAjoo);
            j3 = jMo2190getSizeNHjbRc;
            try {
                DrawScope.m2199drawCircleVaOC9Bg$default(drawScope, jM1976copywmQWz5c$default, f, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 124, null);
                d.B(drawContext, j3);
            } catch (Throwable th10) {
                th = th10;
                d.B(drawContext, j3);
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            j3 = jMo2190getSizeNHjbRc;
        }
    }

    public final void handleInteraction$material_ripple(@NotNull Interaction interaction, @NotNull CoroutineScope scope) {
        if (interaction instanceof HoverInteraction$Enter) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction$Exit) {
            this.interactions.remove(((HoverInteraction$Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction$Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction$Unfocus) {
            this.interactions.remove(((FocusInteraction$Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction$Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction$Stop) {
            this.interactions.remove(((DragInteraction$Stop) interaction).getStart());
        } else if (!(interaction instanceof DragInteraction$Cancel)) {
            return;
        } else {
            this.interactions.remove(((DragInteraction$Cancel) interaction).getStart());
        }
        Interaction interaction2 = (Interaction) d0.o0(this.interactions);
        if (Intrinsics.f(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlpha = (RippleAlpha) this.rippleAlpha.invoke();
            e0.C(scope, null, null, new StateLayer$handleInteraction$1(this, interaction2 instanceof HoverInteraction$Enter ? rippleAlpha.getHoveredAlpha() : interaction2 instanceof FocusInteraction$Focus ? rippleAlpha.getFocusedAlpha() : interaction2 instanceof DragInteraction$Start ? rippleAlpha.getDraggedAlpha() : BitmapDescriptorFactory.HUE_RED, RippleKt.incomingStateLayerAnimationSpecFor(interaction2), null), 3);
        } else {
            e0.C(scope, null, null, new StateLayer$handleInteraction$2(this, RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction), null), 3);
        }
        this.currentInteraction = interaction2;
    }
}
