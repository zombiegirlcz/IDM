package yl6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f314660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f314661c;

    public g(String str, String str2, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f314659a = str;
        this.f314660b = str2;
        this.f314661c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f314661c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f314659a, gVar.f314659a) && Intrinsics.f(this.f314660b, gVar.f314660b) && Intrinsics.f(this.f314661c, gVar.f314661c);
    }

    public final int hashCode() {
        String str = this.f314659a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f314660b;
        return this.f314661c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
