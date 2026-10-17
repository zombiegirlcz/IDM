package hj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f152641c;

    public i(String title, String content, b bVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f152639a = title;
        this.f152640b = content;
        this.f152641c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f152639a, iVar.f152639a) && Intrinsics.f(this.f152640b, iVar.f152640b) && Intrinsics.f(this.f152641c, iVar.f152641c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f152639a.hashCode() * 31, 31, this.f152640b);
        b bVar = this.f152641c;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
