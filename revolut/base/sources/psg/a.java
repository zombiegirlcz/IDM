package psg;

import fo3.e;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f239486c;
    public final b d;

    public a(String id10, String ownerId, e state, b role) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(role, "role");
        this.f239484a = id10;
        this.f239485b = ownerId;
        this.f239486c = state;
        this.d = role;
    }

    public final String a() {
        return this.f239485b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f239484a, aVar.f239484a) && Intrinsics.f(this.f239485b, aVar.f239485b) && this.f239486c == aVar.f239486c && this.d == aVar.d;
    }

    public final String getId() {
        return this.f239484a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f239486c.hashCode() + p.a.c(this.f239484a.hashCode() * 31, 31, this.f239485b)) * 31);
    }
}
