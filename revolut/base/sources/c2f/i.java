package c2f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.m f20773b;

    public i(List items, lw0.m headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f20772a = items;
        this.f20773b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f20772a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f20772a, iVar.f20772a) && Intrinsics.f(this.f20773b, iVar.f20773b);
    }

    public final int hashCode() {
        return this.f20773b.hashCode() + (this.f20772a.hashCode() * 31);
    }
}
