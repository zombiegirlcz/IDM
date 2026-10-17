package a31;

import a09.a0;
import efm.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hbd.a f968c;

    public /* synthetic */ h(x xVar, hbd.a aVar, int i) {
        this.f966a = i;
        this.f967b = xVar;
        this.f968c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f966a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f967b.i.j(this.f968c, it8);
                return Unit.f186387a;
            case 1:
                qua.p updatedPayment = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(updatedPayment, "updatedPayment");
                x xVar = this.f967b;
                w4l.f fVar = xVar.i;
                hbd.a aVar = this.f968c;
                d0 d0VarFirstOrError = m70.a.g(fVar.f(aVar, false), null, new a08.n(15), 1).firstOrError();
                e eVar = new e(new m(updatedPayment, 0, xVar, aVar), 17);
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, eVar, 1);
            case 2:
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                return new pfm.h(new a0(this.f967b, 1, this.f968c, subscriptions), 2);
            default:
                List subscriptionsIds = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptionsIds, "subscriptionsIds");
                hbd.a params = this.f968c;
                Intrinsics.checkNotNullParameter(params, "params");
                return nim.a.w(nim.a.w(this.f967b.i.f(params, false), new a09.a(24)), new a26.j(subscriptionsIds, 2));
        }
    }
}
