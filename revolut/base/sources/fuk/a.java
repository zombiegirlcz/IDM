package fuk;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f138226a;

    public a(l80.e dateProvider, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f138226a = dateProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f138226a = dateProvider;
                break;
        }
    }

    public vrk.f a(vrk.f barSelection, cel.n... charts) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(barSelection, "barSelection");
        Intrinsics.checkNotNullParameter(charts, "charts");
        vrk.d dVar = vrk.d.f291612a;
        if (!Intrinsics.f(barSelection, dVar)) {
            if (barSelection instanceof vrk.e) {
                return barSelection;
            }
            throw new NoWhenBranchMatchedException();
        }
        int year = ((l80.f) this.f138226a).e().getYear();
        int i = 0;
        for (cel.n nVar : charts) {
            List listA = nVar.a();
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it8 = listA.iterator();
                while (it8.hasNext()) {
                    if (((cel.m) it8.next()).f23505b == year) {
                        return new vrk.e(year);
                    }
                }
            }
        }
        int length = charts.length;
        while (true) {
            if (i >= length) {
                break;
            }
            cel.m mVar = (cel.m) zhm.d0.d0(charts[i].a());
            numValueOf = mVar != null ? Integer.valueOf(mVar.f23505b) : null;
            if (numValueOf != null) {
                break;
            }
            i++;
        }
        return numValueOf != null ? new vrk.e(numValueOf.intValue()) : dVar;
    }

    public a(l80.e dateProvider, lia.c intervalCalculator) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(intervalCalculator, "intervalCalculator");
        this.f138226a = dateProvider;
    }
}
