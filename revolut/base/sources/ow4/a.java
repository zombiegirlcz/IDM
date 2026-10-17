package ow4;

import kotlin.jvm.internal.Intrinsics;
import qd0.b;
import u80.p;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f230305a;

    public a(b languageProvider, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                this.f230305a = languageProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                this.f230305a = languageProvider;
                break;
        }
    }

    public long a(String newAmount, String currencyCode) {
        Intrinsics.checkNotNullParameter(newAmount, "newAmount");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        p pVar = p.f278066a;
        return p.a(newAmount, currencyCode, this.f230305a, null);
    }
}
