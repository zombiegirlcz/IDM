package uib;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f280366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f280367b;

    public a(c umbrellaNameType, b statementNameType) {
        Intrinsics.checkNotNullParameter(umbrellaNameType, "umbrellaNameType");
        Intrinsics.checkNotNullParameter(statementNameType, "statementNameType");
        this.f280366a = umbrellaNameType;
        this.f280367b = statementNameType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f280366a == aVar.f280366a && this.f280367b == aVar.f280367b;
    }

    public final int hashCode() {
        return this.f280367b.hashCode() + (this.f280366a.hashCode() * 31);
    }
}
