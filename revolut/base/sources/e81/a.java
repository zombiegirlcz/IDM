package e81;

import android.content.Context;
import dw3.f6;
import kotlin.jvm.internal.Intrinsics;
import l70.e;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f123554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f123555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f123556c;
    public final e4m.e d;

    public a(e eVar, r4l.a aVar, Context context) {
        this.f123554a = context;
        this.f123555b = eVar;
        int i = 14;
        this.f123556c = e4m.b.b(new f6(this, 0, i));
        this.d = e4m.b.b(new f6(this, 1, i));
    }

    public final h81.b a() {
        c.Companion.getClass();
        Context context = this.f123554a;
        Intrinsics.checkNotNullParameter(context, "context");
        return new h81.b(new f01.c(context));
    }

    public final b81.c b() {
        return new b81.c((hlm.a) this.d.get());
    }

    public final g81.a c() {
        return (g81.a) this.f123556c.get();
    }

    public final h81.b d() {
        return a();
    }
}
