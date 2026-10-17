package aod;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import skm.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends kotlin.coroutines.a implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7977b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, int i) {
        super(fVar);
        this.f7977b = i;
    }

    @Override // skm.a0
    public final void handleException(CoroutineContext coroutineContext, Throwable th10) {
        switch (this.f7977b) {
            case 0:
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "AnalyticsIntervalLoading", null, th10, h0Var);
                break;
            case 1:
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Failed to refresh after resetting eSIM", null, th10, h0Var2);
                break;
            case 2:
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "AnalyticsInteractors", null, th10, h0Var3);
                break;
            case 3:
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var4);
                break;
            case 4:
                h0 h0Var5 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var5);
                break;
            case 5:
                h0 h0Var6 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "FullscreenProductIntroView", "failed coroutine", th10, h0Var6);
                break;
            case 6:
                h0 h0Var7 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "TripsIntervalLoading", null, th10, h0Var7);
                break;
            case 7:
                h0 h0Var8 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList8 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "AnalyticsWidgetCacheProvider", null, th10, h0Var8);
                break;
            default:
                h0 h0Var9 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList9 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "AnalyticsIntervalLoading", null, th10, h0Var9);
                break;
        }
    }
}
