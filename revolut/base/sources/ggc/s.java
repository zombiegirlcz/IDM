package ggc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f143665c;

    public s(int i, String name, ArrayList categories) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f143663a = name;
        this.f143664b = i;
        this.f143665c = categories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f143663a, sVar.f143663a) && this.f143664b == sVar.f143664b && this.f143665c.equals(sVar.f143665c);
    }

    public final int hashCode() {
        return this.f143665c.hashCode() + j6.a.b(this.f143664b, this.f143663a.hashCode() * 31, 31);
    }
}
