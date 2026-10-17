package uni;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ab;
import ip0.bb;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f281436a;
        ab abVar = ab.DIGITS_6;
        boolean z = domainState.f281437b;
        bb bbVar = bb.START;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        return new h(u.c(new z3("LIST_ID_OTP_CODE", str, abVar, CodeEditorDelegate.a.b.f52102a, z, bbVar, true, false, i, i, i2, i2, 128)), domainState.f281438c);
    }
}
