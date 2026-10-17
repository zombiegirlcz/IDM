package og6;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f225035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f225037c;

    public a(ArrayList groupedConsents, ArrayList arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(groupedConsents, "groupedConsents");
        this.f225035a = groupedConsents;
        this.f225036b = z;
        this.f225037c = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f225035a.equals(aVar.f225035a) && this.f225036b == aVar.f225036b && Intrinsics.f(this.f225037c, aVar.f225037c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f225035a.hashCode() * 31, 31, this.f225036b);
        List list = this.f225037c;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
