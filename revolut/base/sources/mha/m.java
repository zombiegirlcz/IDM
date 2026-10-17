package mha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements Serializable {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f205456b = new m("ATM");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f205457c = new m("BANK_TRANSFER");
    public static final m d = new m("CARD_SPEND");
    public static final m e = new m("EXCHANGE");
    public static final m f = new m("TRADE");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f205458g = new m("MONETISABLE");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f205459h = new m("INVEST_EXCHANGE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205460a;

    public m(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f205460a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f205460a, ((m) obj2).f205460a);
    }

    public final int hashCode() {
        return this.f205460a.hashCode();
    }
}
