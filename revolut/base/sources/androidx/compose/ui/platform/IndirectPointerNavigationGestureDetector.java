package androidx.compose.ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/platform/IndirectPointerNavigationGestureDetector;", "", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "", "onMoveFocus", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "indirectPointerEvent", "", "isConsumed", "onIndirectPointerEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;Z)Z", "cancelCurrentEventStream", "()V", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "primaryDirectionalMotionAxis", "I", "getPrimaryDirectionalMotionAxis-nZO2Niw", "()I", "setPrimaryDirectionalMotionAxis-WQKaTuc", "(I)V", "ignoreCurrentGestureStream", "Z", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndirectPointerNavigationGestureDetector {

    @NotNull
    private final GestureDetector gestureDetector;
    private boolean ignoreCurrentGestureStream;

    @NotNull
    private final Function1<FocusDirection, Unit> onMoveFocus;
    private int primaryDirectionalMotionAxis = IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m2340getNonenZO2Niw();

    /* JADX WARN: Multi-variable type inference failed */
    public IndirectPointerNavigationGestureDetector(@NotNull Context context, @NotNull Function1<? super FocusDirection, Unit> function1) {
        this.onMoveFocus = function1;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent e) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent e110, MotionEvent e2, float velocityX, float velocityY) {
                if (this.this$0.ignoreCurrentGestureStream) {
                    return true;
                }
                int primaryDirectionalMotionAxis = this.this$0.getPrimaryDirectionalMotionAxis();
                IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE;
                if (IndirectPointerEventPrimaryDirectionalMotionAxis.m2336equalsimpl0(primaryDirectionalMotionAxis, companion.m2341getXnZO2Niw())) {
                    if (Math.abs(velocityX) > Math.abs(velocityY)) {
                        this.this$0.onMoveFocus.invoke(FocusDirection.m1751boximpl(velocityX > BitmapDescriptorFactory.HUE_RED ? FocusDirection.INSTANCE.m1762getNextdhqQ8s() : FocusDirection.INSTANCE.m1763getPreviousdhqQ8s()));
                    }
                } else if (IndirectPointerEventPrimaryDirectionalMotionAxis.m2336equalsimpl0(this.this$0.getPrimaryDirectionalMotionAxis(), companion.m2342getYnZO2Niw()) && Math.abs(velocityY) > Math.abs(velocityX)) {
                    this.this$0.onMoveFocus.invoke(FocusDirection.m1751boximpl(velocityY > BitmapDescriptorFactory.HUE_RED ? FocusDirection.INSTANCE.m1762getNextdhqQ8s() : FocusDirection.INSTANCE.m1763getPreviousdhqQ8s()));
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent e) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent e110, MotionEvent e2, float distanceX, float distanceY) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent e) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });
    }

    public final void cancelCurrentEventStream() {
        this.primaryDirectionalMotionAxis = IndirectPointerEventPrimaryDirectionalMotionAxis.INSTANCE.m2340getNonenZO2Niw();
        this.ignoreCurrentGestureStream = true;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name and from getter */
    public final int getPrimaryDirectionalMotionAxis() {
        return this.primaryDirectionalMotionAxis;
    }

    public final boolean onIndirectPointerEvent(@NotNull IndirectPointerEvent indirectPointerEvent, boolean isConsumed) {
        MotionEvent nativeEvent = AndroidIndirectPointerEvent_androidKt.getNativeEvent(indirectPointerEvent);
        int action = nativeEvent.getAction();
        if (action == 0) {
            this.primaryDirectionalMotionAxis = indirectPointerEvent.getPrimaryDirectionalMotionAxis();
            this.ignoreCurrentGestureStream = false;
        } else if ((action == 1 || action == 2) && isConsumed) {
            cancelCurrentEventStream();
        }
        return this.gestureDetector.onTouchEvent(nativeEvent);
    }
}
