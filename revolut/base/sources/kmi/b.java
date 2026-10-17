package kmi;

import android.nfc.Tag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Tag f185888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185890c;
    public final String d;

    public b(Tag tag2, String documentNumber, String dateOfBirth, String dateOfExpiry) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        this.f185888a = tag2;
        this.f185889b = documentNumber;
        this.f185890c = dateOfBirth;
        this.d = dateOfExpiry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f185888a, bVar.f185888a) && Intrinsics.f(this.f185889b, bVar.f185889b) && Intrinsics.f(this.f185890c, bVar.f185890c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f185888a.hashCode() * 31, 31, this.f185889b), 31, this.f185890c);
    }
}
