package i58;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j38.a f158782a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f158782a, ((a) obj2).f158782a);
    }

    public final int hashCode() {
        j38.a aVar = this.f158782a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public a(j38.a aVar) {
        this.f158782a = aVar;
    }
}
