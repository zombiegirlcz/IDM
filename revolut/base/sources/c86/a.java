package c86;

import c42.j;
import c69.v;
import efm.d0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pfm.m;
import pfm.n;
import pfm.t;
import rfm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f22118b;

    public /* synthetic */ a(g gVar, int i) {
        this.f22117a = i;
        this.f22118b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f22117a) {
            case 0:
                i cachedValueOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(cachedValueOptional, "cachedValueOptional");
                return d0.m(new Pair(cachedValueOptional.g(), Boolean.valueOf(this.f22118b.f22132m.a())));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Boolean bool = (Boolean) pair.f186385a;
                Boolean bool2 = (Boolean) pair.f186386b;
                boolean zBooleanValue = bool2.booleanValue();
                g gVar = this.f22118b;
                if (bool == null) {
                    n nVar = new n(new d(gVar, zBooleanValue, 0), 1);
                    Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                    return nVar;
                }
                if (bool.equals(bool2)) {
                    m mVar = m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                if (zBooleanValue || !bool.equals(Boolean.TRUE)) {
                    n nVar2 = new n(new d(gVar, zBooleanValue, 0), 1);
                    Intrinsics.checkNotNullExpressionValue(nVar2, "fromCallable(...)");
                    return nVar2;
                }
                f0 f0VarF = g.N(gVar.f22129h, "Accounts deletion").e(g.N(gVar.f22130j, "User logout")).f(gVar.f22131l);
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                pfm.a aVar = new pfm.a(o70.a.b(f0VarF), new c64.a(new v(gVar, 10), 4), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                efm.b bVarU = mo3.a.u(aVar, gVar.o, true);
                c64.a aVar2 = new c64.a(new j(29), 5);
                dfm.c cVar = mfm.f.d;
                en.a aVar3 = mfm.f.f205043c;
                t tVar = new t(bVarU, aVar2, cVar, aVar3, aVar3, aVar3, aVar3);
                Intrinsics.checkNotNullExpressionValue(tVar, "doOnSubscribe(...)");
                return tVar;
        }
    }
}
