package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class az0 implements b31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26945a;

    public az0(boolean z) {
        this.f26945a = z;
    }

    @Override // com.fourthline.orca.internal.b31
    public boolean a(fd fdVar, x71 taxationCountry, DocumentType documentType) {
        Intrinsics.checkNotNullParameter(taxationCountry, "taxationCountry");
        return !this.f26945a;
    }
}
