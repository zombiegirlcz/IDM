package ael;

import com.revolut.shared.feature.wealth.domain.api.WealthDomainApi$Toggles$InvestStatementsEmailFallback;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.i2;
import vdl.w1;

/* JADX INFO: loaded from: classes12.dex */
public final class b1 implements ybl.o {

    @NotNull
    private static final y0 Companion = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f3598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.f f3599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r10.w f3600c;
    public final gte.a d;

    public b1(w1 repository, ybl.f fileDownloader, r10.w reportsForAccountProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        Intrinsics.checkNotNullParameter(reportsForAccountProvider, "reportsForAccountProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f3598a = repository;
        this.f3599b = fileDownloader;
        this.f3600c = reportsForAccountProvider;
        this.d = featureToggleInteractor;
    }

    public static void a(wbl.k kVar) {
        int i = z0.f3686c[kVar.f296270a.ordinal()];
        if (i == 1) {
            if (kVar.f296271b == null) {
                throw new IllegalStateException("Statement status url must not be null");
            }
        } else {
            if (i == 2) {
                throw new IllegalStateException();
            }
            if (i == 3) {
                throw new Exception() { // from class: com.revolut.shared.feature.wealth.domain.api.interactors.TradingStatementsInteractor$NotReadyException
                };
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final ufm.i b(String str, LocalDate localDate, LocalDate localDate2, ybl.n nVar, xbl.e eVar) {
        xbl.d dVar;
        int i = z0.f3684a[nVar.ordinal()];
        if (i == 1) {
            dVar = xbl.d.PDF;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = xbl.d.CSV;
        }
        ufm.i iVar = new ufm.i(c(new u0(this, str, localDate, localDate2, dVar, eVar)), new aed.f(new acb.f(nVar, this, 15), 11), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final efm.d0 c(Function1 function1) {
        if (((jte.d) this.d).c(WealthDomainApi$Toggles$InvestStatementsEmailFallback.f105072c)) {
            ufm.i iVar = new ufm.i(new ufm.c(new v0(0, function1), 0), new aed.f(new w0(3, this, function1), 12), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        ufm.c cVar = new ufm.c(new v0(2, function1), 0);
        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
        return new ufm.i(cVar, new aed.f(new r0(this, 5), 13), 1).p(new aed.f(new r0(6), 14));
    }

    public final i2 d(ufm.c cVar) {
        ufm.i iVar = new ufm.i(cVar, new aed.f(new r0(this, 4), 10), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return mra.d.K(iVar, 2000L, new a9d.p(20));
    }
}
