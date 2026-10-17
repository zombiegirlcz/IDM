package btb;

import com.revolut.feature.kyc.vendors.shared.api.uae_pass.UaePassFlowOutputData;
import jt8.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kt8.b;
import ps8.b;
import vs8.b;
import wp5.v;
import ws8.b;
import xs8.b;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f18523b;

    public /* synthetic */ f(v vVar, int i) {
        this.f18522a = i;
        this.f18523b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object dVar;
        Object dVar2;
        Object dVar3;
        Object cVar;
        Object dVar4;
        Object cVar2;
        Object dVar5;
        Object dVar6;
        Object dVar7;
        Object dVar8;
        switch (this.f18522a) {
            case 0:
                ks8.h webIdResult = (ks8.h) obj2;
                Intrinsics.checkNotNullParameter(webIdResult, "webIdResult");
                if (Intrinsics.f(webIdResult, ks8.f.f189310a)) {
                    dVar = new od9.c(null);
                } else if (Intrinsics.f(webIdResult, ks8.g.f189311a)) {
                    dVar = new od9.d(null);
                } else {
                    if (!Intrinsics.f(webIdResult, ks8.e.f189309a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = od9.b.f224331a;
                }
                this.f18523b.invoke(dVar);
                return Unit.f186387a;
            case 1:
                vs8.b output = (vs8.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, b.C1619b.f291747a)) {
                    dVar2 = new od9.d(null);
                } else {
                    if (!Intrinsics.f(output, b.a.f291746a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar2 = od9.a.f224330a;
                }
                this.f18523b.invoke(dVar2);
                return Unit.f186387a;
            case 2:
                UaePassFlowOutputData output2 = (UaePassFlowOutputData) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof UaePassFlowOutputData.Completed) {
                    dVar3 = new od9.d(((UaePassFlowOutputData.Completed) output2).f77914a);
                } else {
                    boolean zF = Intrinsics.f(output2, UaePassFlowOutputData.Cancelled.f77913a);
                    od9.a aVar = od9.a.f224330a;
                    if (!zF && !Intrinsics.f(output2, UaePassFlowOutputData.ApplicationUnavailable.f77912a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar3 = aVar;
                }
                this.f18523b.invoke(dVar3);
                return Unit.f186387a;
            case 3:
                ms8.e output3 = (ms8.e) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof ms8.d) {
                    cVar = new od9.d(((ms8.d) output3).f208635a);
                } else if (Intrinsics.f(output3, ms8.c.f208634a)) {
                    cVar = new od9.c(null);
                } else {
                    if (!Intrinsics.f(output3, ms8.b.f208633a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = od9.a.f224330a;
                }
                this.f18523b.invoke(cVar);
                return Unit.f186387a;
            case 4:
                zs8.d output4 = (zs8.d) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (output4 instanceof zs8.b) {
                    dVar4 = od9.a.f224330a;
                } else {
                    if (!(output4 instanceof zs8.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar4 = new od9.d(((zs8.c) output4).f324827a);
                }
                this.f18523b.invoke(dVar4);
                return Unit.f186387a;
            case 5:
                at8.e output5 = (at8.e) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                if (Intrinsics.f(output5, at8.d.f9019a)) {
                    cVar2 = new od9.d(null);
                } else if (output5 instanceof at8.c) {
                    cVar2 = new od9.c(((at8.c) output5).f9018a);
                } else {
                    if (!Intrinsics.f(output5, at8.b.f9017a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2 = od9.b.f224331a;
                }
                this.f18523b.invoke(cVar2);
                return Unit.f186387a;
            case 6:
                ws8.b output6 = (ws8.b) obj2;
                Intrinsics.checkNotNullParameter(output6, "output");
                if (output6 instanceof b.a) {
                    dVar5 = od9.a.f224330a;
                } else {
                    if (!(output6 instanceof ws8.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar5 = new od9.d(((ws8.c) output6).f299680a);
                }
                this.f18523b.invoke(dVar5);
                return Unit.f186387a;
            case 7:
                xs8.b output7 = (xs8.b) obj2;
                Intrinsics.checkNotNullParameter(output7, "output");
                if (output7 instanceof b.a) {
                    dVar6 = od9.a.f224330a;
                } else {
                    if (!(output7 instanceof xs8.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar6 = new od9.d(((xs8.c) output7).f308439a);
                }
                this.f18523b.invoke(dVar6);
                return Unit.f186387a;
            case 8:
                ps8.b output8 = (ps8.b) obj2;
                Intrinsics.checkNotNullParameter(output8, "output");
                if (!Intrinsics.f(output8, b.a.f239427a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f18523b.invoke(new od9.c(null));
                return Unit.f186387a;
            case 9:
                ss8.d output9 = (ss8.d) obj2;
                Intrinsics.checkNotNullParameter(output9, "output");
                if (output9 instanceof ss8.c) {
                    dVar7 = new od9.d(((ss8.c) output9).f265358a);
                } else {
                    if (!Intrinsics.f(output9, ss8.b.f265357a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar7 = od9.a.f224330a;
                }
                this.f18523b.invoke(dVar7);
                return Unit.f186387a;
            case 10:
                jt8.b result = (jt8.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, b.C1012b.f178430a)) {
                    dVar8 = new od9.c(null);
                } else if (Intrinsics.f(result, b.a.f178429a)) {
                    dVar8 = od9.a.f224330a;
                } else {
                    if (!(result instanceof jt8.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar8 = new od9.d(((jt8.c) result).f178431a);
                }
                this.f18523b.invoke(dVar8);
                return Unit.f186387a;
            case 11:
                kt8.b output10 = (kt8.b) obj2;
                Intrinsics.checkNotNullParameter(output10, "output");
                if (!(output10 instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f18523b.invoke(od9.a.f224330a);
                return Unit.f186387a;
            case 12:
                ts8.e output11 = (ts8.e) obj2;
                Intrinsics.checkNotNullParameter(output11, "output");
                boolean zF2 = Intrinsics.f(output11, ts8.d.f274055a);
                v vVar = this.f18523b;
                if (zF2 || Intrinsics.f(output11, ts8.a.f274052a) || Intrinsics.f(output11, ts8.b.f274053a)) {
                    vVar.invoke(od9.a.f224330a);
                } else {
                    if (!Intrinsics.f(output11, ts8.c.f274054a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar.invoke(new od9.d(null));
                }
                return Unit.f186387a;
            default:
                us8.a output12 = (us8.a) obj2;
                Intrinsics.checkNotNullParameter(output12, "output");
                if (!Intrinsics.f(output12, us8.a.f282836a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f18523b.invoke(od9.a.f224330a);
                return Unit.f186387a;
        }
    }
}
