package c0l;

import brc.h;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b f20297b;

    public /* synthetic */ d(com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b bVar, int i) {
        this.f20296a = i;
        this.f20297b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        switch (this.f20296a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b bVar = this.f20297b;
                l.a1(bVar, bVar.X1(new y0(null, bVar.f104215p.g(it8), false, 5)), null, null, new h(bVar, null, 21), 3);
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var2);
                com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b bVar2 = this.f20297b;
                bVar2.X1(new y0(null, bVar2.f104215p.g(it8), false, 5));
                break;
        }
        return Boolean.TRUE;
    }
}
