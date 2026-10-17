package qf9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f245275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f245276b;

    public a(List formData, List finderItems) {
        Intrinsics.checkNotNullParameter(formData, "formData");
        Intrinsics.checkNotNullParameter(finderItems, "finderItems");
        this.f245275a = formData;
        this.f245276b = finderItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f245275a, aVar.f245275a) && Intrinsics.f(this.f245276b, aVar.f245276b);
    }

    public final int hashCode() {
        return this.f245276b.hashCode() + (this.f245275a.hashCode() * 31);
    }
}
