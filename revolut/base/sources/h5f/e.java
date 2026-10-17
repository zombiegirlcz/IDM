package h5f;

import kotlin.jvm.internal.Intrinsics;
import t1h.f;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements t1h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149550a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f149551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1h.d f149552c;
    public final t1h.e d;

    public e(f provider, t1h.d mapper, g5f.c parcelHandler) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(parcelHandler, "parcelHandler");
        this.f149551b = provider;
        this.f149552c = mapper;
        this.d = parcelHandler;
    }

    @Override // t1h.c
    public final t1h.d a() {
        switch (this.f149550a) {
        }
        return this.f149552c;
    }

    @Override // t1h.c
    public final t1h.e b() {
        switch (this.f149550a) {
            case 0:
                return (g5f.c) this.d;
            default:
                return this.d;
        }
    }

    @Override // t1h.c
    public final f q() {
        switch (this.f149550a) {
        }
        return this.f149551b;
    }

    public e(f provider, t1h.d mapper, t1h.e parcelHandler) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(parcelHandler, "parcelHandler");
        this.f149551b = provider;
        this.f149552c = mapper;
        this.d = parcelHandler;
    }
}
