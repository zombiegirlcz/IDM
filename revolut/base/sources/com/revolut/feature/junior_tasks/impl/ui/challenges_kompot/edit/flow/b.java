package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow;

import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.ChallengesEditContract$Step;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import nk4.o;
import np8.c;
import oki.h;
import org.joda.time.DateTime;
import qki.d;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements np8.a {
    public final np8.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f77367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hp8.b f77368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hj8.a f77369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f77370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f77371t;
    public final d u;
    public final yki.a v;

    public b(np8.b inputData, e dateProvider, hp8.b juniorTasksInteractor, hj8.a juniorProfileInteractor, gte.a featureTogglesInteractor) {
        dj0.d dVar;
        dp8.d dVar2;
        DateTime dateTime;
        ZonedDateTime zonedDateTimeG;
        String str;
        String str2;
        c cVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(juniorTasksInteractor, "juniorTasksInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(featureTogglesInteractor, "featureTogglesInteractor");
        this.o = inputData;
        this.f77367p = dateProvider;
        this.f77368q = juniorTasksInteractor;
        this.f77369r = juniorProfileInteractor;
        this.f77370s = featureTogglesInteractor;
        String str3 = inputData.f218154a;
        dp8.b bVar = inputData.f218155b;
        this.f77371t = str3;
        dp8.b bVar2 = inputData.f218155b;
        c cVar2 = (bVar2 == null || (cVar = c.Edit) == null) ? c.Create : cVar;
        String str4 = (bVar2 == null || (str2 = bVar2.d) == null) ? "" : str2;
        String str5 = (bVar2 == null || (str = bVar2.f116835h) == null) ? "" : str;
        if (bVar2 != null) {
            dVar = bVar2.f;
        } else {
            dj0.d.Companion.getClass();
            dVar = dj0.d.e;
        }
        this.u = hx7.e.b(this, new ChallengesEditContract$State(bVar2, cVar2, str4, str5, dVar, (bVar == null || (dateTime = bVar.k) == null || (zonedDateTimeG = jli.b.g(dateTime)) == null) ? ((f) dateProvider).k() : zonedDateTimeG, (bVar == null || (dVar2 = bVar.f116837l) == null) ? dp8.d.ONE_OFF : dVar2));
        this.v = cp5.d.a(this, ChallengesEditContract$Step.Details.f77364a, f0.f322471a, new o(this, 12));
    }

    @Override // qki.e
    public final d getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
