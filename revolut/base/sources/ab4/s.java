package ab4;

import cli.y;
import com.google.common.collect.ImmutableSet;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.ESignDocumentsScreenContract$InputData;
import ft3.h1;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import nii.y0;
import vkm.v1;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends oki.h implements dli.b {
    public final ESignDocumentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ex3.a f2887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Set f2888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f2889r;

    public s(ESignDocumentsScreenContract$InputData inputData, ex3.a interactor, ImmutableSet errorHandlers, u stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(errorHandlers, "errorHandlers");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f2887p = interactor;
        this.f2888q = errorHandlers;
        this.f2889r = mra.d.b(this, new h(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        h1 productPayload = w0.F(this.o.f67653a);
        ex3.a aVar = this.f2887p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        Continuation continuation = null;
        yji.l.a1(this, new v1(new dp4.p(aVar, productPayload, continuation, 23)), new r(this, continuation, 0), null, new r(this, continuation, 1), 2);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f2889r;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Continuation continuation;
        Object next;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator it8 = this.f2888q.iterator();
        while (true) {
            continuation = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((qk3.a) next).a(throwable)) {
                break;
            }
        }
        qk3.a aVar = (qk3.a) next;
        if (aVar == null) {
            return false;
        }
        y0 y0VarB = aVar.b();
        yji.l.a1(this, X1(y0VarB), null, null, new a26.q(this, y0VarB, continuation, 7), 3);
        return true;
    }
}
