package com.revolut.feature.pay_bills_taxes.impl.ui.flow;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import d8l.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nf9.f;
import nii.y0;
import nii.z;
import ofm.q;
import oki.h;
import ph9.c;
import v60.e;
import y8a.g;
import yji.n;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements yf9.a {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vf9.a f78694p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f78695q;

    public b(f interactor, vf9.a errorHandlerExtension) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        this.o = interactor;
        this.f78694p = errorHandlerExtension;
        this.f78695q = d.a(this, new g(this, 23));
    }

    @Override // yki.j
    public final void M0() {
        l2(new y7i.h(this, null, 12), new yi5.b(26));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        z zVar;
        v60.d bVar;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ve7.i onFinish = new ve7.i(7);
        vf9.b bVar2 = (vf9.b) this.f78694p;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        c cVar = bVar2.f288537l;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Continuation continuation = null;
        if ((throwable instanceof UserDeclinedTwoFaException) || (throwable instanceof HandledNetworkException)) {
            zVar = null;
        } else {
            ServerError serverErrorA = cVar.f236248a.a(throwable);
            Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
            e eVar = cVar.f236249b;
            if (numValueOf == null || (bVar = ((ao0.a) eVar).b(numValueOf)) == null) {
                bVar = new v60.b();
            }
            zVar = new z(q.O(bVar), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
        }
        if (zVar == null) {
            return false;
        }
        n.j2(bVar2, bVar2.L2(new y0(null, zVar, false, 5)), null, new u29.c(bVar2, onFinish, continuation, 13), 3);
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78695q;
    }
}
