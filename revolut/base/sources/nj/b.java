package nj;

import ce.v;
import com.bumptech.glide.g;
import com.google.firebase.messaging.t;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f216288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f216289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f216290c;

    public b(v vVar, Set set, Set set2) {
        this.f216288a = set;
        this.f216289b = set2;
        this.f216290c = vVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Set<String> set = this.f216288a;
        Set set2 = this.f216289b;
        v vVar = this.f216290c;
        t tVar = (t) vVar.e;
        ((Lock) tVar.f49544c).lock();
        try {
            HashMap map = new HashMap();
            for (String str : set) {
                if (!set2.contains(str)) {
                    Object objA = ((ie.a) vVar.f).a(str, tVar.d(str).f246754c);
                    ((g) vVar.d).f26094a.put(str, objA);
                    map.put(str, objA);
                }
            }
            return map;
        } finally {
            tVar.m();
        }
    }
}
