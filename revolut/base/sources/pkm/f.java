package pkm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class f {
    public static final double a(double d, e sourceUnit, e targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.a().convert(1L, sourceUnit.a());
        return jConvert > 0 ? d * jConvert : d / sourceUnit.a().convert(1L, targetUnit.a());
    }

    public static final long b(long j2, e sourceUnit, e targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.a().convert(j2, sourceUnit.a());
    }

    public static final long c(long j2, e sourceUnit, e targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.a().convert(j2, sourceUnit.a());
    }
}
