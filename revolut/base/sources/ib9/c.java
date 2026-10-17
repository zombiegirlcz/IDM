package ib9;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e = {null, null, null, j.c(k.PUBLICATION, new i83.b(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160130c;
    public final List d;

    public /* synthetic */ c(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            j1.f(a.f160127a.getDescriptor(), i, 15);
            throw null;
        }
        this.f160128a = str;
        this.f160129b = str2;
        this.f160130c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f160128a, cVar.f160128a) && Intrinsics.f(this.f160129b, cVar.f160129b) && Intrinsics.f(this.f160130c, cVar.f160130c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f160128a.hashCode() * 31, 31, this.f160129b), 31, this.f160130c);
    }

    public c(String id10, String name, String product, ArrayList countries) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f160128a = id10;
        this.f160129b = name;
        this.f160130c = product;
        this.d = countries;
    }
}
