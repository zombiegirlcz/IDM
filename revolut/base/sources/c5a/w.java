package c5a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f f21538b;

    public /* synthetic */ w(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, int i) {
        this.f21537a = i;
        this.f21538b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f21537a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f21538b.f80172p.J0(true);
            case 1:
                ((Boolean) obj2).getClass();
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = this.f21538b;
                ihm.b bVar = fVar.f0;
                Unit unit = Unit.f186387a;
                bVar.onNext(unit);
                fVar.l2(new b0(fVar, null), new yi5.b(26));
                return unit;
            default:
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar2 = this.f21538b;
                fVar2.n2(new c1i.f(fVar2, (kkd.d) obj2, null, 11), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
