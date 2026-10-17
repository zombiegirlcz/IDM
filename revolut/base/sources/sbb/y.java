package sbb;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.StatementUrlState;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f261566b;

    public /* synthetic */ y(a0 a0Var, int i) {
        this.f261565a = i;
        this.f261566b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f261565a) {
            case 0:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                StatementUrlState statementUrlState = (StatementUrlState) it8.getContent();
                if (statementUrlState == null) {
                    return efm.d0.m(new Data(null, it8.getError(), it8.getLoading(), 1, null));
                }
                if (!(statementUrlState instanceof StatementUrlState.Ready)) {
                    return efm.d0.m(new Data(null, new RuntimeException("Only ready state is expected for this call"), false, 5, null));
                }
                a0 a0Var = this.f261566b;
                StatementUrlState.Ready ready = (StatementUrlState.Ready) statementUrlState;
                return new ufm.i(a0Var.o.a(ready.getUrl(), ((ij0.d) a0Var.f261529n).a(ready.getUrl())), new sa6.a(new sa6.y(8), 19), 1);
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f261566b.f261528m.c(it9);
            default:
                Intrinsics.checkNotNullParameter((File) obj2, "it");
                return this.f261566b.f261528m.a();
        }
    }
}
