package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class uf extends ib.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34075b;

    public uf(boolean z) {
        super(ib.b.Analysis);
        this.f34074a = ib.b.Analysis;
        this.f34075b = "iglu:com.fourthline.sdk/analysis/jsonschema/1-0-0";
        set("enabled", Boolean.valueOf(z));
    }

    @Override // ib.b
    public String getIdentifier() {
        return this.f34074a;
    }

    @Override // ib.b
    public String getSchema() {
        return this.f34075b;
    }
}
