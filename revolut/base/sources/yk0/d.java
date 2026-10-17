package yk0;

import efm.c0;
import hhm.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import wfm.j;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static j a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        c0 c0Var = f.f152429a;
        j jVar = new j(executorServiceNewSingleThreadExecutor);
        Intrinsics.checkNotNullExpressionValue(jVar, "from(...)");
        return jVar;
    }
}
