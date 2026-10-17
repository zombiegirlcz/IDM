package p8f;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f234150a;

    public e(Data allocationItemsData) {
        Intrinsics.checkNotNullParameter(allocationItemsData, "allocationItemsData");
        this.f234150a = allocationItemsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f234150a, ((e) obj2).f234150a);
    }

    public final int hashCode() {
        return this.f234150a.hashCode();
    }
}
