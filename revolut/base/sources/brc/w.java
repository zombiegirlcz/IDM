package brc;

import bn4.y;
import bq5.o0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements cli.n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im.c f18000a;

    public w(b disputeUiMapper) {
        Intrinsics.checkNotNullParameter(disputeUiMapper, "disputeUiMapper");
        HashMap map = im.c.f162274c;
        this.f18000a = v13.d.l("[00].[000].[000]/[0000]-[00…]", f0.f322471a);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (r) iii.c.f(domainState.f17987a, new o0(this, 19), new y(this, 15), new b88.o(this, 15));
    }
}
