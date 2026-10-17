package pi5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f236433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f236434c;

    public h(String id10, int i, d learnMoreLink) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(learnMoreLink, "learnMoreLink");
        this.f236432a = id10;
        this.f236433b = i;
        this.f236434c = learnMoreLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f236432a, hVar.f236432a) && this.f236433b == hVar.f236433b && this.f236434c == hVar.f236434c;
    }

    public final int hashCode() {
        return this.f236434c.hashCode() + j6.a.b(this.f236433b, this.f236432a.hashCode() * 31, 31);
    }
}
