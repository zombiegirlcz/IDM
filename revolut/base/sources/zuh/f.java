package zuh;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f325470a;

    public f(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f325470a = params;
    }

    public final Map a() {
        return this.f325470a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f325470a, ((f) obj2).f325470a);
    }

    public final int hashCode() {
        return this.f325470a.hashCode();
    }
}
