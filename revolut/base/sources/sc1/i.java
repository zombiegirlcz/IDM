package sc1;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.kompot.common.flow.permissions.a;
import d67.q;
import d67.s;
import d67.u;
import fa1.a0;
import fa1.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sc1.e;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f261613b;

    public /* synthetic */ i(l lVar, int i) {
        this.f261612a = i;
        this.f261613b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f261612a;
        e.a aVar = e.a.f261607a;
        q qVar = q.f111462a;
        s sVar = s.f111464a;
        int i2 = 1;
        l lVar = this.f261613b;
        switch (i) {
            case 0:
                com.revolut.kompot.common.flow.permissions.a it8 = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof a.C0596a) {
                    lVar.D2(true);
                } else {
                    int i3 = 2;
                    if (!(it8 instanceof sii.c) && !(it8 instanceof sii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar.C2(new j(lVar, i3));
                }
                return Unit.f186387a;
            case 1:
                com.revolut.kompot.common.flow.permissions.a it9 = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof a.C0596a) {
                    lVar.D2(true);
                } else if (it9 instanceof sii.c) {
                    lVar.C2(new j(lVar, 3));
                } else {
                    if (!(it9 instanceof sii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar.C2(new j(lVar, i2));
                }
                return Unit.f186387a;
            case 2:
                kii.d result = (kii.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                lVar.B2();
                if (result.d) {
                    lVar.E.d(Boolean.TRUE);
                    lVar.C1(new ExternalDestination.ByIntent(((s70.b) lVar.f261618y).c(), null));
                } else {
                    lVar.C2(new j(lVar, 4));
                }
                return Unit.f186387a;
            case 3:
                u output = (u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                lVar.B2();
                if (Intrinsics.f(output, sVar)) {
                    lVar.E.d(Boolean.TRUE);
                    lVar.C1(new ExternalDestination.ByIntent(((s70.b) lVar.f261618y).b(), null));
                } else if (Intrinsics.f(output, qVar)) {
                    lVar.v2(aVar);
                } else {
                    int i5 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 4:
                u output2 = (u) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                lVar.B2();
                if (Intrinsics.f(output2, sVar)) {
                    lVar.E.d(Boolean.TRUE);
                    lVar.C1(new ExternalDestination.ByIntent(((s70.b) lVar.f261618y).b(), null));
                } else if (Intrinsics.f(output2, qVar)) {
                    lVar.v2(aVar);
                } else {
                    int i6 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 5:
                u output3 = (u) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                lVar.B2();
                if (Intrinsics.f(output3, sVar)) {
                    lVar.D2(true);
                } else if (Intrinsics.f(output3, qVar)) {
                    lVar.v2(aVar);
                } else {
                    int i21 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 6:
                u output4 = (u) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                lVar.B2();
                if (Intrinsics.f(output4, sVar)) {
                    lVar.D2(true);
                } else if (Intrinsics.f(output4, qVar)) {
                    lVar.v2(aVar);
                } else {
                    int i22 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 7:
                lVar.D.d(Boolean.TRUE);
                lVar.D2(true);
                return Unit.f186387a;
            case 8:
                cji.d dVar = lVar.C;
                z scanResult = (z) obj2;
                Intrinsics.checkNotNullParameter(scanResult, "scanResult");
                if (Intrinsics.f(scanResult, z.a.C0782a.f133227a)) {
                    lVar.C2(new j(lVar, 6));
                } else if (Intrinsics.f(scanResult, z.a.b.f133228a)) {
                    lVar.C2(new j(lVar, 7));
                } else if (Intrinsics.f(scanResult, z.a.c.f133229a)) {
                    dVar.d(Boolean.TRUE);
                } else if (scanResult instanceof a0) {
                    lVar.B.d(((a0) scanResult).f133188a);
                } else {
                    boolean zF = Intrinsics.f(scanResult, z.c.C0783c.f133232a);
                    int i32 = 0;
                    PermissionsFlowContract$Explanation.None none = PermissionsFlowContract$Explanation.None.f98339a;
                    if (zF) {
                        dVar.d(Boolean.FALSE);
                        yji.l.i2(lVar, new PermissionsFlow(r0.k(new Pair("android.permission.BLUETOOTH_CONNECT", none), new Pair("android.permission.BLUETOOTH_SCAN", none))), null, new i(lVar, i32), 1);
                    } else if (Intrinsics.f(scanResult, z.c.a.f133230a)) {
                        dVar.d(Boolean.FALSE);
                        Intrinsics.checkNotNullParameter(lVar, "<this>");
                        knm.b.j(lVar.l1(), new ExternalDestination.ByIntent(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 55));
                    } else if (Intrinsics.f(scanResult, z.c.d.f133233a)) {
                        dVar.d(Boolean.FALSE);
                        yji.l.i2(lVar, new PermissionsFlow(q0.c(new Pair("android.permission.ACCESS_FINE_LOCATION", none))), null, new i(lVar, i2), 1);
                    } else if (Intrinsics.f(scanResult, z.c.e.f133234a)) {
                        dVar.d(Boolean.FALSE);
                        lVar.C2(new j(lVar, i32));
                    } else {
                        if (!Intrinsics.f(scanResult, z.c.b.f133231a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ea1.b.a("BLE is not supported", fa1.k.INFO);
                    }
                }
                return Unit.f186387a;
            default:
                u output5 = (u) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                lVar.B2();
                if (Intrinsics.f(output5, sVar)) {
                    lVar.D2(true);
                } else if (Intrinsics.f(output5, qVar)) {
                    lVar.v2(aVar);
                } else {
                    int i33 = jli.h.f175850a;
                }
                return Unit.f186387a;
        }
    }
}
