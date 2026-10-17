package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zabs {
    private final ApiKey zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Feature f37890zab;

    public /* synthetic */ zabs(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.zaa = apiKey;
        this.f37890zab = feature;
    }

    public final boolean equals(Object obj2) {
        if (obj2 != null && (obj2 instanceof zabs)) {
            zabs zabsVar = (zabs) obj2;
            if (Objects.equal(this.zaa, zabsVar.zaa) && Objects.equal(this.f37890zab, zabsVar.f37890zab)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa, this.f37890zab);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("key", this.zaa).add("feature", this.f37890zab).toString();
    }
}
