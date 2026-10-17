package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cw0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class cs0 implements bs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kt0 f27543a;

    public cs0(kt0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f27543a = bundle;
    }

    @Override // com.fourthline.orca.internal.bs0
    public void a(String maskedPhoneNumber) {
        Intrinsics.checkNotNullParameter(maskedPhoneNumber, "maskedPhoneNumber");
        this.f27543a.a(maskedPhoneNumber);
    }

    @Override // com.fourthline.orca.internal.bs0
    public void a(cw0.a.C0180a.c cVar) {
        this.f27543a.a(cVar);
    }

    @Override // com.fourthline.orca.internal.bs0
    public void a(List names) {
        Intrinsics.checkNotNullParameter(names, "names");
        this.f27543a.a(names);
    }
}
