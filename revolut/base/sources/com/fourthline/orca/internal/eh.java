package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.location.Coordinate;
import java.net.URI;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap f28131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final URI f28132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentFileSide f28133c;
    private final boolean d;
    private final Long e;
    private final Coordinate f;

    public eh(Bitmap bitmap, URI uri2, DocumentFileSide documentFileSide, boolean z, Long l2, Coordinate coordinate) {
        this.f28131a = bitmap;
        this.f28132b = uri2;
        this.f28133c = documentFileSide;
        this.d = z;
        this.e = l2;
        this.f = coordinate;
    }

    private final boolean b() {
        return this.f28133c != null;
    }

    private final boolean d() {
        return (this.f28131a != null) ^ (this.f28132b != null);
    }

    public final DocumentFileSide a() {
        return this.f28133c;
    }

    public final Bitmap c() {
        return this.f28131a;
    }

    public final Coordinate e() {
        return this.f;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof eh)) {
            return false;
        }
        eh ehVar = (eh) obj2;
        return Intrinsics.f(this.f28131a, ehVar.f28131a) && Intrinsics.f(this.f28132b, ehVar.f28132b) && this.f28133c == ehVar.f28133c && this.d == ehVar.d && Intrinsics.f(this.e, ehVar.e) && Intrinsics.f(this.f, ehVar.f);
    }

    public final Long f() {
        return this.e;
    }

    public final boolean g() {
        return d() && b() && l8.a(this.e) && l8.a(this.f);
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        Bitmap bitmap = this.f28131a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        URI uri2 = this.f28132b;
        int iHashCode2 = (iHashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        DocumentFileSide documentFileSide = this.f28133c;
        int iHashCode3 = (((iHashCode2 + (documentFileSide == null ? 0 : documentFileSide.hashCode())) * 31) + Boolean.hashCode(this.d)) * 31;
        Long l2 = this.e;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Coordinate coordinate = this.f;
        return iHashCode4 + (coordinate != null ? coordinate.hashCode() : 0);
    }

    public String toString() {
        return "DocumentAttachmentBundle(image=" + this.f28131a + ", file=" + this.f28132b + ", fileSide=" + this.f28133c + ", isAngled=" + this.d + ", timestamp=" + this.e + ", location=" + this.f + ")";
    }

    public /* synthetic */ eh(Bitmap bitmap, URI uri2, DocumentFileSide documentFileSide, boolean z, Long l2, Coordinate coordinate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bitmap, (i & 2) != 0 ? null : uri2, (i & 4) != 0 ? null : documentFileSide, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : coordinate);
    }
}
