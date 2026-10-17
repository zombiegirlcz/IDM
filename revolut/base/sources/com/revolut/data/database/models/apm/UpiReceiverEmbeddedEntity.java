package com.revolut.data.database.models.apm;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/revolut/data/database/models/apm/UpiReceiverEmbeddedEntity;", "", "firstName", "", "lastName", "fullName", "account", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getFullName", "getAccount", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpiReceiverEmbeddedEntity {

    @b("account")
    @NotNull
    private final Map<String, String> account;

    @b("firstName")
    private final String firstName;

    @b("fullName")
    private final String fullName;

    @b("lastName")
    private final String lastName;

    public UpiReceiverEmbeddedEntity(String str, String str2, String str3, @NotNull Map<String, String> account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.firstName = str;
        this.lastName = str2;
        this.fullName = str3;
        this.account = account;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpiReceiverEmbeddedEntity copy$default(UpiReceiverEmbeddedEntity upiReceiverEmbeddedEntity, String str, String str2, String str3, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = upiReceiverEmbeddedEntity.firstName;
        }
        if ((i & 2) != 0) {
            str2 = upiReceiverEmbeddedEntity.lastName;
        }
        if ((i & 4) != 0) {
            str3 = upiReceiverEmbeddedEntity.fullName;
        }
        if ((i & 8) != 0) {
            map = upiReceiverEmbeddedEntity.account;
        }
        return upiReceiverEmbeddedEntity.copy(str, str2, str3, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @NotNull
    public final Map<String, String> component4() {
        return this.account;
    }

    @NotNull
    public final UpiReceiverEmbeddedEntity copy(String firstName, String lastName, String fullName, @NotNull Map<String, String> account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return new UpiReceiverEmbeddedEntity(firstName, lastName, fullName, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpiReceiverEmbeddedEntity)) {
            return false;
        }
        UpiReceiverEmbeddedEntity upiReceiverEmbeddedEntity = (UpiReceiverEmbeddedEntity) other;
        return Intrinsics.f(this.firstName, upiReceiverEmbeddedEntity.firstName) && Intrinsics.f(this.lastName, upiReceiverEmbeddedEntity.lastName) && Intrinsics.f(this.fullName, upiReceiverEmbeddedEntity.fullName) && Intrinsics.f(this.account, upiReceiverEmbeddedEntity.account);
    }

    @NotNull
    public final Map<String, String> getAccount() {
        return this.account;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullName;
        return this.account.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public /* synthetic */ UpiReceiverEmbeddedEntity(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, map);
    }
}
