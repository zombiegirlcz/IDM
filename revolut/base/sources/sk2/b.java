package sk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co3.a f263756a;

    public b(co3.a location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f263756a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f263756a, ((b) obj2).f263756a);
    }

    public final int hashCode() {
        return this.f263756a.hashCode();
    }
}
