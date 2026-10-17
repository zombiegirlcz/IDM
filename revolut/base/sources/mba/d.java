package mba;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204187a;

    public d(List info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f204187a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f204187a, ((d) obj2).f204187a);
    }

    public final int hashCode() {
        return this.f204187a.hashCode();
    }
}
