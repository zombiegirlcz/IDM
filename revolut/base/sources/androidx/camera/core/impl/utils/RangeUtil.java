package androidx.camera.core.impl.utils;

import android.util.Range;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/core/impl/utils/RangeUtil;", "", "<init>", "()V", "filterFixedRanges", "", "Landroid/util/Range;", "", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RangeUtil {

    @NotNull
    public static final RangeUtil INSTANCE = new RangeUtil();

    private RangeUtil() {
    }

    @NotNull
    public static final Set<Range<Integer>> filterFixedRanges(@NotNull Set<Range<Integer>> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            Range range = (Range) obj2;
            if (Intrinsics.f(range.getUpper(), range.getLower())) {
                arrayList.add(obj2);
            }
        }
        return new LinkedHashSet(arrayList);
    }
}
