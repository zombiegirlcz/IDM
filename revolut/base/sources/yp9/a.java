package yp9;

import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillInputData f315794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i90.b f315795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final toh.d f315796c;

    public a(SplitBillInputData inputData, i90.b uuidUtils, toh.d itemizeTabChecker) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(itemizeTabChecker, "itemizeTabChecker");
        this.f315794a = inputData;
        this.f315795b = uuidUtils;
        this.f315796c = itemizeTabChecker;
    }
}
