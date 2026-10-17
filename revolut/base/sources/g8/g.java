package g8;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes16.dex */
public final class g implements z8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageDigest f141230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z8.e f141231b = new z8.e();

    public g(MessageDigest messageDigest) {
        this.f141230a = messageDigest;
    }

    @Override // z8.b
    public final z8.e b() {
        return this.f141231b;
    }
}
