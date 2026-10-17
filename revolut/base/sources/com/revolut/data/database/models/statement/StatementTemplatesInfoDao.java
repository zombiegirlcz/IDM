package com.revolut.data.database.models.statement;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import t11.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/data/database/models/statement/StatementTemplatesInfoDao;", "Lt11/b2;", "Lcom/revolut/data/database/models/statement/StatementTemplateInfoEntity;", "<init>", "()V", "entity", "", "insert", "(Lcom/revolut/data/database/models/statement/StatementTemplateInfoEntity;)V", "", "id", "accountId", "getById", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/data/database/models/statement/StatementTemplateInfoEntity;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StatementTemplatesInfoDao extends b2 {
    public abstract StatementTemplateInfoEntity getById(@NotNull String id10, String accountId);

    public abstract void insert(@NotNull StatementTemplateInfoEntity entity);
}
