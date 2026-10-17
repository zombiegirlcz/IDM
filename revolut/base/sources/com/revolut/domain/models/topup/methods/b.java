package com.revolut.domain.models.topup.methods;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f60525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f60526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h71.a f60527c;
    public final List d;

    public b(List storedMethods, ArrayList otherMethods, h71.a aVar, List supportedCurrencyCodes) {
        Intrinsics.checkNotNullParameter(storedMethods, "storedMethods");
        Intrinsics.checkNotNullParameter(otherMethods, "otherMethods");
        Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
        this.f60525a = storedMethods;
        this.f60526b = otherMethods;
        this.f60527c = aVar;
        this.d = supportedCurrencyCodes;
    }

    public static b a(b bVar, ArrayList arrayList, ArrayList otherMethods, int i) {
        List storedMethods = arrayList;
        if ((i & 1) != 0) {
            storedMethods = bVar.f60525a;
        }
        h71.a aVar = bVar.f60527c;
        List supportedCurrencyCodes = bVar.d;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(storedMethods, "storedMethods");
        Intrinsics.checkNotNullParameter(otherMethods, "otherMethods");
        Intrinsics.checkNotNullParameter(supportedCurrencyCodes, "supportedCurrencyCodes");
        return new b(storedMethods, otherMethods, aVar, supportedCurrencyCodes);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f60525a, bVar.f60525a) && this.f60526b.equals(bVar.f60526b) && Intrinsics.f(this.f60527c, bVar.f60527c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f60526b, this.f60525a.hashCode() * 31, 31);
        h71.a aVar = this.f60527c;
        return this.d.hashCode() + ((iB + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
