package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f49470j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f49471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f49472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce.v f49473c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f49475h;
    public final ArrayMap e = new ArrayMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f49474g = false;

    public a0(FirebaseMessaging firebaseMessaging, o oVar, y yVar, ce.v vVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.f49472b = oVar;
        this.f49475h = yVar;
        this.f49473c = vVar;
        this.f49471a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        ce.v vVar = this.f49473c;
        vVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(vVar.h(vVar.l(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.d.a();
        ce.v vVar = this.f49473c;
        vVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(vVar.h(vVar.l(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.f49474g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[Catch: IOException -> 0x005f, TryCatch #2 {IOException -> 0x005f, blocks: (B:15:0x002a, B:32:0x0086, B:34:0x008e, B:20:0x003b, B:22:0x0043, B:24:0x004e, B:27:0x0062, B:29:0x006a, B:31:0x0075), top: B:88:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a0.e():boolean");
    }

    public final void f(long j2) {
        this.f.schedule(new c0(this, this.f49471a, this.f49472b, Math.min(Math.max(30L, 2 * j2), i)), j2, TimeUnit.SECONDS);
        d(true);
    }
}
