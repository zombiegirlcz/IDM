package zli;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f323280c;
    public final LinkedHashMap d;

    public b(String rawUrl, String normalizedUrl, LinkedHashMap queryParameters, List pathSegments) {
        Intrinsics.checkNotNullParameter(rawUrl, "rawUrl");
        Intrinsics.checkNotNullParameter(normalizedUrl, "normalizedUrl");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        this.f323278a = rawUrl;
        this.f323279b = normalizedUrl;
        this.f323280c = pathSegments;
        this.d = queryParameters;
    }

    public final String a() {
        od0.a aVar = od0.a.f224253a;
        boolean zF = od0.a.f();
        String str = this.f323279b;
        String str2 = this.f323278a;
        return zF ? j6.a.s("Deeplink(raw=", str2, ", normalized=", str, ")") : j6.a.s("Deeplink(raw=", d0m.b.a(str2), ", normalized=", d0m.b.a(str), ")");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        if (!Intrinsics.f(this.f323278a, bVar.f323278a) || !Intrinsics.f(this.f323279b, bVar.f323279b) || !Intrinsics.f(this.f323280c, bVar.f323280c)) {
            return false;
        }
        LinkedHashMap linkedHashMap = bVar.d;
        e eVar = f.Companion;
        return this.d.equals(linkedHashMap);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f323278a.hashCode() * 31, 31, this.f323279b), 31, this.f323280c);
        e eVar = f.Companion;
        return this.d.hashCode() + iD;
    }
}
