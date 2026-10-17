package cff;

import ce9.o;
import gef.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23688b;

    public a(b content, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f23687a = content;
        this.f23688b = z;
    }

    @Override // ce9.o
    public final boolean a() {
        return this.f23688b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f23687a, aVar.f23687a) && this.f23688b == aVar.f23688b;
    }

    @Override // ce9.o
    public final Object getContent() {
        return this.f23687a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23688b) + (this.f23687a.hashCode() * 31);
    }
}
