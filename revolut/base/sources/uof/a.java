package uof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f281644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f281645b;

    public a(dj0.d dVar, b bVar) {
        this.f281644a = dVar;
        this.f281645b = bVar;
    }

    public final b a() {
        return this.f281645b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f281644a, aVar.f281644a) && Intrinsics.f(this.f281645b, aVar.f281645b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f281644a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        b bVar = this.f281645b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
