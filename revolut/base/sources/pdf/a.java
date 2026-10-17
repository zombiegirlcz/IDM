package pdf;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f235165a;

    public a(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f235165a = inputData;
    }

    public final b b() {
        return this.f235165a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f235165a, ((a) obj2).f235165a);
    }

    public final int hashCode() {
        return this.f235165a.hashCode();
    }
}
