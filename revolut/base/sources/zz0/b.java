package zz0;

import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.StandardBiometricHeader;

/* JADX INFO: loaded from: classes20.dex */
public final class b {
    private b() {
    }

    public static c a(b bVar, MotionEvent event) {
        a aVar;
        f fVar;
        boolean z = Build.VERSION.SDK_INT >= 29;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        InputDevice device = event.getDevice();
        if (device != null) {
            boolean z3 = z && device.isExternal();
            String name = device.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar = new a(name, device.isVirtual(), z3);
        } else {
            aVar = null;
        }
        a aVar2 = aVar;
        int pointerCount = event.getPointerCount();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i21 = 0; i21 < pointerCount; i21++) {
            int toolType = event.getToolType(i21);
            if (toolType == 1) {
                i2++;
            } else if (toolType == 2) {
                i5++;
            } else if (toolType == 3) {
                i3++;
            } else if (toolType != 4) {
                i6++;
            } else {
                i++;
            }
        }
        e eVar = f.Companion;
        int source = event.getSource();
        eVar.getClass();
        switch (source) {
            case StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE /* 257 */:
                fVar = f.KEYBOARD;
                break;
            case 513:
                fVar = f.DPAD;
                break;
            case 1025:
                fVar = f.GAMEPAD;
                break;
            case 4098:
                fVar = f.TOUCHSCREEN;
                break;
            case 8194:
                fVar = f.MOUSE;
                break;
            case 16386:
                fVar = f.STYLUS;
                break;
            case 65540:
                fVar = f.TRACKBALL;
                break;
            case 131076:
                fVar = f.MOUSE_RELATIVE;
                break;
            case 1048584:
                fVar = f.TOUCHPAD;
                break;
            case 16777232:
                fVar = f.JOYSTICK;
                break;
            default:
                fVar = f.UNKNOWN;
                break;
        }
        return new c(fVar, aVar2, i, i2, i3, i5, i6);
    }
}
