package uq5;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f282107a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f282107a, ((d) obj2).f282107a);
    }

    public final int hashCode() {
        return this.f282107a.hashCode();
    }

    public d(Data limitsData) {
        Intrinsics.checkNotNullParameter(limitsData, "limitsData");
        this.f282107a = limitsData;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
