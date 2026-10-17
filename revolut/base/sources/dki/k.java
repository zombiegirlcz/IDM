package dki;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.h f115547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f115548b;

    public k(ao.h withId) {
        ArrayList embedded = new ArrayList();
        Intrinsics.checkNotNullParameter(withId, "withId");
        Intrinsics.checkNotNullParameter(embedded, "embedded");
        this.f115547a = withId;
        this.f115548b = embedded;
    }

    @Override // dki.m
    public final ao.h a() {
        return this.f115547a;
    }

    public final List b() {
        return this.f115548b;
    }
}
