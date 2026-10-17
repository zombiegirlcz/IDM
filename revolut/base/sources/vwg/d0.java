package vwg;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f292730c = {null, yhm.j.c(yhm.k.PUBLICATION, new vo8.b(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f292732b;

    public /* synthetic */ d0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(b0.f292721a.getDescriptor(), i, 3);
            throw null;
        }
        this.f292731a = str;
        this.f292732b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f292731a, d0Var.f292731a) && Intrinsics.f(this.f292732b, d0Var.f292732b);
    }

    public final int hashCode() {
        return this.f292732b.hashCode() + (this.f292731a.hashCode() * 31);
    }

    public d0(String description, ArrayList requirements) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        this.f292731a = description;
        this.f292732b = requirements;
    }
}
