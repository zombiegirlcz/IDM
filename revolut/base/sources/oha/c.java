package oha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Serializable {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f225328b = new c("FREE_STOCK_TRADE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225329a;

    static {
        new c("STOCK_TRADE");
        new c("SWIFT_NON_USD_TRANSFER_1_FREE");
        new c("SWIFT_USD_TRANSFER_1_FREE");
        new c("CROSS_BORDER_TRANSFER_1_FREE");
        new c("CROSS_BORDER_TRANSFER_PAID");
        new c("BANK_TRANSFER_INTERNATIONAL_10_FREE");
    }

    public c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f225329a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f225329a, ((c) obj2).f225329a);
    }

    public final int hashCode() {
        return this.f225329a.hashCode();
    }
}
