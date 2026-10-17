package x08;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f301533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f301534c;
    public final String d;
    public final String e;
    public final d f;

    public f(String id10, c type, Instant date, String title, String subtitle, d asset) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f301532a = id10;
        this.f301533b = type;
        this.f301534c = date;
        this.d = title;
        this.e = subtitle;
        this.f = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f301532a, fVar.f301532a) && this.f301533b == fVar.f301533b && Intrinsics.f(this.f301534c, fVar.f301534c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(r6.b.c((this.f301533b.hashCode() + (this.f301532a.hashCode() * 31)) * 31, 31, this.f301534c), 31, this.d), 31, this.e);
    }
}
