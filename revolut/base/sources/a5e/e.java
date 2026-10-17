package a5e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1365c;
    public final d d;

    public e(List underlyingAssets, List keyDrivers, List pages, d dVar) {
        Intrinsics.checkNotNullParameter(underlyingAssets, "underlyingAssets");
        Intrinsics.checkNotNullParameter(keyDrivers, "keyDrivers");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f1363a = underlyingAssets;
        this.f1364b = keyDrivers;
        this.f1365c = pages;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f1363a, eVar.f1363a) && Intrinsics.f(this.f1364b, eVar.f1364b) && Intrinsics.f(this.f1365c, eVar.f1365c) && this.d == eVar.d;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f1363a.hashCode() * 31, 31, this.f1364b), 31, this.f1365c);
        d dVar = this.d;
        return iD + (dVar == null ? 0 : dVar.hashCode());
    }
}
