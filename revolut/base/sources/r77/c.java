package r77;

import com.revolut.feature.global_markets.domain.Market;
import s77.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f252037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f252038b;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.US.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.EUROPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.APAC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f252037a = iArr;
        int[] iArr2 = new int[Market.values().length];
        try {
            iArr2[Market.US.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Market.Europe.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Market.APAC.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f252038b = iArr2;
    }
}
