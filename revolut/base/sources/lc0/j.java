package lc0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f193757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f193758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f193759c;
    public final boolean d;
    public final l e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f193760g;

    public j() {
        this(null, CertificateBody.profileType);
    }

    public static j a(j jVar, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, l lVar, h hVar, boolean z, int i) {
        if ((i & 1) != 0) {
            bitmap = jVar.f193757a;
        }
        Bitmap bitmap4 = bitmap;
        if ((i & 2) != 0) {
            bitmap2 = jVar.f193758b;
        }
        Bitmap bitmap5 = bitmap2;
        if ((i & 4) != 0) {
            bitmap3 = jVar.f193759c;
        }
        Bitmap bitmap6 = bitmap3;
        boolean z3 = (i & 8) != 0 ? jVar.d : true;
        if ((i & 16) != 0) {
            lVar = jVar.e;
        }
        l numberCoverMode = lVar;
        if ((i & 32) != 0) {
            hVar = jVar.f;
        }
        h hVar2 = hVar;
        if ((i & 64) != 0) {
            z = jVar.f193760g;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(numberCoverMode, "numberCoverMode");
        return new j(bitmap4, bitmap5, bitmap6, z3, numberCoverMode, hVar2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f193757a, jVar.f193757a) && Intrinsics.f(this.f193758b, jVar.f193758b) && Intrinsics.f(this.f193759c, jVar.f193759c) && this.d == jVar.d && this.e == jVar.e && Intrinsics.f(this.f, jVar.f) && this.f193760g == jVar.f193760g;
    }

    public final int hashCode() {
        Bitmap bitmap = this.f193757a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Bitmap bitmap2 = this.f193758b;
        int iHashCode2 = (iHashCode + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        Bitmap bitmap3 = this.f193759c;
        int iHashCode3 = (this.e.hashCode() + j6.a.c((iHashCode2 + (bitmap3 == null ? 0 : bitmap3.hashCode())) * 31, 31, this.d)) * 31;
        h hVar = this.f;
        return Boolean.hashCode(this.f193760g) + ((iHashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31);
    }

    public j(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, boolean z, l numberCoverMode, h hVar, boolean z3) {
        Intrinsics.checkNotNullParameter(numberCoverMode, "numberCoverMode");
        this.f193757a = bitmap;
        this.f193758b = bitmap2;
        this.f193759c = bitmap3;
        this.d = z;
        this.e = numberCoverMode;
        this.f = hVar;
        this.f193760g = z3;
    }

    public /* synthetic */ j(l lVar, int i) {
        this(null, null, null, false, (i & 16) != 0 ? l.HIDDEN : lVar, null, false);
    }
}
