package z79;

import h30.l;
import io3.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f319950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f319951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f319952c;

    public a(b blockingType, d blockingPocket, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(blockingType, "blockingType");
        Intrinsics.checkNotNullParameter(blockingPocket, "blockingPocket");
        this.f319950a = blockingType;
        this.f319951b = blockingPocket;
        this.f319952c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f319950a == aVar.f319950a && Intrinsics.f(this.f319951b, aVar.f319951b) && Intrinsics.f(this.f319952c, aVar.f319952c);
    }

    public final int hashCode() {
        int iG = l.g(this.f319951b, this.f319950a.hashCode() * 31, 31);
        dj0.d dVar = this.f319952c;
        return iG + (dVar == null ? 0 : dVar.hashCode());
    }
}
