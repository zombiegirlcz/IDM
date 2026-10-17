package dk9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f115479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f115480b;

    public s(r rVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f115479a = rVar;
        this.f115480b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f115480b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f115479a, sVar.f115479a) && Intrinsics.f(this.f115480b, sVar.f115480b);
    }

    public final int hashCode() {
        r rVar = this.f115479a;
        return this.f115480b.hashCode() + ((rVar == null ? 0 : rVar.hashCode()) * 31);
    }
}
