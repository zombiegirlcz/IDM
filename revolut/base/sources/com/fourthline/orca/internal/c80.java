package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c80 extends ib.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27403b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f27402a = ib.b.Flow;
        this.f27403b = "iglu:com.fourthline.sdk/flow/jsonschema/1-0-0";
        set("name", name);
    }

    public final void a(ny nyVar) {
        boolean z = nyVar instanceof dj;
        set("strategies", z ? ((dj) nyVar).getDocumentStrategy().getValues() : nyVar instanceof n01 ? ((n01) nyVar).getBiometricsStrategy().getValues() : nyVar instanceof c4 ? ((c4) nyVar).getBavStrategy().getValues() : zhm.f0.f322471a);
        if (z) {
            dj djVar = (dj) nyVar;
            set("nfc_enabled", Boolean.valueOf(djVar.getNfc().getEnabled()));
            set("nfc_antenna_settings", Boolean.valueOf(djVar.getNfc().getDeviceAntennaSettings() != null));
        }
    }

    @Override // ib.b
    public String getIdentifier() {
        return this.f27402a;
    }

    @Override // ib.b
    public String getSchema() {
        return this.f27403b;
    }
}
