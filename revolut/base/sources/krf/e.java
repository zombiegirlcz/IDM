package krf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mrf.a f188863c;

    public e(String code, String description, mrf.a aVar) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f188861a = code;
        this.f188862b = description;
        this.f188863c = aVar;
    }

    @Override // krf.c
    public final String a() {
        return this.f188862b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f188861a, eVar.f188861a) && Intrinsics.f(this.f188862b, eVar.f188862b) && Intrinsics.f(this.f188863c, eVar.f188863c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f188861a.hashCode() * 31, 31, this.f188862b);
        mrf.a aVar = this.f188863c;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
