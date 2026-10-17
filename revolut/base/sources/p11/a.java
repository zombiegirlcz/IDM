package p11;

import c71.b;
import com.revolut.data.database.models.statement.StatementTemplateInfoEntity;
import com.revolut.domain.models.statement.StatementTemplateId;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f231605a = r0.k(new Pair("transactions", StatementTemplateId.TRANSACTION_LIST), new Pair("csv_transactions", StatementTemplateId.TRANSACTION_LIST_CSV), new Pair("single_transaction", StatementTemplateId.SINGLE_TRANSACTION), new Pair("account_confirmation", StatementTemplateId.ACCOUNT_CONFIRMATION), new Pair("card_confirmation", StatementTemplateId.CARD_CONFIRMATION), new Pair("subject_access_request", StatementTemplateId.SUBJECT_CONFIRMATION), new Pair("direct_deposit_us", StatementTemplateId.DIRECT_DEPOSIT_US));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String a(StatementTemplateId statementTemplateId) {
        Intrinsics.checkNotNullParameter(statementTemplateId, "<this>");
        return u1.g(statementTemplateId, f231605a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final b b(StatementTemplateInfoEntity statementTemplateInfoEntity) {
        Intrinsics.checkNotNullParameter(statementTemplateInfoEntity, "<this>");
        return new b((StatementTemplateId) u1.u(statementTemplateInfoEntity.getId(), f231605a), statementTemplateInfoEntity.getUrl(), statementTemplateInfoEntity.getCheckSum());
    }
}
