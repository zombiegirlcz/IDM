package com.revolut.data.network.models.creditor;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/revolut/data/network/models/creditor/CreditorDto;", "", "id", "", "name", "logo", "bgColor", "authorisationCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getLogo", "getBgColor", "getAuthorisationCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditorDto {

    @b("authorisationCode")
    private final String authorisationCode;

    @b("bgColor")
    private final String bgColor;

    @b("creditorId")
    @NotNull
    private final String id;

    @b("creditorLogo")
    private final String logo;

    @b("creditorName")
    @NotNull
    private final String name;

    public CreditorDto(@NotNull String id10, @NotNull String name, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id10;
        this.name = name;
        this.logo = str;
        this.bgColor = str2;
        this.authorisationCode = str3;
    }

    public static /* synthetic */ CreditorDto copy$default(CreditorDto creditorDto, String str, String str2, String str3, String str4, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = creditorDto.id;
        }
        if ((i & 2) != 0) {
            str2 = creditorDto.name;
        }
        if ((i & 4) != 0) {
            str3 = creditorDto.logo;
        }
        if ((i & 8) != 0) {
            str4 = creditorDto.bgColor;
        }
        if ((i & 16) != 0) {
            str5 = creditorDto.authorisationCode;
        }
        String str6 = str5;
        String str7 = str3;
        return creditorDto.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAuthorisationCode() {
        return this.authorisationCode;
    }

    @NotNull
    public final CreditorDto copy(@NotNull String id10, @NotNull String name, String logo, String bgColor, String authorisationCode) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new CreditorDto(id10, name, logo, bgColor, authorisationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditorDto)) {
            return false;
        }
        CreditorDto creditorDto = (CreditorDto) other;
        return Intrinsics.f(this.id, creditorDto.id) && Intrinsics.f(this.name, creditorDto.name) && Intrinsics.f(this.logo, creditorDto.logo) && Intrinsics.f(this.bgColor, creditorDto.bgColor) && Intrinsics.f(this.authorisationCode, creditorDto.authorisationCode);
    }

    public final String getAuthorisationCode() {
        return this.authorisationCode;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iC = a.c(this.id.hashCode() * 31, 31, this.name);
        String str = this.logo;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bgColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authorisationCode;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ CreditorDto(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
