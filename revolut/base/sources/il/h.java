package il;

import b9.w2;
import com.onfido.android.sdk.capture.common.data.ThemeDataSource_Factory;
import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager_Factory;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource_Factory;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager_Factory;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker_Factory;
import com.onfido.android.sdk.capture.ui.nfc.NfcDataRepository_Factory;
import com.onfido.android.sdk.workflow.internal.workflow.WorkflowHttpExceptionMapper_Factory;
import com.onfido.javax.inject.Provider;
import fmc.z;
import fnc.s;
import g2e.t;
import h30.q;
import hd.r;
import jul.o;
import kl.d2;
import nl.y0;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements j {
    public final b A;
    public final WorkflowHttpExceptionMapper_Factory B;
    public final Provider C;
    public final Provider D;
    public final el.c E;
    public final q F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkComponent f162016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f162017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f162018c;
    public final f4h.a d;
    public final a e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f162019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f162020h;
    public final w2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Provider f162021j;
    public final t k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jx0.a f162022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jt0.b f162023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SharedPreferencesDataSource_Factory f162024n;
    public final y0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f162025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f162026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f162027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a5h.g f162028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lal.a f162029t;
    public final DocumentConfigurationManager_Factory u;
    public final NfcDataRepository_Factory v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w2 f162030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jid.z f162031x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kdh.b f162032y;
    public final k18.c z;

    public h(SdkComponent sdkComponent) {
        this.f162016a = sdkComponent;
        z zVar = new z(new g(sdkComponent, 0), 15);
        this.f162017b = zVar;
        f fVar = new f(sdkComponent, 0);
        this.f162018c = fVar;
        f4h.a aVar = new f4h.a(fVar, 16);
        this.d = aVar;
        int i = 1;
        b bVar = new b(sdkComponent, i);
        a aVar2 = new a(sdkComponent, i);
        this.e = aVar2;
        c cVar = new c(sdkComponent, 0);
        this.f = cVar;
        a aVar3 = new a(sdkComponent, 0);
        this.f162019g = aVar3;
        kdh.b bVar2 = new kdh.b(aVar3, aVar, 28);
        prl.e eVar = new prl.e(bVar, aVar2, cVar, bVar2, 20);
        int i2 = 1;
        g gVar = new g(sdkComponent, i2);
        this.f162020h = gVar;
        this.i = new w2(zVar, aVar, eVar, gVar, bVar2, new d(sdkComponent, i2), 14);
        Provider providerB = el.a.b(new fkg.a(gVar, 15));
        this.f162021j = providerB;
        t tVar = new t(providerB, 16);
        this.k = tVar;
        this.f162022l = new jx0.a(this.e, tVar, 14);
        this.f162023m = new jt0.b(this.f162017b, 24, this.d, this.f162020h);
        SharedPreferencesDataSource_Factory sharedPreferencesDataSource_FactoryCreate = SharedPreferencesDataSource_Factory.create(this.f162019g, this.f);
        this.f162024n = sharedPreferencesDataSource_FactoryCreate;
        RuntimePermissionsManager_Factory runtimePermissionsManager_FactoryCreate = RuntimePermissionsManager_Factory.create(this.f162019g, sharedPreferencesDataSource_FactoryCreate);
        t tVar2 = this.k;
        y0 y0Var = new y0(tVar2, runtimePermissionsManager_FactoryCreate, 0);
        this.o = y0Var;
        jt0.b bVar3 = this.f162023m;
        a aVar4 = this.e;
        lal.a aVar5 = new lal.a(tVar2, bVar3, y0Var, aVar4, 17);
        a aVar6 = this.f162019g;
        this.f162025p = new r(aVar6, aVar5, y0Var, tVar2, bVar3, aVar4);
        this.f162026q = new o(tVar2, bVar3, 15);
        e eVar2 = new e(sdkComponent, 1);
        k7i.i iVar = new k7i.i(aVar6, this.f, 15);
        f fVar2 = this.f162018c;
        r10.r rVar = new r10.r(fVar2, iVar, new jx0.a(aVar6, new s(fVar2, 14), 18));
        d dVar = new d(sdkComponent, 0);
        this.f162027r = dVar;
        this.f162028s = new a5h.g(tVar2, bVar3, eVar2, rVar, dVar, 29);
        this.f162029t = new lal.a(bVar3, eVar2, rVar, dVar, 21);
        this.u = DocumentConfigurationManager_Factory.create(aVar4);
        this.v = NfcDataRepository_Factory.create(new e(sdkComponent, 0), this.f);
        y0 y0Var2 = new y0(this.v, NfcTracker_Factory.create(this.f162027r), 1);
        t tVar3 = this.k;
        jx0.a aVar7 = new jx0.a(tVar3, y0Var2, 22);
        prl.e eVar3 = new prl.e(this.f162017b, this.d, this.f162020h, new c(sdkComponent, 1), 19);
        DocumentConfigurationManager_Factory documentConfigurationManager_Factory = this.u;
        a aVar8 = this.e;
        this.f162030w = new w2(tVar3, this.o, new a5h.g(documentConfigurationManager_Factory, aVar7, tVar3, eVar3, aVar8, 28), new b(sdkComponent, 2), new f(sdkComponent, 1), aVar8, 10);
        jt0.b bVar4 = this.f162023m;
        this.f162031x = new jid.z(tVar3, bVar4, 17);
        this.f162032y = new kdh.b(tVar3, bVar4, 13);
        int i3 = 11;
        this.z = new k18.c(this.k, i3, this.f162023m, ThemeDataSource_Factory.create(this.f162024n));
        this.A = new b(sdkComponent, 0);
        this.B = WorkflowHttpExceptionMapper_Factory.create(this.f);
        Provider providerB2 = el.a.b(hl.b.f152971a);
        this.C = providerB2;
        this.D = el.a.b(new d2(this.i, this.f162020h, this.k, this.f162022l, this.f162025p, this.f162026q, this.f162028s, this.f162029t, this.f162030w, this.f162031x, this.f162032y, this.z, this.A, this.B, providerB2, this.d));
        this.E = new el.c(new rl.d(new jpc.e(this.f162019g, 21, this.k, this.f162018c)));
        this.F = new q(this.C, this.e, this.f162020h, new a(sdkComponent, 2), 24);
    }
}
