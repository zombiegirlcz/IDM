package s69;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260189c;
    public final Instant d;
    public final String e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f260190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f260191h;

    public v(String id10, String title, String description, Instant timestamp, String detailsDeeplink, s sVar, t invitation, String state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(detailsDeeplink, "detailsDeeplink");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f260187a = id10;
        this.f260188b = title;
        this.f260189c = description;
        this.d = timestamp;
        this.e = detailsDeeplink;
        this.f = sVar;
        this.f260190g = invitation;
        this.f260191h = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f260187a, vVar.f260187a) && Intrinsics.f(this.f260188b, vVar.f260188b) && Intrinsics.f(this.f260189c, vVar.f260189c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f260190g, vVar.f260190g) && Intrinsics.f(this.f260191h, vVar.f260191h);
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.g(this.d, p.a.c(p.a.c(this.f260187a.hashCode() * 31, 31, this.f260188b), 31, this.f260189c), 31), 31, this.e);
        s sVar = this.f;
        return this.f260191h.hashCode() + ((this.f260190g.hashCode() + ((iC + (sVar == null ? 0 : sVar.hashCode())) * 31)) * 31);
    }
}
