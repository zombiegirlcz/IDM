package mm1;

import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import ihm.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillerSearchNavigation$InputData f207124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final im1.a f207125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f207126c;
    public final ihm.b d;

    public c(BillerSearchNavigation$InputData inputData, yk0.d schedulerProvider, im1.a billersInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(billersInteractor, "billersInteractor");
        this.f207124a = inputData;
        this.f207125b = billersInteractor;
        this.f207126c = v0.a.d("create(...)");
        this.d = j6.a.h("create(...)");
    }
}
