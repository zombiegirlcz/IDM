package xg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vg.a f305455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f305456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashSet f305457c;
    public ArrayList d;

    public a(double d, double d5, double d6, double d10, int i) {
        this(new vg.a(d, d5, d6, d10), i);
    }

    public final void a(double d, double d5, sg.a aVar) {
        int i;
        a aVar2 = this;
        ArrayList arrayList = aVar2.d;
        vg.a aVar3 = aVar2.f305455a;
        if (arrayList != null) {
            double d6 = aVar3.f;
            double d10 = aVar3.e;
            if (d5 < d6) {
                if (d < d10) {
                    ((a) arrayList.get(0)).a(d, d5, aVar);
                    return;
                } else {
                    ((a) arrayList.get(1)).a(d, d5, aVar);
                    return;
                }
            }
            if (d < d10) {
                ((a) arrayList.get(2)).a(d, d5, aVar);
                return;
            } else {
                ((a) arrayList.get(3)).a(d, d5, aVar);
                return;
            }
        }
        if (aVar2.f305457c == null) {
            aVar2.f305457c = new LinkedHashSet();
        }
        aVar2.f305457c.add(aVar);
        if (aVar2.f305457c.size() <= 50 || (i = aVar2.f305456b) >= 40) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(4);
        aVar2.d = arrayList2;
        int i2 = i + 1;
        arrayList2.add(new a(aVar3.f288678a, aVar3.e, aVar3.f288679b, aVar3.f, i2));
        aVar2.d.add(new a(aVar3.e, aVar3.f288680c, aVar3.f288679b, aVar3.f, i2));
        aVar2.d.add(new a(aVar3.f288678a, aVar3.e, aVar3.f, aVar3.d, i2));
        aVar2.d.add(new a(aVar3.e, aVar3.f288680c, aVar3.f, aVar3.d, i2));
        LinkedHashSet<sg.a> linkedHashSet = aVar2.f305457c;
        aVar2.f305457c = null;
        for (sg.a aVar4 : linkedHashSet) {
            wg.a aVar5 = aVar4.f262565b;
            aVar2.a(aVar5.f297214a, aVar5.f297215b, aVar4);
            aVar2 = this;
        }
    }

    public final boolean b(double d, double d5, sg.a aVar) {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            vg.a aVar2 = this.f305455a;
            double d6 = aVar2.f;
            double d10 = aVar2.e;
            return d5 < d6 ? d < d10 ? ((a) arrayList.get(0)).b(d, d5, aVar) : ((a) arrayList.get(1)).b(d, d5, aVar) : d < d10 ? ((a) arrayList.get(2)).b(d, d5, aVar) : ((a) arrayList.get(3)).b(d, d5, aVar);
        }
        LinkedHashSet linkedHashSet = this.f305457c;
        if (linkedHashSet == null) {
            return false;
        }
        return linkedHashSet.remove(aVar);
    }

    public final void c(vg.a aVar, ArrayList arrayList) {
        vg.a aVar2 = this.f305455a;
        aVar2.getClass();
        double d = aVar.f288678a;
        double d5 = aVar.f288680c;
        double d6 = aVar.f288679b;
        double d10 = aVar.d;
        double d15 = aVar2.f288680c;
        if (d < d15) {
            double d41 = aVar2.f288678a;
            if (d41 < d5) {
                double d51 = aVar2.d;
                if (d6 < d51) {
                    double d68 = aVar2.f288679b;
                    if (d68 < d10) {
                        ArrayList arrayList2 = this.d;
                        if (arrayList2 != null) {
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                ((a) it8.next()).c(aVar, arrayList);
                            }
                            return;
                        }
                        LinkedHashSet<sg.a> linkedHashSet = this.f305457c;
                        if (linkedHashSet != null) {
                            if (d41 >= d && d15 <= d5 && d68 >= d6 && d51 <= d10) {
                                arrayList.addAll(linkedHashSet);
                                return;
                            }
                            for (sg.a aVar3 : linkedHashSet) {
                                wg.a aVar4 = aVar3.f262565b;
                                if (aVar.a(aVar4.f297214a, aVar4.f297215b)) {
                                    arrayList.add(aVar3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public a(vg.a aVar, int i) {
        this.d = null;
        this.f305455a = aVar;
        this.f305456b = i;
    }
}
