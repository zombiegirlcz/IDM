package dmf;

import aoi.h;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import k71.i;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import sjf.e;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f116123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f116124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l80.e f116125n;
    public final zq.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f116126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f116127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f116128r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f116129s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f116130t;

    public d(h0 commonDataSource, e transactionsPerformanceTracker, l80.e dateProvider, zq.a screenBuilderKeySelector, i transactionDescriptor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionsPerformanceTracker, "transactionsPerformanceTracker");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(screenBuilderKeySelector, "screenBuilderKeySelector");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        this.f116123l = commonDataSource;
        this.f116124m = transactionsPerformanceTracker;
        this.f116125n = dateProvider;
        this.o = screenBuilderKeySelector;
        this.f116126p = transactionDescriptor;
        this.f116128r = true;
    }

    @Override // yji.n
    public final void E2() {
        if (this.f116130t) {
            boolean z = this.f116128r;
            e eVar = this.f116124m;
            if (z) {
                Z2();
                eVar.a(TransactionsPerformanceTracker$Scenario.DETAILS_UI, "interrupted", Boolean.TRUE);
            }
            eVar.b(TransactionsPerformanceTracker$Scenario.DETAILS_UI);
        }
    }

    public final void Z2() {
        ((f) this.f116125n).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f116127q;
        TransactionsPerformanceTracker$Scenario scenario = TransactionsPerformanceTracker$Scenario.DETAILS_UI;
        e eVar = this.f116124m;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        h hVarB = eVar.f263727c.b(scenario.getTraceName());
        if (hVarB != null) {
            hVarB.a("DURATION", String.valueOf(jCurrentTimeMillis));
        }
    }
}
