package l5j;

import com.revolut.feature.referrals.common.data.api.domain.model.common.EligibilityCriteria;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f192305a;

    public c(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f192305a = dateProvider;
    }

    public static ArrayList b(List list) {
        List<EligibilityCriteria> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (EligibilityCriteria eligibilityCriteria : list2) {
            arrayList.add(new com.revolut.business.feature.referrals.model.EligibilityCriteria(eligibilityCriteria.f81720a, eligibilityCriteria.f81721b, eligibilityCriteria.f81722c));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ru.k a(com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo r20) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5j.c.a(com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo):ru.k");
    }
}
