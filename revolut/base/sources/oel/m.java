package oel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224651b;

    public m(String icon, String text) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f224650a = icon;
        this.f224651b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f224650a, mVar.f224650a) && Intrinsics.f(this.f224651b, mVar.f224651b);
    }

    public final int hashCode() {
        return this.f224651b.hashCode() + (this.f224650a.hashCode() * 31);
    }
}
