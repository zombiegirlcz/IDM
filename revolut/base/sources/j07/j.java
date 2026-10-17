package j07;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f169990a;

    public j(zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f169990a = regexMatcher;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f169982a;
        List listC = u.c(new InputTextDelegate.Model("ITEM_ID_EMAIL_INPUT", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, null, null, null, null, null, null, false, null, null, false, false, 32, 0, null, false, false, null, true, null, false, false, false, null, null, 0, -538968068, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.q(listC, 0, 0, 0, 0, 15);
        if (str != null && !d0.W(str)) {
            boolean z = ((zzl.c) this.f169990a).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", str);
            return new g(listC, z);
        }
        return new g(listC, z);
    }
}
