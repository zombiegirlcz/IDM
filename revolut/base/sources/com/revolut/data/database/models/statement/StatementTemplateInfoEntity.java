package com.revolut.data.database.models.statement;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/database/models/statement/StatementTemplateInfoEntity;", "", "id", "", "checkSum", "url", "accountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCheckSum", "getUrl", "getAccountId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementTemplateInfoEntity {
    private final String accountId;

    @NotNull
    private final String checkSum;

    @NotNull
    private final String id;

    @NotNull
    private final String url;

    public StatementTemplateInfoEntity(@NotNull String id10, @NotNull String checkSum, @NotNull String url2, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(checkSum, "checkSum");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.id = id10;
        this.checkSum = checkSum;
        this.url = url2;
        this.accountId = str;
    }

    public static /* synthetic */ StatementTemplateInfoEntity copy$default(StatementTemplateInfoEntity statementTemplateInfoEntity, String str, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = statementTemplateInfoEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = statementTemplateInfoEntity.checkSum;
        }
        if ((i & 4) != 0) {
            str3 = statementTemplateInfoEntity.url;
        }
        if ((i & 8) != 0) {
            str4 = statementTemplateInfoEntity.accountId;
        }
        return statementTemplateInfoEntity.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final StatementTemplateInfoEntity copy(@NotNull String id10, @NotNull String checkSum, @NotNull String url2, String accountId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(checkSum, "checkSum");
        Intrinsics.checkNotNullParameter(url2, "url");
        return new StatementTemplateInfoEntity(id10, checkSum, url2, accountId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementTemplateInfoEntity)) {
            return false;
        }
        StatementTemplateInfoEntity statementTemplateInfoEntity = (StatementTemplateInfoEntity) other;
        return Intrinsics.f(this.id, statementTemplateInfoEntity.id) && Intrinsics.f(this.checkSum, statementTemplateInfoEntity.checkSum) && Intrinsics.f(this.url, statementTemplateInfoEntity.url) && Intrinsics.f(this.accountId, statementTemplateInfoEntity.accountId);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    public final String getCheckSum() {
        return this.checkSum;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.checkSum), 31, this.url);
        String str = this.accountId;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
