package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public final class z1 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f35479c;

    public z1(long j2) {
        this.f35478b = j2;
        this.f35479c = zhm.q0.c(new Pair("elapsed_time", Long.valueOf(j2)));
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z1) && this.f35478b == ((z1) obj2).f35478b;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return this.f35479c;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "workflow_assets_extracted";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/workflow_assets_extracted/jsonschema/1-0-0";
    }

    public int hashCode() {
        return Long.hashCode(this.f35478b);
    }

    public String toString() {
        return "AssetBundleExtracted(extractionTime=" + this.f35478b + ")";
    }
}
