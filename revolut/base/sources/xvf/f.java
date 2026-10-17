package xvf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f309249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f309250b;

    public f(Data data, long j2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f309249a = data;
        this.f309250b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f309249a, fVar.f309249a) && this.f309250b == fVar.f309250b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f309250b) + (this.f309249a.hashCode() * 31);
    }
}
