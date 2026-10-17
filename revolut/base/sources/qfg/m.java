package qfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f245344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f245345c;
    public final String d;

    public m(String id10, String str, long j2, long j3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f245343a = id10;
        this.f245344b = j2;
        this.f245345c = j3;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f245343a, mVar.f245343a) && this.f245344b == mVar.f245344b && this.f245345c == mVar.f245345c && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(this.f245343a.hashCode() * 31, 31, this.f245344b), 31, this.f245345c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
