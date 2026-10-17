package ypb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f315813a;

    public g(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f315813a = dateProvider;
    }

    public final List a(long j2, ejb.e eVar) {
        if (eVar == null) {
            return f0.f322471a;
        }
        LocalDate localDateE = ((l80.f) this.f315813a).e();
        List<ejb.d> list = eVar.d;
        ArrayList arrayList = new ArrayList();
        for (ejb.d dVar : list) {
            Float fValueOf = dVar.f126838a.isBefore(localDateE) || dVar.f126838a.isEqual(localDateE) ? Float.valueOf(pyd.c.O(pyd.c.O(dVar.f126839b, dVar.f126840c), dVar.d).f115082a + j2) : null;
            if (fValueOf != null) {
                arrayList.add(fValueOf);
            }
        }
        return arrayList;
    }
}
