package vtj;

import d0j.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f292125a;

    public a(h challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f292125a = challenge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f292125a, ((a) obj2).f292125a);
    }

    public final int hashCode() {
        return this.f292125a.hashCode();
    }
}
