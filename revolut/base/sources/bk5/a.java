package bk5;

import a94.q;
import bcj.i;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import sd5.c;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16260a;

    public a(c cryptoConfigInteractor) {
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        this.f16260a = cryptoConfigInteractor;
    }

    public static r c(a aVar, b currency) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.w(aVar.f16260a.a(false), new a6j.a((Object) currency, false, 8));
    }

    public final r a(b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.w(this.f16260a.a(false), new q(8, currency));
    }

    public final r b(wk5.a blockchain) {
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        return nim.a.w(this.f16260a.a(false), new i(blockchain, 1));
    }
}
