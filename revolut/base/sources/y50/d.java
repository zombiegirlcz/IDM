package y50;

import cli.g;
import com.revolut.core.ui_kit.models.Clause;
import gw0.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f310977l;

    public abstract a Z2();

    public q b3(Clause primaryText, Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        return null;
    }

    public final b c3() {
        b bVar = this.f310977l;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("config");
        throw null;
    }

    public abstract g d3();

    public abstract Object e3(String str);

    public final void f3(Function1 func) {
        Intrinsics.checkNotNullParameter(func, "func");
        X2(d3(), func);
    }
}
