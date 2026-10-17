package sue;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265741c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final que.a f265742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f265743h;

    public /* synthetic */ j(int i, String str, String str2, String str3, String str4, String str5, Long l2, que.a aVar, h hVar) {
        if (255 != (i & 255)) {
            j1.f(e.f265735a.getDescriptor(), i, 255);
            throw null;
        }
        this.f265739a = str;
        this.f265740b = str2;
        this.f265741c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l2;
        this.f265742g = aVar;
        this.f265743h = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f265739a, jVar.f265739a) && Intrinsics.f(this.f265740b, jVar.f265740b) && Intrinsics.f(this.f265741c, jVar.f265741c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f265742g, jVar.f265742g) && Intrinsics.f(this.f265743h, jVar.f265743h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f265739a.hashCode() * 31, 31, this.f265740b), 31, this.f265741c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        que.a aVar = this.f265742g;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        h hVar = this.f265743h;
        return iHashCode4 + (hVar != null ? hVar.hashCode() : 0);
    }
}
