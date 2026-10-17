package yf4;

import cli.n;
import cli.o;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import mx4.z;
import org.jetbrains.annotations.NotNull;
import y66.q;
import yed.g0;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f313183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChangeRepaymentDayScreenContract$InputData f313184b;

    public l(z constructorMapper, ChangeRepaymentDayScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(constructorMapper, "constructorMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f313183a = constructorMapper;
        this.f313184b = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f313173a, new g0(this, 2), new y8a.g(this, 22), new q(this, domainState, 8));
    }
}
