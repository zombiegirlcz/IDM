package zz1;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final h d = new h("AANI");
    public static final h e = new h("BLIK");
    public static final h f = new h("BREB");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f326486g = new h("IRIS");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f326487h = new h("IRIS_PRO");
    public static final h i = new h("PAY_ID");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f326488j = new h("PIX");
    public static final h k = new h("GIRO_ALIAS");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f326489l = new h("SPIN");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f326490m = new h("UPI");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f326491n = new h("WERO");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f326493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f326494c;

    public h(String query) {
        String path = query.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(path, "toLowerCase(...)");
        Intrinsics.checkNotNullParameter(query, "name");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f326492a = query;
        this.f326493b = query;
        this.f326494c = path;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f326492a, hVar.f326492a) && Intrinsics.f(this.f326493b, hVar.f326493b) && Intrinsics.f(this.f326494c, hVar.f326494c);
    }

    public final int hashCode() {
        return this.f326494c.hashCode() + p.a.c(this.f326492a.hashCode() * 31, 31, this.f326493b);
    }
}
