package qri;

import aqd.n1;
import efm.d0;
import efm.k;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import pfm.h;
import rfm.m;
import ufm.f;
import ufm.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ori.b f248733b;

    public b(ori.b presentationModel) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f248733b = presentationModel;
    }

    public abstract ufm.b e();

    public abstract ufm.b f();

    public final Object g() throws Exception {
        Object step = this.f248733b.getStep();
        if (step != null) {
            return step;
        }
        final String strQ = j6.a.q("No current step for router ", o0.f186429a.b(getClass()).m());
        throw new Exception(strQ) { // from class: com.revolut.retail.core.mvp.router.BaseFlowRouter$NoCurrentStepException

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f98613a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(strQ);
                Intrinsics.checkNotNullParameter(strQ, "message");
                this.f98613a = strQ;
            }

            @Override // java.lang.Throwable
            public final String getMessage() {
                return this.f98613a;
            }
        };
    }

    public abstract ufm.b h(Object obj2, Boolean bool);

    public final i i(Object obj2, Boolean bool) {
        i iVar = new i(h(obj2, bool), new qmd.c(24, new n1(19, bool)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public abstract k j(Object obj2);

    public abstract k k(Object obj2);

    public efm.b l() {
        h hVar = new h(new f(new m(k(g()), new qmd.c(27, new a(this, 2)), 0).l(e()), new qmd.c(28, new a(this, 3)), 0), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }

    public final efm.b m() {
        k kVarJ = j(g());
        qmd.c cVar = new qmd.c(25, new a(this, 0));
        kVarJ.getClass();
        h hVar = new h(new f(new m(kVarJ, cVar, 0).l(f()), new qmd.c(26, new a(this, 1)), 0), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }

    public abstract d0 n();

    public final r o() {
        r rVarEmpty;
        if (this.f248733b.getStep() == null) {
            rVarEmpty = new i(n(), new qmd.c(29, new a(this, 4)), 0).x();
        } else {
            rVarEmpty = r.empty();
        }
        r rVarConcatWith = rVarEmpty.concatWith(this.f248734a);
        Intrinsics.checkNotNullExpressionValue(rVarConcatWith, "concatWith(...)");
        return rVarConcatWith;
    }
}
