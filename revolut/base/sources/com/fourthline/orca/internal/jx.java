package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jx extends ib.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f30070c;

    public jx() {
        super(ib.b.Features);
        this.f30068a = ib.b.Features;
        this.f30069b = "iglu:com.fourthline.sdk/features/jsonschema/1-0-0";
        this.f30070c = new ArrayList();
        a();
    }

    public final void a(List variants) {
        Intrinsics.checkNotNullParameter(variants, "variants");
        this.f30070c.addAll(variants);
    }

    @Override // ib.b
    public String getIdentifier() {
        return this.f30068a;
    }

    @Override // ib.b
    public String getSchema() {
        return this.f30069b;
    }

    public final void a() {
        set("variants", zhm.d0.d1(this.f30070c));
    }
}
