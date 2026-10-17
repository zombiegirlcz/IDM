package iff;

import kotlin.jvm.internal.Intrinsics;
import od0.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.b f161008a;

    public a() {
        dj0.d.Companion.getClass();
        ihm.b bVarE = ihm.b.e(dj0.d.d);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f161008a = bVarE;
    }

    @Override // od0.e
    public final void clear() {
        dj0.d.Companion.getClass();
        this.f161008a.onNext(dj0.d.d);
    }
}
