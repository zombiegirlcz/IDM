package m23;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f201687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e13.a f201688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f201689c;
    public final boolean d;

    public c(b country, e13.a flowType, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f201687a = country;
        this.f201688b = flowType;
        this.f201689c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f201687a == cVar.f201687a && this.f201688b == cVar.f201688b && this.f201689c == cVar.f201689c && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c((this.f201688b.hashCode() + (this.f201687a.hashCode() * 31)) * 31, 31, this.f201689c);
    }
}
