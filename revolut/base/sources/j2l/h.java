package j2l;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f170914c;
    public final List d;

    public h(String title, String str, aw0.i iVar, f0 items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f170912a = title;
        this.f170913b = str;
        this.f170914c = iVar;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f170912a, hVar.f170912a) && Intrinsics.f(this.f170913b, hVar.f170913b) && Intrinsics.f(this.f170914c, hVar.f170914c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f170912a.hashCode() * 31;
        String str = this.f170913b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        aw0.i iVar = this.f170914c;
        return this.d.hashCode() + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
