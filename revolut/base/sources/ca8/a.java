package ca8;

import b6a.d;
import bwb.n;
import c1i.f;
import c69.v;
import com.revolut.feature.junior.isa.impl.services.JuniorIsaService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import ue0.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorIsaService f22533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f22534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f22535c;
    public final x4l.c d;

    public a(JuniorIsaService service, j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f22533a = service;
        this.f22534b = memoryCache;
        this.f22535c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new d(this, continuation, 20), new v(this, 17), new c9f.c(this, 1), new f(this, continuation, 24), new n(this, continuation, 7));
    }

    public static String a(String str) {
        return j6.a.q("TAX_RESIDENCIES_", str);
    }
}
