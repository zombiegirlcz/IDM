package com.revolut.data.network.models.login;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/revolut/data/network/models/login/ResendRequestDto;", "", "phone", "", "scopes", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPhone", "()Ljava/lang/String;", "getScopes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResendRequestDto {

    @b("phone")
    @NotNull
    private final String phone;

    @b("scopes")
    private final List<String> scopes;

    public ResendRequestDto(@NotNull String phone, List<String> list) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.phone = phone;
        this.scopes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResendRequestDto copy$default(ResendRequestDto resendRequestDto, String str, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = resendRequestDto.phone;
        }
        if ((i & 2) != 0) {
            list = resendRequestDto.scopes;
        }
        return resendRequestDto.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final List<String> component2() {
        return this.scopes;
    }

    @NotNull
    public final ResendRequestDto copy(@NotNull String phone, List<String> scopes) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new ResendRequestDto(phone, scopes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResendRequestDto)) {
            return false;
        }
        ResendRequestDto resendRequestDto = (ResendRequestDto) other;
        return Intrinsics.f(this.phone, resendRequestDto.phone) && Intrinsics.f(this.scopes, resendRequestDto.scopes);
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    public final List<String> getScopes() {
        return this.scopes;
    }

    public int hashCode() {
        int iHashCode = this.phone.hashCode() * 31;
        List<String> list = this.scopes;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public /* synthetic */ ResendRequestDto(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
