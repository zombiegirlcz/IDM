package qf8;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f245274a;

    public a(ArrayList supportedFiatCurrencies) {
        Intrinsics.checkNotNullParameter(supportedFiatCurrencies, "supportedFiatCurrencies");
        this.f245274a = supportedFiatCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f245274a.equals(((a) obj2).f245274a);
    }

    public final int hashCode() {
        return this.f245274a.hashCode();
    }
}
