package dtc;

import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends atc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f117427a;

    public o(LinkedHashMap wallets) {
        Intrinsics.checkNotNullParameter(wallets, "wallets");
        this.f117427a = wallets;
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        String str = instance.f272584c;
        String str2 = str != null ? (String) this.f117427a.get(str) : null;
        if (str2 != null) {
            targetCollection.add(str2);
        }
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f117427a.equals(((o) obj2).f117427a);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f117427a.hashCode();
    }
}
