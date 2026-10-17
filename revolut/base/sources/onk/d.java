package onk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import ojk.a0;
import ojk.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements cli.j, v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f226954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f226955b;

    public d(Data screenConfig, a0 itemsExtraData) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(itemsExtraData, "itemsExtraData");
        this.f226954a = screenConfig;
        this.f226955b = itemsExtraData;
    }

    public static d c(d dVar, Data screenConfig, a0 itemsExtraData, int i) {
        if ((i & 1) != 0) {
            screenConfig = dVar.f226954a;
        }
        if ((i & 2) != 0) {
            itemsExtraData = dVar.f226955b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(itemsExtraData, "itemsExtraData");
        return new d(screenConfig, itemsExtraData);
    }

    @Override // ojk.v
    public final a0 a() {
        return this.f226955b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f226954a, dVar.f226954a) && Intrinsics.f(this.f226955b, dVar.f226955b);
    }

    public final int hashCode() {
        return this.f226955b.hashCode() + (this.f226954a.hashCode() * 31);
    }
}
