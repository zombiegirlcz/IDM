package fsl;

import fjd.g0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f137735l;

    public s(c configurationProvider) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.f137735l = configurationProvider;
    }

    @Override // fsl.i
    public final void Z2(l parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        V2(new g0(this, parcel, null, 14), new yi5.b(29));
    }
}
