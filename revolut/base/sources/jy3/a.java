package jy3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f179326a;

    public a(Map parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f179326a = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f179326a, ((a) obj2).f179326a);
    }

    public final int hashCode() {
        return this.f179326a.hashCode();
    }
}
