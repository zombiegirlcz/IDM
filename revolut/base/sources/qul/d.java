package qul;

import f7j.p;
import kotlin.jvm.internal.Intrinsics;
import wul.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pvl.a f249492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f249493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ogm.i f249494c;

    public d(pvl.a limitsMapper, p targetPriceBuilder, ogm.i marketPriceBuilder, o tradingOrderMapper, c cfdValidationClauseMapper) {
        Intrinsics.checkNotNullParameter(limitsMapper, "limitsMapper");
        Intrinsics.checkNotNullParameter(targetPriceBuilder, "targetPriceBuilder");
        Intrinsics.checkNotNullParameter(marketPriceBuilder, "marketPriceBuilder");
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        Intrinsics.checkNotNullParameter(cfdValidationClauseMapper, "cfdValidationClauseMapper");
        this.f249492a = limitsMapper;
        this.f249493b = targetPriceBuilder;
        this.f249494c = marketPriceBuilder;
    }

    @Override // qul.g
    public final boolean a(h context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.d == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003f  */
    @Override // qul.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bw0.m b(qul.h r23) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qul.d.b(qul.h):bw0.m");
    }
}
