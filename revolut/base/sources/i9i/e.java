package i9i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159883b;

    public e(String id10, String emojiCode) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(emojiCode, "emojiCode");
        this.f159882a = id10;
        this.f159883b = emojiCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f159882a, eVar.f159882a) && Intrinsics.f(this.f159883b, eVar.f159883b);
    }

    public final int hashCode() {
        return this.f159883b.hashCode() + (this.f159882a.hashCode() * 31);
    }
}
