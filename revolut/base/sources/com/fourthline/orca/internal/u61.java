package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.bf1;
import com.fourthline.orca.internal.c6;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class u61 {
    public final e71 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        m.Companion companion = yhm.m.INSTANCE;
        return new e71(new bf1.b(new ye1(new af1("Fourthline", new ze1(true), (ff) null, new ty0(vc.b(context)), (bz0) null, (m2) null, 52, (DefaultConstructorMarker) null))), 0L, 2, null);
    }

    public final g71 b() {
        return new g71(0L, 1, null);
    }

    public final v51 c() {
        wf wfVar = new wf(true, 18, 10000L, 30000L);
        km kmVar = new km(true, "Default", (gd0) null, 4, (DefaultConstructorMarker) null);
        aim.e eVarB = zhm.u.b();
        aim.e eVarB2 = zhm.u.b();
        eVarB2.add(new CountryNetworkModel.Document(DocumentType.PASSPORT, zhm.u.c("NLD"), null, null, 12, null));
        eVarB2.add(new CountryNetworkModel.Document(DocumentType.DUTCH_DRIVERS_LICENSE, zhm.u.c("NLD"), null, null, 12, null));
        eVarB.add(new CountryNetworkModel("NLD", zhm.u.a(eVarB2)));
        Unit unit = Unit.f186387a;
        return new v51(0L, new dj(null, null, null, true, null, null, null, wfVar, kmVar, zhm.u.a(eVarB), false, 1143, null), 1, null);
    }

    public final s61 d() {
        return new s61(0L, new n01(null, new p21(true, (Integer) null, 2, (DefaultConstructorMarker) null), new n11(true, new o11(false)), null, 9, null), 1, null);
    }

    public final t61 e() {
        return new t61(0L, 1, null);
    }

    public final m51 a() {
        m.Companion companion = yhm.m.INSTANCE;
        return new m51(new c6.b("https://fourthline.com/"), 0L, 2, null);
    }
}
