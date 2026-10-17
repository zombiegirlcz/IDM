package h0d;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f148355c;
    public final String d;
    public final gzc.a e;

    public e(String sourceDescription, String frequencyDescription, ArrayList documents, String amount, gzc.a aVar) {
        Intrinsics.checkNotNullParameter(sourceDescription, "sourceDescription");
        Intrinsics.checkNotNullParameter(frequencyDescription, "frequencyDescription");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f148353a = sourceDescription;
        this.f148354b = frequencyDescription;
        this.f148355c = documents;
        this.d = amount;
        this.e = aVar;
    }

    @Override // h0d.f
    public final List a() {
        return this.f148355c;
    }

    @Override // h0d.f
    public final String b() {
        return this.f148354b;
    }

    @Override // h0d.f
    public final String c() {
        return this.f148353a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f148353a.equals(eVar.f148353a) && this.f148354b.equals(eVar.f148354b) && this.f148355c.equals(eVar.f148355c) && this.d.equals(eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f148355c, p.a.c(this.f148353a.hashCode() * 31, 31, this.f148354b), 31), 31, this.d);
        gzc.a aVar = this.e;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
