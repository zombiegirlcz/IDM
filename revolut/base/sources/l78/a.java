package l78;

import android.content.Context;
import g88.j;
import g88.k;
import kotlin.jvm.internal.Intrinsics;
import q78.e;
import vc.s;
import zfe.d;
import zfe.f;
import zfe.g;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f192537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final usg.a f192538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f192539c;
    public final mj8.b d;

    public a(usg.a aVar, ite.a aVar2, mj8.b bVar, Context context) {
        this.f192537a = context;
        this.f192538b = aVar;
        this.f192539c = aVar2;
        this.d = bVar;
    }

    public final e a() {
        wsg.b newWalletsInteractor = this.f192538b.a();
        gte.a featureToggleInteractor = this.f192539c.b();
        s.j(featureToggleInteractor);
        c.Companion.getClass();
        Context context = this.f192537a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        g.Companion.getClass();
        she.g gVarA = f.a(context);
        zfe.e.Companion.getClass();
        return new e(newWalletsInteractor, gVarA, d.a(context));
    }

    public final jt0.b b() {
        hj8.a aVarA = this.d.a();
        s.j(aVarA);
        wsg.b bVarA = this.f192538b.a();
        gte.a aVarB = this.f192539c.b();
        s.j(aVarB);
        return new jt0.b(aVarA, bVarA, aVarB, new j(), new k());
    }
}
