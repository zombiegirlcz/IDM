package cpc;

import cp7.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1h.g;
import qu4.s;
import vkm.v1;
import ybl.l;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107925a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f107926b;

    public c(qmc.b roboContextProvider) {
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        this.f107926b = roboContextProvider;
    }

    @Override // m1h.g
    public final Flow a(m1h.f input) {
        switch (this.f107925a) {
            case 0:
                Intrinsics.checkNotNullParameter(input, "input");
                return nim.a.v(((qmc.b) this.f107926b).a(), new k(input, 10));
            default:
                Intrinsics.checkNotNullParameter(input, "input");
                return new v1(new s(this, (Continuation) null, 25));
        }
    }

    public c(l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f107926b = tradingConfigInteractor;
    }
}
