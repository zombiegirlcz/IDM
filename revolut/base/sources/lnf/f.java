package lnf;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f197239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f197240b;

    public f(List items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f197239a = headerModel;
        this.f197240b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f197240b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f197239a.equals(fVar.f197239a) && Intrinsics.f(this.f197240b, fVar.f197240b);
    }

    public final int hashCode() {
        return this.f197240b.hashCode() + (this.f197239a.hashCode() * 31);
    }
}
