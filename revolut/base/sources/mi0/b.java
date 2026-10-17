package mi0;

import com.google.android.gms.tasks.Task;
import ecm.q;
import efm.e0;
import efm.g0;
import efm.m;
import kotlin.jvm.internal.Intrinsics;
import mp.r;
import rfm.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements m, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f205591a;

    public /* synthetic */ b(Task task) {
        this.f205591a = task;
    }

    @Override // efm.m
    public void b(c it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        this.f205591a.addOnCompleteListener(new q(it8));
    }

    @Override // efm.g0
    public void subscribe(e0 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        this.f205591a.addOnCompleteListener(new r((ufm.a) it8));
    }
}
