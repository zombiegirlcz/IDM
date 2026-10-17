package rv3;

import ht3.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f257692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ht3.a f257693b;

    public c(d buttonType, ht3.a action) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f257692a = buttonType;
        this.f257693b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f257692a == cVar.f257692a && Intrinsics.f(this.f257693b, cVar.f257693b);
    }

    public final int hashCode() {
        return this.f257693b.hashCode() + (this.f257692a.hashCode() * 31);
    }
}
