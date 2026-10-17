package yw6;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f317336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f317337b;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f317336a, dVar.f317336a) && Intrinsics.f(this.f317337b, dVar.f317337b);
    }

    public final int hashCode() {
        return this.f317337b.hashCode() + (this.f317336a.hashCode() * 31);
    }

    public d(Data pluginFee, Data userCompany) {
        Intrinsics.checkNotNullParameter(pluginFee, "pluginFee");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f317336a = pluginFee;
        this.f317337b = userCompany;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
