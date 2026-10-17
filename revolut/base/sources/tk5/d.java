package tk5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f271878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271879b;

    public d(String str, ArrayList pagerItems) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f271878a = pagerItems;
        this.f271879b = str;
    }

    @Override // oki.a
    public final List W() {
        return this.f271878a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f271878a.equals(dVar.f271878a) && Intrinsics.f(this.f271879b, dVar.f271879b);
    }

    public final int hashCode() {
        int iHashCode = this.f271878a.hashCode() * 31;
        String str = this.f271879b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // oki.a
    public final String z() {
        return this.f271879b;
    }
}
