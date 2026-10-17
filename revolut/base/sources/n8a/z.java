package n8a;

import com.revolut.data.network.models.beneficiary.BeneficiaryIdentificationTypeDto;
import com.revolut.feature.pix.impl.data.model.PixQrCodeDecodeStatusDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f213358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f213359b;

    static {
        int[] iArr = new int[PixQrCodeDecodeStatusDto.values().length];
        try {
            iArr[PixQrCodeDecodeStatusDto.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PixQrCodeDecodeStatusDto.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PixQrCodeDecodeStatusDto.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f213358a = iArr;
        int[] iArr2 = new int[BeneficiaryIdentificationTypeDto.values().length];
        try {
            iArr2[BeneficiaryIdentificationTypeDto.BR_CPF.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BeneficiaryIdentificationTypeDto.BR_CNPJ.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f213359b = iArr2;
    }
}
