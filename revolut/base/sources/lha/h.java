package lha;

import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f195210c;
    public final k d;
    public final Instant e;
    public final boolean f;

    public h(String id10, String familyId, k member, k inviter, Instant expirationDate, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(familyId, "familyId");
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f195208a = id10;
        this.f195209b = familyId;
        this.f195210c = member;
        this.d = inviter;
        this.e = expirationDate;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f195208a, hVar.f195208a) && Intrinsics.f(this.f195209b, hVar.f195209b) && Intrinsics.f(this.f195210c, hVar.f195210c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + r6.b.c((this.d.hashCode() + ((this.f195210c.hashCode() + p.a.c(this.f195208a.hashCode() * 31, 31, this.f195209b)) * 31)) * 31, 31, this.e);
    }
}
