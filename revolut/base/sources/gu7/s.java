package gu7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146825c = {null, yhm.j.c(yhm.k.PUBLICATION, new d(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f146827b;

    public /* synthetic */ s(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(l.f146782a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146826a = str;
        this.f146827b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f146826a, sVar.f146826a) && Intrinsics.f(this.f146827b, sVar.f146827b);
    }

    public final int hashCode() {
        String str = this.f146826a;
        return this.f146827b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public s(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f146826a = str;
        this.f146827b = items;
    }
}
