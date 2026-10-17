package wmk;

import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Optional f298681a;

    public a(Optional optional) {
        this.f298681a = optional;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f298681a, ((a) obj2).f298681a);
    }

    public final int hashCode() {
        Optional optional = this.f298681a;
        if (optional == null) {
            return 0;
        }
        return optional.hashCode();
    }
}
