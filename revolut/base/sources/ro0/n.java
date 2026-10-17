package ro0;

import ix0.h0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f255756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f255757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f255758c;

    public n() {
        this(null, null, 7);
    }

    public n(Function0 function0, h0 h0Var, int i) {
        function0 = (i & 2) != 0 ? null : function0;
        h0Var = (i & 4) != 0 ? null : h0Var;
        this.f255756a = 30.0f;
        this.f255757b = function0;
        this.f255758c = h0Var;
    }
}
