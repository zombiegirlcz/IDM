package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ i A;
    public final /* synthetic */ f B;
    public final /* synthetic */ String C;
    public BeneficiaryCreationFlowContract$CreationProcessState u;
    public f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public yki.a f99751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BeneficiaryCreationFlowContract$CreationProcessState f99752x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f99753y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(f fVar, String str, Continuation continuation, Function1 function1) {
        super(1, continuation);
        this.A = (i) function1;
        this.B = fVar;
        this.C = str;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.B, this.C, continuation, this.A);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
    
        if (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f.I2(r0, r3, r11, r10) == r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Type inference failed for: r11v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
