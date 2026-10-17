package pzd;

import com.revolut.feature.statements.api.models.StatementUrlState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StatementUrlState f240960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f240961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.consolidated.screen.a f240962y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(StatementUrlState statementUrlState, p pVar, com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f240960w = statementUrlState;
        this.f240961x = pVar;
        this.f240962y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d0 d0Var = new d0(this.f240960w, this.f240961x, this.f240962y, continuation);
        d0Var.v = obj2;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        if (r0.emit(r7, r6) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r7)
            goto L93
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            yhm.o.b(r7)
            goto L65
        L21:
            yhm.o.b(r7)
            com.revolut.feature.statements.api.models.StatementUrlState r7 = r6.f240960w
            boolean r2 = r7 instanceof com.revolut.feature.statements.api.models.StatementUrlState.InPreparation
            if (r2 == 0) goto L36
            pzd.t r2 = new pzd.t
            com.revolut.feature.statements.api.models.StatementUrlState$InPreparation r7 = (com.revolut.feature.statements.api.models.StatementUrlState.InPreparation) r7
            java.lang.String r7 = r7.getEmail()
            r2.<init>(r7)
            goto L81
        L36:
            boolean r2 = r7 instanceof com.revolut.feature.statements.api.models.StatementUrlState.Ready
            if (r2 == 0) goto L96
            pzd.p r2 = r6.f240961x
            pzd.q r2 = r2.e
            int[] r5 = pzd.c0.f240959a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            if (r2 == r4) goto L76
            if (r2 != r3) goto L70
            com.revolut.feature.statements.impl.ui.consolidated.screen.a r2 = r6.f240962y
            hk0.a r2 = r2.f88320t
            com.revolut.feature.statements.api.models.StatementUrlState$Ready r7 = (com.revolut.feature.statements.api.models.StatementUrlState.Ready) r7
            java.lang.String r7 = r7.getUrl()
            com.revolut.core.model.FileExtension$Csv r5 = com.revolut.core.model.FileExtension.Csv.f51401b
            ufm.n r7 = r2.b(r7, r4, r5)
            r6.v = r0
            r6.u = r4
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r1) goto L65
            goto L92
        L65:
            java.io.File r7 = (java.io.File) r7
            pzd.u r2 = new pzd.u
            kotlin.jvm.internal.Intrinsics.h(r7)
            r2.<init>(r7)
            goto L81
        L70:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L76:
            pzd.v r2 = new pzd.v
            com.revolut.feature.statements.api.models.StatementUrlState$Ready r7 = (com.revolut.feature.statements.api.models.StatementUrlState.Ready) r7
            java.lang.String r7 = r7.getUrl()
            r2.<init>(r7)
        L81:
            r7 = 0
            r4 = 3
            r5 = 0
            com.revolut.data.model.Data r7 = zi0.c.P(r2, r7, r5, r4)
            r6.v = r5
            r6.u = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L93
        L92:
            return r1
        L93:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L96:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pzd.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
