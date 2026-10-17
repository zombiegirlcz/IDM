package wc;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f296287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.c f296288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.messaging.t f296289c;
    public final Executor d;

    public d(Context context, ThreadPoolExecutor threadPoolExecutor, com.google.firebase.messaging.t tVar, uc.c cVar) {
        this.f296287a = context;
        this.f296288b = cVar;
        this.f296289c = tVar;
        this.d = threadPoolExecutor;
    }
}
