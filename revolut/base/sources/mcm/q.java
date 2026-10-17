package mcm;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f204406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ecm.g f204407c;

    public q(s sVar, ecm.g gVar, int i) {
        this.f204405a = i;
        switch (i) {
            case 1:
                Preconditions.checkArgument(sVar.e != null, "success rate ejection config is null");
                this.f204406b = sVar;
                this.f204407c = gVar;
                break;
            default:
                this.f204406b = sVar;
                this.f204407c = gVar;
                break;
        }
    }

    @Override // mcm.x
    public final void a(p pVar, long j2) {
        double d;
        switch (this.f204405a) {
            case 0:
                s sVar = this.f204406b;
                ArrayList<n> arrayListH = y.h(pVar, sVar.f.d.intValue());
                int size = arrayListH.size();
                r rVar = sVar.f;
                if (size >= rVar.f204410c.intValue() && arrayListH.size() != 0) {
                    for (n nVar : arrayListH) {
                        if (pVar.d() >= sVar.d.intValue()) {
                            break;
                        } else if (nVar.c() >= rVar.d.intValue()) {
                            if (((AtomicLong) nVar.f204401c.f174462c).get() / nVar.c() > ((double) rVar.f204408a.intValue()) / 100.0d) {
                                this.f204407c.b(ecm.f.DEBUG, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", nVar, Double.valueOf(((AtomicLong) nVar.f204401c.f174462c).get() / nVar.c()));
                                if (new Random().nextInt(100) < rVar.f204409b.intValue()) {
                                    nVar.b(j2);
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                s sVar2 = this.f204406b;
                ArrayList<n> arrayListH2 = y.h(pVar, sVar2.e.d.intValue());
                int size2 = arrayListH2.size();
                r rVar2 = sVar2.e;
                if (size2 >= rVar2.f204410c.intValue() && arrayListH2.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (n nVar2 : arrayListH2) {
                        arrayList.add(Double.valueOf(((AtomicLong) nVar2.f204401c.f174461b).get() / nVar2.c()));
                    }
                    Iterator it8 = arrayList.iterator();
                    double d5 = 0.0d;
                    double dDoubleValue = 0.0d;
                    while (it8.hasNext()) {
                        dDoubleValue += ((Double) it8.next()).doubleValue();
                    }
                    double size3 = dDoubleValue / ((double) arrayList.size());
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        double dDoubleValue2 = ((Double) it9.next()).doubleValue() - size3;
                        d5 += dDoubleValue2 * dDoubleValue2;
                    }
                    double dSqrt = Math.sqrt(d5 / ((double) arrayList.size()));
                    double dIntValue = size3 - (((double) (rVar2.f204408a.intValue() / 1000.0f)) * dSqrt);
                    Iterator it10 = arrayListH2.iterator();
                    while (it10.hasNext()) {
                        n nVar3 = (n) it10.next();
                        s sVar3 = sVar2;
                        Iterator it11 = it10;
                        if (pVar.d() < sVar2.d.intValue()) {
                            if (((AtomicLong) nVar3.f204401c.f174461b).get() / nVar3.c() < dIntValue) {
                                d = dSqrt;
                                this.f204407c.b(ecm.f.DEBUG, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", nVar3, Double.valueOf(((AtomicLong) nVar3.f204401c.f174461b).get() / nVar3.c()), Double.valueOf(size3), Double.valueOf(d), Double.valueOf(dIntValue));
                                if (new Random().nextInt(100) < rVar2.f204409b.intValue()) {
                                    nVar3.b(j2);
                                }
                            } else {
                                d = dSqrt;
                            }
                            dSqrt = d;
                            sVar2 = sVar3;
                            it10 = it11;
                        }
                        break;
                    }
                    break;
                }
                break;
        }
    }
}
