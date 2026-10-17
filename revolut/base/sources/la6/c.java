package la6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193325c;
    public final String d;
    public final List e;
    public final boolean f;

    public c(String id10, String title, List charities, String description, String bannerUrl, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(bannerUrl, "bannerUrl");
        Intrinsics.checkNotNullParameter(charities, "charities");
        this.f193323a = id10;
        this.f193324b = title;
        this.f193325c = description;
        this.d = bannerUrl;
        this.e = charities;
        this.f = z;
    }

    public final String a() {
        return this.d;
    }

    public final List b() {
        return this.e;
    }

    public final String c() {
        return this.f193325c;
    }

    public final boolean d() {
        return this.f;
    }

    public final String e() {
        return this.f193323a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f193323a, cVar.f193323a) && Intrinsics.f(this.f193324b, cVar.f193324b) && Intrinsics.f(this.f193325c, cVar.f193325c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f;
    }

    public final String f() {
        return this.f193324b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + p.a.d(p.a.c(p.a.c(p.a.c(this.f193323a.hashCode() * 31, 31, this.f193324b), 31, this.f193325c), 31, this.d), 31, this.e);
    }
}
