package xt1;

import akl.t;
import c02.j;
import com.revolut.feature.apm.blik.impl.data.network.BlikService;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ufm.i;
import ufm.n;
import w4l.f;
import zt1.h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlikService f308742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f308743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jpf.a f308744c;

    public d(BlikService blikService) {
        Intrinsics.checkNotNullParameter(blikService, "blikService");
        this.f308742a = blikService;
        this.f308743b = new f(new t(this, 12), null, null, null, null, null, null, null, 254);
        this.f308744c = new jpf.a(new f2(this, 25), null, null, null, null, 62);
    }

    public final n a(j transaction, String str) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        d0<h> quote = this.f308742a.getQuote(transaction.a(), str);
        a aVar = new a(0, new xrl.a(12));
        quote.getClass();
        i iVar = new i(quote, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }
}
