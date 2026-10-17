package wy3;

import java.io.Serializable;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f301090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f301091c;
    public final List d;
    public final String e;

    public q(String title, String str, String str2, String parameterKey, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.f301089a = title;
        this.f301090b = str;
        this.f301091c = str2;
        this.d = items;
        this.e = parameterKey;
    }

    public final p a() {
        for (p pVar : this.d) {
            if (pVar.e) {
                return pVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f301089a, qVar.f301089a) && Intrinsics.f(this.f301090b, qVar.f301090b) && Intrinsics.f(this.f301091c, qVar.f301091c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f301089a.hashCode() * 31;
        String str = this.f301090b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f301091c;
        return this.e.hashCode() + p.a.d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }
}
