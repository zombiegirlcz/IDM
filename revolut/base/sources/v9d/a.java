package v9d;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import u9d.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f287018a;

    public a(b language) {
        Intrinsics.checkNotNullParameter(language, "language");
        this.f287018a = language;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f287018a == ((a) obj2).f287018a;
    }

    public final int hashCode() {
        return this.f287018a.hashCode();
    }
}
