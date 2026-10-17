package a2l;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f905c;

    public h(String str, c cVar, ArrayList partners) {
        Intrinsics.checkNotNullParameter(partners, "partners");
        this.f903a = str;
        this.f904b = cVar;
        this.f905c = partners;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f903a, hVar.f903a) && Intrinsics.f(this.f904b, hVar.f904b) && this.f905c.equals(hVar.f905c);
    }

    public final int hashCode() {
        String str = this.f903a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        c cVar = this.f904b;
        return this.f905c.hashCode() + ((iHashCode + (cVar != null ? cVar.f896a.hashCode() : 0)) * 31);
    }
}
