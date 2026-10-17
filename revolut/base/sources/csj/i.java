package csj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f108482a;

    public i(Data categoriesBudgetsData) {
        Intrinsics.checkNotNullParameter(categoriesBudgetsData, "categoriesBudgetsData");
        this.f108482a = categoriesBudgetsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f108482a, ((i) obj2).f108482a);
    }

    public final int hashCode() {
        return this.f108482a.hashCode();
    }
}
