package pf8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of8.a f235520a;

    public m(of8.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f235520a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f235520a == ((m) obj2).f235520a;
    }

    public final int hashCode() {
        return this.f235520a.hashCode();
    }
}
