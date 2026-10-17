package z72;

import h12.h;
import kotlin.jvm.internal.Intrinsics;
import l72.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f319855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f319856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l72.c f319857c;
    public final q72.a d;
    public final mt8.d e;

    public e(h apmAreaProvider, i multibancoWithdrawalInteractor, l72.c multibancoCardInteractor, q72.a multibancoTransactionInteractor, mt8.d kycInteractor) {
        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
        Intrinsics.checkNotNullParameter(multibancoWithdrawalInteractor, "multibancoWithdrawalInteractor");
        Intrinsics.checkNotNullParameter(multibancoCardInteractor, "multibancoCardInteractor");
        Intrinsics.checkNotNullParameter(multibancoTransactionInteractor, "multibancoTransactionInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        this.f319855a = apmAreaProvider;
        this.f319856b = multibancoWithdrawalInteractor;
        this.f319857c = multibancoCardInteractor;
        this.d = multibancoTransactionInteractor;
        this.e = kycInteractor;
    }
}
