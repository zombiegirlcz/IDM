package zc6;

import ad6.f;
import ad6.j;
import ad6.k;
import ad6.l;
import ad6.m;
import ad6.n;
import android.content.Context;
import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.Intrinsics;
import md6.g;
import md6.i;
import md6.q;
import md6.r;
import md6.s;
import md6.u;
import md6.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jd6.a f321236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f321237b;

    public a(jd6.a aVar, Context context) {
        this.f321236a = aVar;
        this.f321237b = context;
    }

    public static ed6.a a() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(9);
        builderBuilderWithExpectedSize.put(md6.a.class, new ad6.b(new bd6.b()));
        builderBuilderWithExpectedSize.put(i.class, new f());
        builderBuilderWithExpectedSize.put(q.class, new j());
        builderBuilderWithExpectedSize.put(r.class, new k());
        builderBuilderWithExpectedSize.put(s.class, new l());
        builderBuilderWithExpectedSize.put(g.class, new ad6.d());
        builderBuilderWithExpectedSize.put(u.class, new m(new ad6.b(new bd6.b())));
        builderBuilderWithExpectedSize.put(v.class, new n());
        bd6.b accountProductHelperMapper = new bd6.b();
        Intrinsics.checkNotNullParameter(accountProductHelperMapper, "accountProductHelperMapper");
        builderBuilderWithExpectedSize.put(md6.c.class, new ad6.c());
        return new ed6.a(builderBuilderWithExpectedSize.build());
    }

    public final i4b.f b() {
        l61.a aVarB = this.f321236a.f172982a.b();
        vc.s.j(aVarB);
        return new i4b.f(new kd6.a(aVarB, 0));
    }

    public final zjh.j c() {
        return new zjh.j(a());
    }

    public final i4b.f d() {
        return new i4b.f(new hd6.a());
    }

    public final r10.d e() {
        ed6.a colombiaLegalEntityProvider = a();
        l61.a aVarB = this.f321236a.f172982a.b();
        vc.s.j(aVarB);
        kd6.a legalEntityRegionProvider = new kd6.a(aVarB, 0);
        Intrinsics.checkNotNullParameter(colombiaLegalEntityProvider, "colombiaLegalEntityProvider");
        Intrinsics.checkNotNullParameter(legalEntityRegionProvider, "legalEntityRegionProvider");
        r10.d dVar = new r10.d();
        dVar.f250818a = colombiaLegalEntityProvider;
        dVar.f250819b = legalEntityRegionProvider;
        return dVar;
    }
}
