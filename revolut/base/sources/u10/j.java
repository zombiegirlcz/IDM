package u10;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f276293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f276294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f276295c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f276296g;

    public j(UUID id10, c0 feedType, UUID uuid, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f276293a = id10;
        this.f276294b = feedType;
        this.f276295c = uuid;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f276296g = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f276293a, jVar.f276293a) && this.f276294b == jVar.f276294b && Intrinsics.f(this.f276295c, jVar.f276295c) && this.d == jVar.d && this.e == jVar.e && this.f == jVar.f && this.f276296g == jVar.f276296g;
    }

    public final int hashCode() {
        int iHashCode = (this.f276294b.hashCode() + (this.f276293a.hashCode() * 31)) * 31;
        UUID uuid = this.f276295c;
        return Boolean.hashCode(this.f276296g) + j6.a.c(j6.a.c(j6.a.c((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
