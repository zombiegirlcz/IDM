package com.revolut.data.network.models.topup;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/revolut/data/network/models/topup/AutoTopUpPerPocketDto;", "", "autoTopUps", "", "", "Lcom/revolut/data/network/models/topup/AutoTopUpDto;", "<init>", "(Ljava/util/Map;)V", "getAutoTopUps", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoTopUpPerPocketDto {

    @b("autoTopups")
    @NotNull
    private final Map<String, AutoTopUpDto> autoTopUps;

    public AutoTopUpPerPocketDto(@NotNull Map<String, AutoTopUpDto> autoTopUps) {
        Intrinsics.checkNotNullParameter(autoTopUps, "autoTopUps");
        this.autoTopUps = autoTopUps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoTopUpPerPocketDto copy$default(AutoTopUpPerPocketDto autoTopUpPerPocketDto, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            map = autoTopUpPerPocketDto.autoTopUps;
        }
        return autoTopUpPerPocketDto.copy(map);
    }

    @NotNull
    public final Map<String, AutoTopUpDto> component1() {
        return this.autoTopUps;
    }

    @NotNull
    public final AutoTopUpPerPocketDto copy(@NotNull Map<String, AutoTopUpDto> autoTopUps) {
        Intrinsics.checkNotNullParameter(autoTopUps, "autoTopUps");
        return new AutoTopUpPerPocketDto(autoTopUps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutoTopUpPerPocketDto) && Intrinsics.f(this.autoTopUps, ((AutoTopUpPerPocketDto) other).autoTopUps);
    }

    @NotNull
    public final Map<String, AutoTopUpDto> getAutoTopUps() {
        return this.autoTopUps;
    }

    public int hashCode() {
        return this.autoTopUps.hashCode();
    }
}
