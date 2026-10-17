package oz7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f231116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f231117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f231118c;

    public b(List notifications, List pets, i promotion) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        Intrinsics.checkNotNullParameter(pets, "pets");
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        this.f231116a = notifications;
        this.f231117b = pets;
        this.f231118c = promotion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f231116a, bVar.f231116a) && Intrinsics.f(this.f231117b, bVar.f231117b) && Intrinsics.f(this.f231118c, bVar.f231118c);
    }

    public final int hashCode() {
        return this.f231118c.hashCode() + p.a.d(this.f231116a.hashCode() * 31, 31, this.f231117b);
    }
}
