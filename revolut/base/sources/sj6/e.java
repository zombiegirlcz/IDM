package sj6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f263680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f263681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f263682c;

    public e(List items, String str, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f263680a = items;
        this.f263681b = str;
        this.f263682c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f263680a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f263680a, eVar.f263680a) && Intrinsics.f(this.f263681b, eVar.f263681b) && this.f263682c == eVar.f263682c;
    }

    public final int hashCode() {
        int iHashCode = this.f263680a.hashCode() * 31;
        String str = this.f263681b;
        return Boolean.hashCode(this.f263682c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
