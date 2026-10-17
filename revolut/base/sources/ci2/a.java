package ci2;

import com.revolut.feature.apm.bizum.impl.ui.registration.code.BizumRegistrationOtpData;
import com.revolut.feature.apm.breb.impl.ui.new_alias.BrebAliasOtpData;
import com.revolut.feature.apm.core.code.data.ApmCodeData;
import com.revolut.feature.apm.wero.impl.ui.home.settings.alias.AliasOtpData;
import elm.f;
import hg0.n;
import iyi.j;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import uxe.l;
import zhm.h0;
import zz1.k;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements hx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24349b;

    public a(ps1.b bizumInteractor) {
        this.f24348a = 4;
        Intrinsics.checkNotNullParameter(bizumInteractor, "bizumInteractor");
        this.f24349b = bizumInteractor;
    }

    @Override // hx1.a
    public final Object a(ApmCodeData apmCodeData, j jVar) throws Throwable {
        int i = this.f24348a;
        Object obj2 = this.f24349b;
        switch (i) {
            case 0:
                if (!(apmCodeData instanceof AliasOtpData)) {
                    IllegalStateException illegalStateException = new IllegalStateException("APM Code in WERO called resendCode with unsupported data: " + apmCodeData);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    break;
                } else {
                    AliasOtpData aliasOtpData = (AliasOtpData) apmCodeData;
                    Object objK = ((uy1.j) ((vw1.b) obj2)).k(new k(aliasOtpData.f63069b, aliasOtpData.f63068a, zz1.j.CREATE), jVar);
                    if (objK != fim.a.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            case 1:
                vw1.b bVar = (vw1.b) obj2;
                if (!(apmCodeData instanceof BrebAliasOtpData)) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("APM Code in BRE-B called resendCode with unsupported data: " + apmCodeData);
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                    break;
                } else {
                    od0.a aVar = od0.a.f224253a;
                    if (!od0.a.e()) {
                        BrebAliasOtpData brebAliasOtpData = (BrebAliasOtpData) apmCodeData;
                        Object objK2 = ((uy1.j) bVar).k(new k(brebAliasOtpData.f61746b, brebAliasOtpData.f61745a, brebAliasOtpData.f61747c), jVar);
                        if (objK2 != fim.a.COROUTINE_SUSPENDED) {
                            break;
                        }
                    } else {
                        uy1.j jVar2 = (uy1.j) bVar;
                        jVar2.getClass();
                        l lVar = new l(jVar2, null, 3);
                        p0 p0Var = p0.f264001a;
                        Object objJ = e0.J(f.f127540b, lVar, jVar);
                        if (objJ != fim.a.COROUTINE_SUSPENDED) {
                            break;
                        }
                    }
                }
                break;
            case 2:
                if (!(apmCodeData instanceof com.revolut.feature.apm.qvik.impl.ui.settings.alias.AliasOtpData)) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("APM Code in QVIK called resendCode with unsupported data: " + apmCodeData);
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                    break;
                } else {
                    com.revolut.feature.apm.qvik.impl.ui.settings.alias.AliasOtpData aliasOtpData2 = (com.revolut.feature.apm.qvik.impl.ui.settings.alias.AliasOtpData) apmCodeData;
                    Object objK3 = ((uy1.j) ((vw1.b) obj2)).k(new k(aliasOtpData2.f62827b, aliasOtpData2.f62826a, zz1.j.CREATE), jVar);
                    if (objK3 != fim.a.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            case 3:
                if (!(apmCodeData instanceof com.revolut.feature.apm.spin.impl.ui.settings.AliasOtpData)) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("APM Code in SPIN called resendCode with unsupported data: " + apmCodeData);
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var4);
                    break;
                } else {
                    com.revolut.feature.apm.spin.impl.ui.settings.AliasOtpData aliasOtpData3 = (com.revolut.feature.apm.spin.impl.ui.settings.AliasOtpData) apmCodeData;
                    Object objK4 = ((uy1.j) ((vw1.b) obj2)).k(new k(aliasOtpData3.f62878b, aliasOtpData3.f62877a, aliasOtpData3.f62879c), jVar);
                    if (objK4 != fim.a.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
            default:
                if (!(apmCodeData instanceof BizumRegistrationOtpData)) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("APM Code in BizumFlow called resendCode with unsupported data: " + apmCodeData);
                    h0 h0Var5 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException5, h0Var5);
                    break;
                } else {
                    n nVar = new n(((ps1.b) obj2).f239387a, new b02.a(null, ((BizumRegistrationOtpData) apmCodeData).f61589a), null, 20);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(f.f127540b, nVar, jVar);
                    if (objJ2 != fim.a.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
        }
        return Unit.f186387a;
    }

    public a(vw1.b repository, int i) {
        this.f24348a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(repository, "repository");
                this.f24349b = repository;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(repository, "repository");
                this.f24349b = repository;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(repository, "repository");
                this.f24349b = repository;
                break;
            default:
                Intrinsics.checkNotNullParameter(repository, "repository");
                this.f24349b = repository;
                break;
        }
    }
}
