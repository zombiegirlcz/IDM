package i4h;

import ael.e1;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f158462b;

    public /* synthetic */ o(p0 p0Var, int i) {
        this.f158461a = i;
        this.f158462b = p0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158461a) {
            case 0:
                String ref2 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                efm.r rVarX = ((ael.k) this.f158462b.f158471p).e(ref2).x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return rd0.e.b(rVarX);
            case 1:
                String ref3 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref3, "ref");
                return ((ael.k) this.f158462b.f158471p).g(ref3);
            case 2:
                String ref4 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref4, "ref");
                efm.r rVarX2 = ((ael.k) this.f158462b.f158471p).e(ref4).x();
                Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
                return rd0.e.b(rVarX2);
            case 3:
                String ref5 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref5, "ref");
                return rd0.e.b(((ael.k) this.f158462b.f158471p).f(ref5));
            case 4:
                String ref6 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref6, "ref");
                efm.r rVarX3 = ((ael.k) this.f158462b.f158471p).e(ref6).x();
                Intrinsics.checkNotNullExpressionValue(rVarX3, "toObservable(...)");
                return rd0.e.b(rVarX3);
            case 5:
                p0 p0Var = this.f158462b;
                od0.i iVar = p0Var.z;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                nel.n nVar = (nel.n) pair.f186385a;
                return ((eel.c) pair.f186386b) == eel.c.ONE_DAY ? nim.a.z(nim.a.w(rd0.e.c(p0Var.f158475t.j(nVar.f214596b, c1b.h.TEN_MINUTES), kotlin.coroutines.g.f186406a), new e1(nVar, 5)), new o(p0Var, 6)).onErrorResumeNext(zi0.c.j(iVar)) : zi0.c.j(iVar);
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return this.f158462b.z;
            case 7:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                efm.r rVarX4 = ((ael.k) this.f158462b.f158471p).e(it8).x();
                Intrinsics.checkNotNullExpressionValue(rVarX4, "toObservable(...)");
                return rd0.e.b(rVarX4);
            default:
                String ref7 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref7, "ref");
                return rd0.e.b(this.f158462b.f158473r.a(ref7, false));
        }
    }
}
