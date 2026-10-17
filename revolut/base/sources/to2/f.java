package to2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn2.a f272498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f272499b;

    public f(mn2.a serviceType, Data data) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f272498a = serviceType;
        this.f272499b = data;
    }

    public static f a(f fVar, Data data) {
        mn2.a serviceType = fVar.f272498a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(data, "data");
        return new f(serviceType, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f272498a == fVar.f272498a && Intrinsics.f(this.f272499b, fVar.f272499b);
    }

    public final int hashCode() {
        return this.f272499b.hashCode() + (this.f272498a.hashCode() * 31);
    }
}
