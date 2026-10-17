package yt2;

import android.os.Build;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import be7.k;
import com.revolut.feature.call_security_info.impl.network.ActiveCallsService;
import h30.n;
import h80.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import m30.j;
import skm.e0;
import skm.p0;
import vc.s;
import vfg.p;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f316611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f316612b;

    public f(g gVar, int i) {
        this.f316611a = gVar;
        this.f316612b = i;
    }

    @Override // phm.a
    public final Object get() {
        zt2.h hVar;
        g gVar = this.f316611a;
        nj0.a aVar = gVar.f;
        ee0.a aVar2 = gVar.f316616g;
        ee7.a aVar3 = gVar.f316615c;
        l70.e eVar = gVar.d;
        int i = this.f316612b;
        switch (i) {
            case 0:
                CoroutineScope coroutineScopeA = gVar.f316613a.a();
                s.j(coroutineScopeA);
                j jVar = (j) ((n) gVar.f316614b).Z.get();
                s.j(jVar);
                k kVarC = aVar3.c();
                s.j(kVarC);
                y80.a aVarR = eVar.r();
                s.j(aVarR);
                p pVar = new p(new wt2.b(gVar.e.f308745a.a()));
                n80.b buildInfo = new n80.b();
                d4m.a phoneCallStateReceiverImpl = e4m.b.a(gVar.f316618j);
                d4m.a legacyPhoneCallStateReceiverImpl = e4m.b.a(gVar.k);
                Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
                Intrinsics.checkNotNullParameter(phoneCallStateReceiverImpl, "phoneCallStateReceiverImpl");
                Intrinsics.checkNotNullParameter(legacyPhoneCallStateReceiverImpl, "legacyPhoneCallStateReceiverImpl");
                nd.p phoneCallStateReceiverFactory = new nd.p();
                a aVar4 = b.Companion;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(phoneCallStateReceiverFactory, "phoneCallStateReceiverFactory");
                if (Build.VERSION.SDK_INT >= 31) {
                    Object obj2 = phoneCallStateReceiverImpl.get();
                    Intrinsics.h(obj2);
                    hVar = (zt2.h) obj2;
                } else {
                    Object obj3 = legacyPhoneCallStateReceiverImpl.get();
                    Intrinsics.h(obj3);
                    hVar = (zt2.h) obj3;
                }
                z70.a contextProvider = eVar.f();
                s.j(contextProvider);
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                Object systemService = contextProvider.getContext().getSystemService("telecom");
                Intrinsics.i(systemService, "null cannot be cast to non-null type android.telecom.TelecomManager");
                o7.b bVar = new o7.b((ActiveCallsService) gVar.f316619l.get());
                aVar4.getClass();
                e.a aVar5 = h80.e.f149935b;
                s.k(aVar5);
                return new zt2.c(coroutineScopeA, jVar, kVarC, aVarR, pVar, hVar, (TelecomManager) systemService, bVar, aVar5);
            case 1:
                TelephonyManager telephonyManagerA = gVar.a();
                b.Companion.getClass();
                return new zt2.j(telephonyManagerA, e0.f(p0.f264002b));
            case 2:
                return new zt2.g(gVar.a());
            case 3:
                ik0.b retrofitFactory = ((nj0.d) aVar).m();
                s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar).d();
                b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(ActiveCallsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                ActiveCallsService activeCallsService = (ActiveCallsService) objCreate;
                s.k(activeCallsService);
                return activeCallsService;
            case 4:
                y80.a aVarR2 = eVar.r();
                s.j(aVarR2);
                return new zt2.e(aVarR2, (ue0.c) gVar.f316621n.get());
            case 5:
                xe0.f storageFactory = aVar2.f();
                s.j(storageFactory);
                je0.d mapper = aVar2.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = gVar.f316617h.b();
                s.j(databaseSessionProvider);
                b.Companion.getClass();
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                return xe0.f.f(storageFactory, databaseSessionProvider, "call_security_info_storage", mapper, 0, null, 56);
            case 6:
                return new cu2.c((ue0.c) gVar.f316621n.get(), (CoroutineScope) gVar.f316622p.get());
            case 7:
                b.Companion.getClass();
                p0 p0Var = p0.f264001a;
                return rd0.e.a(elm.f.f127540b);
            case 8:
                be7.h hVarB = aVar3.b();
                s.j(hVarB);
                return new du2.c(hVarB);
            default:
                throw new AssertionError(i);
        }
    }
}
