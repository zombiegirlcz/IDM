package oc;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes16.dex */
public final class h extends pc.d implements pc.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc.k f224011b;
    public final TaskCompletionSource e;
    public final /* synthetic */ i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f224012g;

    public h(i iVar, TaskCompletionSource taskCompletionSource, String str) {
        this.f224012g = iVar;
        pc.k kVar = new pc.k("OnRequestInstallCallback");
        this.f = iVar;
        super(0);
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f224011b = kVar;
        this.e = taskCompletionSource;
    }

    @Override // pc.i
    public final void a(Bundle bundle) {
        this.f.f224013a.c(this.e);
        this.f224011b.e("onRequestInfo", new Object[0]);
        int i = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.e;
        if (i != 0) {
            taskCompletionSource.trySetException(new InstallException(bundle.getInt("error.code", -2)));
            return;
        }
        int i2 = bundle.getInt("version.code", -1);
        int i3 = bundle.getInt("update.availability");
        int i5 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i6 = bundle.getInt("in.app.update.priority", 0);
        long j2 = bundle.getLong("bytes.downloaded");
        long j3 = bundle.getLong("total.bytes.to.download");
        long j5 = bundle.getLong("additional.size.required");
        j jVar = this.f224012g.d;
        jVar.getClass();
        long jA = j.a(new File(jVar.f224016a.getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSet = new HashSet();
        if (integerArrayList != null) {
            hashSet.addAll(integerArrayList);
        }
        map.put("blocking.destructive.intent", hashSet);
        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSet2 = new HashSet();
        if (integerArrayList2 != null) {
            hashSet2.addAll(integerArrayList2);
        }
        map.put("nonblocking.destructive.intent", hashSet2);
        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSet3 = new HashSet();
        if (integerArrayList3 != null) {
            hashSet3.addAll(integerArrayList3);
        }
        map.put("blocking.intent", hashSet3);
        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSet4 = new HashSet();
        if (integerArrayList4 != null) {
            hashSet4.addAll(integerArrayList4);
        }
        map.put("nonblocking.intent", hashSet4);
        taskCompletionSource.trySetResult(new a(i2, i3, i5, numValueOf, i6, j2, j3, j5, jA, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map));
    }

    @Override // pc.i
    public void i(Bundle bundle) {
        this.f.f224013a.c(this.e);
        this.f224011b.e("onCompleteUpdate", new Object[0]);
    }
}
