package ox1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.f f230526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor.Phone f230527b;

    public b(zm3.f deviceContact, ApmDescriptor.Phone descriptor) {
        Intrinsics.checkNotNullParameter(deviceContact, "deviceContact");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f230526a = deviceContact;
        this.f230527b = descriptor;
    }

    @Override // ox1.c
    public final zm3.g a() {
        return this.f230526a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f230526a.equals(bVar.f230526a) && this.f230527b.equals(bVar.f230527b);
    }

    @Override // ox1.c
    public final ApmDescriptor getDescriptor() {
        return this.f230527b;
    }

    public final int hashCode() {
        return this.f230527b.f62110b.hashCode() + (this.f230526a.hashCode() * 31);
    }
}
