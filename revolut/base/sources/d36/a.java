package d36;

import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110920a;

    static {
        int[] iArr = new int[DeFiAssetRiskType.values().length];
        try {
            iArr[DeFiAssetRiskType.MALICIOUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeFiAssetRiskType.SMART_CONTRACT_FLAWS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeFiAssetRiskType.MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeFiAssetRiskType.ECONOMIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DeFiAssetRiskType.BEHAVIOUR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DeFiAssetRiskType.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f110920a = iArr;
    }
}
