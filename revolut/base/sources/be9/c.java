package be9;

import kotlin.jvm.internal.Intrinsics;
import zsc.m;
import zsc.r;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f14722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zsc.d f14723b;

    public c(m query, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        r stringFilterFactory = r.f324883a;
        Intrinsics.checkNotNullParameter(stringFilterFactory, "stringFilterFactory");
        this.f14722a = uiKitResources;
        this.f14723b = stringFilterFactory.a(query);
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        wd9.a value = (wd9.a) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f14723b.a(this.f14722a.b(yd9.d.c(value.f296466a)).toString());
    }
}
