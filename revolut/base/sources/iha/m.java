package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f161339c;

    public m(i action, String str, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f161337a = str;
        this.f161338b = label;
        this.f161339c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f161337a, mVar.f161337a) && Intrinsics.f(this.f161338b, mVar.f161338b) && Intrinsics.f(this.f161339c, mVar.f161339c);
    }

    public final int hashCode() {
        String str = this.f161337a;
        return this.f161339c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f161338b);
    }
}
