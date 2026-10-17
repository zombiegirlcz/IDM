package vv8;

import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vrl.i0;
import vv8.c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f292485b;

    public /* synthetic */ k(q qVar, int i) {
        this.f292484a = i;
        this.f292485b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f292484a) {
            case 0:
                q qVar = this.f292485b;
                y yVar = qVar.f292497s;
                t3i.i result = (t3i.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof t3i.h) {
                    t3i.h hVar = (t3i.h) result;
                    qVar.H2(yVar, new m(hVar, 0));
                    qVar.l2(new vnl.o(qVar, hVar, null, 11), new vrl.n(qVar, hVar, 9));
                } else if (result instanceof t3i.e) {
                    qVar.H2(yVar, new i0(21));
                } else {
                    if (!(result instanceof t3i.g)) {
                        if (result instanceof t3i.f) {
                            throw new IllegalStateException("Should not happen: expected selfie result but got documents");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar.C2(c.a.f292474a);
                }
                return Unit.f186387a;
            default:
                q qVar2 = this.f292485b;
                y yVar2 = qVar2.f292497s;
                t3i.i result2 = (t3i.i) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof t3i.f) {
                    t3i.f fVar = (t3i.f) result2;
                    qVar2.H2(yVar2, new l(fVar, 0));
                    qVar2.l2(new vnl.o(qVar2, fVar, null, 10), new vrl.n(qVar2, fVar, 8));
                } else if (result2 instanceof t3i.e) {
                    qVar2.H2(yVar2, new i0(20));
                } else {
                    if (!(result2 instanceof t3i.g)) {
                        if (result2 instanceof t3i.h) {
                            throw new IllegalStateException("Should not happen: expected documents result but got selfie");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar2.C2(c.a.f292474a);
                }
                return Unit.f186387a;
        }
    }
}
