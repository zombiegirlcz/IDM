package zfd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements ce9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f321932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f321933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f321934c;

    public i(int i, List content, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f321932a = i;
        this.f321933b = content;
        this.f321934c = z;
    }

    @Override // ce9.o
    public final boolean a() {
        return this.f321934c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f321932a == iVar.f321932a && Intrinsics.f(this.f321933b, iVar.f321933b) && this.f321934c == iVar.f321934c;
    }

    @Override // ce9.o
    public final Object getContent() {
        return this.f321933b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f321934c) + p.a.d(Integer.hashCode(this.f321932a) * 31, 31, this.f321933b);
    }
}
