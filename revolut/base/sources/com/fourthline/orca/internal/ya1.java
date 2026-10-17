package com.fourthline.orca.internal;

import com.fourthline.orca.internal.i91;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ya1 implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f35237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f31 f35238b;

    public ya1(boolean z, f31 skipTinDetailsUseCase) {
        Intrinsics.checkNotNullParameter(skipTinDetailsUseCase, "skipTinDetailsUseCase");
        this.f35237a = z;
        this.f35238b = skipTinDetailsUseCase;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        return zhm.u.c(!this.f35238b.a() ? i91.c.f29537a : b() ? i91.a.f29535a : new i91.b(null, 1, null));
    }

    public boolean b() {
        return this.f35237a;
    }
}
