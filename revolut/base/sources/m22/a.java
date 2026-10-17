package m22;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f201679a;

    public a(Data items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f201679a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f201679a, ((a) obj2).f201679a);
    }

    public final int hashCode() {
        return this.f201679a.hashCode();
    }
}
