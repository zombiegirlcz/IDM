package cuh;

import bwb.n;
import cnc.t;
import com.revolut.feature.workflow.engine.rfi.impl.data.network.service.RfiScreeningService;
import cp7.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import ue0.c;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final auh.a f108998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RfiScreeningService f108999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f109000c;
    public final c d;
    public final x4l.c e;

    public b(auh.a answersMapper, RfiScreeningService service, j cache, c storage) {
        Intrinsics.checkNotNullParameter(answersMapper, "answersMapper");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f108998a = answersMapper;
        this.f108999b = service;
        this.f109000c = cache;
        this.d = storage;
        Continuation continuation = null;
        this.e = new x4l.c(new a(this, continuation, 0), new k(this, 27), new t(this, 19), new ck7.j(this, continuation, 24), new n(this, continuation, 17));
    }
}
