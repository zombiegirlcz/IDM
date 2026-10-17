package jgi;

import aie.v;
import gq.f;
import ipa.h;
import ipa.j;
import ipa.k;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import wsg.n;
import x71.e;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f174059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final go3.b f174060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f174061c;
    public final f d;
    public final CoroutineScope e;

    public d(n walletInteractor, go3.b walletMapper, e transactionsRepository, f appWidgetsController, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(walletMapper, "walletMapper");
        Intrinsics.checkNotNullParameter(transactionsRepository, "transactionsRepository");
        Intrinsics.checkNotNullParameter(appWidgetsController, "appWidgetsController");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f174059a = walletInteractor;
        this.f174060b = walletMapper;
        this.f174061c = transactionsRepository;
        this.d = appWidgetsController;
        this.e = scope;
    }

    public final boolean a(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (k.l(message) == h.WALLETS_UPDATE) {
            Intrinsics.checkNotNullParameter(message, "<this>");
            String str = (String) message.get("wallets");
            if (str != null && str.length() != 0) {
                String strJ = k.j(message);
                if (strJ == null) {
                    strJ = "";
                }
                String str2 = strJ;
                p0 p0Var = p0.f264001a;
                e0.C(this.e, elm.f.f127540b, null, new v(6, str, this, str2, null), 2);
                return true;
            }
        }
        return false;
    }
}
