package com.revolut.data.network.models.moneyrequest;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jä\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00102\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010*R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001c¨\u0006M"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/TransferLinkDetailsDto;", "", "id", "", "url", "state", "code", "expiryDate", "", "createdDate", "amount", "currency", "note", "gifUrl", "direction", "isAnonymous", "", "transactionId", "beneficiaryName", "beneficiaryPhone", "beneficiaryEmail", "owner", "Lcom/revolut/data/network/models/moneyrequest/TransferLinkOwnerDto;", "payee", "registeredIdentityId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/moneyrequest/TransferLinkOwnerDto;Lcom/revolut/data/network/models/moneyrequest/TransferLinkOwnerDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUrl", "getState", "getCode", "getExpiryDate", "()J", "getCreatedDate", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getNote", "getGifUrl", "getDirection", "()Z", "getTransactionId", "getBeneficiaryName", "getBeneficiaryPhone", "getBeneficiaryEmail", "getOwner", "()Lcom/revolut/data/network/models/moneyrequest/TransferLinkOwnerDto;", "getPayee", "getRegisteredIdentityId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/moneyrequest/TransferLinkOwnerDto;Lcom/revolut/data/network/models/moneyrequest/TransferLinkOwnerDto;Ljava/lang/String;)Lcom/revolut/data/network/models/moneyrequest/TransferLinkDetailsDto;", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferLinkDetailsDto {

    @b("amount")
    private final Long amount;

    @b("beneficiaryEmail")
    private final String beneficiaryEmail;

    @b("beneficiaryName")
    private final String beneficiaryName;

    @b("beneficiaryPhone")
    private final String beneficiaryPhone;

    @b("code")
    @NotNull
    private final String code;

    @b("createdDate")
    private final long createdDate;

    @b("currency")
    private final String currency;

    @b("direction")
    private final String direction;

    @b("expiryDate")
    private final long expiryDate;

    @b("gif")
    private final String gifUrl;

    @b("id")
    @NotNull
    private final String id;

    @b("anonymous")
    private final boolean isAnonymous;

    @b("comment")
    private final String note;

    @b("owner")
    private final TransferLinkOwnerDto owner;

    @b("payee")
    private final TransferLinkOwnerDto payee;

    @b("registeredIdentityId")
    private final String registeredIdentityId;

    @b("state")
    @NotNull
    private final String state;

    @b("transactionId")
    private final String transactionId;

    @b("receiveUrl")
    @NotNull
    private final String url;

    public TransferLinkDetailsDto(@NotNull String id10, @NotNull String url2, @NotNull String state, @NotNull String code, long j2, long j3, Long l2, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, TransferLinkOwnerDto transferLinkOwnerDto, TransferLinkOwnerDto transferLinkOwnerDto2, String str9) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(code, "code");
        this.id = id10;
        this.url = url2;
        this.state = state;
        this.code = code;
        this.expiryDate = j2;
        this.createdDate = j3;
        this.amount = l2;
        this.currency = str;
        this.note = str2;
        this.gifUrl = str3;
        this.direction = str4;
        this.isAnonymous = z;
        this.transactionId = str5;
        this.beneficiaryName = str6;
        this.beneficiaryPhone = str7;
        this.beneficiaryEmail = str8;
        this.owner = transferLinkOwnerDto;
        this.payee = transferLinkOwnerDto2;
        this.registeredIdentityId = str9;
    }

    public static /* synthetic */ TransferLinkDetailsDto copy$default(TransferLinkDetailsDto transferLinkDetailsDto, String str, String str2, String str3, String str4, long j2, long j3, Long l2, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, TransferLinkOwnerDto transferLinkOwnerDto, TransferLinkOwnerDto transferLinkOwnerDto2, String str13, int i, Object obj2) {
        String str14;
        TransferLinkOwnerDto transferLinkOwnerDto3;
        String str15 = (i & 1) != 0 ? transferLinkDetailsDto.id : str;
        String str16 = (i & 2) != 0 ? transferLinkDetailsDto.url : str2;
        String str17 = (i & 4) != 0 ? transferLinkDetailsDto.state : str3;
        String str18 = (i & 8) != 0 ? transferLinkDetailsDto.code : str4;
        long j5 = (i & 16) != 0 ? transferLinkDetailsDto.expiryDate : j2;
        long j16 = (i & 32) != 0 ? transferLinkDetailsDto.createdDate : j3;
        Long l3 = (i & 64) != 0 ? transferLinkDetailsDto.amount : l2;
        String str19 = (i & 128) != 0 ? transferLinkDetailsDto.currency : str5;
        String str20 = (i & 256) != 0 ? transferLinkDetailsDto.note : str6;
        String str21 = (i & 512) != 0 ? transferLinkDetailsDto.gifUrl : str7;
        String str22 = (i & 1024) != 0 ? transferLinkDetailsDto.direction : str8;
        boolean z3 = (i & 2048) != 0 ? transferLinkDetailsDto.isAnonymous : z;
        String str23 = str15;
        String str24 = (i & 4096) != 0 ? transferLinkDetailsDto.transactionId : str9;
        String str25 = (i & 8192) != 0 ? transferLinkDetailsDto.beneficiaryName : str10;
        String str26 = (i & 16384) != 0 ? transferLinkDetailsDto.beneficiaryPhone : str11;
        String str27 = (i & 32768) != 0 ? transferLinkDetailsDto.beneficiaryEmail : str12;
        TransferLinkOwnerDto transferLinkOwnerDto4 = (i & 65536) != 0 ? transferLinkDetailsDto.owner : transferLinkOwnerDto;
        TransferLinkOwnerDto transferLinkOwnerDto5 = (i & 131072) != 0 ? transferLinkDetailsDto.payee : transferLinkOwnerDto2;
        if ((i & 262144) != 0) {
            transferLinkOwnerDto3 = transferLinkOwnerDto5;
            str14 = transferLinkDetailsDto.registeredIdentityId;
        } else {
            str14 = str13;
            transferLinkOwnerDto3 = transferLinkOwnerDto5;
        }
        return transferLinkDetailsDto.copy(str23, str16, str17, str18, j5, j16, l3, str19, str20, str21, str22, z3, str24, str25, str26, str27, transferLinkOwnerDto4, transferLinkOwnerDto3, str14);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getGifUrl() {
        return this.gifUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBeneficiaryPhone() {
        return this.beneficiaryPhone;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBeneficiaryEmail() {
        return this.beneficiaryEmail;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final TransferLinkOwnerDto getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final TransferLinkOwnerDto getPayee() {
        return this.payee;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @NotNull
    public final TransferLinkDetailsDto copy(@NotNull String id10, @NotNull String url2, @NotNull String state, @NotNull String code, long expiryDate, long createdDate, Long amount, String currency, String note, String gifUrl, String direction, boolean isAnonymous, String transactionId, String beneficiaryName, String beneficiaryPhone, String beneficiaryEmail, TransferLinkOwnerDto owner, TransferLinkOwnerDto payee, String registeredIdentityId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(code, "code");
        return new TransferLinkDetailsDto(id10, url2, state, code, expiryDate, createdDate, amount, currency, note, gifUrl, direction, isAnonymous, transactionId, beneficiaryName, beneficiaryPhone, beneficiaryEmail, owner, payee, registeredIdentityId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferLinkDetailsDto)) {
            return false;
        }
        TransferLinkDetailsDto transferLinkDetailsDto = (TransferLinkDetailsDto) other;
        return Intrinsics.f(this.id, transferLinkDetailsDto.id) && Intrinsics.f(this.url, transferLinkDetailsDto.url) && Intrinsics.f(this.state, transferLinkDetailsDto.state) && Intrinsics.f(this.code, transferLinkDetailsDto.code) && this.expiryDate == transferLinkDetailsDto.expiryDate && this.createdDate == transferLinkDetailsDto.createdDate && Intrinsics.f(this.amount, transferLinkDetailsDto.amount) && Intrinsics.f(this.currency, transferLinkDetailsDto.currency) && Intrinsics.f(this.note, transferLinkDetailsDto.note) && Intrinsics.f(this.gifUrl, transferLinkDetailsDto.gifUrl) && Intrinsics.f(this.direction, transferLinkDetailsDto.direction) && this.isAnonymous == transferLinkDetailsDto.isAnonymous && Intrinsics.f(this.transactionId, transferLinkDetailsDto.transactionId) && Intrinsics.f(this.beneficiaryName, transferLinkDetailsDto.beneficiaryName) && Intrinsics.f(this.beneficiaryPhone, transferLinkDetailsDto.beneficiaryPhone) && Intrinsics.f(this.beneficiaryEmail, transferLinkDetailsDto.beneficiaryEmail) && Intrinsics.f(this.owner, transferLinkDetailsDto.owner) && Intrinsics.f(this.payee, transferLinkDetailsDto.payee) && Intrinsics.f(this.registeredIdentityId, transferLinkDetailsDto.registeredIdentityId);
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getBeneficiaryEmail() {
        return this.beneficiaryEmail;
    }

    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public final String getBeneficiaryPhone() {
        return this.beneficiaryPhone;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final long getCreatedDate() {
        return this.createdDate;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final long getExpiryDate() {
        return this.expiryDate;
    }

    public final String getGifUrl() {
        return this.gifUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getNote() {
        return this.note;
    }

    public final TransferLinkOwnerDto getOwner() {
        return this.owner;
    }

    public final TransferLinkOwnerDto getPayee() {
        return this.payee;
    }

    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iC = d.c(d.c(a.c(a.c(a.c(this.id.hashCode() * 31, 31, this.url), 31, this.state), 31, this.code), 31, this.expiryDate), 31, this.createdDate);
        Long l2 = this.amount;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.note;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gifUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.direction;
        int iC2 = j6.a.c((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isAnonymous);
        String str5 = this.transactionId;
        int iHashCode5 = (iC2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.beneficiaryName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.beneficiaryPhone;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.beneficiaryEmail;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        TransferLinkOwnerDto transferLinkOwnerDto = this.owner;
        int iHashCode9 = (iHashCode8 + (transferLinkOwnerDto == null ? 0 : transferLinkOwnerDto.hashCode())) * 31;
        TransferLinkOwnerDto transferLinkOwnerDto2 = this.payee;
        int iHashCode10 = (iHashCode9 + (transferLinkOwnerDto2 == null ? 0 : transferLinkOwnerDto2.hashCode())) * 31;
        String str9 = this.registeredIdentityId;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public final boolean isAnonymous() {
        return this.isAnonymous;
    }
}
