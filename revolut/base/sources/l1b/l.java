package l1b;

import akl.w;
import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes13.dex */
public final class l {

    @NotNull
    public static final j Companion = new j(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f191525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n80.e f191526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f191527c;
    public final Lazy d;

    public l(ue0.c storage, n80.e packageManager, Context context) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f191525a = storage;
        this.f191526b = packageManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f191527c = applicationContext;
        this.d = yhm.j.b(new kob.a(this, 15));
    }

    public final Object a(gim.c cVar) {
        w wVar = new w(this, null, 2);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, wVar, cVar);
    }
}
