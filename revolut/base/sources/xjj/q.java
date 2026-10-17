package xjj;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f306548a;

    public q(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f306548a = phoneToolsProvider;
    }

    public final String a(EsimCoverage esimCoverage, String str) {
        String str2;
        if (esimCoverage instanceof EsimCoverage.Country) {
            str2 = ((EsimCoverage.Country) esimCoverage).f100204a.f297794a;
        } else {
            if (!(esimCoverage instanceof EsimCoverage.Global) && !(esimCoverage instanceof EsimCoverage.Regional) && !(esimCoverage instanceof EsimCoverage.Undefined)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = null;
        }
        return this.f306548a.a(str, str2, yk0.b.INTERNATIONAL);
    }
}
