package ivk;

import com.revolut.data.model.Data;
import i6j.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r18.n f168880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1k.a f168881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f168882c;

    public p(r18.n recentInsightsMapper, a1k.a marketNewsItemsMapper, q1 wealthDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(recentInsightsMapper, "recentInsightsMapper");
        Intrinsics.checkNotNullParameter(marketNewsItemsMapper, "marketNewsItemsMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimerMapper, "wealthDisclaimerMapper");
        this.f168880a = recentInsightsMapper;
        this.f168881b = marketNewsItemsMapper;
        this.f168882c = wealthDisclaimerMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        ArrayList arrayListE0;
        Collection collection;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listA = a18.f.a(this.f168880a, domainState.f168872a);
        Data data = domainState.f168873b;
        List list = data != null ? (List) iii.c.f(data, new iui.a(this, 20), new iui.b(14), new igh.o(this, 18)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        List listB = ((aah.m) this.f168882c).b(domainState.f168874c);
        if (list.isEmpty() && listA.isEmpty()) {
            Data data2 = domainState.d;
            if (data2 == null || (collection = (List) iii.c.f(data2, new iui.a(21), new iui.b(15), new q(22))) == null) {
                collection = f0.f322471a;
            }
            arrayListE0 = d0.E0(listB, collection);
        } else {
            arrayListE0 = d0.E0(listB, d0.E0(list, listA));
        }
        return new l(arrayListE0);
    }
}
