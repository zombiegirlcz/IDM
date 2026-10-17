package qjf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246861b;

    public a(String legId, String content) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f246860a = legId;
        this.f246861b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f246860a, aVar.f246860a) && Intrinsics.f(this.f246861b, aVar.f246861b);
    }

    public final int hashCode() {
        return this.f246861b.hashCode() + (this.f246860a.hashCode() * 31);
    }
}
