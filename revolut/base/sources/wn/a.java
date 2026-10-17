package wn;

import kotlin.jvm.internal.Intrinsics;
import xn.b;
import yji.n;
import zn.d;
import zn.f;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f298704l;

    public a(b adsTrackingInteractor) {
        Intrinsics.checkNotNullParameter(adsTrackingInteractor, "adsTrackingInteractor");
        this.f298704l = adsTrackingInteractor;
    }

    @Override // yji.n
    public final void F2() {
        this.f298704l.a();
    }

    public final void Z2(d viewableRecordItem) {
        Intrinsics.checkNotNullParameter(viewableRecordItem, "viewableRecordItem");
        this.f298704l.d(viewableRecordItem);
    }

    public final void b3(f viewableRecordSnapshot) {
        Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
        this.f298704l.f(viewableRecordSnapshot);
    }
}
