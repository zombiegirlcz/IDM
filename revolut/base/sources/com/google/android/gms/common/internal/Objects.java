package com.google.android.gms.common.internal;

import a0.d;
import android.os.Bundle;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class Objects {

    /* JADX INFO: loaded from: classes16.dex */
    @KeepForSdk
    public static final class ToStringHelper {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final List f38086zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final Object f38087zzb;

        public /* synthetic */ ToStringHelper(Object obj2, byte[] bArr) {
            Preconditions.checkNotNull(obj2);
            this.f38087zzb = obj2;
            this.f38086zza = new ArrayList();
        }

        @NonNull
        @KeepForSdk
        public ToStringHelper add(@NonNull String str, Object obj2) {
            Preconditions.checkNotNull(str);
            int length = str.length();
            String strValueOf = String.valueOf(obj2);
            this.f38086zza.add(d.u(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
            return this;
        }

        @NonNull
        @KeepForSdk
        public String toString() {
            StringBuilder sb6 = new StringBuilder(100);
            sb6.append(this.f38087zzb.getClass().getSimpleName());
            sb6.append(CoreConstants.CURLY_LEFT);
            List list = this.f38086zza;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb6.append((String) list.get(i));
                if (i < size - 1) {
                    sb6.append(", ");
                }
            }
            sb6.append(CoreConstants.CURLY_RIGHT);
            return sb6.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(@NonNull Bundle bundle, @NonNull Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public static boolean equal(Object obj2, Object obj3) {
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    @KeepForSdk
    public static int hashCode(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    @KeepForSdk
    public static ToStringHelper toStringHelper(@NonNull Object obj2) {
        return new ToStringHelper(obj2, null);
    }
}
