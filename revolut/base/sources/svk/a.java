package svk;

import hdh.g;
import kotlin.jvm.internal.Intrinsics;
import zjh.f;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f266030a;

    public a(f ipoInstrumentInteractor) {
        Intrinsics.checkNotNullParameter(ipoInstrumentInteractor, "ipoInstrumentInteractor");
        this.f266030a = ipoInstrumentInteractor;
    }

    @Override // hdh.g
    public final hdh.f a() {
        return new c(this.f266030a);
    }
}
