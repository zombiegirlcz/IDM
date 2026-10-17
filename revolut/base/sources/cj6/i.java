package cj6;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f24615b;

    public /* synthetic */ i(n nVar, int i) {
        this.f24614a = i;
        this.f24615b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable e = (Throwable) obj2;
        switch (this.f24614a) {
            case 0:
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                n nVar = this.f24615b;
                yji.l.a1(nVar, nVar.X1(nVar.f24620r.c(e)), null, null, new m(nVar, null), 3);
                break;
            default:
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                n nVar2 = this.f24615b;
                yji.l.a1(nVar2, nVar2.X1(nVar2.f24620r.c(e)), null, null, new m(nVar2, null), 3);
                break;
        }
        return Boolean.TRUE;
    }
}
