package vv8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f292471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f292472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f292473c;

    public b(boolean z, j documentsUploadState, j selfieUploadState) {
        Intrinsics.checkNotNullParameter(documentsUploadState, "documentsUploadState");
        Intrinsics.checkNotNullParameter(selfieUploadState, "selfieUploadState");
        this.f292471a = z;
        this.f292472b = documentsUploadState;
        this.f292473c = selfieUploadState;
    }

    public static b a(b bVar, j documentsUploadState, j selfieUploadState, int i) {
        boolean z = (i & 1) != 0 ? bVar.f292471a : true;
        if ((i & 2) != 0) {
            documentsUploadState = bVar.f292472b;
        }
        if ((i & 4) != 0) {
            selfieUploadState = bVar.f292473c;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(documentsUploadState, "documentsUploadState");
        Intrinsics.checkNotNullParameter(selfieUploadState, "selfieUploadState");
        return new b(z, documentsUploadState, selfieUploadState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f292471a == bVar.f292471a && Intrinsics.f(this.f292472b, bVar.f292472b) && Intrinsics.f(this.f292473c, bVar.f292473c);
    }

    public final int hashCode() {
        return this.f292473c.hashCode() + ((this.f292472b.hashCode() + (Boolean.hashCode(this.f292471a) * 31)) * 31);
    }
}
