package aw0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8 f10239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx0.r f10240b;

    public b(i8 productIntro, tx0.r account) {
        Intrinsics.checkNotNullParameter(productIntro, "productIntro");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f10239a = productIntro;
        this.f10240b = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f10239a, bVar.f10239a) && Intrinsics.f(this.f10240b, bVar.f10240b);
    }

    public final int hashCode() {
        return this.f10240b.hashCode() + (this.f10239a.hashCode() * 31);
    }
}
