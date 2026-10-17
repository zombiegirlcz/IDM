package zo;

import android.content.Context;
import ecm.q;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import sri.o;
import vc.s;
import xo.f;
import xo.h;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f323839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kf0.c f323840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dp.a f323841c;
    public final an0.c d;
    public final ysc.a e;

    public c(dp.a aVar, kf0.c cVar, an0.c cVar2, ysc.a aVar2, Context context) {
        this.f323839a = context;
        this.f323840b = cVar;
        this.f323841c = aVar;
        this.d = cVar2;
        this.e = aVar2;
    }

    public final h a() {
        kf0.c cVar = this.f323840b;
        return new h(cVar.f183264b, cVar.f183263a, this.f323841c.f116591b);
    }

    public final f b() {
        h hVarA = a();
        gte.a aVarB = this.f323841c.f116590a.b();
        s.j(aVarB);
        q qVar = new q(aVarB);
        b.Companion.getClass();
        Context context = this.f323839a;
        Intrinsics.checkNotNullParameter(context, "context");
        m mVarC = o.c(context, null, null, 14);
        zm0.c cVarJ = this.d.j();
        s.j(cVarJ);
        wsc.a aVar = (wsc.a) this.e.e.get();
        s.j(aVar);
        return new f(hVarA, qVar, mVarC, cVarJ, aVar, new bp.a());
    }
}
