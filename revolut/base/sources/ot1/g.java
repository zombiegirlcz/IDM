package ot1;

import com.revolut.feature.apm.core.models.recipients.BizumContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qt1.m f229401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BizumContact f229402b;

    public g(qt1.m result, BizumContact contact) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f229401a = result;
        this.f229402b = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f229401a, gVar.f229401a) && Intrinsics.f(this.f229402b, gVar.f229402b);
    }

    public final int hashCode() {
        return this.f229402b.hashCode() + (this.f229401a.hashCode() * 31);
    }
}
