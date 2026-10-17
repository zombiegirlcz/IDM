package myf;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f210492b;

    public t(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f210491a = str;
        this.f210492b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f210491a, tVar.f210491a) && this.f210492b.equals(tVar.f210492b);
    }

    public final int hashCode() {
        String str = this.f210491a;
        return this.f210492b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
