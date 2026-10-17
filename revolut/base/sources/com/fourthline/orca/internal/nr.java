package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class nr implements or {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj f31468a;

    public nr(gj bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f31468a = bundle;
    }

    @Override // com.fourthline.orca.internal.or
    public List a() {
        return pr.b(ij.a(this.f31468a), this.f31468a.o());
    }

    @Override // com.fourthline.orca.internal.or
    public void a(di document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f31468a.a(document);
    }
}
