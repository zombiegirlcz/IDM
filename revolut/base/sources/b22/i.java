package b22;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f11861b;

    public i(aw0.e footerModel, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        this.f11860a = items;
        this.f11861b = footerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f11860a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f11860a.equals(iVar.f11860a) && this.f11861b.equals(iVar.f11861b);
    }

    public final int hashCode() {
        return this.f11861b.hashCode() + (this.f11860a.hashCode() * 31);
    }
}
