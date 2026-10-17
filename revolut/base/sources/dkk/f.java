package dkk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.h f115594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8g.a f115595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p8g.c f115596c;

    public f(yik.h stringMapper, p8g.a staysCashbackInteractor, p8g.c staysFeatureInteractor) {
        Intrinsics.checkNotNullParameter(stringMapper, "stringMapper");
        Intrinsics.checkNotNullParameter(staysCashbackInteractor, "staysCashbackInteractor");
        Intrinsics.checkNotNullParameter(staysFeatureInteractor, "staysFeatureInteractor");
        this.f115594a = stringMapper;
        this.f115595b = staysCashbackInteractor;
        this.f115596c = staysFeatureInteractor;
    }
}
