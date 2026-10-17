package com.revolut.feature.statements.impl.tools.transactions.extras;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionSenderDto;", "Ljava/io/Serializable;", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionExtra;", "id", "", "firstName", "lastName", "phone", "account", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAccountDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAccountDto;)V", "getId", "()Ljava/lang/String;", "getFirstName", "getLastName", "getPhone", "getAccount", "()Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionAccountDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionSenderDto implements Serializable, TransactionExtra {

    @b("account")
    private final TransactionAccountDto account;

    @b("firstName")
    private final String firstName;

    @b("id")
    private final String id;

    @b("lastName")
    private final String lastName;

    @b("phone")
    private final String phone;

    public TransactionSenderDto() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ TransactionSenderDto copy$default(TransactionSenderDto transactionSenderDto, String str, String str2, String str3, String str4, TransactionAccountDto transactionAccountDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transactionSenderDto.id;
        }
        if ((i & 2) != 0) {
            str2 = transactionSenderDto.firstName;
        }
        if ((i & 4) != 0) {
            str3 = transactionSenderDto.lastName;
        }
        if ((i & 8) != 0) {
            str4 = transactionSenderDto.phone;
        }
        if ((i & 16) != 0) {
            transactionAccountDto = transactionSenderDto.account;
        }
        TransactionAccountDto transactionAccountDto2 = transactionAccountDto;
        String str5 = str3;
        return transactionSenderDto.copy(str, str2, str5, str4, transactionAccountDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TransactionAccountDto getAccount() {
        return this.account;
    }

    @NotNull
    public final TransactionSenderDto copy(String id10, String firstName, String lastName, String phone, TransactionAccountDto account) {
        return new TransactionSenderDto(id10, firstName, lastName, phone, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionSenderDto)) {
            return false;
        }
        TransactionSenderDto transactionSenderDto = (TransactionSenderDto) other;
        return Intrinsics.f(this.id, transactionSenderDto.id) && Intrinsics.f(this.firstName, transactionSenderDto.firstName) && Intrinsics.f(this.lastName, transactionSenderDto.lastName) && Intrinsics.f(this.phone, transactionSenderDto.phone) && Intrinsics.f(this.account, transactionSenderDto.account);
    }

    public final TransactionAccountDto getAccount() {
        return this.account;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phone;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TransactionAccountDto transactionAccountDto = this.account;
        return iHashCode4 + (transactionAccountDto != null ? transactionAccountDto.hashCode() : 0);
    }

    public TransactionSenderDto(String str, String str2, String str3, String str4, TransactionAccountDto transactionAccountDto) {
        this.id = str;
        this.firstName = str2;
        this.lastName = str3;
        this.phone = str4;
        this.account = transactionAccountDto;
    }

    public /* synthetic */ TransactionSenderDto(String str, String str2, String str3, String str4, TransactionAccountDto transactionAccountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : transactionAccountDto);
    }
}
