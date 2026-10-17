package tv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f274648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f274649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f274650c;
    public final Integer d;

    public i(Integer num, Integer num2, m tone, Integer num3) {
        Intrinsics.checkNotNullParameter(tone, "tone");
        this.f274648a = num;
        this.f274649b = num2;
        this.f274650c = tone;
        this.d = num3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f274648a, iVar.f274648a) && Intrinsics.f(this.f274649b, iVar.f274649b) && this.f274650c == iVar.f274650c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        Integer num = this.f274648a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f274649b;
        int iHashCode2 = (this.f274650c.hashCode() + ((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        Integer num3 = this.d;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public /* synthetic */ i(Integer num, Integer num2, m mVar, int i) {
        this(num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? m.NEUTRAL : mVar, (Integer) null);
    }
}
