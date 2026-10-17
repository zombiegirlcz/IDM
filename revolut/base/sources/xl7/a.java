package xl7;

import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306939a;

    static {
        int[] iArr = new int[AdditionalDriver.Relationship.values().length];
        try {
            iArr[AdditionalDriver.Relationship.SPOUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdditionalDriver.Relationship.FAMILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdditionalDriver.Relationship.PARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AdditionalDriver.Relationship.OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f306939a = iArr;
    }
}
