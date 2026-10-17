package vc;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends wc.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f287581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f287582c;
    public final /* synthetic */ b9.q d;
    public final /* synthetic */ TaskCompletionSource e;
    public final /* synthetic */ i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, TaskCompletionSource taskCompletionSource, ArrayList arrayList, ArrayList arrayList2, b9.q qVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f = iVar;
        this.f287581b = arrayList;
        this.f287582c = arrayList2;
        this.d = qVar;
        this.e = taskCompletionSource2;
    }

    @Override // wc.s
    public final void c() {
        TaskCompletionSource taskCompletionSource = this.e;
        i iVar = this.f;
        b9.q qVar = this.d;
        Collection collection = this.f287581b;
        ArrayList arrayListA = i.a(collection);
        ArrayList<String> arrayList = this.f287582c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : arrayList) {
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList2.add(bundle);
        }
        arrayListA.addAll(arrayList2);
        try {
            qVar.d(2);
            wc.i iVar2 = iVar.f287588b.f296286m;
            String str2 = iVar.f287587a;
            Bundle bundleB = i.b();
            bundleB.putParcelableArrayList("event_timestamps", new ArrayList<>(qVar.c()));
            iVar2.d(str2, arrayListA, bundleB, new h(iVar, taskCompletionSource, 2));
        } catch (RemoteException e) {
            i.f287586c.d(e, "startInstall(%s,%s)", collection, arrayList);
            taskCompletionSource.trySetException(new RuntimeException(e));
        }
    }
}
