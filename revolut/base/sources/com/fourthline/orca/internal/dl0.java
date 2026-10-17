package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class dl0 implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vc1 f27816b;

    public dl0(boolean z, vc1 skipPersonDetailsUseCase) {
        Intrinsics.checkNotNullParameter(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        this.f27815a = z;
        this.f27816b = skipPersonDetailsUseCase;
    }

    private final boolean b() {
        return !this.f27816b.a(false);
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        if (b()) {
            return zhm.u.c(ck0.b.f27493a);
        }
        ck0[] elements = {c() ? ck0.c.f27494a : null, new ck0.a(null, 1, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public boolean c() {
        return this.f27815a;
    }
}
