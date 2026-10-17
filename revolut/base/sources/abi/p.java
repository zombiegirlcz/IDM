package abi;

import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationUseCase;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2974a;

    static {
        int[] iArr = new int[EmailVerificationUseCase.values().length];
        try {
            iArr[EmailVerificationUseCase.Onboarding.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EmailVerificationUseCase.PostOnboarding.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f2974a = iArr;
    }
}
