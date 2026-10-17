package fwf;

import com.revolut.data.model.Data;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f138620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f138621b;

    public f(Data data, LocalDateTime now) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(now, "now");
        this.f138620a = data;
        this.f138621b = now;
    }

    public static f a(f fVar, Data data, LocalDateTime now, int i) {
        if ((i & 1) != 0) {
            data = fVar.f138620a;
        }
        if ((i & 2) != 0) {
            now = fVar.f138621b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(now, "now");
        return new f(data, now);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f138620a, fVar.f138620a) && Intrinsics.f(this.f138621b, fVar.f138621b);
    }

    public final int hashCode() {
        return this.f138621b.hashCode() + (this.f138620a.hashCode() * 31);
    }
}
