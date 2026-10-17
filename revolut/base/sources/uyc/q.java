package uyc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f284147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f284148b;

    public q(l nextButtonModel, List items) {
        Intrinsics.checkNotNullParameter(nextButtonModel, "nextButtonModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f284147a = nextButtonModel;
        this.f284148b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f284148b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f284147a, qVar.f284147a) && Intrinsics.f(this.f284148b, qVar.f284148b);
    }

    public final int hashCode() {
        return this.f284148b.hashCode() + (this.f284147a.hashCode() * 31);
    }
}
