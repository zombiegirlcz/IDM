package com.fourthline.orca.internal;

import com.fourthline.orca.internal.fp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class uq implements my {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final or f34160a;

    public uq(or documentVersionRepository) {
        Intrinsics.checkNotNullParameter(documentVersionRepository, "documentVersionRepository");
        this.f34160a = documentVersionRepository;
    }

    private final boolean b() {
        return this.f34160a.a().size() > 1;
    }

    @Override // com.fourthline.orca.internal.my
    public List a() {
        return zhm.u.c(b() ? fp.b.f28591a : new fp.c(null, 1, null));
    }
}
