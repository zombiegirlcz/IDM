package be9;

import kotlin.jvm.internal.Intrinsics;
import zsc.i;
import zsc.j;
import zsc.m;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f14719a;

    public a(m query) {
        Intrinsics.checkNotNullParameter(query, "query");
        j factory = j.f324876a;
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f14719a = new i(query);
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        wd9.a value = (wd9.a) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f14719a.a(value.f296466a.f72129a.f72140g);
    }
}
