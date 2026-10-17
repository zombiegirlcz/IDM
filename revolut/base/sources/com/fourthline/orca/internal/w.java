package com.fourthline.orca.internal;

import com.fourthline.core.internal.TimestampProvider;

/* JADX INFO: loaded from: classes23.dex */
public final class w implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f34483a;

    private w(d dVar) {
        this.f34483a = dVar;
    }

    public static TimestampProvider b(d dVar) {
        TimestampProvider timestampProviderN = dVar.n();
        vc.s.k(timestampProviderN);
        return timestampProviderN;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TimestampProvider get() {
        return b(this.f34483a);
    }

    public static w a(d dVar) {
        return new w(dVar);
    }
}
