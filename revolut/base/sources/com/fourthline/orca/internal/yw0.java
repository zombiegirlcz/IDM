package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cw0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yw0 implements xw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kt0 f35449a;

    public yw0(kt0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f35449a = bundle;
    }

    @Override // com.fourthline.orca.internal.xw0
    public String a() {
        return this.f35449a.e();
    }

    @Override // com.fourthline.orca.internal.xw0
    public String b() {
        String strA = this.f35449a.a();
        if (strA != null) {
            return strA;
        }
        throw new IllegalStateException("Phone number must be present at this moment!");
    }

    @Override // com.fourthline.orca.internal.xw0
    public cw0.a.C0180a.c c() {
        cw0.a.C0180a.c cVarB = this.f35449a.b();
        if (cVarB != null) {
            return cVarB;
        }
        throw new IllegalStateException("Otp Settings must be present at this moment!");
    }

    @Override // com.fourthline.orca.internal.xw0
    public List d() {
        List listD = this.f35449a.d();
        if (listD != null) {
            return listD;
        }
        throw new IllegalStateException("SignDocumentNames must be present at this moment!");
    }
}
