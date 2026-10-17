package dl6;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115706a;

    public d(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f115706a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f115706a, ((d) obj2).f115706a);
    }

    public final int hashCode() {
        return this.f115706a.hashCode();
    }
}
