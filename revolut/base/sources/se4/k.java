package se4;

import cli.y;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f262110b;

    public /* synthetic */ k(o oVar, int i) {
        this.f262109a = i;
        this.f262110b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f262109a;
        o oVar = this.f262110b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                Continuation continuation = null;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                y yVar = oVar.f262116s;
                if (((e) ((j2) yVar.f22677a).getValue()).f262102c.isBefore(((l80.f) oVar.f262114q).f())) {
                    oVar.H2(yVar, new se0.a(4));
                } else {
                    oVar.l2(new m(oVar, continuation, 0), new yi5.b(26));
                }
                return Boolean.TRUE;
            default:
                return e.a((e) obj2, null, null, null, ((l80.f) oVar.f262114q).f(), null, null, 55);
        }
    }
}
