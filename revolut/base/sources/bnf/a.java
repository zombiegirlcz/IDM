package bnf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.b f17134a;

    public a(fk3.b configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f17134a = configurationRepository;
    }

    public final String a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (d0.J(str, "http", false)) {
            return str;
        }
        String strI = ((ik3.g) this.f17134a).f161888g.b().i();
        if (strI.length() == 0) {
            strI = "https://assets.revolut.com/merchant_icons/";
        }
        return j6.a.r(strI, str, z ? "@xxxhdpi" : "@2x", ".png");
    }
}
