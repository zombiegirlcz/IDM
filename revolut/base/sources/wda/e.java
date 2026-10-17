package wda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f296478b;

    public e(String value, d popup) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.f296477a = value;
        this.f296478b = popup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f296477a, eVar.f296477a) && Intrinsics.f(this.f296478b, eVar.f296478b);
    }

    @Override // wda.h
    public final String getValue() {
        return this.f296477a;
    }

    public final int hashCode() {
        return this.f296478b.hashCode() + (this.f296477a.hashCode() * 31);
    }
}
