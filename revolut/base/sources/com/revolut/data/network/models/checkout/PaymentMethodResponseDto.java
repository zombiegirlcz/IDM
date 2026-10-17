package com.revolut.data.network.models.checkout;

import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001'Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003Js\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/revolut/data/network/models/checkout/PaymentMethodResponseDto;", "Ljava/io/Serializable;", "paymentId", "", "externalPaymentId", "paymentUrl", "redirects", "Lcom/revolut/data/network/models/checkout/PaymentMethodResponseDto$RedirectUrls;", "data", "", "keyMap", "expiryYearFormat", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/checkout/PaymentMethodResponseDto$RedirectUrls;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "getPaymentId", "()Ljava/lang/String;", "getExternalPaymentId", "getPaymentUrl", "getRedirects", "()Lcom/revolut/data/network/models/checkout/PaymentMethodResponseDto$RedirectUrls;", "getData", "()Ljava/util/Map;", "getKeyMap", "getExpiryYearFormat", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "RedirectUrls", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentMethodResponseDto implements Serializable {

    @b("data")
    private final Map<String, String> data;

    @b("expiryYearFormat")
    private final String expiryYearFormat;

    @b("externalPaymentId")
    private final String externalPaymentId;

    @b("keyMap")
    private final Map<String, String> keyMap;

    @b("paymentId")
    @NotNull
    private final String paymentId;

    @b("paymentUrl")
    private final String paymentUrl;

    @b("redirects")
    private final RedirectUrls redirects;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/revolut/data/network/models/checkout/PaymentMethodResponseDto$RedirectUrls;", "Ljava/io/Serializable;", "success", "", "error", "decline", "hold", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/String;", "getError", "getDecline", "getHold", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedirectUrls implements Serializable {

        @b("decline")
        private final String decline;

        @b("error")
        @NotNull
        private final String error;

        @b("hold")
        private final String hold;

        @b("success")
        @NotNull
        private final String success;

        public RedirectUrls(@NotNull String success, @NotNull String error, String str, String str2) {
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(error, "error");
            this.success = success;
            this.error = error;
            this.decline = str;
            this.hold = str2;
        }

        public static /* synthetic */ RedirectUrls copy$default(RedirectUrls redirectUrls, String str, String str2, String str3, String str4, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = redirectUrls.success;
            }
            if ((i & 2) != 0) {
                str2 = redirectUrls.error;
            }
            if ((i & 4) != 0) {
                str3 = redirectUrls.decline;
            }
            if ((i & 8) != 0) {
                str4 = redirectUrls.hold;
            }
            return redirectUrls.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSuccess() {
            return this.success;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDecline() {
            return this.decline;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getHold() {
            return this.hold;
        }

        @NotNull
        public final RedirectUrls copy(@NotNull String success, @NotNull String error, String decline, String hold) {
            Intrinsics.checkNotNullParameter(success, "success");
            Intrinsics.checkNotNullParameter(error, "error");
            return new RedirectUrls(success, error, decline, hold);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RedirectUrls)) {
                return false;
            }
            RedirectUrls redirectUrls = (RedirectUrls) other;
            return Intrinsics.f(this.success, redirectUrls.success) && Intrinsics.f(this.error, redirectUrls.error) && Intrinsics.f(this.decline, redirectUrls.decline) && Intrinsics.f(this.hold, redirectUrls.hold);
        }

        public final String getDecline() {
            return this.decline;
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        public final String getHold() {
            return this.hold;
        }

        @NotNull
        public final String getSuccess() {
            return this.success;
        }

        public int hashCode() {
            int iC = a.c(this.success.hashCode() * 31, 31, this.error);
            String str = this.decline;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hold;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public PaymentMethodResponseDto(@NotNull String paymentId, String str, String str2, RedirectUrls redirectUrls, Map<String, String> map, Map<String, String> map2, String str3) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        this.paymentId = paymentId;
        this.externalPaymentId = str;
        this.paymentUrl = str2;
        this.redirects = redirectUrls;
        this.data = map;
        this.keyMap = map2;
        this.expiryYearFormat = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodResponseDto copy$default(PaymentMethodResponseDto paymentMethodResponseDto, String str, String str2, String str3, RedirectUrls redirectUrls, Map map, Map map2, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = paymentMethodResponseDto.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethodResponseDto.externalPaymentId;
        }
        if ((i & 4) != 0) {
            str3 = paymentMethodResponseDto.paymentUrl;
        }
        if ((i & 8) != 0) {
            redirectUrls = paymentMethodResponseDto.redirects;
        }
        if ((i & 16) != 0) {
            map = paymentMethodResponseDto.data;
        }
        if ((i & 32) != 0) {
            map2 = paymentMethodResponseDto.keyMap;
        }
        if ((i & 64) != 0) {
            str4 = paymentMethodResponseDto.expiryYearFormat;
        }
        Map map3 = map2;
        String str5 = str4;
        Map map4 = map;
        String str6 = str3;
        return paymentMethodResponseDto.copy(str, str2, str6, redirectUrls, map4, map3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExternalPaymentId() {
        return this.externalPaymentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RedirectUrls getRedirects() {
        return this.redirects;
    }

    public final Map<String, String> component5() {
        return this.data;
    }

    public final Map<String, String> component6() {
        return this.keyMap;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExpiryYearFormat() {
        return this.expiryYearFormat;
    }

    @NotNull
    public final PaymentMethodResponseDto copy(@NotNull String paymentId, String externalPaymentId, String paymentUrl, RedirectUrls redirects, Map<String, String> data, Map<String, String> keyMap, String expiryYearFormat) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        return new PaymentMethodResponseDto(paymentId, externalPaymentId, paymentUrl, redirects, data, keyMap, expiryYearFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodResponseDto)) {
            return false;
        }
        PaymentMethodResponseDto paymentMethodResponseDto = (PaymentMethodResponseDto) other;
        return Intrinsics.f(this.paymentId, paymentMethodResponseDto.paymentId) && Intrinsics.f(this.externalPaymentId, paymentMethodResponseDto.externalPaymentId) && Intrinsics.f(this.paymentUrl, paymentMethodResponseDto.paymentUrl) && Intrinsics.f(this.redirects, paymentMethodResponseDto.redirects) && Intrinsics.f(this.data, paymentMethodResponseDto.data) && Intrinsics.f(this.keyMap, paymentMethodResponseDto.keyMap) && Intrinsics.f(this.expiryYearFormat, paymentMethodResponseDto.expiryYearFormat);
    }

    public final Map<String, String> getData() {
        return this.data;
    }

    public final String getExpiryYearFormat() {
        return this.expiryYearFormat;
    }

    public final String getExternalPaymentId() {
        return this.externalPaymentId;
    }

    public final Map<String, String> getKeyMap() {
        return this.keyMap;
    }

    @NotNull
    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    public final RedirectUrls getRedirects() {
        return this.redirects;
    }

    public int hashCode() {
        int iHashCode = this.paymentId.hashCode() * 31;
        String str = this.externalPaymentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paymentUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RedirectUrls redirectUrls = this.redirects;
        int iHashCode4 = (iHashCode3 + (redirectUrls == null ? 0 : redirectUrls.hashCode())) * 31;
        Map<String, String> map = this.data;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.keyMap;
        int iHashCode6 = (iHashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str3 = this.expiryYearFormat;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }
}
