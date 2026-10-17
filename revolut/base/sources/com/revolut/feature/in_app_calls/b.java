package com.revolut.feature.in_app_calls;

import be7.k;
import be7.l;
import efm.r;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import rd0.c;
import rd0.d;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f74793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f74794b;

    public b(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f74793a = dateProvider;
        InAppCallStateWithData.INSTANCE.getClass();
        ihm.b bVarE = ihm.b.e(InAppCallStateWithData.f74784j);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f74794b = bVarE;
    }

    public final ihm.b a() {
        return this.f74794b;
    }

    public final boolean b() {
        be7.a aVar;
        InAppCallStateWithData inAppCallStateWithData = (InAppCallStateWithData) this.f74794b.f();
        return (inAppCallStateWithData == null || (aVar = inAppCallStateWithData.f74785a) == null || !aVar.a()) ? false : true;
    }

    public final void c(UUID ticketId) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        e(new l(0, ticketId));
    }

    public final r d(UUID ticketId) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        r rVarDistinctUntilChanged = this.f74794b.map(new bce.e(new l(1, ticketId), 20)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final void e(Function1 function1) {
        ihm.b bVar = this.f74794b;
        InAppCallStateWithData inAppCallStateWithData = (InAppCallStateWithData) bVar.f();
        if (inAppCallStateWithData == null) {
            InAppCallStateWithData.INSTANCE.getClass();
            inAppCallStateWithData = InAppCallStateWithData.f74784j;
        }
        InAppCallStateWithData inAppCallStateWithDataA = InAppCallStateWithData.a((InAppCallStateWithData) function1.invoke(inAppCallStateWithData), null, null, null, null, null, null, null, ((f) this.f74793a).b(), 255);
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.b(c.DEBUG, "InAppCalls", "Updated call state " + inAppCallStateWithData.f74785a + " -> " + inAppCallStateWithDataA.f74785a, null, null, 16);
        bVar.onNext(inAppCallStateWithDataA);
    }
}
