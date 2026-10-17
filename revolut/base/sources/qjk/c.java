package qjk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import ojk.a0;
import ojk.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements cli.j, v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f246896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f246897b;

    public c(Data bottomSheetConfig, a0 itemsExtraData) {
        Intrinsics.checkNotNullParameter(bottomSheetConfig, "bottomSheetConfig");
        Intrinsics.checkNotNullParameter(itemsExtraData, "itemsExtraData");
        this.f246896a = bottomSheetConfig;
        this.f246897b = itemsExtraData;
    }

    public static c c(c cVar, Data bottomSheetConfig, a0 itemsExtraData, int i) {
        if ((i & 1) != 0) {
            bottomSheetConfig = cVar.f246896a;
        }
        if ((i & 2) != 0) {
            itemsExtraData = cVar.f246897b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(bottomSheetConfig, "bottomSheetConfig");
        Intrinsics.checkNotNullParameter(itemsExtraData, "itemsExtraData");
        return new c(bottomSheetConfig, itemsExtraData);
    }

    @Override // ojk.v
    public final a0 a() {
        return this.f246897b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f246896a, cVar.f246896a) && Intrinsics.f(this.f246897b, cVar.f246897b);
    }

    public final int hashCode() {
        return this.f246897b.hashCode() + (this.f246896a.hashCode() * 31);
    }
}
