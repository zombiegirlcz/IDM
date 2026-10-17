package foh;

import java.math.BigDecimal;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ twg.c f136960b;

    public /* synthetic */ c(twg.c cVar, int i) {
        this.f136959a = i;
        this.f136960b = cVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f136959a) {
            case 0:
                Object obj4 = this.f136960b.f275019c;
                return cim.b.b(adh.a.b((vel.f) obj2), adh.a.b((vel.f) obj3));
            case 1:
                Object obj5 = this.f136960b.f275019c;
                BigDecimal bigDecimalB = adh.a.b((vel.f) obj3);
                BigDecimal bigDecimalAbs = bigDecimalB != null ? bigDecimalB.abs() : null;
                BigDecimal bigDecimalB2 = adh.a.b((vel.f) obj2);
                return cim.b.b(bigDecimalAbs, bigDecimalB2 != null ? bigDecimalB2.abs() : null);
            default:
                Object obj6 = this.f136960b.f275019c;
                return cim.b.b(adh.a.b((vel.f) obj3), adh.a.b((vel.f) obj2));
        }
    }
}
