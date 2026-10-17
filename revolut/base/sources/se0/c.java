package se0;

import dp4.b1;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import s1c.d;
import sa6.y;
import scl.e;
import vkm.f;
import vkm.q;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f262079a = new y(29);

    public static f a(w4l.f fVar, Object params, long j2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        y reloadStartStrategy = f262079a;
        Intrinsics.checkNotNullParameter(reloadStartStrategy, "reloadStartStrategy");
        d observeTransformer = new d(5);
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(observeTransformer, "observeTransformer");
        Intrinsics.checkNotNullParameter(reloadStartStrategy, "reloadStartStrategy");
        e observeTransformerFactory = new e(observeTransformer, 7);
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(observeTransformerFactory, "observeTransformerFactory");
        Intrinsics.checkNotNullParameter(reloadStartStrategy, "reloadStartStrategy");
        a reloadTransformerFactory = new a(0);
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(observeTransformerFactory, "observeTransformerFactory");
        Intrinsics.checkNotNullParameter(reloadTransformerFactory, "reloadTransformerFactory");
        Intrinsics.checkNotNullParameter(reloadStartStrategy, "reloadStartStrategy");
        return q.m(new b1(fVar, params, observeTransformerFactory, j2, reloadTransformerFactory, (Continuation) null));
    }
}
