package c36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20898b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f20896a.getDescriptor(), i, 3);
            throw null;
        }
        this.f20897a = str;
        this.f20898b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f20897a, cVar.f20897a) && Intrinsics.f(this.f20898b, cVar.f20898b);
    }

    public final int hashCode() {
        return this.f20898b.hashCode() + (this.f20897a.hashCode() * 31);
    }

    public c(String accountScopedId, String ticker) {
        Intrinsics.checkNotNullParameter(accountScopedId, "accountScopedId");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        this.f20897a = accountScopedId;
        this.f20898b = ticker;
    }
}
