package com.revolut.data.network.models.ideal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/ideal/IdealIssuerInfoDto;", "", "bic", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBic", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdealIssuerInfoDto {

    @b("bic")
    @NotNull
    private final String bic;

    @b("name")
    @NotNull
    private final String name;

    public IdealIssuerInfoDto(@NotNull String bic2, @NotNull String name) {
        Intrinsics.checkNotNullParameter(bic2, "bic");
        Intrinsics.checkNotNullParameter(name, "name");
        this.bic = bic2;
        this.name = name;
    }

    public static /* synthetic */ IdealIssuerInfoDto copy$default(IdealIssuerInfoDto idealIssuerInfoDto, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = idealIssuerInfoDto.bic;
        }
        if ((i & 2) != 0) {
            str2 = idealIssuerInfoDto.name;
        }
        return idealIssuerInfoDto.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBic() {
        return this.bic;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final IdealIssuerInfoDto copy(@NotNull String bic2, @NotNull String name) {
        Intrinsics.checkNotNullParameter(bic2, "bic");
        Intrinsics.checkNotNullParameter(name, "name");
        return new IdealIssuerInfoDto(bic2, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdealIssuerInfoDto)) {
            return false;
        }
        IdealIssuerInfoDto idealIssuerInfoDto = (IdealIssuerInfoDto) other;
        return Intrinsics.f(this.bic, idealIssuerInfoDto.bic) && Intrinsics.f(this.name, idealIssuerInfoDto.name);
    }

    @NotNull
    public final String getBic() {
        return this.bic;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.bic.hashCode() * 31);
    }
}
