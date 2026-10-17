package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J#\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u001a\u001a\u00020\u0015H&¢\u0006\u0004\b\u001a\u0010\u0017J\u0011\u0010!\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H&¢\u0006\u0004\b%\u0010$J'\u0010,\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060(H&¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b-\u0010.J'\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u0002002\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060(H&¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00062\u0006\u00101\u001a\u000204H&¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0015H&¢\u0006\u0004\b7\u0010\u0017J\u000f\u00108\u001a\u00020\u0015H&¢\u0006\u0004\b8\u0010\u0017J\u0017\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u00020\fH&¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u00020<H&¢\u0006\u0004\b:\u0010=J\u000f\u0010>\u001a\u00020\u0015H&¢\u0006\u0004\b>\u0010\u0017R\u0014\u0010B\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001e\u0010O\u001a\u0004\u0018\u00010\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010;R\u001c\u0010P\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\bP\u0010$\"\u0004\bQ\u0010Rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006SÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/FocusManager;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "requestOwnerFocus-7o62pno", "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", "requestOwnerFocus", "focusedRect", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "focusSearch", "wrapAroundForOneDimensionalFocus", "moveFocus-aToIllA", "(IZ)Z", "moveFocus", "", "releaseFocus", "()V", "force", "refreshFocusEvents", "clearOwnerFocus", "clearFocus-I7lrPNg", "(ZZZI)Z", "clearFocus", "resetFocus-3ESFkO8", "(I)Z", "resetFocus", "getFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "hasFocusableContent", "()Z", "hasNonInteropFocusableContent", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "dispatchRotaryEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lkotlin/jvm/functions/Function0;)Z", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "dispatchIndirectPointerEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;)Z", "dispatchIndirectPointerCancel", "focusTargetAvailable", "node", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "scheduleInvalidationForOwner", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/focus/FocusListener;", "getListeners", "()Landroidx/collection/MutableObjectList;", "listeners", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "rootState", "getActiveFocusTargetNode", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setActiveFocusTargetNode", "activeFocusTargetNode", "isFocusCaptured", "setFocusCaptured", "(Z)V", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FocusOwner extends FocusManager {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
    static /* synthetic */ boolean m1770dispatchKeyEventYhN2O0w$default(FocusOwner focusOwner, KeyEvent keyEvent, Function0 function0, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i & 2) != 0) {
            function0 = FocusOwner$dispatchKeyEvent$1.INSTANCE;
        }
        return focusOwner.mo1773dispatchKeyEventYhN2O0w(keyEvent, function0);
    }

    /* JADX INFO: renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    boolean mo1771clearFocusI7lrPNg(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection);

    void clearOwnerFocus();

    void dispatchIndirectPointerCancel();

    boolean dispatchIndirectPointerEvent(@NotNull IndirectPointerEvent event);

    /* JADX INFO: renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo1772dispatchInterceptedSoftKeyboardEventZmokQxo(@NotNull KeyEvent keyEvent);

    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    boolean mo1773dispatchKeyEventYhN2O0w(@NotNull KeyEvent keyEvent, @NotNull Function0<Boolean> onFocusedItem);

    boolean dispatchRotaryEvent(@NotNull RotaryScrollEvent event, @NotNull Function0<Boolean> onFocusedItem);

    /* JADX INFO: renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    Boolean mo1774focusSearchULY8qGw(int focusDirection, Rect focusedRect, @NotNull Function1<? super FocusTargetNode, Boolean> onFound);

    void focusTargetAvailable();

    FocusTargetNode getActiveFocusTargetNode();

    Rect getFocusRect();

    @NotNull
    MutableObjectList<FocusListener> getListeners();

    @NotNull
    Modifier getModifier();

    @NotNull
    FocusState getRootState();

    boolean hasFocusableContent();

    boolean hasNonInteropFocusableContent();

    boolean isFocusCaptured();

    /* JADX INFO: renamed from: moveFocus-aToIllA, reason: not valid java name */
    boolean mo1775moveFocusaToIllA(int focusDirection, boolean wrapAroundForOneDimensionalFocus);

    void releaseFocus();

    /* JADX INFO: renamed from: requestOwnerFocus-7o62pno, reason: not valid java name */
    boolean mo1776requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect previouslyFocusedRect);

    /* JADX INFO: renamed from: resetFocus-3ESFkO8, reason: not valid java name */
    boolean mo1777resetFocus3ESFkO8(int focusDirection);

    void scheduleInvalidation(@NotNull FocusEventModifierNode node);

    void scheduleInvalidation(@NotNull FocusTargetNode node);

    void scheduleInvalidationForOwner();

    void setActiveFocusTargetNode(FocusTargetNode focusTargetNode);
}
