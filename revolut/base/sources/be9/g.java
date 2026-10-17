package be9;

import kotlin.jvm.internal.Intrinsics;
import zsc.i;
import zsc.j;
import zsc.m;
import zsc.r;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14726a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zsc.d f14727b;

    public g(m query) {
        Intrinsics.checkNotNullParameter(query, "query");
        j factory = j.f324876a;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f14727b = new i(query);
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        switch (this.f14726a) {
            case 0:
                wd9.b value = (wd9.b) obj2;
                Intrinsics.checkNotNullParameter(value, "value");
                Long l2 = value.f296467a.f249323j;
                return ((i) this.f14727b).a(l2 != null ? new dj0.d(l2.longValue(), new xi0.b(6, value.f296467a.i, null)) : null);
            default:
                return b((zf1.a) obj2);
        }
    }

    public boolean b(zf1.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return ((h) this.f14727b).b(value.f321854b);
    }

    public g(m query, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        r stringFilterFactory = r.f324883a;
        Intrinsics.checkNotNullParameter(stringFilterFactory, "stringFilterFactory");
        this.f14727b = new h(query, uiKitResources, 2);
    }
}
