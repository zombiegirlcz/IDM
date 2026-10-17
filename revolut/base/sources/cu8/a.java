package cu8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f108817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f108818b;

    public a(r0 kycRequiredActionTransformer, f9b.f errorView, tpi.j progressView, sri.m navigator) {
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f108817a = kycRequiredActionTransformer;
        this.f108818b = navigator;
    }

    public static pfm.a a(a aVar, ks8.a source, efm.b completable) {
        aVar.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(completable, "completable");
        pfm.a aVar2 = new pfm.a(ks8.m.a(aVar.f108817a), new csl.b(3, new cma.b(completable, aVar, 21)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }
}
