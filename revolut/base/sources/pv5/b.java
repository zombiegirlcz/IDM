package pv5;

import ahe.i;
import bwb.k;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mu5.p;
import o9c.r0;
import tk0.c;
import ut5.g;
import vkm.j2;
import vkm.q;
import vkm.y;
import wkm.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f239979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f239980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f239981c;
    public final j2 d;

    public b(p widgetCustomizationInteractor, g perpetualsItemsProvider) {
        Intrinsics.checkNotNullParameter(widgetCustomizationInteractor, "widgetCustomizationInteractor");
        Intrinsics.checkNotNullParameter(perpetualsItemsProvider, "perpetualsItemsProvider");
        this.f239979a = widgetCustomizationInteractor;
        this.f239980b = perpetualsItemsProvider;
        Boolean bool = Boolean.TRUE;
        this.f239981c = q.c(bool);
        this.d = q.c(bool);
    }

    public final l a() {
        p pVar = this.f239979a;
        Continuation continuation = null;
        return q.Q(ta6.a.g(this.f239981c, this.d, pVar.c(), t1.E(new i(new y(new mu5.i(pVar, null, 2), pVar.f208986a.j(new c("CRYPTO_PERPETUALS_WIDGET_SHOW_UP_TO"))), 10)), new r0(this, continuation, 1)), new k(3, 14, continuation));
    }
}
