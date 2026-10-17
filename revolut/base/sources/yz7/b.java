package yz7;

import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f318043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f318044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f318045c;
    public final PolicyDocument d;
    public final boolean e;

    public b(Date policyStartDate, h1 quote, List documents, PolicyDocument generalInfo, boolean z) {
        Intrinsics.checkNotNullParameter(policyStartDate, "policyStartDate");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(generalInfo, "generalInfo");
        this.f318043a = policyStartDate;
        this.f318044b = quote;
        this.f318045c = documents;
        this.d = generalInfo;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f318043a, bVar.f318043a) && Intrinsics.f(this.f318044b, bVar.f318044b) && Intrinsics.f(this.f318045c, bVar.f318045c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + p.a.d((this.f318044b.hashCode() + (this.f318043a.hashCode() * 31)) * 31, 31, this.f318045c)) * 31);
    }
}
