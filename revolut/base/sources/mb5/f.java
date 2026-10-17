package mb5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements Serializable {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f204136c;
    public final String d;
    public final o e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f204137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f204138h;

    static {
        new f("", "Default", "Default", "", o.ORIGINAL, n.CREATED, 0L, m.PDF);
    }

    public f(String id10, String name, String displayName, String url2, o type, n state, long j2, m fileType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        this.f204134a = id10;
        this.f204135b = name;
        this.f204136c = displayName;
        this.d = url2;
        this.e = type;
        this.f = state;
        this.f204137g = j2;
        this.f204138h = fileType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f204134a, fVar.f204134a) && Intrinsics.f(this.f204135b, fVar.f204135b) && Intrinsics.f(this.f204136c, fVar.f204136c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f && this.f204137g == fVar.f204137g && this.f204138h == fVar.f204138h;
    }

    public final int hashCode() {
        return this.f204138h.hashCode() + a0.d.c((this.f.hashCode() + ((this.e.hashCode() + j6.a.c(p.a.c(p.a.c(p.a.c(this.f204134a.hashCode() * 31, 31, this.f204135b), 31, this.f204136c), 31, this.d), 31, false)) * 31)) * 31, 31, this.f204137g);
    }
}
