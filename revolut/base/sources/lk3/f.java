package lk3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Llk3/f;", "", "", "toString", "()Ljava/lang/String;", "", "Llk3/d;", "a", "Ljava/util/List;", "()Ljava/util/List;", "addressForms", "b", "Llk3/d;", "()Llk3/d;", "defaultAddressForm", "feature_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("addressForms")
    @NotNull
    private final List<d> addressForms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultAddressForm")
    @NotNull
    private final d defaultAddressForm;

    public f(ArrayList addressForms, d defaultAddressForm) {
        Intrinsics.checkNotNullParameter(addressForms, "addressForms");
        Intrinsics.checkNotNullParameter(defaultAddressForm, "defaultAddressForm");
        this.addressForms = addressForms;
        this.defaultAddressForm = defaultAddressForm;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAddressForms() {
        return this.addressForms;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getDefaultAddressForm() {
        return this.defaultAddressForm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.addressForms, fVar.addressForms) && Intrinsics.f(this.defaultAddressForm, fVar.defaultAddressForm);
    }

    public final int hashCode() {
        return this.defaultAddressForm.hashCode() + (this.addressForms.hashCode() * 31);
    }
}
