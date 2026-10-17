package vad;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f287278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f287279c;
    public final boolean d;

    public h(List items, b scannedInterval, b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scannedInterval, "scannedInterval");
        this.f287277a = items;
        this.f287278b = scannedInterval;
        this.f287279c = bVar;
        this.d = z;
    }

    @Override // vad.c
    public final boolean a() {
        return this.d;
    }

    @Override // vad.c
    public final List b() {
        return this.f287277a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f287277a, hVar.f287277a) && Intrinsics.f(this.f287278b, hVar.f287278b) && Intrinsics.f(this.f287279c, hVar.f287279c) && this.d == hVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f287278b.hashCode() + (this.f287277a.hashCode() * 31)) * 31;
        b bVar = this.f287279c;
        return Boolean.hashCode(this.d) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
