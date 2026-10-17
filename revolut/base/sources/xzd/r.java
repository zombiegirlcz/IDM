package xzd;

import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.StatementUrlState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ StatementUrlState f309942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CustomisationSelection f309943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.custom_statement.screen.b f309944y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(StatementUrlState statementUrlState, CustomisationSelection customisationSelection, com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f309942w = statementUrlState;
        this.f309943x = customisationSelection;
        this.f309944y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.f309942w, this.f309943x, this.f309944y, continuation);
        rVar.v = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r0.emit(r7, r6) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
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
            goto L95
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            yhm.o.b(r7)
            goto L67
        L21:
            yhm.o.b(r7)
            com.revolut.feature.statements.api.models.StatementUrlState r7 = r6.f309942w
            boolean r2 = r7 instanceof com.revolut.feature.statements.api.models.StatementUrlState.InPreparation
            if (r2 == 0) goto L36
            pzd.t r2 = new pzd.t
            com.revolut.feature.statements.api.models.StatementUrlState$InPreparation r7 = (com.revolut.feature.statements.api.models.StatementUrlState.InPreparation) r7
            java.lang.String r7 = r7.getEmail()
            r2.<init>(r7)
            goto L83
        L36:
            boolean r2 = r7 instanceof com.revolut.feature.statements.api.models.StatementUrlState.Ready
            if (r2 == 0) goto L98
            com.revolut.feature.statements.api.models.CustomisationSelection r2 = r6.f309943x
            com.revolut.feature.statements.api.models.StatementsFormat r2 = r2.getFormat()
            int[] r5 = xzd.q.f309941a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            if (r2 == r4) goto L78
            if (r2 != r3) goto L72
            com.revolut.feature.statements.impl.ui.custom_statement.screen.b r2 = r6.f309944y
            hk0.a r2 = r2.u
            com.revolut.feature.statements.api.models.StatementUrlState$Ready r7 = (com.revolut.feature.statements.api.models.StatementUrlState.Ready) r7
            java.lang.String r7 = r7.getUrl()
            com.revolut.core.model.FileExtension$Csv r5 = com.revolut.core.model.FileExtension.Csv.f51401b
            ufm.n r7 = r2.b(r7, r4, r5)
            r6.v = r0
            r6.u = r4
            java.lang.Object r7 = nim.a.b(r7, r6)
            if (r7 != r1) goto L67
            goto L94
        L67:
            java.io.File r7 = (java.io.File) r7
            pzd.u r2 = new pzd.u
            kotlin.jvm.internal.Intrinsics.h(r7)
            r2.<init>(r7)
            goto L83
        L72:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L78:
            pzd.v r2 = new pzd.v
            com.revolut.feature.statements.api.models.StatementUrlState$Ready r7 = (com.revolut.feature.statements.api.models.StatementUrlState.Ready) r7
            java.lang.String r7 = r7.getUrl()
            r2.<init>(r7)
        L83:
            r7 = 0
            r4 = 3
            r5 = 0
            com.revolut.data.model.Data r7 = zi0.c.P(r2, r7, r5, r4)
            r6.v = r5
            r6.u = r3
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r1) goto L95
        L94:
            return r1
        L95:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L98:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xzd.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
