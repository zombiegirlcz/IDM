package auj;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreenContract$InputData;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends oki.h implements j {
    public final RewardsHubChallengeHistoryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final stj.b f9852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final stj.h f9853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f9854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f9855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f9856t;

    public n(q stateMapper, RewardsHubChallengeHistoryScreenContract$InputData inputData, stj.b pagingSource, stj.h interactor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = inputData;
        this.f9852p = pagingSource;
        this.f9853q = interactor;
        this.f9854r = mra.d.b(this, new g(inputData.f101584a, new Data(null, null, true, 3, null), r0.g(), false), stateMapper, null, false, 12);
        this.f9856t = new LinkedHashSet();
    }

    public static final Data I2(n nVar, Data data, Map map) {
        ArrayList arrayList;
        if (!nVar.J2()) {
            return data;
        }
        List list = (List) data.getContent();
        if (list != null) {
            List<d0j.q> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (d0j.q qVar : list2) {
                ArrayList<d0j.h> arrayList3 = qVar.f110426b;
                ArrayList arrayList4 = new ArrayList();
                for (d0j.h hVar : arrayList3) {
                    d0j.h hVar2 = (d0j.h) map.get(hVar.f110400b);
                    if (hVar2 != null) {
                        hVar = hVar2;
                    }
                    d0j.n nVar2 = hVar.d;
                    if (nVar2 == d0j.n.COMPLETED || nVar2 == d0j.n.EXPIRED) {
                        hVar = null;
                    }
                    if (hVar != null) {
                        arrayList4.add(hVar);
                    }
                }
                arrayList2.add(d0j.q.a(qVar, arrayList4));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return Data.copy$default(data, arrayList, null, false, 6, null);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.f9852p.j(250L), null, null, new l(this, continuation, 0), 3);
        l2(new m(this, null, 0), new yi5.b(26));
        if (J2()) {
            yji.l.a1(this, this.f9853q.f265611b, null, null, new l(this, continuation, 1), 3);
        }
    }

    public final boolean J2() {
        return this.o.f101584a == d0j.m.ACTIVE;
    }

    @Override // yji.l
    public final void T1(long j2) {
        String str;
        if (!J2() || (str = this.f9855s) == null) {
            return;
        }
        l2(new ald.l(this, str, null, 29), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f9854r;
    }
}
