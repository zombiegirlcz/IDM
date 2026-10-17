package qz9;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import h6i.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements iz9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k61.a f250419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f250420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f250421c;

    public e(k61.a transferInteractor, q0 paymentsChatCountryProfilesProvider, i settingsInteractor) {
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(paymentsChatCountryProfilesProvider, "paymentsChatCountryProfilesProvider");
        Intrinsics.checkNotNullParameter(settingsInteractor, "settingsInteractor");
        this.f250419a = transferInteractor;
        this.f250420b = paymentsChatCountryProfilesProvider;
        this.f250421c = settingsInteractor;
    }

    public static boolean a(TransferLinkDetails.Active active, String str) {
        v61.p pVar = active.f60362p;
        if (Intrinsics.f(pVar != null ? pVar.e : null, str)) {
            return true;
        }
        v61.p pVar2 = active.o;
        return Intrinsics.f(pVar2 != null ? pVar2.e : null, str);
    }

    public static boolean b(TransferLinkDetails.Active active, String str) {
        v61.p pVar = active.f60362p;
        if (Intrinsics.f(pVar != null ? pVar.f : null, str)) {
            return true;
        }
        v61.p pVar2 = active.o;
        return Intrinsics.f(pVar2 != null ? pVar2.f : null, str);
    }
}
