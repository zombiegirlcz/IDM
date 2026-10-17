package au6;

import androidx.room.util.DBUtil;
import au6.g2;
import com.revolut.feature.freelancer.common.models.FreelancerBanner;
import com.revolut.feature.freelancer.common.models.FreelancerInboundVolume;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f9504b;

    public /* synthetic */ c2(k2 k2Var, int i) {
        this.f9503a = i;
        this.f9504b = k2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        int i = this.f9503a;
        ArrayList arrayList = null;
        k2 k2Var = this.f9504b;
        switch (i) {
            case 0:
                com.revolut.feature.freelancer.impl.network.models.v order = (com.revolut.feature.freelancer.impl.network.models.v) obj2;
                Intrinsics.checkNotNullParameter(order, "order");
                return zhm.u.c(k2Var.e.b(order));
            case 1:
                g2 param = (g2) obj2;
                Intrinsics.checkNotNullParameter(param, "param");
                if (param instanceof g2.a) {
                    return (List) k2Var.f9555c.get("CACHE_KEY_SALES");
                }
                if (!(param instanceof h2)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list = (List) k2Var.f9555c.get("CACHE_KEY_SALES");
                if (list == null) {
                    return null;
                }
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((FreelancerOrder) next).f73289a, ((h2) param).f9535a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                FreelancerOrder freelancerOrder = (FreelancerOrder) next;
                if (freelancerOrder != null) {
                    return zhm.u.c(freelancerOrder);
                }
                return null;
            case 2:
                is6.z zVar = k2Var.f9554b;
                g2 param2 = (g2) obj2;
                Intrinsics.checkNotNullParameter(param2, "param");
                if (param2 instanceof g2.a) {
                    List list2 = (List) DBUtil.performBlocking(zVar.f168149a, true, false, new is2.t(zVar, 5));
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(ft6.u.c((ks6.i0) it9.next()));
                    }
                    return arrayList2;
                }
                if (!(param2 instanceof h2)) {
                    throw new NoWhenBranchMatchedException();
                }
                ks6.i0 i0Var = (ks6.i0) DBUtil.performBlocking(zVar.f168149a, true, false, new is6.t(zVar, ((h2) param2).f9535a, 3));
                if (i0Var != null) {
                    return zhm.u.c(ft6.u.c(i0Var));
                }
                return null;
            case 3:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (lr6.f0) k2Var.f9555c.get("CACHE_KEY_PROCESSING_SETTINGS");
            case 4:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (FreelancerProfileSettings) k2Var.f9555c.get("CACHE_KEY_PROFILE_SETTINGS");
            case 5:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (List) k2Var.f9555c.get("CACHE_FREELANCER_BANNERS");
            case 6:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                com.revolut.feature.freelancer.impl.network.models.l0 l0Var = (com.revolut.feature.freelancer.impl.network.models.l0) k2Var.d.T2("STORAGE_KEY_FREELANCER_PROFILE_SETTINGS", com.revolut.feature.freelancer.impl.network.models.l0.class);
                if (l0Var != null) {
                    return ft6.k.a(l0Var);
                }
                return null;
            case 7:
                Unit it14 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                List list3 = (List) k2Var.d.T2("STORAGE_KEY_FREELANCE_BANNERS", k2.f9552j.getClass());
                if (list3 != null) {
                    List<du6.e> list4 = list3;
                    arrayList = new ArrayList(zhm.w.t(list4, 10));
                    for (du6.e eVar : list4) {
                        Map map = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        arrayList.add(new FreelancerBanner(lr6.b.valueOf(eVar.getBannerType())));
                    }
                }
                return arrayList;
            case 8:
                Unit it15 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (List) k2Var.f9555c.get("CACHE_FREELANCER_INBOUND_VOLUMES");
            case 9:
                Unit it16 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                List list5 = (List) k2Var.d.T2("STORAGE_KEY_FREELANCER_INBOUND_VOLUMES", k2.k.getClass());
                if (list5 != null) {
                    List<du6.f> list6 = list5;
                    arrayList = new ArrayList(zhm.w.t(list6, 10));
                    for (du6.f fVar : list6) {
                        Map map2 = ft6.k.f137948a;
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        arrayList.add(new FreelancerInboundVolume(fVar.getCurrency(), fVar.getFrom(), fVar.getTo()));
                    }
                }
                return arrayList;
            default:
                List orders = (List) obj2;
                Intrinsics.checkNotNullParameter(orders, "orders");
                List list7 = orders;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list7, 10));
                Iterator it17 = list7.iterator();
                while (it17.hasNext()) {
                    arrayList3.add(k2Var.e.b((com.revolut.feature.freelancer.impl.network.models.v) it17.next()));
                }
                return arrayList3;
        }
    }
}
