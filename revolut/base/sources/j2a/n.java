package j2a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170793c;
    public final String d;
    public final k e;

    public /* synthetic */ n(int i, String str, String str2, String str3, String str4, k kVar) {
        if (7 != (i & 7)) {
            j1.f(l.f170790a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170791a = str;
        this.f170792b = str2;
        this.f170793c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = kVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f170791a, nVar.f170791a) && Intrinsics.f(this.f170792b, nVar.f170792b) && Intrinsics.f(this.f170793c, nVar.f170793c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f170791a.hashCode() * 31, 31, this.f170792b), 31, this.f170793c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.e;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public n(String id10, String videoUrl, String thumbnailUrl, String str, k kVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        this.f170791a = id10;
        this.f170792b = videoUrl;
        this.f170793c = thumbnailUrl;
        this.d = str;
        this.e = kVar;
    }
}
