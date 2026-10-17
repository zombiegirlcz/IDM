package com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select;

import cli.y;
import g6j.t;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import le3.w;
import mnl.g;
import mpd.b;
import mpd.c;
import mpd.d;
import mpd.n;
import oki.h;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements d {

    @NotNull
    private static final n Companion = new n();
    public final CustomPeriodSelectContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f87682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kge.d f87683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ge3.d f87684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f87685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f87686t;

    public a(CustomPeriodSelectContract$InputData inputData, e dateProvider, kge.d customPeriodProvider, ge3.d earliestTransactionFlowInteractor, cli.n stateMapper) {
        b bVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(customPeriodProvider, "customPeriodProvider");
        Intrinsics.checkNotNullParameter(earliestTransactionFlowInteractor, "earliestTransactionFlowInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f87682p = dateProvider;
        this.f87683q = customPeriodProvider;
        this.f87684r = earliestTransactionFlowInteractor;
        LocalDate localDate = inputData.f87677b;
        LocalDate localDate2 = inputData.f87678c;
        LocalDate localDate3 = inputData.d;
        boolean z = inputData.e;
        CustomPeriodSelectContract$CustomPeriodConfig customPeriodSelectContract$CustomPeriodConfig = inputData.f87679g;
        if (customPeriodSelectContract$CustomPeriodConfig != null) {
            c cVar = customPeriodSelectContract$CustomPeriodConfig.f87674a ? customPeriodSelectContract$CustomPeriodConfig.f87675b : null;
            c cVar2 = cVar == null ? c.START_DATE : cVar;
            bVar = new b(localDate2, localDate3, cVar2, cVar2 == c.START_DATE ? localDate2 : localDate3, ((f) dateProvider).e(), false);
        } else {
            bVar = null;
        }
        this.f87685s = mra.d.b(this, new mpd.a(localDate, localDate2, localDate3, localDate2, localDate3, z, bVar), stateMapper, null, false, 12);
        this.f87686t = hx7.e.a(this, new g(this, 6));
    }

    public final boolean I2(mpd.a aVar) {
        return (!this.o.e && Intrinsics.f(aVar.d, aVar.f207785b) && Intrinsics.f(aVar.e, aVar.f207786c)) ? false : true;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f87686t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        final int i = 0;
        H2(this.f87685s, new Function1(this) { // from class: mpd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a f207802b;

            {
                this.f207802b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        a update = (a) obj2;
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        b bVar = update.f207787g;
                        return a.a(update, null, null, null, false, bVar != null ? b.a(bVar, null, null, null, null, ((l80.f) this.f207802b.f87682p).e(), false, 47) : null, 63);
                    default:
                        DateTime dateTime = (DateTime) obj2;
                        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
                        com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar = this.f207802b;
                        aVar.H2(aVar.f87685s, new t(dateTime, 1));
                        return Unit.f186387a;
                }
            }
        });
        final int i2 = 1;
        l.b1(this, c8g.c.d(cj9.c.O(((w) this.f87684r).b(this.o.f87676a), 500L), new Function1(this) { // from class: mpd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a f207802b;

            {
                this.f207802b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        a update = (a) obj2;
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        b bVar = update.f207787g;
                        return a.a(update, null, null, null, false, bVar != null ? b.a(bVar, null, null, null, null, ((l80.f) this.f207802b.f87682p).e(), false, 47) : null, 63);
                    default:
                        DateTime dateTime = (DateTime) obj2;
                        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
                        com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar = this.f207802b;
                        aVar.H2(aVar.f87685s, new t(dateTime, 1));
                        return Unit.f186387a;
                }
            }
        }), null, null, 7);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f87685s;
    }
}
