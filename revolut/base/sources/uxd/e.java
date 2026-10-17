package uxd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f283982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f283983b;

    public e(aim.e items, c headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f283982a = items;
        this.f283983b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f283982a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f283982a, eVar.f283982a) && Intrinsics.f(this.f283983b, eVar.f283983b);
    }

    public final int hashCode() {
        return this.f283983b.hashCode() + (this.f283982a.hashCode() * 31);
    }
}
