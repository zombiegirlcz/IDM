package a3l;

import android.content.Context;
import az0.a0;
import az0.b0;
import az0.c0;
import az0.d0;
import az0.d1;
import az0.e0;
import az0.e1;
import az0.f;
import az0.f0;
import az0.g0;
import az0.g1;
import az0.h;
import az0.i;
import az0.i0;
import az0.i1;
import az0.j;
import az0.j1;
import az0.m;
import az0.m0;
import az0.o;
import az0.o1;
import az0.p;
import az0.q;
import az0.r0;
import az0.s0;
import az0.t;
import az0.u1;
import az0.w;
import az0.w0;
import az0.w1;
import az0.x;
import az0.z;
import fz0.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import qz0.n;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends yy0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1169b;

    public a(Context context, bk0.e authHeadersProvider, Set displayDelegates, bk0.e eVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authHeadersProvider, "authHeadersProvider");
        Intrinsics.checkNotNullParameter(displayDelegates, "displayDelegates");
        n urlImagesRepository = new n(context, authHeadersProvider, eVar);
        g urlImageFactory = new g(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urlImagesRepository, "urlImagesRepository");
        Intrinsics.checkNotNullParameter(urlImageFactory, "urlImageFactory");
        this.f1169b = v.n(new d1(), new i0(), new o1(urlImagesRepository), new az0.n(urlImageFactory), new u1(new w1(context, authHeadersProvider, eVar)), new a0(), new f0(), new s0(), new r0(), new h(), new i1(), new d0(), new e1(), new j1(), new m0(), new x(), new az0.g(), new c0(), new e0(), new m(), new b0(), new i(), new j(), new w0(), new f(), new az0.b(), new g0(), new z(), new o(), new w(), new t(), new p(), new q(), new g1());
        zhm.a0.x(displayDelegates, this.f1169b);
    }

    @Override // yy0.b
    public final List g() {
        return this.f1169b;
    }
}
