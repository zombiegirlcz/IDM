package com.hcaptcha.sdk;

/* JADX INFO: loaded from: classes17.dex */
public class HCaptchaException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HCaptchaError f49849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49850b;

    public HCaptchaException(HCaptchaError hCaptchaError, String str) {
        if (hCaptchaError == null) {
            throw new NullPointerException("hCaptchaError is marked non-null but is null");
        }
        this.f49849a = hCaptchaError;
        this.f49850b = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof HCaptchaException)) {
            return false;
        }
        HCaptchaException hCaptchaException = (HCaptchaException) obj2;
        if (!super.equals(obj2)) {
            return false;
        }
        HCaptchaError hCaptchaError = hCaptchaException.f49849a;
        HCaptchaError hCaptchaError2 = this.f49849a;
        if (hCaptchaError2 != null ? !hCaptchaError2.equals(hCaptchaError) : hCaptchaError != null) {
            return false;
        }
        String message = getMessage();
        String message2 = hCaptchaException.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.f49850b;
        return str == null ? this.f49849a.getMessage() : str;
    }

    public final int hashCode() {
        int iHashCode = super.hashCode() * 59;
        HCaptchaError hCaptchaError = this.f49849a;
        int iHashCode2 = iHashCode + (hCaptchaError == null ? 43 : hCaptchaError.hashCode());
        String message = getMessage();
        return (iHashCode2 * 59) + (message != null ? message.hashCode() : 43);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "HCaptchaException(hCaptchaError=" + this.f49849a + ", message=" + getMessage() + ")";
    }
}
