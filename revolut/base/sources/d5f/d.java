package d5f;

import akg.n;
import bke.t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q1h.f;
import w4l.h;
import ybl.l;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f111410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f111411b;

    public d(ang.f userInteractor, l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f111410a = userInteractor;
        this.f111411b = tradingConfigInteractor;
    }

    @Override // q1h.f
    public final n a(List trades) {
        Intrinsics.checkNotNullParameter(trades, "trades");
        return nim.a.v(u0.m(this.f111410a.j(h.f294642c), l.d(this.f111411b)), new t(trades, 20));
    }
}
