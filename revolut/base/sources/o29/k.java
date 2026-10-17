package o29;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m29.b;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f221562w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f221562w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f221562w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f221562w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m mVar = this.f221562w;
        switch (i) {
            case 0:
                i iVar = (i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = mVar.f221569c;
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                String strQ = j6.a.q("SAVINGS_BOTTOM_SHEET_STORAGE_KEY_", iVar.f221558a);
                m.Companion.getClass();
                m29.b bVar = (m29.b) cVar.T2(strQ, m.i);
                if (bVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                String icon = bVar.getIcon();
                String title = bVar.getTitle();
                RevPointsTextWithLinks revPointsTextWithLinksB = qvb.b.b(bVar.getSubtitle());
                b.C1146b cta2 = bVar.getCta();
                y19.c cVar2 = cta2 != null ? new y19.c(cta2.getTitle(), cta2.getDeeplink()) : null;
                List<b.a> contentItems = bVar.getContentItems();
                ArrayList arrayList = new ArrayList(zhm.w.t(contentItems, 10));
                for (b.a aVar2 : contentItems) {
                    arrayList.add(new y19.b(aVar2.getTitle(), aVar2.getValue()));
                }
                return new y19.d(icon, title, revPointsTextWithLinksB, cVar2, arrayList);
            default:
                j jVar = (j) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar3 = mVar.f221569c;
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                String strQ2 = j6.a.q("SAVINGS_DETAILS_STORAGE_KEY_", jVar.f221560a.name());
                m.Companion.getClass();
                m29.c cVar4 = (m29.c) cVar3.T2(strQ2, m.f221566h);
                if (cVar4 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(cVar4, "<this>");
                dj0.d dVarV = hx7.a.v(cVar4.getTotalSaved());
                y19.i iVarC = d29.a.c(cVar4.getType());
                List usedProducts = cVar4.getUsedProducts();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(usedProducts, 10));
                Iterator it8 = usedProducts.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(d29.a.b((m29.a) it8.next()));
                }
                List unusedProducts = cVar4.getUnusedProducts();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(unusedProducts, 10));
                Iterator it9 = unusedProducts.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(d29.a.b((m29.a) it9.next()));
                }
                return new y19.e(dVarV, iVarC, arrayList2, arrayList3);
        }
    }
}
