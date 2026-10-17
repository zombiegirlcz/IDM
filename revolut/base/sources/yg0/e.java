package yg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yh0.e f313485b;

    public e(String token, yh0.e remediationLauncher) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(remediationLauncher, "remediationLauncher");
        this.f313484a = token;
        this.f313485b = remediationLauncher;
    }

    public final String a() {
        return this.f313484a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f313484a, eVar.f313484a) && this.f313485b.equals(eVar.f313485b);
    }

    public final int hashCode() {
        return this.f313485b.hashCode() + (this.f313484a.hashCode() * 31);
    }
}
