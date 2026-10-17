package kze;

import com.revolut.kompot.common.flow.permissions.a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f191105b;

    public /* synthetic */ e(i iVar, int i) {
        this.f191104a = i;
        this.f191105b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f191104a;
        i iVar = this.f191105b;
        switch (i) {
            case 0:
                com.revolut.kompot.common.flow.permissions.a result = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof sii.c) && !(result instanceof sii.d)) {
                    if (!Intrinsics.f(result, a.C0596a.f98352a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.l2(new h(iVar, null, 0), new e(iVar, 1));
                }
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                iVar.C2(new c(it8));
                return Boolean.TRUE;
        }
    }
}
