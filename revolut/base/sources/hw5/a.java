package hw5;

import ce9.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f156100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156101c;

    public a(int i, List content, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f156099a = i;
        this.f156100b = content;
        this.f156101c = z;
    }

    @Override // ce9.o
    public final boolean a() {
        return this.f156101c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f156099a == aVar.f156099a && Intrinsics.f(this.f156100b, aVar.f156100b) && this.f156101c == aVar.f156101c;
    }

    @Override // ce9.o
    public final Object getContent() {
        return this.f156100b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f156101c) + p.a.d(Integer.hashCode(this.f156099a) * 31, 31, this.f156100b);
    }
}
