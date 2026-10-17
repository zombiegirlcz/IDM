package com.fourthline.orca.internal;

import com.fourthline.orca.internal.er;
import com.fourthline.orca.internal.w2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wh implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd f34686a;

    public wh(pd countryValidator) {
        Intrinsics.checkNotNullParameter(countryValidator, "countryValidator");
        this.f34686a = countryValidator;
    }

    @Override // com.fourthline.orca.internal.w2
    public w2.a a(a01 selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        return this.f34686a.a((fd) selection) ? w2.a.b.f34494a : new w2.a.C0303a(er.g.f28242a);
    }
}
