package com.revolut.data.network.models.statements;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/statements/StatementTemplateInfoDto;", "", "url", "", "checkSum", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getCheckSum", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementTemplateInfoDto {

    @b("hash")
    @NotNull
    private final String checkSum;

    @b("url")
    @NotNull
    private final String url;

    public StatementTemplateInfoDto(@NotNull String url2, @NotNull String checkSum) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(checkSum, "checkSum");
        this.url = url2;
        this.checkSum = checkSum;
    }

    public static /* synthetic */ StatementTemplateInfoDto copy$default(StatementTemplateInfoDto statementTemplateInfoDto, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = statementTemplateInfoDto.url;
        }
        if ((i & 2) != 0) {
            str2 = statementTemplateInfoDto.checkSum;
        }
        return statementTemplateInfoDto.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckSum() {
        return this.checkSum;
    }

    @NotNull
    public final StatementTemplateInfoDto copy(@NotNull String url2, @NotNull String checkSum) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(checkSum, "checkSum");
        return new StatementTemplateInfoDto(url2, checkSum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementTemplateInfoDto)) {
            return false;
        }
        StatementTemplateInfoDto statementTemplateInfoDto = (StatementTemplateInfoDto) other;
        return Intrinsics.f(this.url, statementTemplateInfoDto.url) && Intrinsics.f(this.checkSum, statementTemplateInfoDto.checkSum);
    }

    @NotNull
    public final String getCheckSum() {
        return this.checkSum;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.checkSum.hashCode() + (this.url.hashCode() * 31);
    }
}
