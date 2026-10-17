package com.fourthline.vision.internal;

import android.content.Context;
import androidx.view.result.ActivityResultRegistry;
import com.fourthline.core.location.LocationProvider;

/* JADX INFO: loaded from: classes23.dex */
public final class ld implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f36490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f36491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f36492c;

    private ld(ed edVar, e4m.e eVar, e4m.e eVar2) {
        this.f36490a = edVar;
        this.f36491b = eVar;
        this.f36492c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocationProvider get() {
        return a(this.f36490a, (Context) this.f36491b.get(), (ActivityResultRegistry) this.f36492c.get());
    }

    public static ld a(ed edVar, e4m.e eVar, e4m.e eVar2) {
        return new ld(edVar, eVar, eVar2);
    }

    public static LocationProvider a(ed edVar, Context context, ActivityResultRegistry activityResultRegistry) {
        LocationProvider locationProviderProvideLocationProvider = edVar.provideLocationProvider(context, activityResultRegistry);
        vc.s.k(locationProviderProvideLocationProvider);
        return locationProviderProvideLocationProvider;
    }
}
