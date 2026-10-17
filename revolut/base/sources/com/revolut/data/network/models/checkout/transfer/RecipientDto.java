package com.revolut.data.network.models.checkout.transfer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/data/network/models/checkout/transfer/RecipientDto;", "", "<init>", "()V", "UserNameDto", "PhoneDto", "IdDto", "Lcom/revolut/data/network/models/checkout/transfer/RecipientDto$IdDto;", "Lcom/revolut/data/network/models/checkout/transfer/RecipientDto$PhoneDto;", "Lcom/revolut/data/network/models/checkout/transfer/RecipientDto$UserNameDto;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RecipientDto {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revolut/data/network/models/checkout/transfer/RecipientDto$IdDto;", "Lcom/revolut/data/network/models/checkout/transfer/RecipientDto;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdDto extends RecipientDto {

        @b("id")
        private final String id;

        public IdDto(String str) {
            super(null);
            this.id = str;
        }

        public static /* synthetic */ IdDto copy$default(IdDto idDto, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = idDto.id;
            }
            return idDto.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final IdDto copy(String id10) {
            return new IdDto(id10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdDto) && Intrinsics.f(this.id, ((IdDto) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revolut/data/network/models/checkout/transfer/RecipientDto$PhoneDto;", "Lcom/revolut/data/network/models/checkout/transfer/RecipientDto;", "phone", "", "<init>", "(Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneDto extends RecipientDto {

        @b("phone")
        private final String phone;

        public PhoneDto(String str) {
            super(null);
            this.phone = str;
        }

        public static /* synthetic */ PhoneDto copy$default(PhoneDto phoneDto, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = phoneDto.phone;
            }
            return phoneDto.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @NotNull
        public final PhoneDto copy(String phone) {
            return new PhoneDto(phone);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PhoneDto) && Intrinsics.f(this.phone, ((PhoneDto) other).phone);
        }

        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            String str = this.phone;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revolut/data/network/models/checkout/transfer/RecipientDto$UserNameDto;", "Lcom/revolut/data/network/models/checkout/transfer/RecipientDto;", "referralCode", "", "<init>", "(Ljava/lang/String;)V", "getReferralCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserNameDto extends RecipientDto {

        @b("referralCode")
        @NotNull
        private final String referralCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserNameDto(@NotNull String referralCode) {
            super(null);
            Intrinsics.checkNotNullParameter(referralCode, "referralCode");
            this.referralCode = referralCode;
        }

        public static /* synthetic */ UserNameDto copy$default(UserNameDto userNameDto, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = userNameDto.referralCode;
            }
            return userNameDto.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReferralCode() {
            return this.referralCode;
        }

        @NotNull
        public final UserNameDto copy(@NotNull String referralCode) {
            Intrinsics.checkNotNullParameter(referralCode, "referralCode");
            return new UserNameDto(referralCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserNameDto) && Intrinsics.f(this.referralCode, ((UserNameDto) other).referralCode);
        }

        @NotNull
        public final String getReferralCode() {
            return this.referralCode;
        }

        public int hashCode() {
            return this.referralCode.hashCode();
        }
    }

    public /* synthetic */ RecipientDto(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RecipientDto() {
    }
}
