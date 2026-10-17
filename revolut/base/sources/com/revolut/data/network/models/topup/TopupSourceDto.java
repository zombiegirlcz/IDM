package com.revolut.data.network.models.topup;

import com.revolut.domain.models.topup.methods.TopupMethodType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/revolut/data/network/models/topup/TopupSourceDto;", "", "topupMethodType", "Lcom/revolut/domain/models/topup/methods/TopupMethodType;", "details", "Lcom/revolut/data/network/models/topup/TopupSourceDto$Details;", "<init>", "(Lcom/revolut/domain/models/topup/methods/TopupMethodType;Lcom/revolut/data/network/models/topup/TopupSourceDto$Details;)V", "getTopupMethodType", "()Lcom/revolut/domain/models/topup/methods/TopupMethodType;", "getDetails", "()Lcom/revolut/data/network/models/topup/TopupSourceDto$Details;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Details", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopupSourceDto {

    @b("details")
    @NotNull
    private final Details details;

    @b("topupMethod")
    @NotNull
    private final TopupMethodType topupMethodType;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/topup/TopupSourceDto$Details;", "", "accountNumber", "", "accountHolder", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getAccountHolder", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details {

        @b("accountHolder")
        @NotNull
        private final String accountHolder;

        @b("accountNumber")
        @NotNull
        private final String accountNumber;

        public Details(@NotNull String accountNumber, @NotNull String accountHolder) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountHolder, "accountHolder");
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
        }

        public static /* synthetic */ Details copy$default(Details details, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = details.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = details.accountHolder;
            }
            return details.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAccountHolder() {
            return this.accountHolder;
        }

        @NotNull
        public final Details copy(@NotNull String accountNumber, @NotNull String accountHolder) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountHolder, "accountHolder");
            return new Details(accountNumber, accountHolder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Details)) {
                return false;
            }
            Details details = (Details) other;
            return Intrinsics.f(this.accountNumber, details.accountNumber) && Intrinsics.f(this.accountHolder, details.accountHolder);
        }

        @NotNull
        public final String getAccountHolder() {
            return this.accountHolder;
        }

        @NotNull
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public int hashCode() {
            return this.accountHolder.hashCode() + (this.accountNumber.hashCode() * 31);
        }
    }

    public TopupSourceDto(@NotNull TopupMethodType topupMethodType, @NotNull Details details) {
        Intrinsics.checkNotNullParameter(topupMethodType, "topupMethodType");
        Intrinsics.checkNotNullParameter(details, "details");
        this.topupMethodType = topupMethodType;
        this.details = details;
    }

    public static /* synthetic */ TopupSourceDto copy$default(TopupSourceDto topupSourceDto, TopupMethodType topupMethodType, Details details, int i, Object obj2) {
        if ((i & 1) != 0) {
            topupMethodType = topupSourceDto.topupMethodType;
        }
        if ((i & 2) != 0) {
            details = topupSourceDto.details;
        }
        return topupSourceDto.copy(topupMethodType, details);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TopupMethodType getTopupMethodType() {
        return this.topupMethodType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Details getDetails() {
        return this.details;
    }

    @NotNull
    public final TopupSourceDto copy(@NotNull TopupMethodType topupMethodType, @NotNull Details details) {
        Intrinsics.checkNotNullParameter(topupMethodType, "topupMethodType");
        Intrinsics.checkNotNullParameter(details, "details");
        return new TopupSourceDto(topupMethodType, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupSourceDto)) {
            return false;
        }
        TopupSourceDto topupSourceDto = (TopupSourceDto) other;
        return this.topupMethodType == topupSourceDto.topupMethodType && Intrinsics.f(this.details, topupSourceDto.details);
    }

    @NotNull
    public final Details getDetails() {
        return this.details;
    }

    @NotNull
    public final TopupMethodType getTopupMethodType() {
        return this.topupMethodType;
    }

    public int hashCode() {
        return this.details.hashCode() + (this.topupMethodType.hashCode() * 31);
    }
}
