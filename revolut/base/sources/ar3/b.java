package ar3;

import aqd.h1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f8513b;

    public /* synthetic */ b(c cVar, int i) {
        this.f8512a = i;
        this.f8513b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        switch (this.f8512a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f8513b.f8515b.b(it8, true);
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f8513b.getClass();
                return c.a(it8);
            default:
                Intrinsics.checkNotNullParameter(it8, "currencyPairs");
                List list = it8;
                return !list.isEmpty() ? m70.a.g(this.f8513b.f8515b.b(list, true), null, new h1(4), 1).firstOrError() : w.j(f0.f322471a);
        }
    }
}
