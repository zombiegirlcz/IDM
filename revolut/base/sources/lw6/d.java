package lw6;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f200414a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f200414a, ((d) obj2).f200414a);
    }

    public final int hashCode() {
        return this.f200414a.hashCode();
    }

    public d(Data proVaultsData) {
        Intrinsics.checkNotNullParameter(proVaultsData, "proVaultsData");
        this.f200414a = proVaultsData;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
