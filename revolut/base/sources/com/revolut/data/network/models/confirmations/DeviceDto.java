package com.revolut.data.network.models.confirmations;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/revolut/data/network/models/confirmations/DeviceDto;", "", "id", "", "lastIpAddress", "lastOpen", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLastIpAddress", "getLastOpen", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeviceDto {

    @b("id")
    private final String id;

    @b("lastIpAddress")
    private final String lastIpAddress;

    @b("lastOpen")
    private final String lastOpen;

    public DeviceDto(String str, String str2, String str3) {
        this.id = str;
        this.lastIpAddress = str2;
        this.lastOpen = str3;
    }

    public static /* synthetic */ DeviceDto copy$default(DeviceDto deviceDto, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = deviceDto.id;
        }
        if ((i & 2) != 0) {
            str2 = deviceDto.lastIpAddress;
        }
        if ((i & 4) != 0) {
            str3 = deviceDto.lastOpen;
        }
        return deviceDto.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastIpAddress() {
        return this.lastIpAddress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastOpen() {
        return this.lastOpen;
    }

    @NotNull
    public final DeviceDto copy(String id10, String lastIpAddress, String lastOpen) {
        return new DeviceDto(id10, lastIpAddress, lastOpen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDto)) {
            return false;
        }
        DeviceDto deviceDto = (DeviceDto) other;
        return Intrinsics.f(this.id, deviceDto.id) && Intrinsics.f(this.lastIpAddress, deviceDto.lastIpAddress) && Intrinsics.f(this.lastOpen, deviceDto.lastOpen);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastIpAddress() {
        return this.lastIpAddress;
    }

    public final String getLastOpen() {
        return this.lastOpen;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastIpAddress;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastOpen;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
