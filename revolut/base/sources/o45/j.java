package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222068c;
    public final String d;

    public /* synthetic */ j(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(h.f222062a.getDescriptor(), i, 15);
            throw null;
        }
        this.f222066a = str;
        this.f222067b = str2;
        this.f222068c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f222066a, jVar.f222066a) && Intrinsics.f(this.f222067b, jVar.f222067b) && Intrinsics.f(this.f222068c, jVar.f222068c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f222066a.hashCode() * 31, 31, this.f222067b), 31, this.f222068c);
    }

    public j(String id10, String ownerId, String state, String cardId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f222066a = id10;
        this.f222067b = ownerId;
        this.f222068c = state;
        this.d = cardId;
    }
}
