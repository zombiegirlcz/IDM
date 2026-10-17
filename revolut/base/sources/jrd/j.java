package jrd;

import cli.y;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends oki.h implements dli.b {

    @NotNull
    public static final i Companion = new i();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l80.e f178000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f178001q;

    public j(k stateMapper, c inputData, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = inputData;
        this.f178000p = dateProvider;
        LocalDate localDateE = ((l80.f) dateProvider).e();
        Integer num = inputData.f177995c;
        int iIntValue = num != null ? num.intValue() : localDateE.getYear();
        a aVar = inputData.f177994b;
        Integer num2 = inputData.d;
        this.f178001q = mra.d.b(this, new b(aVar, iIntValue, num2 != null ? num2.intValue() : localDateE.getMonthValue(), d0.d1(new IntRange(1950, localDateE.getYear(), 1)), I2(iIntValue)), stateMapper, null, false, 12);
    }

    public final List I2(int i) {
        LocalDate localDateE = ((l80.f) this.f178000p).e();
        return i == localDateE.getYear() ? d0.d1(new IntRange(1, localDateE.getMonthValue(), 1)) : d0.d1(new IntRange(1, 12, 1));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f178001q;
    }
}
