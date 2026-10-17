package pf8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final of8.a f235504a;

    public a(of8.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f235504a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f235504a == ((a) obj2).f235504a;
    }

    public final int hashCode() {
        return this.f235504a.hashCode();
    }
}
