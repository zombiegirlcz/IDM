package com.revolut.data.database.models.transaction;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u009e\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00066"}, d2 = {"Lcom/revolut/data/database/models/transaction/CryptoCounterpartyEmbeddedEntity;", "", "id", "", "address", "state", "hostingType", "hostingVerification", "hostingPlatform", "ownershipState", "ownershipMethod", "ownershipPayload", "", "updatedDate", "", "details", "Lcom/revolut/data/database/models/transaction/CryptoCounterpartyDetailsEmbeddedEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;Lcom/revolut/data/database/models/transaction/CryptoCounterpartyDetailsEmbeddedEntity;)V", "getId", "()Ljava/lang/String;", "getAddress", "getState", "getHostingType", "getHostingVerification", "getHostingPlatform", "getOwnershipState", "getOwnershipMethod", "getOwnershipPayload", "()Ljava/util/Map;", "getUpdatedDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDetails", "()Lcom/revolut/data/database/models/transaction/CryptoCounterpartyDetailsEmbeddedEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;Lcom/revolut/data/database/models/transaction/CryptoCounterpartyDetailsEmbeddedEntity;)Lcom/revolut/data/database/models/transaction/CryptoCounterpartyEmbeddedEntity;", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCounterpartyEmbeddedEntity {
    private final String address;
    private final CryptoCounterpartyDetailsEmbeddedEntity details;
    private final String hostingPlatform;
    private final String hostingType;
    private final String hostingVerification;
    private final String id;
    private final String ownershipMethod;
    private final Map<String, String> ownershipPayload;
    private final String ownershipState;
    private final String state;
    private final Long updatedDate;

    public CryptoCounterpartyEmbeddedEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map, Long l2, CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity) {
        this.id = str;
        this.address = str2;
        this.state = str3;
        this.hostingType = str4;
        this.hostingVerification = str5;
        this.hostingPlatform = str6;
        this.ownershipState = str7;
        this.ownershipMethod = str8;
        this.ownershipPayload = map;
        this.updatedDate = l2;
        this.details = cryptoCounterpartyDetailsEmbeddedEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoCounterpartyEmbeddedEntity copy$default(CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, Long l2, CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = cryptoCounterpartyEmbeddedEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = cryptoCounterpartyEmbeddedEntity.address;
        }
        if ((i & 4) != 0) {
            str3 = cryptoCounterpartyEmbeddedEntity.state;
        }
        if ((i & 8) != 0) {
            str4 = cryptoCounterpartyEmbeddedEntity.hostingType;
        }
        if ((i & 16) != 0) {
            str5 = cryptoCounterpartyEmbeddedEntity.hostingVerification;
        }
        if ((i & 32) != 0) {
            str6 = cryptoCounterpartyEmbeddedEntity.hostingPlatform;
        }
        if ((i & 64) != 0) {
            str7 = cryptoCounterpartyEmbeddedEntity.ownershipState;
        }
        if ((i & 128) != 0) {
            str8 = cryptoCounterpartyEmbeddedEntity.ownershipMethod;
        }
        if ((i & 256) != 0) {
            map = cryptoCounterpartyEmbeddedEntity.ownershipPayload;
        }
        if ((i & 512) != 0) {
            l2 = cryptoCounterpartyEmbeddedEntity.updatedDate;
        }
        if ((i & 1024) != 0) {
            cryptoCounterpartyDetailsEmbeddedEntity = cryptoCounterpartyEmbeddedEntity.details;
        }
        Long l3 = l2;
        CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity2 = cryptoCounterpartyDetailsEmbeddedEntity;
        String str9 = str8;
        Map map2 = map;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return cryptoCounterpartyEmbeddedEntity.copy(str, str2, str13, str4, str12, str10, str11, str9, map2, l3, cryptoCounterpartyDetailsEmbeddedEntity2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CryptoCounterpartyDetailsEmbeddedEntity getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHostingType() {
        return this.hostingType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHostingVerification() {
        return this.hostingVerification;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHostingPlatform() {
        return this.hostingPlatform;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOwnershipState() {
        return this.ownershipState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOwnershipMethod() {
        return this.ownershipMethod;
    }

    public final Map<String, String> component9() {
        return this.ownershipPayload;
    }

    @NotNull
    public final CryptoCounterpartyEmbeddedEntity copy(String id10, String address, String state, String hostingType, String hostingVerification, String hostingPlatform, String ownershipState, String ownershipMethod, Map<String, String> ownershipPayload, Long updatedDate, CryptoCounterpartyDetailsEmbeddedEntity details) {
        return new CryptoCounterpartyEmbeddedEntity(id10, address, state, hostingType, hostingVerification, hostingPlatform, ownershipState, ownershipMethod, ownershipPayload, updatedDate, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCounterpartyEmbeddedEntity)) {
            return false;
        }
        CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity = (CryptoCounterpartyEmbeddedEntity) other;
        return Intrinsics.f(this.id, cryptoCounterpartyEmbeddedEntity.id) && Intrinsics.f(this.address, cryptoCounterpartyEmbeddedEntity.address) && Intrinsics.f(this.state, cryptoCounterpartyEmbeddedEntity.state) && Intrinsics.f(this.hostingType, cryptoCounterpartyEmbeddedEntity.hostingType) && Intrinsics.f(this.hostingVerification, cryptoCounterpartyEmbeddedEntity.hostingVerification) && Intrinsics.f(this.hostingPlatform, cryptoCounterpartyEmbeddedEntity.hostingPlatform) && Intrinsics.f(this.ownershipState, cryptoCounterpartyEmbeddedEntity.ownershipState) && Intrinsics.f(this.ownershipMethod, cryptoCounterpartyEmbeddedEntity.ownershipMethod) && Intrinsics.f(this.ownershipPayload, cryptoCounterpartyEmbeddedEntity.ownershipPayload) && Intrinsics.f(this.updatedDate, cryptoCounterpartyEmbeddedEntity.updatedDate) && Intrinsics.f(this.details, cryptoCounterpartyEmbeddedEntity.details);
    }

    public final String getAddress() {
        return this.address;
    }

    public final CryptoCounterpartyDetailsEmbeddedEntity getDetails() {
        return this.details;
    }

    public final String getHostingPlatform() {
        return this.hostingPlatform;
    }

    public final String getHostingType() {
        return this.hostingType;
    }

    public final String getHostingVerification() {
        return this.hostingVerification;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOwnershipMethod() {
        return this.ownershipMethod;
    }

    public final Map<String, String> getOwnershipPayload() {
        return this.ownershipPayload;
    }

    public final String getOwnershipState() {
        return this.ownershipState;
    }

    public final String getState() {
        return this.state;
    }

    public final Long getUpdatedDate() {
        return this.updatedDate;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hostingType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hostingVerification;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.hostingPlatform;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ownershipState;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ownershipMethod;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Map<String, String> map = this.ownershipPayload;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        Long l2 = this.updatedDate;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity = this.details;
        return iHashCode10 + (cryptoCounterpartyDetailsEmbeddedEntity != null ? cryptoCounterpartyDetailsEmbeddedEntity.hashCode() : 0);
    }

    public /* synthetic */ CryptoCounterpartyEmbeddedEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, Long l2, CryptoCounterpartyDetailsEmbeddedEntity cryptoCounterpartyDetailsEmbeddedEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, map, (i & 512) != 0 ? null : l2, cryptoCounterpartyDetailsEmbeddedEntity);
    }
}
