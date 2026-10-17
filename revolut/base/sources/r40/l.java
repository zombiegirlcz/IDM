package r40;

import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f251345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f251346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f251347c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f251348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f251349h;

    public l(UUID chatId, UUID uuid, boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        n buttons = new n(0);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f251345a = chatId;
        this.f251346b = uuid;
        this.f251347c = z;
        this.d = z3;
        this.e = z4;
        this.f = z6;
        this.f251348g = z11;
        this.f251349h = buttons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f251345a, lVar.f251345a) && Intrinsics.f(this.f251346b, lVar.f251346b) && this.f251347c == lVar.f251347c && this.d == lVar.d && this.e == lVar.e && this.f == lVar.f && this.f251348g == lVar.f251348g && Intrinsics.f(this.f251349h, lVar.f251349h);
    }

    public final int hashCode() {
        int iHashCode = this.f251345a.hashCode() * 31;
        UUID uuid = this.f251346b;
        return this.f251349h.hashCode() + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31, 31, this.f251347c), 31, this.d), 31, this.e), 31, this.f), 31, this.f251348g);
    }
}
