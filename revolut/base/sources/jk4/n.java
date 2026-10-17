package jk4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.autopay.ui.screen.amount.input.b f175082b;

    public /* synthetic */ n(com.revolut.feature.credit.autopay.ui.screen.amount.input.b bVar, int i) {
        this.f175081a = i;
        this.f175082b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f175081a) {
            case 0:
                String sourceId = (String) obj2;
                Intrinsics.checkNotNullParameter(sourceId, "sourceId");
                com.revolut.feature.credit.autopay.ui.screen.amount.input.b bVar = this.f175082b;
                lb5.b bVar2 = bVar.f68612s;
                yb5.e eVar = (yb5.e) bVar2;
                return nim.a.v(((yb5.e) bVar2).d(eVar.c(y0.b(bVar.f68610q.f68604b.f115083b))), new jb8.a(sourceId, 5));
            default:
                g1j.b result = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.credit.autopay.ui.screen.amount.input.b bVar3 = this.f175082b;
                bVar3.n2(new jij.h(result, bVar3, (Continuation) null), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
