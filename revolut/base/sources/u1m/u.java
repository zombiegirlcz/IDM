package u1m;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements Serializable {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f276500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f276501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f276502c;

    public u(ArrayList targetProcessTypes, s stateType, Integer num) {
        Intrinsics.checkNotNullParameter(targetProcessTypes, "targetProcessTypes");
        Intrinsics.checkNotNullParameter(stateType, "stateType");
        this.f276500a = targetProcessTypes;
        this.f276501b = stateType;
        this.f276502c = num;
        if (targetProcessTypes.isEmpty()) {
            throw new IllegalArgumentException("processTypes は１つ以上要素をもっていること");
        }
        s sVar = s.RUNNING_PROCESSES;
        if (stateType != sVar) {
            if (num != null) {
                throw new IllegalArgumentException("currentStateType must be INITIAL.");
            }
            return;
        }
        if (num == null) {
            throw new IllegalArgumentException((sVar + " のときは currentProcessIndexがnullでないこと").toString());
        }
        if (num.intValue() < 0 || num.intValue() >= targetProcessTypes.size()) {
            throw new IllegalArgumentException((sVar + " のときは currentProcessIndex(" + num + ")に有効なインデックスが指定されていること").toString());
        }
    }

    public static u b(u uVar, s stateType, Integer num, int i) {
        ArrayList targetProcessTypes = uVar.f276500a;
        if ((i & 2) != 0) {
            stateType = uVar.f276501b;
        }
        if ((i & 4) != 0) {
            num = uVar.f276502c;
        }
        Intrinsics.checkNotNullParameter(targetProcessTypes, "targetProcessTypes");
        Intrinsics.checkNotNullParameter(stateType, "stateType");
        return new u(targetProcessTypes, stateType, num);
    }

    public final u a(s sVar) {
        return b(this, sVar, sVar == s.RUNNING_PROCESSES ? 0 : null, 1);
    }

    public final u c() {
        switch (t.f276499a[this.f276501b.ordinal()]) {
            case 1:
                return b(this, s.SESSION_CREATED, null, 5);
            case 2:
                return b(this, s.DEVELOPMENT_MODE_CHECKED, null, 5);
            case 3:
                return b(this, s.RUNNING_PROCESSES, 0, 1);
            case 4:
                Integer num = this.f276502c;
                if (num == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int iIntValue = num.intValue() + 1;
                return iIntValue < this.f276500a.size() ? b(this, null, Integer.valueOf(iIntValue), 3) : b(this, s.PROCESSES_COMPLETED, null, 1);
            case 5:
                return b(this, s.ALL_COMPLETED, null, 5);
            case 6:
            case 7:
                return this;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f276500a.equals(uVar.f276500a) && this.f276501b == uVar.f276501b && Intrinsics.f(this.f276502c, uVar.f276502c);
    }

    public final int hashCode() {
        int iHashCode = (this.f276501b.hashCode() + (this.f276500a.hashCode() * 31)) * 31;
        Integer num = this.f276502c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CoreEkycProcessStateMachine(targetProcessTypes=" + this.f276500a + ", stateType=" + this.f276501b + ", processIndex=" + this.f276502c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
