package zj;

import gpk.c;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f322735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f322736b;

    public a(c cVar, String str) {
        this.f322735a = str;
        this.f322736b = cVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        this.f322736b.getClass();
        Thread thread = new Thread(runnable);
        thread.setName("binaryprefs-pool-" + this.f322735a);
        thread.setPriority(10);
        return thread;
    }
}
