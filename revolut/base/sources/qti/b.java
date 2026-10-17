package qti;

import bti.p;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftBusinessHours;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPointsOptions;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPriceBreakdown;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import dj0.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import oti.m1;
import oti.n1;
import oti.q;
import oti.r;
import oti.z1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f249158a = r0.k(new Pair("ALLOWED", p.ALLOWED), new Pair("NOT_ALLOWED", p.NOT_ALLOWED), new Pair("ALTERNATIVE_BOOKING", p.ALTERNATIVE_BOOKING));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal a(oti.z1 r26) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qti.b.a(oti.z1):com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    public static final z1 b(AsftTerminal asftTerminal) {
        Intrinsics.checkNotNullParameter(asftTerminal, "<this>");
        String str = asftTerminal.f98737a;
        String str2 = asftTerminal.f98738b;
        int i = asftTerminal.f98739c;
        int i2 = asftTerminal.e;
        List list = asftTerminal.f98743l;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<AsftBusinessHours> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (AsftBusinessHours asftBusinessHours : list2) {
            int value = asftBusinessHours.f98708a.getValue();
            ArrayList<AsftTimeSlot> arrayList2 = asftBusinessHours.f98709b;
            Intrinsics.checkNotNullParameter(arrayList2, "<this>");
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            for (AsftTimeSlot asftTimeSlot : arrayList2) {
                Intrinsics.checkNotNullParameter(asftTimeSlot, "<this>");
                arrayList3.add(new q(asftTimeSlot.f98749a, asftTimeSlot.f98750b));
            }
            arrayList.add(new r(value, arrayList3));
        }
        ArrayList arrayList4 = arrayList.isEmpty() ? null : arrayList;
        String str3 = asftTerminal.d;
        AsftPriceBreakdown asftPriceBreakdown = asftTerminal.k;
        Intrinsics.checkNotNullParameter(asftPriceBreakdown, "<this>");
        jo3.a aVarP = mo3.a.p(asftPriceBreakdown.f98734a);
        AsftPointsOptions asftPointsOptions = asftPriceBreakdown.f98735b;
        m1 m1Var = asftPointsOptions != null ? new m1(asftPointsOptions.f98732a, mo3.a.p(asftPointsOptions.f98733b)) : null;
        d dVar = asftPriceBreakdown.f98736c;
        jo3.a aVarP2 = dVar != null ? mo3.a.p(dVar) : null;
        AsftPointsOptions asftPointsOptions2 = asftPriceBreakdown.d;
        m1 m1Var2 = asftPointsOptions2 != null ? new m1(asftPointsOptions2.f98732a, mo3.a.p(asftPointsOptions2.f98733b)) : null;
        String str4 = asftPriceBreakdown.e;
        d dVar2 = asftPriceBreakdown.f;
        return new z1(str, str2, str3, asftTerminal.f98741h, asftTerminal.f, i, asftTerminal.f98742j, asftTerminal.i, i2, asftTerminal.f98740g, new n1(aVarP, m1Var, aVarP2, m1Var2, str4, dVar2 != null ? mo3.a.p(dVar2) : null), arrayList4, asftTerminal.f98744m, u1.g(asftTerminal.f98745n, f249158a));
    }
}
