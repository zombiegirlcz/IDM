package kwa;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ab;
import ip0.bb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        kwa.a domainState = (kwa.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c(u.c(new z3("CODE_INPUT_ID", domainState.f190313a, ab.DIGITS_6_NO_DIVIDER, CodeEditorDelegate.a.C0399a.f52101a, false, bb.START, false, false, 0, 0, R$attr.uikit_dp16, 0, 2960)));
    }
}
