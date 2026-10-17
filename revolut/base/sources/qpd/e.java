package qpd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ie3.a f248350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f248351b;

    public e(ie3.a transactionsContent, od0.i categoryGroup) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(categoryGroup, "categoryGroup");
        this.f248350a = transactionsContent;
        this.f248351b = categoryGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f248350a, eVar.f248350a) && Intrinsics.f(this.f248351b, eVar.f248351b);
    }

    public final int hashCode() {
        return this.f248351b.hashCode() + (this.f248350a.hashCode() * 31);
    }
}
