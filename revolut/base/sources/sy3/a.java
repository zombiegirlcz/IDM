package sy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f266605c;

    public a(String id10, String title, b mode) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f266603a = id10;
        this.f266604b = title;
        this.f266605c = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f266603a, aVar.f266603a) && Intrinsics.f(this.f266604b, aVar.f266604b) && this.f266605c == aVar.f266605c;
    }

    public final int hashCode() {
        return this.f266605c.hashCode() + p.a.c(this.f266603a.hashCode() * 31, 31, this.f266604b);
    }
}
