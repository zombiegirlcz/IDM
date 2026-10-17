package com.revolut.data.network.models.kyc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/revolut/data/network/models/kyc/AddUserAddressRequestDto;", "", "Lno3/b;", "address", "", "addressRef", "<init>", "(Lno3/b;Ljava/lang/String;)V", "component1", "()Lno3/b;", "component2", "()Ljava/lang/String;", "copy", "(Lno3/b;Ljava/lang/String;)Lcom/revolut/data/network/models/kyc/AddUserAddressRequestDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Lno3/b;", "getAddress", "Ljava/lang/String;", "getAddressRef", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddUserAddressRequestDto {

    @b("address")
    @NotNull
    private final no3.b address;

    @b("addressRef")
    private final String addressRef;

    public AddUserAddressRequestDto(@NotNull no3.b address, String str) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.address = address;
        this.addressRef = str;
    }

    public static /* synthetic */ AddUserAddressRequestDto copy$default(AddUserAddressRequestDto addUserAddressRequestDto, no3.b bVar, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            bVar = addUserAddressRequestDto.address;
        }
        if ((i & 2) != 0) {
            str = addUserAddressRequestDto.addressRef;
        }
        return addUserAddressRequestDto.copy(bVar, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final no3.b getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddressRef() {
        return this.addressRef;
    }

    @NotNull
    public final AddUserAddressRequestDto copy(@NotNull no3.b address, String addressRef) {
        Intrinsics.checkNotNullParameter(address, "address");
        return new AddUserAddressRequestDto(address, addressRef);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddUserAddressRequestDto)) {
            return false;
        }
        AddUserAddressRequestDto addUserAddressRequestDto = (AddUserAddressRequestDto) other;
        return Intrinsics.f(this.address, addUserAddressRequestDto.address) && Intrinsics.f(this.addressRef, addUserAddressRequestDto.addressRef);
    }

    @NotNull
    public final no3.b getAddress() {
        return this.address;
    }

    public final String getAddressRef() {
        return this.addressRef;
    }

    public int hashCode() {
        int iHashCode = this.address.hashCode() * 31;
        String str = this.addressRef;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ AddUserAddressRequestDto(no3.b bVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? null : str);
    }
}
