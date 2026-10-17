package gll;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ab;
import ip0.bb;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f144728a;
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        ab abVar = ab.DIGITS_4;
        bb bbVar = bb.CENTER_HORIZONTAL;
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp16;
        return new h(u.c(new z3("LIST_ID_PIN_INPUT", str, abVar, null, false, bbVar, true, false, i, i2, i3, i3, SyslogConstants.LOG_LOCAL3)));
    }
}
