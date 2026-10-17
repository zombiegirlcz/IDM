package wek;

import ap9.e;
import ap9.g;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import hp9.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f296814a;

    public b(c splitDistributionStrategiesFactory) {
        Intrinsics.checkNotNullParameter(splitDistributionStrategiesFactory, "splitDistributionStrategiesFactory");
        this.f296814a = c.a(cp9.a.PERCENT, 0L);
    }

    public final ArrayList a(ArrayList nominees) {
        Intrinsics.checkNotNullParameter(nominees, "nominees");
        int iB = q0.b(w.t(nominees, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : nominees) {
            linkedHashMap.put(((PodNominee) obj2).f102617a, obj2);
        }
        ArrayList arrayList = new ArrayList(w.t(nominees, 10));
        Iterator it8 = nominees.iterator();
        while (it8.hasNext()) {
            arrayList.add(new g(0L, ((PodNominee) it8.next()).f102617a, false, true));
        }
        ArrayList<g> arrayList2 = this.f296814a.a(new ap9.a(arrayList)).f8125a;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (g gVar : arrayList2) {
            arrayList3.add(PodNominee.a((PodNominee) r0.h(gVar.f8127a, linkedHashMap), null, null, null, null, null, null, (int) gVar.f8128b, CertificateBody.profileType));
        }
        return arrayList3;
    }
}
