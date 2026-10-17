package gei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f143300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f143301c;
    public final d d;
    public final b e;

    public a(String id10, f state, e mandatoryLevel, d content, b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mandatoryLevel, "mandatoryLevel");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f143299a = id10;
        this.f143300b = state;
        this.f143301c = mandatoryLevel;
        this.d = content;
        this.e = bVar;
    }

    public static a a(a aVar, f state) {
        String id10 = aVar.f143299a;
        e mandatoryLevel = aVar.f143301c;
        d content = aVar.d;
        b bVar = aVar.e;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mandatoryLevel, "mandatoryLevel");
        Intrinsics.checkNotNullParameter(content, "content");
        return new a(id10, state, mandatoryLevel, content, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f143299a, aVar.f143299a) && this.f143300b == aVar.f143300b && this.f143301c == aVar.f143301c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f143301c.hashCode() + ((this.f143300b.hashCode() + (this.f143299a.hashCode() * 31)) * 31)) * 31)) * 31;
        b bVar = this.e;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
