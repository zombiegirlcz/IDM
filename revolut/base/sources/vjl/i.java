package vjl;

import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f289813c;
    public final Instant d;
    public final Instant e;
    public final String f;

    public i(String id10, String name, List consents, Instant createdAt, Instant lastUsedAt, String iconUri) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(lastUsedAt, "lastUsedAt");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        this.f289811a = id10;
        this.f289812b = name;
        this.f289813c = consents;
        this.d = createdAt;
        this.e = lastUsedAt;
        this.f = iconUri;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f289811a, iVar.f289811a) && Intrinsics.f(this.f289812b, iVar.f289812b) && Intrinsics.f(this.f289813c, iVar.f289813c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r6.b.c(r6.b.c(p.a.d(p.a.c(this.f289811a.hashCode() * 31, 31, this.f289812b), 31, this.f289813c), 31, this.d), 31, this.e);
    }
}
