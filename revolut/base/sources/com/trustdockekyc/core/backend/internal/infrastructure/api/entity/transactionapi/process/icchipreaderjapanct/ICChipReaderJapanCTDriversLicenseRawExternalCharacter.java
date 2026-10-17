package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawExternalCharacter;", "", "", "index", "", "image", "size", "<init>", "(ILjava/lang/String;I)V", "copy", "(ILjava/lang/String;I)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawExternalCharacter;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDriversLicenseRawExternalCharacter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107476c;

    public ICChipReaderJapanCTDriversLicenseRawExternalCharacter(@i(name = "index") int i, @i(name = "image") @NotNull String image, @i(name = "size") int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f107474a = i;
        this.f107475b = image;
        this.f107476c = i2;
    }

    @NotNull
    public final ICChipReaderJapanCTDriversLicenseRawExternalCharacter copy(@i(name = "index") int index, @i(name = "image") @NotNull String image, @i(name = "size") int size) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new ICChipReaderJapanCTDriversLicenseRawExternalCharacter(index, image, size);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDriversLicenseRawExternalCharacter)) {
            return false;
        }
        ICChipReaderJapanCTDriversLicenseRawExternalCharacter iCChipReaderJapanCTDriversLicenseRawExternalCharacter = (ICChipReaderJapanCTDriversLicenseRawExternalCharacter) obj2;
        return this.f107474a == iCChipReaderJapanCTDriversLicenseRawExternalCharacter.f107474a && Intrinsics.f(this.f107475b, iCChipReaderJapanCTDriversLicenseRawExternalCharacter.f107475b) && this.f107476c == iCChipReaderJapanCTDriversLicenseRawExternalCharacter.f107476c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f107476c) + w0.a(this.f107475b, Integer.hashCode(this.f107474a) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTDriversLicenseRawExternalCharacter(index=");
        sb6.append(this.f107474a);
        sb6.append(", image=");
        sb6.append(this.f107475b);
        sb6.append(", size=");
        return a.t(sb6, this.f107476c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
