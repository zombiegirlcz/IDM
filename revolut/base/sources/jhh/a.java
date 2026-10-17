package jhh;

import kotlin.jvm.internal.Intrinsics;
import m1h.e;
import m1h.g;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements m1h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f174250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1h.d f174251c;
    public final e d;

    public a(g provider, m1h.d mapper, e parcelHandler, int i) {
        this.f174249a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(parcelHandler, "parcelHandler");
                this.f174250b = provider;
                this.f174251c = mapper;
                this.d = parcelHandler;
                break;
            default:
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(parcelHandler, "parcelHandler");
                this.f174250b = provider;
                this.f174251c = mapper;
                this.d = parcelHandler;
                break;
        }
    }

    @Override // m1h.c
    public final m1h.d a() {
        switch (this.f174249a) {
        }
        return this.f174251c;
    }

    @Override // m1h.c
    public final e b() {
        switch (this.f174249a) {
        }
        return this.d;
    }

    @Override // m1h.c
    public final g q() {
        switch (this.f174249a) {
        }
        return this.f174250b;
    }
}
