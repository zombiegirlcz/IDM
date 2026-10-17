package j2a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170778c;
    public final k d;

    public /* synthetic */ c(int i, String str, String str2, String str3, k kVar) {
        if (3 != (i & 3)) {
            j1.f(a.f170775a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170776a = str;
        this.f170777b = str2;
        if ((i & 4) == 0) {
            this.f170778c = null;
        } else {
            this.f170778c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = kVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f170776a, cVar.f170776a) && Intrinsics.f(this.f170777b, cVar.f170777b) && Intrinsics.f(this.f170778c, cVar.f170778c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f170776a.hashCode() * 31, 31, this.f170777b);
        String str = this.f170778c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.d;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public c(String id10, String thumbnailUrl, String str, k kVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        this.f170776a = id10;
        this.f170777b = thumbnailUrl;
        this.f170778c = str;
        this.d = kVar;
    }
}
