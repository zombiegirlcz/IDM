package vlk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f290488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f290489b;

    public m(Data layout, int i) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f290488a = layout;
        this.f290489b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f290488a, mVar.f290488a) && this.f290489b == mVar.f290489b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f290489b) + (this.f290488a.hashCode() * 31);
    }
}
