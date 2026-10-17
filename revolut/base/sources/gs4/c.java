package gs4;

import kotlin.jvm.internal.Intrinsics;
import ql4.t;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f146311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f146313c;

    public c(t state, int i, int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f146311a = state;
        this.f146312b = i;
        this.f146313c = i2;
    }

    @Override // gs4.d
    public final int a() {
        return this.f146312b;
    }

    @Override // gs4.d
    public final int b() {
        return this.f146313c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f146311a == cVar.f146311a && this.f146312b == cVar.f146312b && this.f146313c == cVar.f146313c;
    }

    @Override // gs4.d
    public final t getState() {
        return this.f146311a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f146313c) + j6.a.b(this.f146312b, this.f146311a.hashCode() * 31, 31);
    }
}
