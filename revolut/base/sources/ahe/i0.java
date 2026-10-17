package ahe;

import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ ProductSpaceIdentifier A;
    public FlowCollector u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f4999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ pie.v f5000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5001y;
    public final /* synthetic */ w0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pie.v vVar, ArrayList arrayList, w0 w0Var, ProductSpaceIdentifier productSpaceIdentifier, Continuation continuation) {
        super(2, continuation);
        this.f5000x = vVar;
        this.f5001y = arrayList;
        this.z = w0Var;
        this.A = productSpaceIdentifier;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i0 i0Var = new i0(this.f5000x, this.f5001y, this.z, this.A, continuation);
        i0Var.f4999w = obj2;
        return i0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r12 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r0.emit(r12, r11) != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4999w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.v
            java.util.ArrayList r8 = r11.f5001y
            ahe.w0 r3 = r11.z
            pie.v r4 = r11.f5000x
            r9 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L29
            if (r2 == r5) goto L23
            if (r2 != r9) goto L1b
            yhm.o.b(r12)
            goto L66
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            kotlinx.coroutines.flow.FlowCollector r0 = r11.u
            yhm.o.b(r12)
            goto L47
        L29:
            yhm.o.b(r12)
            pie.v r12 = pie.v.FLAT_ROOT
            if (r4 != r12) goto L36
            com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel$FlatSubSpaceContentModel r12 = new com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel$FlatSubSpaceContentModel
            r12.<init>(r4, r8)
            goto L59
        L36:
            lge.h r12 = r3.k
            r11.f4999w = r10
            r11.u = r0
            r11.v = r5
            com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier r2 = r11.A
            java.lang.Object r12 = r12.d(r2, r4, r11)
            if (r12 != r1) goto L47
            goto L65
        L47:
            r5 = r12
            com.revolut.core.ui_kit.models.Clause r5 = (com.revolut.core.ui_kit.models.Clause) r5
            lge.j r12 = r3.f5046l
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r6 = lge.j.a(r4)
            com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel$GroupedSubSpaceContentModel r3 = new com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel$GroupedSubSpaceContentModel
            r4 = 0
            pie.v r7 = r11.f5000x
            r3.<init>(r4, r5, r6, r7, r8)
            r12 = r3
        L59:
            r11.f4999w = r10
            r11.u = r10
            r11.v = r9
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ahe.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
