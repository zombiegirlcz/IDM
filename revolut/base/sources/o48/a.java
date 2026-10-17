package o48;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f222166a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f222166a, ((a) obj2).f222166a);
    }

    public final int hashCode() {
        wi0.b bVar = this.f222166a;
        if (bVar == null) {
            return 0;
        }
        return bVar.f297794a.hashCode();
    }

    public a(wi0.b bVar) {
        this.f222166a = bVar;
    }
}
