package b9i;

import efm.d0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f13791b;

    public /* synthetic */ g(l lVar, int i) {
        this.f13790a = i;
        this.f13791b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f13790a) {
            case 0:
                w61.a news = (w61.a) obj2;
                Intrinsics.checkNotNullParameter(news, "news");
                d0 d0VarP = ((ik3.c) this.f13791b.f13801n).p();
                b79.g gVar = new b79.g(new f(news, 0), 12);
                d0VarP.getClass();
                return new ufm.i(d0VarP, gVar, 1).o(new Pair("", news));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                Object obj3 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                this.f13791b.o.getClass();
                return c9i.c.a((w61.a) obj3, str);
        }
    }
}
