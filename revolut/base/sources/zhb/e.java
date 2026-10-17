package zhb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f322385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f322386b;

    public e(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f322385a = items;
        this.f322386b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f322385a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f322385a, eVar.f322385a) && this.f322386b == eVar.f322386b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322386b) + (this.f322385a.hashCode() * 31);
    }
}
