package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sz0 extends ib.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33164b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
        this.f33163a = ib.b.Screen;
        this.f33164b = "iglu:com.fourthline.sdk/screen/jsonschema/1-0-0";
        set("name", name);
    }

    @Override // ib.b
    public String getIdentifier() {
        return this.f33163a;
    }

    @Override // ib.b
    public String getSchema() {
        return this.f33164b;
    }
}
