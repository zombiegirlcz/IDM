package ttl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f274448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4l.k f274449b;

    public h(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f274448a = date;
        this.f274449b = k4l.k.CUSTOM;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f274448a, ((h) obj2).f274448a);
    }

    @Override // ttl.n
    public final k4l.k getType() {
        return this.f274449b;
    }

    public final int hashCode() {
        return this.f274448a.hashCode();
    }
}
