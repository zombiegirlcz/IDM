package bof;

import com.revolut.feature.statements.api.models.StatementUrlState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f17414a = new l();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        StatementUrlState statementUrlState = (StatementUrlState) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (statementUrlState == null) {
            return error;
        }
        return null;
    }
}
