package rnd;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f255608b;

    public /* synthetic */ e0(v0 v0Var, int i) {
        this.f255607a = i;
        this.f255608b = v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        switch (this.f255607a) {
            case 0:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                uib.a aVar = (uib.a) pair.f186385a;
                List list = (List) pair.f186386b;
                uib.c cVar = aVar.f280366a;
                this.f255608b.getClass();
                return v0.a(list, cVar);
            default:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                uib.a aVar2 = (uib.a) pair.f186385a;
                List list2 = (List) pair.f186386b;
                uib.c cVar2 = aVar2.f280366a;
                this.f255608b.getClass();
                return v0.a(list2, cVar2);
        }
    }
}
