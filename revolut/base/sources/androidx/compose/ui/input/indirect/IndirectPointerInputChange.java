package androidx.compose.ui.input.indirect;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerId;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b$\u0010\u001eR$\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b&\u0010\u001e¨\u0006'"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectPointerInputChange;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "uptimeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "<init>", "(JJJZFJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "consume", "()V", "", "toString", "()Ljava/lang/String;", "J", "getId-J3iCeTQ", "()J", "getUptimeMillis", "getPosition-F1C5BW0", "Z", "getPressed", "()Z", "F", "getPressure", "()F", "getPreviousUptimeMillis", "getPreviousPosition-F1C5BW0", "getPreviousPressed", "value", "isConsumed", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndirectPointerInputChange {
    private final long id;
    private boolean isConsumed;
    private final long position;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long uptimeMillis;

    public /* synthetic */ IndirectPointerInputChange(long j2, long j3, long j5, boolean z, float f, long j16, long j22, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j5, z, f, j16, j22, z3);
    }

    public final void consume() {
        this.isConsumed = true;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    /* JADX INFO: renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* JADX INFO: renamed from: isConsumed, reason: from getter */
    public final boolean getIsConsumed() {
        return this.isConsumed;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("IndirectPointerInputChange(id=");
        sb6.append((Object) PointerId.m2461toStringimpl(this.id));
        sb6.append(", uptimeMillis=");
        sb6.append(this.uptimeMillis);
        sb6.append(", position=");
        sb6.append((Object) Offset.m1841toStringimpl(this.position));
        sb6.append(", pressed=");
        sb6.append(this.pressed);
        sb6.append(", pressure=");
        sb6.append(this.pressure);
        sb6.append(", previousUptimeMillis=");
        sb6.append(this.previousUptimeMillis);
        sb6.append(", previousPosition=");
        sb6.append((Object) Offset.m1841toStringimpl(this.previousPosition));
        sb6.append(", previousPressed=");
        sb6.append(this.previousPressed);
        sb6.append(", isConsumed=");
        return a.x(sb6, this.isConsumed, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    private IndirectPointerInputChange(long j2, long j3, long j5, boolean z, float f, long j16, long j22, boolean z3) {
        this.id = j2;
        this.uptimeMillis = j3;
        this.position = j5;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j16;
        this.previousPosition = j22;
        this.previousPressed = z3;
    }
}
