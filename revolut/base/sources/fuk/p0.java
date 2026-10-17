package fuk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f138267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f138268b;

    public p0(g0 datasetMapper, o0 legendSeriesMapper, b0 chartMapper) {
        Intrinsics.checkNotNullParameter(datasetMapper, "datasetMapper");
        Intrinsics.checkNotNullParameter(legendSeriesMapper, "legendSeriesMapper");
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        this.f138267a = datasetMapper;
        this.f138268b = legendSeriesMapper;
    }

    public static String b(rwk.k kVar) {
        String str;
        String str2;
        if (kVar.equals(rwk.h.f257989a)) {
            return "PERCENT";
        }
        if (kVar.equals(rwk.j.f257991a)) {
            return "RATIO";
        }
        if (kVar instanceof rwk.g) {
            str = ((rwk.g) kVar).f257988a.f306286a;
            str2 = "MoneyUnit(currencyCode=";
        } else {
            if (!(kVar instanceof rwk.i)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((rwk.i) kVar).f257990a.f306286a;
            str2 = "PreciseMoneyUnit(currencyCode=";
        }
        return p.a.p(str2, str, ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b4 A[LOOP:1: B:125:0x02ae->B:127:0x02b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f6 A[LOOP:6: B:155:0x03f0->B:157:0x03f6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x068f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(fuk.l0 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fuk.p0.a(fuk.l0):java.util.List");
    }
}
