package ca6;

import aii.e;
import com.revolut.feature.donations.api.navigation.DonatedAmountInfoScreenDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DonatedAmountInfoScreenDescriptor$InputData f22527a;

    public a(DonatedAmountInfoScreenDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f22527a = inputData;
    }

    public final DonatedAmountInfoScreenDescriptor$InputData b() {
        return this.f22527a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f22527a, ((a) obj2).f22527a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22527a.f71969a);
    }
}
