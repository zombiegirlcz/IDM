package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006*\f\b\u0000\u0010\r\"\u00020\f2\u00020\f*\f\b\u0000\u0010\u000e\"\u00020\f2\u00020\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "EmptyPointerKeyboardModifiers", "()I", "Landroidx/compose/ui/input/pointer/PointerButtons;", "", "isPrimaryPressed-aHzCx-E", "(I)Z", "isPrimaryPressed", "isSecondaryPressed-aHzCx-E", "isSecondaryPressed", "isShiftPressed-5xRPYO0", "isShiftPressed", "", "NativePointerButtons", "NativePointerKeyboardModifiers", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PointerEvent_androidKt {
    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m2485constructorimpl(0);
    }

    /* JADX INFO: renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m2453isPrimaryPressedaHzCxE(int i) {
        return (i & 33) != 0;
    }

    /* JADX INFO: renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m2454isSecondaryPressedaHzCxE(int i) {
        return (i & 66) != 0;
    }

    /* JADX INFO: renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m2455isShiftPressed5xRPYO0(int i) {
        return (i & 1) != 0;
    }
}
