package zl1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f323156a;

    public a(Data settingsData) {
        Intrinsics.checkNotNullParameter(settingsData, "settingsData");
        this.f323156a = settingsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f323156a, ((a) obj2).f323156a);
    }

    public final int hashCode() {
        return this.f323156a.hashCode();
    }
}
