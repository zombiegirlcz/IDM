package ba7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements a97.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv5.c f13976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.f f13977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f13978c;

    public h(xv5.c cryptoCommodityBaseCurrencyInteractor, r10.f inputProcessor, k mapper) {
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(inputProcessor, "inputProcessor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f13976a = cryptoCommodityBaseCurrencyInteractor;
        this.f13977b = inputProcessor;
        this.f13978c = mapper;
    }

    @Override // a97.g
    public final a97.h e() {
        return new a97.h(a97.b.class);
    }

    @Override // a97.g
    public final a97.k f() {
        return new f(this);
    }
}
