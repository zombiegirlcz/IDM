package jil;

import com.revolut.shared.feature.wealth_orders.domain.impl.data.network.TradingProjectionsService;
import ghl.l;
import j40.d;
import jch.p;
import jeg.g;
import jij.h;
import jul.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import ne0.j;
import x4l.c;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingProjectionsService f174608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f174609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f174610c;
    public final e d;
    public final c e;

    public a(TradingProjectionsService projectionsService, j memoryCache, o tradingProjectionsStorage, e dateProvider) {
        Intrinsics.checkNotNullParameter(projectionsService, "projectionsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(tradingProjectionsStorage, "tradingProjectionsStorage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f174608a = projectionsService;
        this.f174609b = memoryCache;
        this.f174610c = tradingProjectionsStorage;
        this.d = dateProvider;
        Continuation continuation = null;
        this.e = new c(new l(this, continuation, 20), new g(this, 24), new p(this, 20), new h(this, continuation, 1), new d(this, continuation, 4));
    }
}
