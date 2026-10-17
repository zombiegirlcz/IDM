package h0d;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f148352c;
    public final long d;
    public final String e;

    public d(String sourceDescription, String frequencyDescription, ArrayList documents, long j2, String currencyCode) {
        Intrinsics.checkNotNullParameter(sourceDescription, "sourceDescription");
        Intrinsics.checkNotNullParameter(frequencyDescription, "frequencyDescription");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f148350a = sourceDescription;
        this.f148351b = frequencyDescription;
        this.f148352c = documents;
        this.d = j2;
        this.e = currencyCode;
    }

    @Override // h0d.f
    public final List a() {
        return this.f148352c;
    }

    @Override // h0d.f
    public final String b() {
        return this.f148351b;
    }

    @Override // h0d.f
    public final String c() {
        return this.f148350a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f148350a.equals(dVar.f148350a) && this.f148351b.equals(dVar.f148351b) && this.f148352c.equals(dVar.f148352c) && this.d == dVar.d && this.e.equals(dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a0.d.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f148352c, p.a.c(this.f148350a.hashCode() * 31, 31, this.f148351b), 31), 31, this.d);
    }
}
