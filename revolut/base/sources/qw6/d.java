package qw6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f249785a;

    public d(Set availablePluginTypes) {
        Intrinsics.checkNotNullParameter(availablePluginTypes, "availablePluginTypes");
        this.f249785a = availablePluginTypes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f249785a, ((d) obj2).f249785a);
    }

    public final int hashCode() {
        return this.f249785a.hashCode();
    }
}
