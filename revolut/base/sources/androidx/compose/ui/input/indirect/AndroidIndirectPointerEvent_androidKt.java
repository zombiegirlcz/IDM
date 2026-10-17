package androidx.compose.ui.input.indirect;

import android.view.InputDevice;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\r\u001a\u00020\u0005*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "actionMasked", "Landroidx/compose/ui/input/indirect/IndirectPointerEventType;", "convertActionToIndirectPointerEventType", "(I)I", "Landroid/view/MotionEvent;", "motionEvent", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "indirectPrimaryDirectionalScrollAxis", "(Landroid/view/MotionEvent;)I", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "getNativeEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;)Landroid/view/MotionEvent;", "nativeEvent", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class AndroidIndirectPointerEvent_androidKt {
    public static final int convertActionToIndirectPointerEventType(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return IndirectPointerEventType.INSTANCE.m2344getMove4ZHQPSE();
                }
                if (i != 5) {
                    if (i != 6) {
                        return IndirectPointerEventType.INSTANCE.m2347getUnknown4ZHQPSE();
                    }
                }
            }
            return IndirectPointerEventType.INSTANCE.m2346getRelease4ZHQPSE();
        }
        return IndirectPointerEventType.INSTANCE.m2345getPress4ZHQPSE();
    }

    @NotNull
    public static final MotionEvent getNativeEvent(@NotNull IndirectPointerEvent indirectPointerEvent) {
        Intrinsics.i(indirectPointerEvent, "null cannot be cast to non-null type androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent");
        return ((AndroidIndirectPointerEvent) indirectPointerEvent).getNativeEvent();
    }

    public static final int indirectPrimaryDirectionalScrollAxis(@NotNull MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(PKIFailureInfo.badSenderNonce)) {
            throw new IllegalArgumentException("MotionEvent must be a touch navigation source");
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange != null && motionRange2 == null) {
                return IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m2341getXnZO2Niw();
            }
            if (motionRange2 != null && motionRange == null) {
                return IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m2342getYnZO2Niw();
            }
            if (motionRange != null && motionRange2 != null) {
                float range = motionRange.getRange();
                float range2 = motionRange2.getRange();
                if (range > range2 && (range2 == BitmapDescriptorFactory.HUE_RED || range / range2 >= 5.0f)) {
                    return IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m2341getXnZO2Niw();
                }
                if (range2 > range && (range == BitmapDescriptorFactory.HUE_RED || range2 / range >= 5.0f)) {
                    return IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m2342getYnZO2Niw();
                }
            }
        }
        return IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m2340getNonenZO2Niw();
    }
}
