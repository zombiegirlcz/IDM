package nik;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f216278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f216279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f216280c;

    public d() {
        this(7, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f216278a, dVar.f216278a) && Intrinsics.f(this.f216279b, dVar.f216279b) && this.f216280c == dVar.f216280c;
    }

    public final int hashCode() {
        Clause clause = this.f216278a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Integer num = this.f216279b;
        return Boolean.hashCode(this.f216280c) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public /* synthetic */ d(int i, Integer num) {
        this(null, (i & 2) != 0 ? null : num, false);
    }

    public d(Clause clause, Integer num, boolean z) {
        this.f216278a = clause;
        this.f216279b = num;
        this.f216280c = z;
    }
}
