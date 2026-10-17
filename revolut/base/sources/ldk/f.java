package ldk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f194163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f194164b;

    public f(Data layout, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f194163a = layout;
        this.f194164b = z;
    }

    public static f a(f fVar, Data layout, boolean z, int i) {
        if ((i & 1) != 0) {
            layout = fVar.f194163a;
        }
        if ((i & 2) != 0) {
            z = fVar.f194164b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new f(layout, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f194163a, fVar.f194163a) && this.f194164b == fVar.f194164b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f194164b) + (this.f194163a.hashCode() * 31);
    }
}
