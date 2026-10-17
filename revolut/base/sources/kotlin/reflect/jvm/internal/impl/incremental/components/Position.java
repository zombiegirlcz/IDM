package kotlin.reflect.jvm.internal.impl.incremental.components;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Position implements Serializable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Position f186728c = new Position(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f186729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f186730b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final Position getNO_POSITION() {
            return Position.f186728c;
        }
    }

    public Position(int i, int i2) {
        this.f186729a = i;
        this.f186730b = i2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Position)) {
            return false;
        }
        Position position = (Position) obj2;
        return this.f186729a == position.f186729a && this.f186730b == position.f186730b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f186730b) + (Integer.hashCode(this.f186729a) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("Position(line=");
        sb6.append(this.f186729a);
        sb6.append(", column=");
        return a.t(sb6, this.f186730b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
