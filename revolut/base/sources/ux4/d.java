package ux4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283867c;
    public final String d;
    public final boolean e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f283868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f283869h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f283870j;

    static {
        new d("", "Default", "Default", "", false, h.ORIGINAL, g.CREATED, 0L, 0L, f.PDF);
    }

    public d(String id10, String name, String displayName, String url2, boolean z, h type, g state, long j2, Long l2, f fileType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        this.f283865a = id10;
        this.f283866b = name;
        this.f283867c = displayName;
        this.d = url2;
        this.e = z;
        this.f = type;
        this.f283868g = state;
        this.f283869h = j2;
        this.i = l2;
        this.f283870j = fileType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f283865a, dVar.f283865a) && Intrinsics.f(this.f283866b, dVar.f283866b) && Intrinsics.f(this.f283867c, dVar.f283867c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && this.f283868g == dVar.f283868g && this.f283869h == dVar.f283869h && Intrinsics.f(this.i, dVar.i) && this.f283870j == dVar.f283870j;
    }

    public final int hashCode() {
        int iC = a0.d.c((this.f283868g.hashCode() + ((this.f.hashCode() + j6.a.c(p.a.c(p.a.c(p.a.c(this.f283865a.hashCode() * 31, 31, this.f283866b), 31, this.f283867c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.f283869h);
        Long l2 = this.i;
        return this.f283870j.hashCode() + ((iC + (l2 == null ? 0 : l2.hashCode())) * 31);
    }
}
