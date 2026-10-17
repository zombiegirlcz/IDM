package cim;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lcim/e;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class e implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f24566a = new e();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> a7 = comparable;
        Comparable<? super Object> b4 = comparable2;
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return b4.compareTo(a7);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return d.f24565a;
    }
}
