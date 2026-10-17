package androidx.navigationevent;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState;", "", "<init>", "()V", "Companion", "Idle", "InProgress", "Landroidx/navigationevent/NavigationEventTransitionState$Idle;", "Landroidx/navigationevent/NavigationEventTransitionState$InProgress;", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NavigationEventTransitionState {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState$Idle;", "Landroidx/navigationevent/NavigationEventTransitionState;", "<init>", "()V", "toString", "", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Idle extends NavigationEventTransitionState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Idle()";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState$InProgress;", "Landroidx/navigationevent/NavigationEventTransitionState;", "Landroidx/navigationevent/NavigationEvent;", "latestEvent", "", "direction", "<init>", "(Landroidx/navigationevent/NavigationEvent;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigationevent/NavigationEvent;", "getLatestEvent", "()Landroidx/navigationevent/NavigationEvent;", "I", "getDirection", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InProgress extends NavigationEventTransitionState {
        private final int direction;

        @NotNull
        private final NavigationEvent latestEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(@NotNull NavigationEvent latestEvent, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(latestEvent, "latestEvent");
            this.latestEvent = latestEvent;
            this.direction = i;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || InProgress.class != other.getClass()) {
                return false;
            }
            InProgress inProgress = (InProgress) other;
            return this.direction == inProgress.direction && Intrinsics.f(this.latestEvent, inProgress.latestEvent);
        }

        public int hashCode() {
            return this.latestEvent.hashCode() + (this.direction * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("InProgress(latestEvent=");
            sb6.append(this.latestEvent);
            sb6.append(", direction=");
            return a.t(sb6, this.direction, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public /* synthetic */ NavigationEventTransitionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NavigationEventTransitionState() {
    }
}
