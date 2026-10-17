package u10;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f276279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f276280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f276281c;
    public final UUID d;
    public final boolean e;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f276279a == gVar.f276279a && Intrinsics.f(this.f276280b, gVar.f276280b) && this.f276281c == gVar.f276281c && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f276279a) * 31;
        UUID uuid = this.f276280b;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        c0 c0Var = this.f276281c;
        int iHashCode3 = (iHashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        UUID uuid2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (uuid2 != null ? uuid2.hashCode() : 0)) * 31);
    }

    public g(long j2, UUID uuid, c0 c0Var, UUID uuid2, boolean z) {
        this.f276279a = j2;
        this.f276280b = uuid;
        this.f276281c = c0Var;
        this.d = uuid2;
        this.e = z;
    }

    public /* synthetic */ g(UUID uuid, c0 c0Var, UUID uuid2, int i) {
        this(0L, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? null : c0Var, (i & 8) != 0 ? null : uuid2, (i & 16) == 0);
    }
}
