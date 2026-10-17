package fa8;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ec8.q;
import ip0.sr;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, sr srVar, boolean z) {
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, textLocalisedClause, textLocalisedClause2, null, false, null, false, null, null, null, null, null, null, false, null, null, false, z, false, false, null, 0, null, srVar, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -50593800, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(t1.t(domainState.f133250a, domainState.f133252c), new f7l.c(this, 8), new f5g.l(20), new q(this, domainState, 23));
    }
}
