package njf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f216479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f216480b;

    public a(boolean z, Map splitBillsMap) {
        Intrinsics.checkNotNullParameter(splitBillsMap, "splitBillsMap");
        this.f216479a = z;
        this.f216480b = splitBillsMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f216479a == aVar.f216479a && Intrinsics.f(this.f216480b, aVar.f216480b);
    }

    public final int hashCode() {
        return this.f216480b.hashCode() + (Boolean.hashCode(this.f216479a) * 31);
    }
}
