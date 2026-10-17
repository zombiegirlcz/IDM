package androidx.view;

import a0.d;
import android.os.Build;
import android.window.BackEvent;
import androidx.navigationevent.NavigationEvent;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000  2\u00020\u0001:\u0001 B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/activity/BackEventCompat;", "", "", "touchX", "touchY", "progress", "", "swipeEdge", "", "frameTimeMillis", "<init>", "(FFFIJ)V", "Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)V", "Landroidx/navigationevent/NavigationEvent;", "navigationEvent", "(Landroidx/navigationevent/NavigationEvent;)V", "", "toString", "()Ljava/lang/String;", "F", "getTouchX", "()F", "getTouchY", "getProgress", "I", "getSwipeEdge", "()I", "J", "getFrameTimeMillis", "()J", "Companion", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BackEventCompat {
    private final long frameTimeMillis;
    private final float progress;
    private final int swipeEdge;
    private final float touchX;
    private final float touchY;

    public BackEventCompat(float f, float f4, float f5, int i, long j2) {
        this.touchX = f;
        this.touchY = f4;
        this.progress = f5;
        this.swipeEdge = i;
        this.frameTimeMillis = j2;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    public final float getTouchY() {
        return this.touchY;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("BackEventCompat(touchX=");
        sb6.append(this.touchX);
        sb6.append(", touchY=");
        sb6.append(this.touchY);
        sb6.append(", progress=");
        sb6.append(this.progress);
        sb6.append(", swipeEdge=");
        sb6.append(this.swipeEdge);
        sb6.append(", frameTimeMillis=");
        return d.t(sb6, this.frameTimeMillis, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackEventCompat(@NotNull BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackEventCompat(@NotNull NavigationEvent navigationEvent) {
        this(navigationEvent.getTouchX(), navigationEvent.getTouchY(), navigationEvent.getProgress(), navigationEvent.getSwipeEdge(), navigationEvent.getFrameTimeMillis());
        Intrinsics.checkNotNullParameter(navigationEvent, "navigationEvent");
    }
}
