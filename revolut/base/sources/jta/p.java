package jta;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f178455b;

    public /* synthetic */ p(v vVar, int i) {
        this.f178454a = i;
        this.f178455b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f178454a;
        v vVar = this.f178455b;
        switch (i) {
            case 0:
                com.revolut.feature.raffle.impl.data.models.b it8 = (com.revolut.feature.raffle.impl.data.models.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8.f81632c == bta.k.DRAW_WINNER) {
                    vVar.f178464q.R(h60.a.f149577a);
                }
                return Unit.f186387a;
            default:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "RaffleScreenModel", null, throwable, h0Var);
                vVar.X1(v.J2());
                return Boolean.TRUE;
        }
    }
}
