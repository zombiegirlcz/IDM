package oha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Serializable {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f225330b = new e("EXCHANGE");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f225331c;
    public static final e d;
    public static final e e;
    public static final e f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225332a;

    static {
        new e("CROSS_BORDER_TRANSFER");
        f225331c = new e("CRYPTO_EXCHANGE");
        new e("COMMODITY_EXCHANGE");
        d = new e("WEEKEND_EXCHANGE");
        e = new e("TRADE");
        f = new e("ATM");
        new e("TRANSFER");
    }

    public e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f225332a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f225332a, ((e) obj2).f225332a);
    }

    public final int hashCode() {
        return this.f225332a.hashCode();
    }
}
