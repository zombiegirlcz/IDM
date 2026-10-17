package fv3;

import ft3.j1;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138319b;

    public c(List pluginNames, List productTypes) {
        Intrinsics.checkNotNullParameter(pluginNames, "pluginNames");
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
        this.f138318a = pluginNames;
        this.f138319b = productTypes;
    }

    @Override // fv3.b
    public final List a() {
        return this.f138319b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f138318a, cVar.f138318a) && Intrinsics.f(this.f138319b, cVar.f138319b);
    }

    public final int hashCode() {
        return this.f138319b.hashCode() + (this.f138318a.hashCode() * 31);
    }

    public /* synthetic */ c(ks3.b bVar) {
        this(bVar, d.v0(j1.values()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(ks3.b pluginName, List productTypes) {
        this(u.c(pluginName), productTypes);
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(ks3.b pluginName, j1 productType) {
        this(u.c(pluginName), u.c(productType));
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(productType, "productType");
    }
}
