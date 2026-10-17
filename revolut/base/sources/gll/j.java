package gll;

import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends jki.g implements jki.h {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f144732p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f144732p = new d(null);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f144732p;
    }
}
