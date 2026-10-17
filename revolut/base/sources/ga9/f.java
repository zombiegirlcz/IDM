package ga9;

import bai.j;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.junior_graduation.api.navigation.IdentificationFlowPublicContract$OutputData;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$OutputData;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$OutputData;
import ew9.c;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lbl.a;
import pa9.c;
import y89.e;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142070b;

    public /* synthetic */ f(com.revolut.feature.onboarding.impl.onboarding.v vVar, int i) {
        this.f142069a = i;
        this.f142070b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f142069a;
        int i2 = 28;
        int i3 = 1;
        Continuation continuation = null;
        com.revolut.feature.onboarding.impl.onboarding.v vVar = this.f142070b;
        int i5 = 26;
        switch (i) {
            case 0:
                com.revolut.feature.onboarding.impl.onboarding.kyc.a output = (com.revolut.feature.onboarding.impl.onboarding.kyc.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.e(vVar, output, null), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                bai.j outputData = (bai.j) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof j.a) {
                    vVar.B2();
                } else {
                    if (!(outputData instanceof bai.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.a(vVar, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 2:
                DateOfBirthControllerDescriptor$OutputData outputData2 = (DateOfBirthControllerDescriptor$OutputData) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.d(vVar, outputData2, null), new yi5.b(26));
                return Unit.f186387a;
            case 3:
                c.a output2 = (c.a) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                vVar.l2(new a0(vVar, output2, null), new yi5.b(26));
                return Unit.f186387a;
            case 4:
                aii.q it8 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.l(vVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 5:
                pb9.h output3 = (pb9.h) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.m(vVar, output3, null), new yi5.b(26));
                return Unit.f186387a;
            case 6:
                pa9.c result = (pa9.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof pa9.d) {
                    vVar.l2(new g1k.i(vVar, result, continuation, 29), new yi5.b(26));
                } else {
                    if (!Intrinsics.f(result, c.a.f234452a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar.l2(new m(vVar, continuation, i3), new yi5.b(26));
                }
                return Unit.f186387a;
            case 7:
                d67.u output4 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.q(output4, vVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 8:
                aii.r it9 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                vVar.l2(new m(vVar, continuation, 2), new yi5.b(26));
                return Unit.f186387a;
            case 9:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                vVar.S2(error, new s(vVar, continuation, i3));
                return Boolean.TRUE;
            case 10:
                vb9.d outputData3 = (vb9.d) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.r(vVar, outputData3, null), new yi5.b(26));
                return Unit.f186387a;
            case 11:
                y89.e result2 = (y89.e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, e.a.f311640a)) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("NotPassed is not supported, should be handled by retry action");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                } else {
                    if (!Intrinsics.f(result2, e.b.f311641a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.o(vVar, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 12:
                g3a.b result3 = (g3a.b) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!(result3 instanceof g3a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                vVar.l2(new g1k.i(vVar, result3, continuation, i2), new yi5.b(26));
                return Unit.f186387a;
            case 13:
                AddressFlowContract$OutputData addressResult = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(addressResult, "addressResult");
                vVar.l2(new g1k.i(vVar, addressResult, continuation, 24), new yi5.b(26));
                return Unit.f186387a;
            case 14:
                va9.f data = (va9.f) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                vVar.l2(new g06.k(data, vVar, continuation, i2), new yi5.b(26));
                return Unit.f186387a;
            case 15:
                ka9.d result4 = (ka9.d) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.c(result4, vVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 16:
                IdentificationFlowPublicContract$OutputData output5 = (IdentificationFlowPublicContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(output5, "output");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.h(output5, vVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 17:
                lb9.e result5 = (lb9.e) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                vVar.l2(new v((aii.r) result5, vVar, continuation, 3), new yi5.b(26));
                return Unit.f186387a;
            case 18:
                ma9.f data2 = (ma9.f) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                vVar.l2(new g1k.i(vVar, data2, continuation, 27), new yi5.b(26));
                return Unit.f186387a;
            case 19:
                com.revolut.feature.onboarding.impl.onboarding.kyc.a output6 = (com.revolut.feature.onboarding.impl.onboarding.kyc.a) obj2;
                Intrinsics.checkNotNullParameter(output6, "output");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.f(vVar, output6, null), new yi5.b(26));
                return Unit.f186387a;
            case 20:
                d67.u data3 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                vVar.l2(new v((aii.r) data3, vVar, continuation, i3), new yi5.b(26));
                return Unit.f186387a;
            case 21:
                d67.u output7 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(output7, "output");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.g(output7, vVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 22:
                vja.n output8 = (vja.n) obj2;
                Intrinsics.checkNotNullParameter(output8, "output");
                vVar.l2(new v(vVar, output8, continuation, 5), new yi5.b(26));
                return Unit.f186387a;
            case 23:
                rbi.c outputData4 = (rbi.c) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.k(vVar, outputData4, null), new yi5.b(26));
                return Unit.f186387a;
            case 24:
                zb9.c it10 = (zb9.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.t(it10, vVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 25:
                NameControllerDescriptor$OutputData outputData5 = (NameControllerDescriptor$OutputData) obj2;
                Intrinsics.checkNotNullParameter(outputData5, "outputData");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.j(vVar, outputData5, null), new yi5.b(26));
                return Unit.f186387a;
            case 26:
                SubmitCitizenshipFlowOutput flowOutput = (SubmitCitizenshipFlowOutput) obj2;
                Intrinsics.checkNotNullParameter(flowOutput, "flowOutput");
                vVar.l2(new g1k.i(vVar, flowOutput, continuation, i5), new yi5.b(26));
                return Unit.f186387a;
            case 27:
                rb9.c data4 = (rb9.c) obj2;
                Intrinsics.checkNotNullParameter(data4, "data");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.p(data4, vVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 28:
                ja9.c output9 = (ja9.c) obj2;
                Intrinsics.checkNotNullParameter(output9, "output");
                vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.b(output9, vVar, null), new yi5.b(26));
                return Unit.f186387a;
            default:
                lbl.a outputData6 = (lbl.a) obj2;
                Intrinsics.checkNotNullParameter(outputData6, "outputData");
                if (Intrinsics.f(outputData6, a.C1100a.f193707a)) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("DescriptionClicked is not supported");
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                } else {
                    if (!(outputData6 instanceof lbl.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar.l2(new com.revolut.feature.onboarding.impl.onboarding.i(vVar, outputData6, null), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
