package vs7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f291740b;

    public e(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f291739a = str;
        this.f291740b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f291739a, eVar.f291739a) && this.f291740b.equals(eVar.f291740b);
    }

    public final int hashCode() {
        String str = this.f291739a;
        return this.f291740b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
