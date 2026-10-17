package ex3;

import com.revolut.feature.confirmation_code.data.OtpTask;
import elm.f;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import prl.k;
import q24.d;
import q24.e;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements pk3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f130352a;

    public a(e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f130352a = repository;
    }

    @Override // pk3.a
    public final Object a(OtpTask otpTask, h1 h1Var, i iVar) throws Throwable {
        Continuation continuation = null;
        if (h1Var == null) {
            h1Var = null;
        }
        if (h1Var == null) {
            throw new IllegalStateException("ProductPayload must be passed as payload");
        }
        e eVar = this.f130352a;
        eVar.getClass();
        d dVar = new d(eVar, h1Var, continuation, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, dVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    @Override // pk3.a
    public final Object b(OtpTask otpTask, String str, h1 h1Var, Continuation continuation) throws Throwable {
        Continuation continuation2 = null;
        h1 h1Var2 = h1Var != null ? h1Var : null;
        if (h1Var2 == null) {
            throw new IllegalStateException("ProductPayload must be passed as payload");
        }
        e eVar = this.f130352a;
        eVar.getClass();
        k kVar = new k(14, eVar, h1Var2, str, continuation2);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, kVar, continuation);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
