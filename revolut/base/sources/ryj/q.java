package ryj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f258407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f258408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f258409c;

    public q(p kind, boolean z, Data data) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f258407a = kind;
        this.f258408b = z;
        this.f258409c = data;
    }

    public static q a(q qVar, boolean z) {
        p kind = qVar.f258407a;
        Data data = qVar.f258409c;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(data, "data");
        return new q(kind, z, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f258407a, qVar.f258407a) && this.f258408b == qVar.f258408b && Intrinsics.f(this.f258409c, qVar.f258409c);
    }

    public final int hashCode() {
        return this.f258409c.hashCode() + j6.a.c(this.f258407a.hashCode() * 31, 31, this.f258408b);
    }
}
