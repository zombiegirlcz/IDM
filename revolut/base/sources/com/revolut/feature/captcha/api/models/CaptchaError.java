package com.revolut.feature.captcha.api.models;

import iu2.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/captcha/api/models/CaptchaError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Liu2/a;", "Resolution", "ChallengeClosed", "Timeout", "Lcom/revolut/feature/captcha/api/models/CaptchaError$ChallengeClosed;", "Lcom/revolut/feature/captcha/api/models/CaptchaError$Resolution;", "Lcom/revolut/feature/captcha/api/models/CaptchaError$Timeout;", "feature_captcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CaptchaError extends Exception implements a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/captcha/api/models/CaptchaError$ChallengeClosed;", "Lcom/revolut/feature/captcha/api/models/CaptchaError;", "<init>", "()V", "feature_captcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChallengeClosed extends CaptchaError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChallengeClosed f64377a = new ChallengeClosed();

        private ChallengeClosed() {
            super("Challenge closed");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/captcha/api/models/CaptchaError$Resolution;", "Lcom/revolut/feature/captcha/api/models/CaptchaError;", "", "toString", "()Ljava/lang/String;", "feature_captcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Resolution extends CaptchaError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64378a;

        public Resolution(String str) {
            super(str);
            this.f64378a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Resolution) && Intrinsics.f(this.f64378a, ((Resolution) obj2).f64378a);
        }

        public final int hashCode() {
            String str = this.f64378a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/captcha/api/models/CaptchaError$Timeout;", "Lcom/revolut/feature/captcha/api/models/CaptchaError;", "<init>", "()V", "feature_captcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Timeout extends CaptchaError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Timeout f64379a = new Timeout();

        private Timeout() {
            super("Captcha resolution timeout.");
        }
    }
}
