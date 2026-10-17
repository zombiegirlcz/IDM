package q4b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f242120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f242121b;

    public e(Data data, boolean z) {
        this.f242120a = data;
        this.f242121b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f242120a, eVar.f242120a) && this.f242121b == eVar.f242121b;
    }

    public final int hashCode() {
        Data data = this.f242120a;
        return Boolean.hashCode(this.f242121b) + ((data == null ? 0 : data.hashCode()) * 31);
    }
}
