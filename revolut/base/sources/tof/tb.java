package tof;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class tb extends i7 {

    @NotNull
    public static final sb Companion = new sb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f273093b = new Regex("\\s+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Regex f273094c = new Regex("[\"&.,]");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f273095a;

    public tb(Set tokens) {
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        this.f273095a = tokens;
    }

    public final Set a() {
        return this.f273095a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof tb) && Intrinsics.f(this.f273095a, ((tb) obj2).f273095a);
    }

    public final int hashCode() {
        return this.f273095a.hashCode();
    }

    public tb(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Companion.getClass();
        List<String> listK = f273093b.k(searchQuery);
        ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
        for (String str : listK) {
            Companion.getClass();
            arrayList.add(sb.a(str));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        this(zhm.d0.i1(arrayList2));
    }
}
