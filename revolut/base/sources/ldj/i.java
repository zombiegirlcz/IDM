package ldj;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l9j.j;
import ocb.u;
import rd3.k;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pcj.c f194158a;

    public i(pcj.c priceTargetsWidgetMapper) {
        Intrinsics.checkNotNullParameter(priceTargetsWidgetMapper, "priceTargetsWidgetMapper");
        this.f194158a = priceTargetsWidgetMapper;
    }

    public static List b() {
        s7 s7Var = new s7("LOADING_ITEM_COMMENTARY_SECTION_HEADER", 0, 0, 0, 0, false, null, 126);
        IntRange intRangeO = kotlin.ranges.f.o(0, 3);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("LOADING_ITEM_COMMENTARY_SECTION_TARGET", it8.nextInt())));
        }
        List listQ = i2b.a.q(s7Var, arrayList);
        yp0.b.k(listQ, 0, R$attr.uikit_dp16, 0, 0, 29);
        return listQ;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        List list;
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ncj.g priceTargetsWidgetInfo = domainState.f194147b;
        Object content = domainState.f194148c.getContent();
        if (priceTargetsWidgetInfo == null || content == null) {
            list = null;
        } else {
            rdj.c cVar = (rdj.c) this.f194158a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(priceTargetsWidgetInfo, "priceTargetsWidgetInfo");
            list = (List) iii.c.f(priceTargetsWidgetInfo.f214230a, new u(cVar, false, 29), new k(14), new d8d.a((Object) priceTargetsWidgetInfo, (Object) cVar, content, false, 9));
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return new h(list, (List) iii.c.f(domainState.f194146a, new lbh.a(this, 20), new j(this, 14), new g(this, 0)));
    }
}
