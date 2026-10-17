package uv1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f283277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f283278b;

    public k() {
        this(0);
    }

    public static k a(k kVar, boolean z, Data contactsInfo, int i) {
        if ((i & 1) != 0) {
            z = kVar.f283277a;
        }
        if ((i & 2) != 0) {
            contactsInfo = kVar.f283278b;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(contactsInfo, "contactsInfo");
        return new k(contactsInfo, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f283277a == kVar.f283277a && Intrinsics.f(this.f283278b, kVar.f283278b);
    }

    public final int hashCode() {
        return this.f283278b.hashCode() + (Boolean.hashCode(this.f283277a) * 31);
    }

    public k(Data contactsInfo, boolean z) {
        Intrinsics.checkNotNullParameter(contactsInfo, "contactsInfo");
        this.f283277a = z;
        this.f283278b = contactsInfo;
    }

    public /* synthetic */ k(int i) {
        this(new Data(null, null, true, 3, null), false);
    }
}
