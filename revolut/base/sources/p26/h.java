package p26;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f232085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9j.a f232086b;

    public h(List items, p9j.a headerData) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        this.f232085a = items;
        this.f232086b = headerData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f232085a, hVar.f232085a) && Intrinsics.f(this.f232086b, hVar.f232086b);
    }

    public final int hashCode() {
        return this.f232086b.hashCode() + (this.f232085a.hashCode() * 31);
    }
}
