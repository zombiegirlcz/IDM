package d7a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6a.a f111897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i80.a f111898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111899c;
    public final Long d;

    public e() {
        this(null, 15);
    }

    public static e a(e eVar, y6a.a aVar, i80.a aVar2, String str, Long l2, int i) {
        if ((i & 1) != 0) {
            aVar = eVar.f111897a;
        }
        if ((i & 2) != 0) {
            aVar2 = eVar.f111898b;
        }
        if ((i & 4) != 0) {
            str = eVar.f111899c;
        }
        if ((i & 8) != 0) {
            l2 = eVar.d;
        }
        eVar.getClass();
        return new e(aVar, aVar2, str, l2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f111897a, eVar.f111897a) && Intrinsics.f(this.f111898b, eVar.f111898b) && Intrinsics.f(this.f111899c, eVar.f111899c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        y6a.a aVar = this.f111897a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        i80.a aVar2 = this.f111898b;
        int iDeepHashCode = (iHashCode + (aVar2 == null ? 0 : Arrays.deepHashCode(aVar2.f159408a))) * 31;
        String str = this.f111899c;
        int iHashCode2 = (iDeepHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.d;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public /* synthetic */ e(Long l2, int i) {
        this(null, null, null, (i & 8) != 0 ? null : l2);
    }

    public e(y6a.a aVar, i80.a aVar2, String str, Long l2) {
        this.f111897a = aVar;
        this.f111898b = aVar2;
        this.f111899c = str;
        this.d = l2;
    }
}
