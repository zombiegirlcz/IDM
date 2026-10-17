package ebk;

import abk.d;
import abk.e;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f124380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f124381m;

    public b(e transferErrorStateMapper, d transferAmountBalanceValidator) {
        Intrinsics.checkNotNullParameter(transferErrorStateMapper, "transferErrorStateMapper");
        Intrinsics.checkNotNullParameter(transferAmountBalanceValidator, "transferAmountBalanceValidator");
        this.f124380l = transferErrorStateMapper;
        this.f124381m = transferAmountBalanceValidator;
    }
}
