package taa;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f269299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f269300b;

    public i(ArrayList items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f269299a = items;
        this.f269300b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f269299a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f269299a.equals(iVar.f269299a) && this.f269300b.equals(iVar.f269300b);
    }

    public final int hashCode() {
        return this.f269300b.hashCode() + (this.f269299a.hashCode() * 31);
    }
}
