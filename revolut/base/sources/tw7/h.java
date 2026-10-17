package tw7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f274934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f274935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.d f274936c;

    public h(Data tilesContainer, boolean z, hha.d dVar) {
        Intrinsics.checkNotNullParameter(tilesContainer, "tilesContainer");
        this.f274934a = tilesContainer;
        this.f274935b = z;
        this.f274936c = dVar;
    }

    public static h a(h hVar, Data tilesContainer, boolean z, hha.d dVar, int i) {
        if ((i & 1) != 0) {
            tilesContainer = hVar.f274934a;
        }
        if ((i & 2) != 0) {
            z = hVar.f274935b;
        }
        if ((i & 4) != 0) {
            dVar = hVar.f274936c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(tilesContainer, "tilesContainer");
        return new h(tilesContainer, z, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f274934a, hVar.f274934a) && this.f274935b == hVar.f274935b && Intrinsics.f(this.f274936c, hVar.f274936c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f274934a.hashCode() * 31, 31, this.f274935b);
        hha.d dVar = this.f274936c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
