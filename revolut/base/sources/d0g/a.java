package d0g;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f110359b;

    public a(String str, ArrayList arrayList) {
        this.f110358a = str;
        this.f110359b = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f110358a, aVar.f110358a) && this.f110359b.equals(aVar.f110359b);
    }

    public final int hashCode() {
        String str = this.f110358a;
        return this.f110359b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
