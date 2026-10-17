package knd;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lmd.a f186097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ge3.a f186098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.f f186099c;
    public final gmd.d d;
    public final ConcurrentHashMap e;

    public j0(lmd.a analyticsInteractor, ge3.a analyticsPocketsInteractor, l93.f revolutCardsInteractor, gmd.d jointAccountParticipantsProvider) {
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountParticipantsProvider, "jointAccountParticipantsProvider");
        this.f186097a = analyticsInteractor;
        this.f186098b = analyticsPocketsInteractor;
        this.f186099c = revolutCardsInteractor;
        this.d = jointAccountParticipantsProvider;
        this.e = new ConcurrentHashMap();
    }

    public final vkm.q0 a(Flow flow, amd.i iVar, Function2 function2) {
        Continuation continuation = null;
        return new vkm.q0(vkm.q.q(new vkm.y(new h0(this, iVar, continuation, 0), new g0(flow, function2, 0))), new im9.h(this, iVar, continuation, 19), 1);
    }
}
