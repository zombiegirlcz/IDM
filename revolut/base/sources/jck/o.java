package jck;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f172861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f172862b;

    public o(n contentData, Data contactsPermissionsGranted) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        Intrinsics.checkNotNullParameter(contactsPermissionsGranted, "contactsPermissionsGranted");
        this.f172861a = contentData;
        this.f172862b = contactsPermissionsGranted;
    }

    public static o a(o oVar, n contentData, Data contactsPermissionsGranted, int i) {
        if ((i & 1) != 0) {
            contentData = oVar.f172861a;
        }
        if ((i & 2) != 0) {
            contactsPermissionsGranted = oVar.f172862b;
        }
        oVar.getClass();
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        Intrinsics.checkNotNullParameter(contactsPermissionsGranted, "contactsPermissionsGranted");
        return new o(contentData, contactsPermissionsGranted);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f172861a, oVar.f172861a) && Intrinsics.f(this.f172862b, oVar.f172862b);
    }

    public final int hashCode() {
        return this.f172862b.hashCode() + (this.f172861a.hashCode() * 31);
    }
}
