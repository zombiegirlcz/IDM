package dam;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public enum d {
    PRODUCTION("https://transact.atomicfi.com"),
    SANDBOX("https://transact-sandbox.atomicfi.com"),
    LOCAL("http://local.atomicfi.com:4545");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f112555a;

    d(String str) {
        this.f112555a = str;
    }
}
