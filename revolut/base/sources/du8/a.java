package du8;

import a08.l;
import cu8.c1;
import cu8.g1;
import dkk.a0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f117933b;

    public /* synthetic */ a(b bVar, int i) {
        this.f117932a = i;
        this.f117933b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f117932a;
        b bVar = this.f117933b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                g1 g1Var = (g1) bVar.f117936c;
                Intrinsics.h(it8);
                com.revolut.feature.kyc.impl.b bVar2 = (com.revolut.feature.kyc.impl.b) g1Var;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                bVar2.o3();
                return Unit.f186387a;
            case 1:
                zt8.a result = (zt8.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.kyc.impl.b bVar3 = (com.revolut.feature.kyc.impl.b) ((g1) bVar.f117936c);
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                pfm.h hVar = new pfm.h(new l(result, bVar3, 13), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            default:
                Intrinsics.checkNotNullParameter((c1) obj2, "it");
                pfm.a aVar = new pfm.a(new ufm.f(w.o0(kotlin.coroutines.g.f186406a, new mt8.c((mt8.d) bVar.f117935b, null, 0)), new a0(new a(bVar, 0), 17), 1), new a0(new a(bVar, 1), 18), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
        }
    }
}
