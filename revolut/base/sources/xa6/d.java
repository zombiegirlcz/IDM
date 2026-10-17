package xa6;

import com.revolut.core.extensions.rx.BreadcrumbException;
import ipa.j;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ofm.h;
import org.jetbrains.annotations.NotNull;
import sa6.a0;
import te0.w;
import ue0.e;
import vfg.p;
import x94.q;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements hpa.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f303778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.c f303779b;

    public d(a0 pendingDonationsInteractor, lfm.c compositeDisposable) {
        Intrinsics.checkNotNullParameter(pendingDonationsInteractor, "pendingDonationsInteractor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f303778a = pendingDonationsInteractor;
        this.f303779b = compositeDisposable;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = (String) message.get("requestId");
        if (str == null) {
            return false;
        }
        if (d0.W(str)) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        try {
            lfm.c cVar = this.f303779b;
            pfm.a aVar = new pfm.a(e.v(this.f303778a.a(y0.b(str))), new p(new q(new BreadcrumbException(), 2)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
            h hVarW = aVar.w(new wl3.e(2, c.f303777a), b.f303776a);
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
            w.j0(cVar, hVarW);
            Unit unit = Unit.f186387a;
            return false;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return false;
        }
    }
}
