package com.revolut.data.network.models.openbanking;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import x61.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revolut/data/network/models/openbanking/ExternalInstitutionLinkingScopeRequestDto;", "", "withIncomeVerification", "", "<init>", "(Z)V", "getWithIncomeVerification", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalInstitutionLinkingScopeRequestDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @b("withIncomeVerification")
    private final boolean withIncomeVerification;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/data/network/models/openbanking/ExternalInstitutionLinkingScopeRequestDto$Companion;", "", "<init>", "()V", "Lx61/d;", "linkingScope", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionLinkingScopeRequestDto;", "from", "(Lx61/d;)Lcom/revolut/data/network/models/openbanking/ExternalInstitutionLinkingScopeRequestDto;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExternalInstitutionLinkingScopeRequestDto from(@NotNull d linkingScope) {
            Intrinsics.checkNotNullParameter(linkingScope, "linkingScope");
            return new ExternalInstitutionLinkingScopeRequestDto(linkingScope.f303012a);
        }

        private Companion() {
        }
    }

    public ExternalInstitutionLinkingScopeRequestDto(boolean z) {
        this.withIncomeVerification = z;
    }

    public static /* synthetic */ ExternalInstitutionLinkingScopeRequestDto copy$default(ExternalInstitutionLinkingScopeRequestDto externalInstitutionLinkingScopeRequestDto, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = externalInstitutionLinkingScopeRequestDto.withIncomeVerification;
        }
        return externalInstitutionLinkingScopeRequestDto.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getWithIncomeVerification() {
        return this.withIncomeVerification;
    }

    @NotNull
    public final ExternalInstitutionLinkingScopeRequestDto copy(boolean withIncomeVerification) {
        return new ExternalInstitutionLinkingScopeRequestDto(withIncomeVerification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExternalInstitutionLinkingScopeRequestDto) && this.withIncomeVerification == ((ExternalInstitutionLinkingScopeRequestDto) other).withIncomeVerification;
    }

    public final boolean getWithIncomeVerification() {
        return this.withIncomeVerification;
    }

    public int hashCode() {
        return Boolean.hashCode(this.withIncomeVerification);
    }
}
