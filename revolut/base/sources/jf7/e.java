package jf7;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f173665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f173666b;

    public /* synthetic */ e(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            qlm.j1.f(c.f173660a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173665a = i2;
        this.f173666b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f173665a == eVar.f173665a && this.f173666b == eVar.f173666b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f173666b) + (Integer.hashCode(this.f173665a) * 31);
    }
}
