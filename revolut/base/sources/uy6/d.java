package uy6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f284080a;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f284080a, ((d) obj2).f284080a);
    }

    public final int hashCode() {
        return this.f284080a.hashCode();
    }

    public d(Data invoiceSettingsData) {
        Intrinsics.checkNotNullParameter(invoiceSettingsData, "invoiceSettingsData");
        this.f284080a = invoiceSettingsData;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
