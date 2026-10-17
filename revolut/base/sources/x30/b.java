package x30;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import pkm.e;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f302602h;
    public static final long i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f302604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f302605c;
    public final List d;
    public final c e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f302606g;

    static {
        f0 f0Var = f0.f322471a;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(0L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(0L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
        f302602h = new b(null, null, null, f0Var, null, instantOfEpochMilli, instantOfEpochMilli2);
        b.Companion companion = kotlin.time.b.INSTANCE;
        i = kotlin.time.b.f(kotlin.time.c.g(7, e.DAYS));
    }

    public b(String str, UUID uuid, String str2, List pendingAttachments, c cVar, Instant createdAt, Instant expiresAt) {
        Intrinsics.checkNotNullParameter(pendingAttachments, "pendingAttachments");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        this.f302603a = str;
        this.f302604b = uuid;
        this.f302605c = str2;
        this.d = pendingAttachments;
        this.e = cVar;
        this.f = createdAt;
        this.f302606g = expiresAt;
    }

    public static b a(b bVar, ArrayList arrayList, c cVar, Instant instant, Instant instant2, int i2) {
        String str = bVar.f302603a;
        UUID uuid = bVar.f302604b;
        String str2 = bVar.f302605c;
        List list = arrayList;
        if ((i2 & 8) != 0) {
            list = bVar.d;
        }
        List pendingAttachments = list;
        if ((i2 & 16) != 0) {
            cVar = bVar.e;
        }
        c cVar2 = cVar;
        if ((i2 & 32) != 0) {
            instant = bVar.f;
        }
        Instant createdAt = instant;
        if ((i2 & 64) != 0) {
            instant2 = bVar.f302606g;
        }
        Instant expiresAt = instant2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pendingAttachments, "pendingAttachments");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        return new b(str, uuid, str2, pendingAttachments, cVar2, createdAt, expiresAt);
    }

    public final boolean b() {
        String str = this.f302603a;
        return (str == null || str.length() == 0) && this.f302604b == null && this.d.isEmpty() && this.e == null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f302603a, bVar.f302603a) && Intrinsics.f(this.f302604b, bVar.f302604b) && Intrinsics.f(this.f302605c, bVar.f302605c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f302606g, bVar.f302606g);
    }

    public final int hashCode() {
        String str = this.f302603a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UUID uuid = this.f302604b;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str2 = this.f302605c;
        int iD = p.a.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        c cVar = this.e;
        return this.f302606g.hashCode() + t61.a.g(this.f, (iD + (cVar != null ? cVar.hashCode() : 0)) * 31, 31);
    }
}
