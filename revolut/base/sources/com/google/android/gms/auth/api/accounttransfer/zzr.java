package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes16.dex */
public final class zzr implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzr f37334zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Bundle f37335zzb;

    static {
        Bundle bundle = new Bundle();
        if (!bundle.containsKey("accountTypes")) {
            bundle.putStringArrayList("accountTypes", new ArrayList<>(0));
        }
        f37334zza = new zzr(bundle, null);
    }

    public /* synthetic */ zzr(Bundle bundle, zzq zzqVar) {
        this.f37335zzb = bundle;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof zzr)) {
            return false;
        }
        Bundle bundleZza = zza();
        Bundle bundleZza2 = ((zzr) obj2).zza();
        if (bundleZza.size() != bundleZza2.size()) {
            return false;
        }
        for (String str : bundleZza.keySet()) {
            if (!bundleZza2.containsKey(str) || !Objects.equal(bundleZza.get(str), bundleZza2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Bundle bundleZza = zza();
        int size = bundleZza.size();
        ArrayList arrayList = new ArrayList(size + size);
        ArrayList arrayList2 = new ArrayList(bundleZza.keySet());
        Collections.sort(arrayList2);
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            String str = (String) arrayList2.get(i);
            arrayList.add(str);
            arrayList.add(bundleZza.get(str));
        }
        return Objects.hashCode(arrayList);
    }

    public final Bundle zza() {
        return new Bundle(this.f37335zzb);
    }
}
