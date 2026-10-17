package tx5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw5.e f275333a;

    public d(cw5.e selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f275333a = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f275333a == ((d) obj2).f275333a;
    }

    public final int hashCode() {
        return this.f275333a.hashCode();
    }
}
