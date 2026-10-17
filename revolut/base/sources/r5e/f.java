package r5e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f251589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f251590b;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f251589a, fVar.f251589a) && this.f251590b == fVar.f251590b;
    }

    public final int hashCode() {
        Data data = this.f251589a;
        return Integer.hashCode(this.f251590b) + ((data == null ? 0 : data.hashCode()) * 31);
    }

    public /* synthetic */ f(int i) {
        this(null, 0);
    }

    public f(Data data, int i) {
        this.f251589a = data;
        this.f251590b = i;
    }
}
