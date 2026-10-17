package xg1;

import com.google.android.gms.tasks.Task;
import com.revolut.feature.add_card_to_google_pay_shared.impl.tapandpay.GooglePayVerificationService;
import kotlin.jvm.internal.Intrinsics;
import lfg.z;
import lhi.v;
import li0.b;
import rd0.e;
import ufm.i;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f305480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GooglePayVerificationService f305481b;

    public a(b tapAndPayClient, GooglePayVerificationService service) {
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f305480a = tapAndPayClient;
        this.f305481b = service;
    }

    public final i a() {
        Task<String> activeWalletId = this.f305480a.f195399a.getActiveWalletId();
        Intrinsics.checkNotNullExpressionValue(activeWalletId, "getActiveWalletId(...)");
        i iVar = new i(e.t(activeWalletId), new v(1, new z(18)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        return iVar;
    }
}
