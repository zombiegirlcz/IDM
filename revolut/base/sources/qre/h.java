package qre;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f248725c;
    public final String d;
    public final long e;
    public final String f;

    public /* synthetic */ h(long j2, int i, String str, String str2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            j1.f(f.f248722a.getDescriptor(), i, 63);
            throw null;
        }
        this.f248723a = str;
        this.f248724b = str2;
        this.f248725c = str3;
        this.d = str4;
        this.e = j2;
        this.f = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f248723a, hVar.f248723a) && Intrinsics.f(this.f248724b, hVar.f248724b) && Intrinsics.f(this.f248725c, hVar.f248725c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f248723a.hashCode() * 31, 31, this.f248724b);
        String str = this.f248725c;
        return this.f.hashCode() + a0.d.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public h(long j2, String type, String name, String contentType, String url2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f248723a = type;
        this.f248724b = name;
        this.f248725c = null;
        this.d = contentType;
        this.e = j2;
        this.f = url2;
    }
}
