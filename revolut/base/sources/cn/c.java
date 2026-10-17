package cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f25326b;

    public /* synthetic */ c(int i, Set set) {
        this.f25325a = i;
        this.f25326b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25325a) {
            case 0:
                Set set = this.f25326b;
                ArrayList arrayList = new ArrayList(w.t(set, 10));
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new ce9.a((b) it8.next(), 21));
                }
                return arrayList;
            case 1:
                Set set2 = this.f25326b;
                ArrayList arrayList2 = new ArrayList(w.t(set2, 10));
                Iterator it9 = set2.iterator();
                while (it9.hasNext()) {
                    a0.d.B(it9.next());
                    arrayList2.add(new gn.a(0));
                }
                return arrayList2;
            case 2:
                List listP0 = d0.P0(this.f25326b, new in.d());
                ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
                Iterator it10 = listP0.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(new ii4.b((um.b) it10.next(), 15));
                }
                return arrayList3;
            default:
                List listP02 = d0.P0(this.f25326b, new om.b());
                ArrayList arrayList4 = new ArrayList(w.t(listP02, 10));
                Iterator it11 = listP02.iterator();
                while (it11.hasNext()) {
                    arrayList4.add(new ok7.c((om.a) it11.next(), 4));
                }
                return arrayList4;
        }
    }
}
