package m50;

import k50.p0;
import kotlin.jvm.internal.Intrinsics;
import m2f.b0;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends p0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f30.h f202788l;

    public l(f30.h messageSearchIndexer) {
        Intrinsics.checkNotNullParameter(messageSearchIndexer, "messageSearchIndexer");
        this.f202788l = messageSearchIndexer;
    }

    @Override // k50.p0
    public final void Z2(c0 feedType) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        T2(new b0(this, feedType, null, 4), new yi5.b(27));
    }
}
