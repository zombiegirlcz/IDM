package fv3;

import ft3.j1;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ks3.a f138316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138317b;

    public a(ks3.a pluginState) {
        List productTypes = d.v0(j1.values());
        Intrinsics.checkNotNullParameter(pluginState, "pluginState");
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
        this.f138316a = pluginState;
        this.f138317b = productTypes;
    }

    @Override // fv3.b
    public final List a() {
        return this.f138317b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f138316a == aVar.f138316a && Intrinsics.f(this.f138317b, aVar.f138317b);
    }

    public final int hashCode() {
        return this.f138317b.hashCode() + (this.f138316a.hashCode() * 31);
    }
}
