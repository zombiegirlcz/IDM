package c93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements Serializable {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f22273b = new h("STANDARD_DESIGN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f22274c = new h("PREMIUM_DESIGN");
    public static final h d = new h("PLUS_DESIGN");
    public static final h e = new h("METAL_DESIGN");
    public static final h f = new h("ULTRA_DESIGN");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f22275g = new h("PRIVATE_DESIGN");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f22276h = new h("CHROMATIC");
    public static final h i = new h("CHROMATIC_METAL");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f22277j;
    public static final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f22278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f22279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f22280n;
    public static final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f22281p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f22282q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f22283r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f22284s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f22285t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22286a;

    static {
        new h("PHYSICAL");
        new h("VIRTUAL");
        f22277j = new h("DISPOSABLE");
        k = new h("ACQUIRING");
        new h("SPECIAL_EDITION");
        f22278l = new h("CO_BRANDED_DESIGN");
        f22279m = new h("PROMO");
        f22280n = new h("METALLIC");
        o = new h("PLASTIC");
        f22281p = new h("BRAZIL_LOCAL");
        f22282q = new h("BRAZIL_GLOBAL");
        f22283r = new h("INDIA_LOCAL");
        f22284s = new h("INDIA_GLOBAL");
        f22285t = new h("NUMBERLESS_SUPPORTED");
    }

    public h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f22286a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f22286a, ((h) obj2).f22286a);
    }

    public final int hashCode() {
        return this.f22286a.hashCode();
    }
}
