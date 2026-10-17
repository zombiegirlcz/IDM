package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ue implements r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d3 f34058a;

    public ue(d3 bavBundle) {
        Intrinsics.checkNotNullParameter(bavBundle, "bavBundle");
        this.f34058a = bavBundle;
    }

    @Override // com.fourthline.orca.internal.r3
    public String a() {
        return this.f34058a.b();
    }

    @Override // com.fourthline.orca.internal.r3
    public int b() {
        t5 t5VarA = this.f34058a.a();
        if (t5VarA != null) {
            return t5VarA.getAmount();
        }
        return 0;
    }

    @Override // com.fourthline.orca.internal.r3
    public List c() {
        return this.f34058a.e();
    }
}
