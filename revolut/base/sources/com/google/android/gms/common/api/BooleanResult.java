package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes16.dex */
public class BooleanResult implements Result {
    private final Status zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final boolean f37707zab;

    @ShowFirstParty
    @KeepForSdk
    public BooleanResult(@NonNull Status status, boolean z) {
        this.zaa = (Status) Preconditions.checkNotNull(status, "Status must not be null");
        this.f37707zab = z;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj2;
        return this.zaa.equals(booleanResult.zaa) && this.f37707zab == booleanResult.f37707zab;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.zaa;
    }

    public boolean getValue() {
        return this.f37707zab;
    }

    public final int hashCode() {
        return ((this.zaa.hashCode() + 527) * 31) + (this.f37707zab ? 1 : 0);
    }
}
