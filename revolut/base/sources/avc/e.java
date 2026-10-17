package avc;

import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f9995a;

    public e(f0 revolutCard) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        this.f9995a = revolutCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f9995a, ((e) obj2).f9995a);
    }

    public final int hashCode() {
        return this.f9995a.hashCode();
    }
}
