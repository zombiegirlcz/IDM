package xp7;

import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tl7.f f307897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f307898q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, tl7.f bottomDialog) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f307897p = bottomDialog;
        this.f307898q = new e(null);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f307898q;
    }
}
