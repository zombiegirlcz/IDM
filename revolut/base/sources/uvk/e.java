package uvk;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f283474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final awk.h f283475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283476c;
    public final List d;

    public e() {
        this(0);
    }

    public static e a(e eVar, LinkedHashMap linkedHashMap, awk.h hVar, String str, List list, int i) {
        Map statsGroups = linkedHashMap;
        if ((i & 1) != 0) {
            statsGroups = eVar.f283474a;
        }
        if ((i & 2) != 0) {
            hVar = eVar.f283475b;
        }
        if ((i & 4) != 0) {
            str = eVar.f283476c;
        }
        if ((i & 8) != 0) {
            list = eVar.d;
        }
        eVar.getClass();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(statsGroups, "statsGroups");
        return new e(statsGroups, hVar, str, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f283474a, eVar.f283474a) && Intrinsics.f(this.f283475b, eVar.f283475b) && Intrinsics.f(this.f283476c, eVar.f283476c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f283474a.hashCode() * 31;
        awk.h hVar = this.f283475b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.f10802a.hashCode())) * 31;
        String str = this.f283476c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
    }

    public e(Map statsGroups, awk.h hVar, String str, List list) {
        Intrinsics.checkNotNullParameter(statsGroups, "statsGroups");
        this.f283474a = statsGroups;
        this.f283475b = hVar;
        this.f283476c = str;
        this.d = list;
    }

    public /* synthetic */ e(int i) {
        this(r0.g(), null, null, null);
    }
}
