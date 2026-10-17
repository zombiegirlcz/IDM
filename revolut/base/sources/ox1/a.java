package ox1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.e f230524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmDescriptor.Email f230525b;

    public a(zm3.e deviceContact, ApmDescriptor.Email descriptor) {
        Intrinsics.checkNotNullParameter(deviceContact, "deviceContact");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f230524a = deviceContact;
        this.f230525b = descriptor;
    }

    @Override // ox1.c
    public final zm3.g a() {
        return this.f230524a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f230524a.equals(aVar.f230524a) && this.f230525b.equals(aVar.f230525b);
    }

    @Override // ox1.c
    public final ApmDescriptor getDescriptor() {
        return this.f230525b;
    }

    public final int hashCode() {
        return this.f230525b.f62107b.hashCode() + (this.f230524a.hashCode() * 31);
    }
}
