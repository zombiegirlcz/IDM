package com.revolut.data.database.models.transaction;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/database/models/transaction/CryptoCounterpartyAddressEmbeddedEntity;", "", "country", "", "city", "addressLine1", "addressLine2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getCity", "getAddressLine1", "getAddressLine2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCounterpartyAddressEmbeddedEntity {
    private final String addressLine1;
    private final String addressLine2;
    private final String city;
    private final String country;

    public CryptoCounterpartyAddressEmbeddedEntity(String str, String str2, String str3, String str4) {
        this.country = str;
        this.city = str2;
        this.addressLine1 = str3;
        this.addressLine2 = str4;
    }

    public static /* synthetic */ CryptoCounterpartyAddressEmbeddedEntity copy$default(CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity, String str, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = cryptoCounterpartyAddressEmbeddedEntity.country;
        }
        if ((i & 2) != 0) {
            str2 = cryptoCounterpartyAddressEmbeddedEntity.city;
        }
        if ((i & 4) != 0) {
            str3 = cryptoCounterpartyAddressEmbeddedEntity.addressLine1;
        }
        if ((i & 8) != 0) {
            str4 = cryptoCounterpartyAddressEmbeddedEntity.addressLine2;
        }
        return cryptoCounterpartyAddressEmbeddedEntity.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    @NotNull
    public final CryptoCounterpartyAddressEmbeddedEntity copy(String country, String city, String addressLine1, String addressLine2) {
        return new CryptoCounterpartyAddressEmbeddedEntity(country, city, addressLine1, addressLine2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCounterpartyAddressEmbeddedEntity)) {
            return false;
        }
        CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity = (CryptoCounterpartyAddressEmbeddedEntity) other;
        return Intrinsics.f(this.country, cryptoCounterpartyAddressEmbeddedEntity.country) && Intrinsics.f(this.city, cryptoCounterpartyAddressEmbeddedEntity.city) && Intrinsics.f(this.addressLine1, cryptoCounterpartyAddressEmbeddedEntity.addressLine1) && Intrinsics.f(this.addressLine2, cryptoCounterpartyAddressEmbeddedEntity.addressLine2);
    }

    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        String str = this.country;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine1;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.addressLine2;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
