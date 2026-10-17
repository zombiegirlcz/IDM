package az0;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.coroutines.a implements skm.a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11297b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(kotlin.coroutines.f fVar, int i) {
        super(fVar);
        this.f11297b = i;
    }

    @Override // skm.a0
    public final void handleException(CoroutineContext coroutineContext, Throwable th10) {
        switch (this.f11297b) {
            case 0:
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                break;
            case 1:
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "OfflineQueue", null, th10, h0Var2);
                break;
            default:
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var3);
                break;
        }
    }
}
