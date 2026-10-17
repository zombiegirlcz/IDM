package wwi;

import kotlin.jvm.internal.Intrinsics;
import wwi.f;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f300678b;

    public h() {
        this(0);
    }

    public static h a(h hVar, String searchQuery, f contentData, int i) {
        if ((i & 1) != 0) {
            searchQuery = hVar.f300677a;
        }
        if ((i & 2) != 0) {
            contentData = hVar.f300678b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        return new h(searchQuery, contentData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f300677a, hVar.f300677a) && Intrinsics.f(this.f300678b, hVar.f300678b);
    }

    public final int hashCode() {
        return this.f300678b.hashCode() + (this.f300677a.hashCode() * 31);
    }

    public h(String searchQuery, f contentData) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f300677a = searchQuery;
        this.f300678b = contentData;
    }

    public /* synthetic */ h(int i) {
        this("", new f.a(0));
    }
}
