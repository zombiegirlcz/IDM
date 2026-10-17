package gk3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f144321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f144322b;

    public e(ArrayList addressForms, d defaultAddressForm) {
        Intrinsics.checkNotNullParameter(addressForms, "addressForms");
        Intrinsics.checkNotNullParameter(defaultAddressForm, "defaultAddressForm");
        this.f144321a = addressForms;
        this.f144322b = defaultAddressForm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f144321a.equals(eVar.f144321a) && this.f144322b.equals(eVar.f144322b);
    }

    public final int hashCode() {
        return this.f144322b.hashCode() + (this.f144321a.hashCode() * 31);
    }
}
