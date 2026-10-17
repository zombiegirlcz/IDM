package fh5;

import com.revolut.feature.crypto.locked.balance.api.navigation.ExcludedLockedBalancesInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExcludedLockedBalancesInputData f135150a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f135150a, ((e) obj2).f135150a);
    }

    public final int hashCode() {
        return this.f135150a.hashCode();
    }

    public e(int i) {
        ExcludedLockedBalancesInputData inputData = ExcludedLockedBalancesInputData.f70875a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f135150a = inputData;
    }
}
