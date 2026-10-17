package qmg;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f247825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.m f247826b;

    public c(List items, lw0.m mVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f247825a = items;
        this.f247826b = mVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f247825a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f247825a, cVar.f247825a) && Intrinsics.f(this.f247826b, cVar.f247826b);
    }

    public final int hashCode() {
        int iHashCode = this.f247825a.hashCode() * 31;
        lw0.m mVar = this.f247826b;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }
}
