package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a¥\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052*\b\u0002\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n2*\b\u0002\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0011*\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u0017\u001a\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"6\u0010\u001e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"6\u0010 \u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/DraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "toValidVelocity-TH1AsA0", "(J)J", "toValidVelocity", "NoOpOnDragStarted", "Lkotlin/jvm/functions/Function3;", "NoOpOnDragStopped", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class DraggableKt {

    @NotNull
    private static final Function3 NoOpOnDragStarted = new DraggableKt$NoOpOnDragStarted$1(null);

    @NotNull
    private static final Function3 NoOpOnDragStopped = new DraggableKt$NoOpOnDragStopped$1(null);

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull DraggableState draggableState, @NotNull Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z3, @NotNull Function3 function3, @NotNull Function3 function32, boolean z4) {
        return modifier.then(new DraggableElement(draggableState, orientation, z, mutableInteractionSource, z3, function3, function32, z4));
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z3, Function3 function3, Function3 function32, boolean z4, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            mutableInteractionSource = null;
        }
        return draggable(modifier, draggableState, orientation, z6, mutableInteractionSource, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? NoOpOnDragStarted : function3, (i & 64) != 0 ? NoOpOnDragStopped : function32, (i & 128) != 0 ? false : z4);
    }

    /* JADX INFO: renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m716toFloat3MmeM6k(long j2, @NotNull Orientation orientation) {
        return Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j2 & BodyPartID.bodyIdMax : j2 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m717toFloatsFctU(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m3398getYimpl(j2) : Velocity.m3397getXimpl(j2);
    }

    /* JADX INFO: renamed from: toValidVelocity-TH1AsA0, reason: not valid java name */
    public static final long m718toValidVelocityTH1AsA0(long j2) {
        boolean zIsNaN = Float.isNaN(Velocity.m3397getXimpl(j2));
        float fM3398getYimpl = BitmapDescriptorFactory.HUE_RED;
        float fM3397getXimpl = zIsNaN ? 0.0f : Velocity.m3397getXimpl(j2);
        if (!Float.isNaN(Velocity.m3398getYimpl(j2))) {
            fM3398getYimpl = Velocity.m3398getYimpl(j2);
        }
        return VelocityKt.Velocity(fM3397getXimpl, fM3398getYimpl);
    }
}
