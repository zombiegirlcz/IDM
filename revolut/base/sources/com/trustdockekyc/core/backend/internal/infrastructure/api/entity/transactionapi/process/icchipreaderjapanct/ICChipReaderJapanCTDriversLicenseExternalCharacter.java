package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseExternalCharacter;", "", "", "index", "", "image", "<init>", "(ILjava/lang/String;)V", "copy", "(ILjava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseExternalCharacter;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDriversLicenseExternalCharacter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107464b;

    public ICChipReaderJapanCTDriversLicenseExternalCharacter(@i(name = "index") int i, @i(name = "image") @NotNull String image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f107463a = i;
        this.f107464b = image;
    }

    @NotNull
    public final ICChipReaderJapanCTDriversLicenseExternalCharacter copy(@i(name = "index") int index, @i(name = "image") @NotNull String image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new ICChipReaderJapanCTDriversLicenseExternalCharacter(index, image);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDriversLicenseExternalCharacter)) {
            return false;
        }
        ICChipReaderJapanCTDriversLicenseExternalCharacter iCChipReaderJapanCTDriversLicenseExternalCharacter = (ICChipReaderJapanCTDriversLicenseExternalCharacter) obj2;
        return this.f107463a == iCChipReaderJapanCTDriversLicenseExternalCharacter.f107463a && Intrinsics.f(this.f107464b, iCChipReaderJapanCTDriversLicenseExternalCharacter.f107464b);
    }

    public final int hashCode() {
        return this.f107464b.hashCode() + (Integer.hashCode(this.f107463a) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTDriversLicenseExternalCharacter(index=");
        sb6.append(this.f107463a);
        sb6.append(", image=");
        return a.u(sb6, this.f107464b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
