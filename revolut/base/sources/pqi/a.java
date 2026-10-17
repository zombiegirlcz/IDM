package pqi;

import android.content.Context;
import androidx.appcompat.view.ContextThemeWrapper;
import com.revolut.retail.common.ui.R$style;
import kotlin.jvm.internal.Intrinsics;
import l70.e;
import n80.d;
import nd.o;
import p8a.c0;
import th0.f;
import tqi.g;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f238791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final th0.a f238792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f238793c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(e eVar, th0.a aVar, Context context) {
        this.f238791a = context;
        this.f238792b = aVar;
        this.f238793c = eVar;
        int i = 8;
        this.d = e4m.b.b(new c0(this, 0, i));
        this.e = e4m.b.b(new c0(this, 1, i));
        this.f = e4m.b.b(new c0(this, 2, i));
    }

    public final o a() {
        sqi.a aVar = (sqi.a) this.d.get();
        zk0.b bVarL = this.f238793c.l();
        s.j(bVarL);
        return new o(aVar, bVarL, this.f238791a);
    }

    public final rqi.c b() {
        th0.a aVar = this.f238792b;
        return new rqi.c(this.f238791a, f.a(), th0.e.a(), new gi0.a(), aVar.h());
    }

    public final ww0.b c() {
        c.Companion.getClass();
        Context context = this.f238791a;
        Intrinsics.checkNotNullParameter(context, "context");
        com.bumptech.glide.c.k(context).getClass();
        ww0.b bVarC = xoi.e.c(context);
        s.k(bVarC);
        return bVarC;
    }

    public final tqi.e d() {
        e eVar = this.f238793c;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        d dVarA = eVar.a();
        s.j(dVarA);
        return new tqi.e(bVarL, dVarA);
    }

    public final g e() {
        uqi.b bVar = new uqi.b(this.f238791a, 0);
        e eVar = this.f238793c;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        zk0.b bVarL2 = eVar.l();
        s.j(bVarL2);
        return new g(bVar, bVarL, bVarL2);
    }

    public final ContextThemeWrapper f() {
        c.Companion.getClass();
        Context context = this.f238791a;
        Intrinsics.checkNotNullParameter(context, "context");
        return new ContextThemeWrapper(context, R$style.BaseUiKitTheme);
    }

    public final f01.c g() {
        c.Companion.getClass();
        Context context = this.f238791a;
        Intrinsics.checkNotNullParameter(context, "context");
        return new f01.c(context);
    }
}
