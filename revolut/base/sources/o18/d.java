package o18;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x08.c f221348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f221349c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x08.b f221350g;

    public d(String id10, x08.c type, Instant date, String title, String subtitle, String ref2, x08.b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f221347a = id10;
        this.f221348b = type;
        this.f221349c = date;
        this.d = title;
        this.e = subtitle;
        this.f = ref2;
        this.f221350g = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f221347a, dVar.f221347a) && this.f221348b == dVar.f221348b && Intrinsics.f(this.f221349c, dVar.f221349c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f221350g, dVar.f221350g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(r6.b.c((this.f221348b.hashCode() + (this.f221347a.hashCode() * 31)) * 31, 31, this.f221349c), 31, this.d), 31, this.e), 31, this.f);
        x08.b bVar = this.f221350g;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
