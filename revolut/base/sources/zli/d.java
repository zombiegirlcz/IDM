package zli;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f323283a;

    public d(LinkedHashMap pathParameters) {
        Intrinsics.checkNotNullParameter(pathParameters, "pathParameters");
        this.f323283a = pathParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f323283a.equals(((d) obj2).f323283a);
    }

    public final int hashCode() {
        return this.f323283a.hashCode();
    }
}
