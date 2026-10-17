package vn3;

import com.revolut.feature.cooldown_checker.api.UserActivity;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290744a;

    static {
        int[] iArr = new int[UserActivity.values().length];
        try {
            iArr[UserActivity.AddBeneficiary.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserActivity.EmailChange.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserActivity.PhoneNumberChange.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f290744a = iArr;
    }
}
