package sh1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f263379b;

    public m(String name, String code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f263378a = name;
        this.f263379b = code;
    }

    public final String a() {
        return this.f263379b;
    }

    public final String b() {
        return this.f263378a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f263378a, mVar.f263378a) && Intrinsics.f(this.f263379b, mVar.f263379b);
    }

    public final int hashCode() {
        return this.f263379b.hashCode() + (this.f263378a.hashCode() * 31);
    }
}
