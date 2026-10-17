package oq5;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227742b;

    public a() {
        this(0);
    }

    public static a a(a aVar, String providerName, String selectedTypeId, int i) {
        if ((i & 1) != 0) {
            providerName = aVar.f227741a;
        }
        if ((i & 2) != 0) {
            selectedTypeId = aVar.f227742b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(selectedTypeId, "selectedTypeId");
        return new a(providerName, selectedTypeId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f227741a, aVar.f227741a) && Intrinsics.f(this.f227742b, aVar.f227742b);
    }

    public final int hashCode() {
        return this.f227742b.hashCode() + (this.f227741a.hashCode() * 31);
    }

    public a(String providerName, String selectedTypeId) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(selectedTypeId, "selectedTypeId");
        this.f227741a = providerName;
        this.f227742b = selectedTypeId;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i) {
        this("", "");
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        m70.a.c(t0Var);
    }
}
