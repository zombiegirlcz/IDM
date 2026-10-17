package com.revolut.data.database.models.transaction;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/revolut/data/database/models/transaction/CryptoCounterpartyDetailsEmbeddedEntity;", "", "type", "", "name", "surname", "businessRegistrationNumber", "address", "Lcom/revolut/data/database/models/transaction/CryptoCounterpartyAddressEmbeddedEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/transaction/CryptoCounterpartyAddressEmbeddedEntity;)V", "getType", "()Ljava/lang/String;", "getName", "getSurname", "getBusinessRegistrationNumber", "getAddress", "()Lcom/revolut/data/database/models/transaction/CryptoCounterpartyAddressEmbeddedEntity;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCounterpartyDetailsEmbeddedEntity {
    private final CryptoCounterpartyAddressEmbeddedEntity address;
    private final String businessRegistrationNumber;
    private final String name;
    private final String surname;
    private final String type;

    public CryptoCounterpartyDetailsEmbeddedEntity(String str, String str2, String str3, String str4, CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity) {
        this.type = str;
        this.name = str2;
        this.surname = str3;
        this.businessRegistrationNumber = str4;
        this.address = cryptoCounterpartyAddressEmbeddedEntity;
    }

    public static /* synthetic */ CryptoCounterpartyDetailsEmbeddedEntity copy$default(CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity, String str, String str2, String str3, String str4, CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = cryptoCounterpartyDetailsEmbeddedEntity.type;
        }
        if ((i & 2) != 0) {
            str2 = cryptoCounterpartyDetailsEmbeddedEntity.name;
        }
        if ((i & 4) != 0) {
            str3 = cryptoCounterpartyDetailsEmbeddedEntity.surname;
        }
        if ((i & 8) != 0) {
            str4 = cryptoCounterpartyDetailsEmbeddedEntity.businessRegistrationNumber;
        }
        if ((i & 16) != 0) {
            cryptoCounterpartyAddressEmbeddedEntity = cryptoCounterpartyDetailsEmbeddedEntity.address;
        }
        CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity2 = cryptoCounterpartyAddressEmbeddedEntity;
        String str5 = str3;
        return cryptoCounterpartyDetailsEmbeddedEntity.copy(str, str2, str5, str4, cryptoCounterpartyAddressEmbeddedEntity2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSurname() {
        return this.surname;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBusinessRegistrationNumber() {
        return this.businessRegistrationNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CryptoCounterpartyAddressEmbeddedEntity getAddress() {
        return this.address;
    }

    @NotNull
    public final CryptoCounterpartyDetailsEmbeddedEntity copy(String type, String name, String surname, String businessRegistrationNumber, CryptoCounterpartyAddressEmbeddedEntity address) {
        return new CryptoCounterpartyDetailsEmbeddedEntity(type, name, surname, businessRegistrationNumber, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCounterpartyDetailsEmbeddedEntity)) {
            return false;
        }
        CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity = (CryptoCounterpartyDetailsEmbeddedEntity) other;
        return Intrinsics.f(this.type, cryptoCounterpartyDetailsEmbeddedEntity.type) && Intrinsics.f(this.name, cryptoCounterpartyDetailsEmbeddedEntity.name) && Intrinsics.f(this.surname, cryptoCounterpartyDetailsEmbeddedEntity.surname) && Intrinsics.f(this.businessRegistrationNumber, cryptoCounterpartyDetailsEmbeddedEntity.businessRegistrationNumber) && Intrinsics.f(this.address, cryptoCounterpartyDetailsEmbeddedEntity.address);
    }

    public final CryptoCounterpartyAddressEmbeddedEntity getAddress() {
        return this.address;
    }

    public final String getBusinessRegistrationNumber() {
        return this.businessRegistrationNumber;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSurname() {
        return this.surname;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.surname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.businessRegistrationNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CryptoCounterpartyAddressEmbeddedEntity cryptoCounterpartyAddressEmbeddedEntity = this.address;
        return iHashCode4 + (cryptoCounterpartyAddressEmbeddedEntity != null ? cryptoCounterpartyAddressEmbeddedEntity.hashCode() : 0);
    }
}
