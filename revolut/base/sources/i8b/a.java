package i8b;

import com.revolut.data.model.Data;
import efm.r;
import h8b.k;
import i52.j;
import i6j.p;
import i83.m;
import iel.e;
import iii.c;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import te0.w;
import yhl.d;
import zhm.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f159482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f159483c;

    public /* synthetic */ a(b bVar, String str, int i) {
        this.f159481a = i;
        this.f159482b = bVar;
        this.f159483c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Collection collection;
        switch (this.f159481a) {
            case 0:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8.getLoading() || !((collection = (Collection) it8.getContent()) == null || collection.isEmpty())) {
                    return w.h(new Pair(j8b.b.SHORT, it8));
                }
                k kVar = this.f159482b.f159484l;
                kVar.getClass();
                String ref2 = this.f159483c;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                r rVarCompose = d.c(kVar.f149978a, ref2, null, ((f) kVar.f149980c).e(), false, a1.j(d0.i1(e.a()), e.MARKET_HOLIDAY), null, 1, iel.f.DATE_DESCENDING, 256).compose(kVar.f149979b);
                Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
                return nim.a.w(rVarCompose, new h5i.b(26)).map(new j(5, new p(14)));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                j8b.b bVar = (j8b.b) pair.f186385a;
                Object obj3 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                return (List) c.f((Data) obj3, new p(13), new m(2), new a0i.a(this.f159482b, 21, bVar, this.f159483c));
        }
    }
}
