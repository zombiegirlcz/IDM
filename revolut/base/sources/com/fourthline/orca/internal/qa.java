package com.fourthline.orca.internal;

import com.fourthline.core.DocumentFileSide;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
final class qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentFileSide f32361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f32362b;

    public qa(DocumentFileSide documentFileSide, boolean z) {
        Intrinsics.checkNotNullParameter(documentFileSide, "documentFileSide");
        this.f32361a = documentFileSide;
        this.f32362b = z;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj2;
        return this.f32361a == qaVar.f32361a && this.f32362b == qaVar.f32362b;
    }

    public int hashCode() {
        return (this.f32361a.hashCode() * 31) + Boolean.hashCode(this.f32362b);
    }

    public String toString() {
        return "CompleteFileSide(documentFileSide=" + this.f32361a + ", isAngled=" + this.f32362b + ")";
    }
}
