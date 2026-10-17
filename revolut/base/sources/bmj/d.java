package bmj;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f16838a;

    public d(Data phoneNumberCancellationPreview) {
        Intrinsics.checkNotNullParameter(phoneNumberCancellationPreview, "phoneNumberCancellationPreview");
        this.f16838a = phoneNumberCancellationPreview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f16838a, ((d) obj2).f16838a);
    }

    public final int hashCode() {
        return this.f16838a.hashCode();
    }
}
