package qul;

import f7j.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pvl.a f249501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f249502b;

    public i(pvl.a limitsMapper, p targetPriceBuilder, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(limitsMapper, "limitsMapper");
        Intrinsics.checkNotNullParameter(targetPriceBuilder, "targetPriceBuilder");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f249501a = limitsMapper;
        this.f249502b = targetPriceBuilder;
    }

    @Override // qul.g
    public final boolean a(h context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.d != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    @Override // qul.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bw0.m b(qul.h r20) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qul.i.b(qul.h):bw0.m");
    }
}
