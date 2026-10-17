package p78;

import kotlin.jvm.internal.Intrinsics;
import sf8.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f233571a;

    public a(m accountInfo) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        this.f233571a = accountInfo;
    }

    @Override // p78.c
    public final m a() {
        return this.f233571a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f233571a, ((a) obj2).f233571a);
    }

    public final int hashCode() {
        return this.f233571a.hashCode();
    }
}
