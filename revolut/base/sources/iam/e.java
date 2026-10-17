package iam;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Future;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nd.k;
import org.jetbrains.annotations.NotNull;
import pak.h;
import uam.j;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    @NotNull
    public static final b Companion = new b();
    public static final kdh.b f = new kdh.b(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdh.b f160064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f160065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2m.b f160066c;
    public final qam.e d;
    public final Lazy e;

    public e(Context context, hbm.a view, fbm.d lensPosition, j jVar, nam.b cameraConfiguration, Function1 function1, k kVar, int i) {
        j scaleType = (i & 16) != 0 ? j.CenterCrop : jVar;
        Function1 cameraErrorCallback = (i & 64) != 0 ? a.f : function1;
        k logger = (i & 256) != 0 ? new k(14) : kVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(cameraConfiguration, "cameraConfiguration");
        Intrinsics.checkNotNullParameter(cameraErrorCallback, "cameraErrorCallback");
        kdh.b executor = f;
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f160064a = executor;
        this.f160065b = logger;
        Intrinsics.checkNotNullParameter(cameraErrorCallback, "<this>");
        this.f160066c = new c2m.b(cameraErrorCallback, 5);
        this.d = new qam.e(logger, new h(context), scaleType, view, executor, cameraConfiguration, lensPosition);
        this.e = yhm.j.b(new abm.c(context, this, 2));
        k.k();
    }

    public final void a() {
        this.f160065b.getClass();
        k.k();
        this.f160064a.B(new mam.a(false, new c(this, 0)));
    }

    public final void b() {
        this.f160065b.getClass();
        k.k();
        kdh.b bVar = this.f160064a;
        LinkedList linkedList = (LinkedList) bVar.f182900c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : linkedList) {
            Future future = (Future) obj2;
            if (!future.isCancelled() && !future.isDone()) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((Future) it8.next()).cancel(true);
        }
        linkedList.clear();
        bVar.B(new mam.a(false, new c(this, 1)));
    }

    public final void c(fbm.d lensPosition, nam.b cameraConfiguration) {
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(cameraConfiguration, "cameraConfiguration");
        this.f160065b.getClass();
        k.k();
        this.f160064a.B(new mam.a(true, new d(this, lensPosition, cameraConfiguration)));
    }
}
