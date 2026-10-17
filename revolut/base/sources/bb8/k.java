package bb8;

import bb2.t;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.lr;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, boolean z, boolean z3) {
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, textLocalisedClause, textLocalisedClause2, null, false, null, false, textLocalisedClause3, null, null, null, null, null, false, null, null, z, false, false, false, new lr(540673), 0, null, null, false, z3, null, null, false, v.k(new oe8.a(), new oe8.b()), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1143079048, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f14184a, new b96.a(this, 23), new t(2), new b88.o(2, domainState, this));
    }
}
