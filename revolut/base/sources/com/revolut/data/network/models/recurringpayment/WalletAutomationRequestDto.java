package com.revolut.data.network.models.recurringpayment;

import ip0.v7;
import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto;", "", "DropsBelowDto", "ExceedsDto", "LimitDto", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$DropsBelowDto;", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$ExceedsDto;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WalletAutomationRequestDto {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;", "", "Ljo3/a;", "max", "", "period", "<init>", "(Ljo3/a;Ljava/lang/String;)V", "component1", "()Ljo3/a;", "component2", "()Ljava/lang/String;", "copy", "(Ljo3/a;Ljava/lang/String;)Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljo3/a;", "getMax", "Ljava/lang/String;", "getPeriod", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitDto {

        @b("max")
        @NotNull
        private final a max;

        @b("period")
        @NotNull
        private final String period;

        public LimitDto(@NotNull a max, @NotNull String period) {
            Intrinsics.checkNotNullParameter(max, "max");
            Intrinsics.checkNotNullParameter(period, "period");
            this.max = max;
            this.period = period;
        }

        public static /* synthetic */ LimitDto copy$default(LimitDto limitDto, a aVar, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                aVar = limitDto.max;
            }
            if ((i & 2) != 0) {
                str = limitDto.period;
            }
            return limitDto.copy(aVar, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final a getMax() {
            return this.max;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPeriod() {
            return this.period;
        }

        @NotNull
        public final LimitDto copy(@NotNull a max, @NotNull String period) {
            Intrinsics.checkNotNullParameter(max, "max");
            Intrinsics.checkNotNullParameter(period, "period");
            return new LimitDto(max, period);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LimitDto)) {
                return false;
            }
            LimitDto limitDto = (LimitDto) other;
            return Intrinsics.f(this.max, limitDto.max) && Intrinsics.f(this.period, limitDto.period);
        }

        @NotNull
        public final a getMax() {
            return this.max;
        }

        @NotNull
        public final String getPeriod() {
            return this.period;
        }

        public int hashCode() {
            return this.period.hashCode() + (this.max.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$ExceedsDto;", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto;", "Ljo3/a;", "threshold", "", "monitoredPocket", "receiver", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;", "limit", "<init>", "(Ljo3/a;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;)V", "component1", "()Ljo3/a;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;", "copy", "(Ljo3/a;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;)Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$ExceedsDto;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljo3/a;", "getThreshold", "Ljava/lang/String;", "getMonitoredPocket", "getReceiver", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;", "getLimit", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExceedsDto implements WalletAutomationRequestDto {

        @b("limit")
        private final LimitDto limit;

        @b("monitoredPocket")
        @NotNull
        private final String monitoredPocket;

        @b("receiver")
        @NotNull
        private final String receiver;

        @b("threshold")
        @NotNull
        private final a threshold;

        public ExceedsDto(@NotNull a threshold, @NotNull String monitoredPocket, @NotNull String receiver, LimitDto limitDto) {
            Intrinsics.checkNotNullParameter(threshold, "threshold");
            Intrinsics.checkNotNullParameter(monitoredPocket, "monitoredPocket");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            this.threshold = threshold;
            this.monitoredPocket = monitoredPocket;
            this.receiver = receiver;
            this.limit = limitDto;
        }

        public static /* synthetic */ ExceedsDto copy$default(ExceedsDto exceedsDto, a aVar, String str, String str2, LimitDto limitDto, int i, Object obj2) {
            if ((i & 1) != 0) {
                aVar = exceedsDto.threshold;
            }
            if ((i & 2) != 0) {
                str = exceedsDto.monitoredPocket;
            }
            if ((i & 4) != 0) {
                str2 = exceedsDto.receiver;
            }
            if ((i & 8) != 0) {
                limitDto = exceedsDto.limit;
            }
            return exceedsDto.copy(aVar, str, str2, limitDto);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final a getThreshold() {
            return this.threshold;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMonitoredPocket() {
            return this.monitoredPocket;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getReceiver() {
            return this.receiver;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final LimitDto getLimit() {
            return this.limit;
        }

        @NotNull
        public final ExceedsDto copy(@NotNull a threshold, @NotNull String monitoredPocket, @NotNull String receiver, LimitDto limit) {
            Intrinsics.checkNotNullParameter(threshold, "threshold");
            Intrinsics.checkNotNullParameter(monitoredPocket, "monitoredPocket");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return new ExceedsDto(threshold, monitoredPocket, receiver, limit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExceedsDto)) {
                return false;
            }
            ExceedsDto exceedsDto = (ExceedsDto) other;
            return Intrinsics.f(this.threshold, exceedsDto.threshold) && Intrinsics.f(this.monitoredPocket, exceedsDto.monitoredPocket) && Intrinsics.f(this.receiver, exceedsDto.receiver) && Intrinsics.f(this.limit, exceedsDto.limit);
        }

        public final LimitDto getLimit() {
            return this.limit;
        }

        @NotNull
        public final String getMonitoredPocket() {
            return this.monitoredPocket;
        }

        @NotNull
        public final String getReceiver() {
            return this.receiver;
        }

        @NotNull
        public final a getThreshold() {
            return this.threshold;
        }

        public int hashCode() {
            int iC = p.a.c(p.a.c(this.threshold.hashCode() * 31, 31, this.monitoredPocket), 31, this.receiver);
            LimitDto limitDto = this.limit;
            return iC + (limitDto == null ? 0 : limitDto.hashCode());
        }

        public /* synthetic */ ExceedsDto(a aVar, String str, String str2, LimitDto limitDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, str, str2, (i & 8) != 0 ? null : limitDto);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013¨\u0006'"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$DropsBelowDto;", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto;", "Ljo3/a;", "topupAmount", "threshold", "", "monitoredPocket", "topupFrom", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;", "limit", "<init>", "(Ljo3/a;Ljo3/a;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;)V", "component1", "()Ljo3/a;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;", "copy", "(Ljo3/a;Ljo3/a;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;)Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$DropsBelowDto;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljo3/a;", "getTopupAmount", "getThreshold", "Ljava/lang/String;", "getMonitoredPocket", "getTopupFrom", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$LimitDto;", "getLimit", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DropsBelowDto implements WalletAutomationRequestDto {

        @b("limit")
        private final LimitDto limit;

        @b("monitoredPocket")
        @NotNull
        private final String monitoredPocket;

        @b("threshold")
        @NotNull
        private final a threshold;

        @b("topupAmount")
        @NotNull
        private final a topupAmount;

        @b("topupFrom")
        @NotNull
        private final String topupFrom;

        public DropsBelowDto(@NotNull a topupAmount, @NotNull a threshold, @NotNull String monitoredPocket, @NotNull String topupFrom, LimitDto limitDto) {
            Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
            Intrinsics.checkNotNullParameter(threshold, "threshold");
            Intrinsics.checkNotNullParameter(monitoredPocket, "monitoredPocket");
            Intrinsics.checkNotNullParameter(topupFrom, "topupFrom");
            this.topupAmount = topupAmount;
            this.threshold = threshold;
            this.monitoredPocket = monitoredPocket;
            this.topupFrom = topupFrom;
            this.limit = limitDto;
        }

        public static /* synthetic */ DropsBelowDto copy$default(DropsBelowDto dropsBelowDto, a aVar, a aVar2, String str, String str2, LimitDto limitDto, int i, Object obj2) {
            if ((i & 1) != 0) {
                aVar = dropsBelowDto.topupAmount;
            }
            if ((i & 2) != 0) {
                aVar2 = dropsBelowDto.threshold;
            }
            if ((i & 4) != 0) {
                str = dropsBelowDto.monitoredPocket;
            }
            if ((i & 8) != 0) {
                str2 = dropsBelowDto.topupFrom;
            }
            if ((i & 16) != 0) {
                limitDto = dropsBelowDto.limit;
            }
            LimitDto limitDto2 = limitDto;
            String str3 = str;
            return dropsBelowDto.copy(aVar, aVar2, str3, str2, limitDto2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final a getTopupAmount() {
            return this.topupAmount;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final a getThreshold() {
            return this.threshold;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMonitoredPocket() {
            return this.monitoredPocket;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTopupFrom() {
            return this.topupFrom;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final LimitDto getLimit() {
            return this.limit;
        }

        @NotNull
        public final DropsBelowDto copy(@NotNull a topupAmount, @NotNull a threshold, @NotNull String monitoredPocket, @NotNull String topupFrom, LimitDto limit) {
            Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
            Intrinsics.checkNotNullParameter(threshold, "threshold");
            Intrinsics.checkNotNullParameter(monitoredPocket, "monitoredPocket");
            Intrinsics.checkNotNullParameter(topupFrom, "topupFrom");
            return new DropsBelowDto(topupAmount, threshold, monitoredPocket, topupFrom, limit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DropsBelowDto)) {
                return false;
            }
            DropsBelowDto dropsBelowDto = (DropsBelowDto) other;
            return Intrinsics.f(this.topupAmount, dropsBelowDto.topupAmount) && Intrinsics.f(this.threshold, dropsBelowDto.threshold) && Intrinsics.f(this.monitoredPocket, dropsBelowDto.monitoredPocket) && Intrinsics.f(this.topupFrom, dropsBelowDto.topupFrom) && Intrinsics.f(this.limit, dropsBelowDto.limit);
        }

        public final LimitDto getLimit() {
            return this.limit;
        }

        @NotNull
        public final String getMonitoredPocket() {
            return this.monitoredPocket;
        }

        @NotNull
        public final a getThreshold() {
            return this.threshold;
        }

        @NotNull
        public final a getTopupAmount() {
            return this.topupAmount;
        }

        @NotNull
        public final String getTopupFrom() {
            return this.topupFrom;
        }

        public int hashCode() {
            int iC = p.a.c(p.a.c(v7.j(this.threshold, this.topupAmount.hashCode() * 31, 31), 31, this.monitoredPocket), 31, this.topupFrom);
            LimitDto limitDto = this.limit;
            return iC + (limitDto == null ? 0 : limitDto.hashCode());
        }

        public /* synthetic */ DropsBelowDto(a aVar, a aVar2, String str, String str2, LimitDto limitDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, aVar2, str, str2, (i & 16) != 0 ? null : limitDto);
        }
    }
}
