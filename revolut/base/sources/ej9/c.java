package ej9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f126792a;

    public c(ue0.c storage, int i) {
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f126792a = storage;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f126792a = storage;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f126792a = storage;
                break;
            default:
                Intrinsics.checkNotNullParameter(storage, "storage");
                this.f126792a = storage;
                break;
        }
    }

    public static String a(ai9.h hVar) {
        if (hVar instanceof ai9.d) {
            return "AccountDetails";
        }
        if (hVar instanceof ai9.e) {
            return j6.a.q("InstalmentDetails:", ((ai9.e) hVar).f5221a);
        }
        if (hVar instanceof ai9.f) {
            return "MaxPurchaseAmountExplainer";
        }
        if (hVar instanceof ai9.g) {
            return "PurchaseList";
        }
        throw new NoWhenBranchMatchedException();
    }

    public c(ue0.c storage, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f126792a = storage;
    }
}
