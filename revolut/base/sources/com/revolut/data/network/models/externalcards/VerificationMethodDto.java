package com.revolut.data.network.models.externalcards;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/revolut/data/network/models/externalcards/VerificationMethodDto;", "", "name", "Lcom/revolut/data/network/models/externalcards/VerificationMethodDto$Companion$VerificationMethodName;", "preferred", "", "<init>", "(Lcom/revolut/data/network/models/externalcards/VerificationMethodDto$Companion$VerificationMethodName;Z)V", "getName", "()Lcom/revolut/data/network/models/externalcards/VerificationMethodDto$Companion$VerificationMethodName;", "getPreferred", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationMethodDto {

    @b("name")
    @NotNull
    private final Companion.VerificationMethodName name;

    @b("preferred")
    private final boolean preferred;

    public VerificationMethodDto(@NotNull Companion.VerificationMethodName name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.preferred = z;
    }

    public static /* synthetic */ VerificationMethodDto copy$default(VerificationMethodDto verificationMethodDto, Companion.VerificationMethodName verificationMethodName, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            verificationMethodName = verificationMethodDto.name;
        }
        if ((i & 2) != 0) {
            z = verificationMethodDto.preferred;
        }
        return verificationMethodDto.copy(verificationMethodName, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Companion.VerificationMethodName getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPreferred() {
        return this.preferred;
    }

    @NotNull
    public final VerificationMethodDto copy(@NotNull Companion.VerificationMethodName name, boolean preferred) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new VerificationMethodDto(name, preferred);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationMethodDto)) {
            return false;
        }
        VerificationMethodDto verificationMethodDto = (VerificationMethodDto) other;
        return this.name == verificationMethodDto.name && this.preferred == verificationMethodDto.preferred;
    }

    @NotNull
    public final Companion.VerificationMethodName getName() {
        return this.name;
    }

    public final boolean getPreferred() {
        return this.preferred;
    }

    public int hashCode() {
        return Boolean.hashCode(this.preferred) + (this.name.hashCode() * 31);
    }
}
