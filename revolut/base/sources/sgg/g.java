package sgg;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f262654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f262655b;

    public g(List items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f262654a = items;
        this.f262655b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f262654a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f262654a.equals(gVar.f262654a) && this.f262655b.equals(gVar.f262655b);
    }

    public final int hashCode() {
        return this.f262655b.hashCode() + (this.f262654a.hashCode() * 31);
    }
}
