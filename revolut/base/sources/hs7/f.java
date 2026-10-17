package hs7;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f155008b;

    public /* synthetic */ f(int i, String str, e eVar) {
        if (3 != (i & 3)) {
            j1.f(a.f155004a.getDescriptor(), i, 3);
            throw null;
        }
        this.f155007a = str;
        this.f155008b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f155007a, fVar.f155007a) && Intrinsics.f(this.f155008b, fVar.f155008b);
    }

    public final int hashCode() {
        int iHashCode = this.f155007a.hashCode() * 31;
        e eVar = this.f155008b;
        return iHashCode + (eVar == null ? 0 : eVar.f155006a.hashCode());
    }

    public f(String title, e eVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f155007a = title;
        this.f155008b = eVar;
    }
}
