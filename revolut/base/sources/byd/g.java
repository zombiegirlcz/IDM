package byd;

import a41.j1;
import bw4.t;
import com.revolut.feature.statements.api.models.StatementUrlState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.c0;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g {
    public static final a87.b a(Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return new a87.b(mo3.a.g(flow, null, new t(16), 1), 5);
    }

    public static final v1 b(Flow flow, tji.f dialogDisplayer, a factory) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(factory, "factory");
        final vyd.a aVar = (vyd.a) factory;
        final int i = 0;
        final int i2 = 1;
        return c(flow, dialogDisplayer, aVar.d(), new Function1() { // from class: byd.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Throwable it8 = (Throwable) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((vyd.a) aVar).c(it8);
                    default:
                        StatementUrlState content = (StatementUrlState) obj2;
                        Intrinsics.checkNotNullParameter(content, "content");
                        boolean z = content instanceof StatementUrlState.InPreparation;
                        a aVar2 = aVar;
                        if (z) {
                            return ((vyd.a) aVar2).b(((StatementUrlState.InPreparation) content).getEmail());
                        }
                        if (content instanceof StatementUrlState.Ready) {
                            return ((vyd.a) aVar2).a();
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        }, new Function1() { // from class: byd.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Throwable it8 = (Throwable) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return ((vyd.a) aVar).c(it8);
                    default:
                        StatementUrlState content = (StatementUrlState) obj2;
                        Intrinsics.checkNotNullParameter(content, "content");
                        boolean z = content instanceof StatementUrlState.InPreparation;
                        a aVar2 = aVar;
                        if (z) {
                            return ((vyd.a) aVar2).b(((StatementUrlState.InPreparation) content).getEmail());
                        }
                        if (content instanceof StatementUrlState.Ready) {
                            return ((vyd.a) aVar2).a();
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    public static final v1 c(Flow flow, tji.f dialogDisplayer, c0 c0Var, Function1 errorConfig, Function1 successConfig) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(errorConfig, "errorConfig");
        Intrinsics.checkNotNullParameter(successConfig, "successConfig");
        return new v1(new j1(c0Var, flow, dialogDisplayer, successConfig, errorConfig, (Continuation) null, 2));
    }
}
