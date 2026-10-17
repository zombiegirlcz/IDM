package zyc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f326424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f326425b;

    public q(l navBarModel, ArrayList items) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f326424a = navBarModel;
        this.f326425b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f326425b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f326424a.equals(qVar.f326424a) && this.f326425b.equals(qVar.f326425b);
    }

    public final int hashCode() {
        return this.f326425b.hashCode() + (this.f326424a.hashCode() * 31);
    }
}
