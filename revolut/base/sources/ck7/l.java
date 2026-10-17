package ck7;

import ajd.t;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import ijj.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik7.e f24798b;

    public l(ik7.g reasonsItemMapper, ik7.e reasonNotListedItemMapper, int i) {
        this.f24797a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(reasonsItemMapper, "reasonsItemMapper");
                Intrinsics.checkNotNullParameter(reasonNotListedItemMapper, "reasonNotListedItemMapper");
                this.f24798b = reasonNotListedItemMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(reasonsItemMapper, "reasonsItemMapper");
                Intrinsics.checkNotNullParameter(reasonNotListedItemMapper, "reasonNotListedItemMapper");
                this.f24798b = reasonNotListedItemMapper;
                break;
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        switch (this.f24797a) {
            case 0:
                e domainState = (e) iVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                List list = domainState.f24787a;
                boolean z = domainState.d;
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(ik7.g.a((CFACCancellationReason) it8.next(), z));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                Data reasonNotListedInfoData = domainState.f24789c;
                Intrinsics.checkNotNullParameter(reasonNotListedInfoData, "reasonNotListedInfoData");
                return new i(i2b.a.p(arrayList, (qv0.i) iii.c.f(reasonNotListedInfoData, new ijj.p(21), new r(6), new t(z, this.f24798b, 8))));
            default:
                uj7.e domainState2 = (uj7.e) iVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                List list3 = domainState2.f280523a;
                boolean z3 = domainState2.f280525c;
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(ik7.g.a((CFACCancellationReason) it9.next(), z3));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                Data reasonNotListedInfoData2 = domainState2.f280524b;
                Intrinsics.checkNotNullParameter(reasonNotListedInfoData2, "reasonNotListedInfoData");
                return new uj7.i(i2b.a.p(arrayList2, (qv0.i) iii.c.f(reasonNotListedInfoData2, new ijj.p(21), new r(6), new t(z3, this.f24798b, 8))));
        }
    }
}
