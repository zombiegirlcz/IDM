package kwg;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wvg.p;
import wvg.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f190347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f190348c;
    public final /* synthetic */ eel.c d;

    public /* synthetic */ h(l lVar, List list, eel.c cVar, int i) {
        this.f190346a = i;
        this.f190347b = lVar;
        this.f190348c = list;
        this.d = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f190346a) {
            case 0:
                String userId = (String) obj2;
                xi0.b currency = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(currency, "currency");
                l lVar = this.f190347b;
                return rd0.e.c(nim.a.v(lVar.f190365s.d(userId, this.f190348c, this.d, currency, w4l.i.f294643c), new i5f.g(lVar, currency, 15)), kotlin.coroutines.g.f186406a);
            case 1:
                String userId2 = (String) obj2;
                xi0.b currency2 = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(userId2, "userId");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                l lVar2 = this.f190347b;
                q qVar = lVar2.o;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(userId2, "userId");
                List analyticsProductTypes = this.f190348c;
                Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
                eel.c timeSpan = this.d;
                Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                return nim.a.v(qVar.e.a(new p(userId2, analyticsProductTypes, timeSpan, currency2), w4l.i.f294643c), new kvg.j(lVar2, 20));
            default:
                String userId3 = (String) obj2;
                xi0.b currency3 = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(userId3, "userId");
                Intrinsics.checkNotNullParameter(currency3, "currency");
                l lVar3 = this.f190347b;
                return rd0.e.c(nim.a.v(lVar3.f190365s.a(userId3, this.f190348c, this.d, currency3, w4l.i.f294643c), new i(lVar3, 1)), kotlin.coroutines.g.f186406a);
        }
    }
}
