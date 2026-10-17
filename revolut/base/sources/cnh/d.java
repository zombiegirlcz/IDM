package cnh;

import ck7.j;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import xv0.x;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends yji.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f25423c;
    public final h d;

    public d(f modelExtension, a parcelItemParser, h view) {
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(parcelItemParser, "parcelItemParser");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f25423c = modelExtension;
        this.d = view;
    }

    @Override // yji.d
    public final void M() {
        vkm.d dVarB = rd0.e.b(x.c(this.d.f25431a, 7));
        b.Companion companion = kotlin.time.b.INSTANCE;
        yji.d.H(this, new ba4.x(t1.f(dVarB, kotlin.time.c.h(300L, pkm.e.MILLISECONDS)), this, 29), new j(this, null, 5), 3);
    }
}
