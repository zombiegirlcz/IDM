package ava;

import kotlin.jvm.internal.Intrinsics;
import pa6.m;
import rb8.e;
import tsk.t;
import vc.s;
import vfg.p;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f9977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f9979c;

    public b(m mVar, e eVar, a aVar) {
        this.f9977a = mVar;
        this.f9978b = aVar;
        this.f9979c = eVar;
    }

    public final uc.d a() {
        aa6.c cVarB = this.f9977a.b();
        s.j(cVarB);
        t recurringPaymentExtendedContentCharityProvider = new t(cVarB);
        xua.a recurringPaymentInteractor = this.f9978b.a();
        s.j(recurringPaymentInteractor);
        p recurringPaymentExtendedContentJuniorAllowanceProvider = new p(((rb8.a) this.f9979c).a());
        Intrinsics.checkNotNullParameter(recurringPaymentExtendedContentCharityProvider, "recurringPaymentExtendedContentCharityProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentExtendedContentJuniorAllowanceProvider, "recurringPaymentExtendedContentJuniorAllowanceProvider");
        uc.d dVar = new uc.d();
        dVar.f278952a = recurringPaymentExtendedContentCharityProvider;
        dVar.f278953b = recurringPaymentInteractor;
        dVar.f278954c = recurringPaymentExtendedContentJuniorAllowanceProvider;
        return dVar;
    }
}
