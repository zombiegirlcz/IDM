package aui;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f9830a;

    public e(Data airportsList) {
        Intrinsics.checkNotNullParameter(airportsList, "airportsList");
        this.f9830a = airportsList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f9830a, ((e) obj2).f9830a);
    }

    public final int hashCode() {
        return this.f9830a.hashCode();
    }
}
