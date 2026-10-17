package h7;

import android.content.Context;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes23.dex */
public final class d0 extends kotlin.jvm.internal.u implements Function1 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f149772h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj2, int i) {
        super(1);
        this.f = i;
        this.f149772h = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g1m.i iVar;
        g1m.i iVar2;
        g1m.i iVar3;
        switch (this.f) {
            case 0:
                s7.b it8 = (s7.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f149772h;
            default:
                s0m.c emitter = (s0m.c) obj2;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                z0m.q qVar = (z0m.q) this.f149772h;
                g1m.d method = qVar.b().c();
                emitter.getClass();
                AtomicReference atomicReference = emitter.f259015y;
                EnumSet enumSet = emitter.f259007n;
                Context context = emitter.f;
                String str = emitter.f259002g;
                boolean z = emitter.f259000b;
                Intrinsics.checkNotNullParameter(method, "method");
                emitter.f259012t = method;
                boolean z3 = emitter.e;
                g1m.i iVar4 = null;
                if (!z3 && z) {
                    Integer num = emitter.f259013w;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        if (str == null) {
                            Intrinsics.r("uri");
                            throw null;
                        }
                        g1m.h hVar = new g1m.h(str, context);
                        hVar.a(emitter.f259012t);
                        hVar.b(enumSet);
                        hVar.e = iIntValue;
                        hVar.f139739h = emitter.f259014x;
                        hVar.f = emitter.f259005l;
                        hVar.f139738g = emitter.f259004j;
                        hVar.i = emitter.z;
                        hVar.f139740j = emitter.C;
                        iVar3 = new g1m.i(hVar);
                    } else {
                        iVar3 = null;
                    }
                    emitter.d(iVar3);
                }
                g1m.j security = qVar.b().h();
                if (security != null) {
                    Intrinsics.checkNotNullParameter(security, "security");
                    emitter.v = security;
                    if (!z3 && z) {
                        Integer num2 = emitter.f259013w;
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            if (str == null) {
                                Intrinsics.r("uri");
                                throw null;
                            }
                            g1m.h hVar2 = new g1m.h(str, context);
                            hVar2.a(emitter.f259012t);
                            hVar2.b(enumSet);
                            hVar2.e = iIntValue2;
                            hVar2.f139739h = emitter.f259014x;
                            hVar2.f = emitter.f259005l;
                            hVar2.f139738g = emitter.f259004j;
                            hVar2.i = emitter.z;
                            hVar2.f139740j = emitter.C;
                            iVar2 = new g1m.i(hVar2);
                        } else {
                            iVar2 = null;
                        }
                        emitter.d(iVar2);
                    }
                }
                emitter.d(qVar.b().d());
                String strA = qVar.b().a();
                emitter.f259014x = strA;
                if (!z3 && z) {
                    Integer num3 = emitter.f259013w;
                    if (num3 != null) {
                        int iIntValue3 = num3.intValue();
                        if (str == null) {
                            Intrinsics.r("uri");
                            throw null;
                        }
                        g1m.h hVar3 = new g1m.h(str, context);
                        hVar3.a(emitter.f259012t);
                        hVar3.b(enumSet);
                        hVar3.e = iIntValue3;
                        hVar3.f139739h = strA;
                        hVar3.f = emitter.f259005l;
                        hVar3.f139738g = emitter.f259004j;
                        hVar3.i = emitter.z;
                        hVar3.f139740j = emitter.C;
                        iVar = new g1m.i(hVar3);
                    } else {
                        iVar = null;
                    }
                    emitter.d(iVar);
                }
                OkHttpClient okHttpClientE = qVar.b().e();
                if (!z) {
                    emitter.f259005l = okHttpClientE;
                }
                ulm.e0 e0VarF = qVar.b().f();
                if (!z) {
                    emitter.f259004j = e0VarF;
                }
                Integer numK = qVar.b().k();
                emitter.f259013w = numK;
                if (!z3 && z) {
                    if (str == null) {
                        Intrinsics.r("uri");
                        throw null;
                    }
                    g1m.h hVar4 = new g1m.h(str, context);
                    hVar4.a(emitter.f259012t);
                    hVar4.b(enumSet);
                    hVar4.e = numK.intValue();
                    hVar4.f139739h = emitter.f259014x;
                    hVar4.f = emitter.f259005l;
                    hVar4.f139738g = emitter.f259004j;
                    hVar4.i = emitter.z;
                    hVar4.f139740j = emitter.C;
                    emitter.d(new g1m.i(hVar4));
                }
                emitter.f259009q = qVar.a().e();
                d1m.b option = qVar.a().a();
                Intrinsics.checkNotNullParameter(option, "option");
                if (!emitter.f259001c.get()) {
                    emitter.u = option;
                }
                emitter.f259011s = qVar.a().c();
                emitter.f259010r = qVar.a().b();
                int iN = qVar.a().n();
                if (!z) {
                    emitter.k = iN;
                }
                qVar.a().k();
                Map mapD = qVar.a().d();
                AtomicReference atomicReference2 = emitter.A;
                if (mapD == null) {
                    mapD = new HashMap();
                }
                atomicReference2.set(mapD);
                boolean zM = qVar.a().m();
                emitter.z = zM;
                if (!z3 && z && (((g1m.e) atomicReference.get()) instanceof g1m.i)) {
                    g1m.e eVar = (g1m.e) atomicReference.get();
                    Intrinsics.i(eVar, "null cannot be cast to non-null type com.snowplowanalytics.snowplow.network.OkHttpNetworkConnection");
                    ((g1m.i) eVar).e = zM;
                }
                Map mapI = qVar.b().i();
                emitter.C = mapI;
                if (!z3 && z) {
                    Integer num4 = emitter.f259013w;
                    if (num4 != null) {
                        int iIntValue4 = num4.intValue();
                        if (str == null) {
                            Intrinsics.r("uri");
                            throw null;
                        }
                        g1m.h hVar5 = new g1m.h(str, context);
                        hVar5.a(emitter.f259012t);
                        hVar5.b(enumSet);
                        hVar5.e = iIntValue4;
                        hVar5.f139739h = emitter.f259014x;
                        hVar5.f = emitter.f259005l;
                        hVar5.f139738g = emitter.f259004j;
                        hVar5.i = emitter.z;
                        hVar5.f139740j = mapI;
                        iVar4 = new g1m.i(hVar5);
                    }
                    emitter.d(iVar4);
                }
                emitter.B.set(Boolean.valueOf(qVar.a().l()));
                emitter.E = qVar.a().h();
                emitter.D = qVar.a().i();
                return Unit.f186387a;
        }
    }
}
