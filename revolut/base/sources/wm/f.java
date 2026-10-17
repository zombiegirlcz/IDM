package wm;

import kotlin.jvm.internal.Intrinsics;
import rp0.p;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f298574a;

    public f(p data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f298574a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f298574a == ((f) obj2).f298574a;
    }

    public final int hashCode() {
        return this.f298574a.hashCode();
    }
}
