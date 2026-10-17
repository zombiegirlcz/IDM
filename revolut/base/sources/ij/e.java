package ij;

import android.content.SharedPreferences;
import com.bumptech.glide.k;
import com.google.firebase.messaging.t;
import com.ironz.binaryprefs.exception.TransactionInvalidatedException;
import cpi.g;
import ecm.q;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class e implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f161658a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f161659b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f161660c;
    public final g d;
    public final gpk.c e;
    public final ie.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.g f161661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f161662h;
    public final Lock i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f161663j;

    public e(t tVar, g gVar, gpk.c cVar, ie.a aVar, com.bumptech.glide.g gVar2, q qVar, Lock lock) {
        this.f161660c = tVar;
        this.d = gVar;
        this.e = cVar;
        this.f = aVar;
        this.f161661g = gVar2;
        this.f161662h = qVar;
        this.i = lock;
    }

    public final void a() {
        Lock lock = this.i;
        lock.lock();
        try {
            this.f161659b.addAll(Collections.unmodifiableSet((Set) this.f161662h.f124861b));
        } finally {
            lock.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        Lock lock = this.i;
        lock.lock();
        try {
            b();
        } finally {
            lock.unlock();
        }
    }

    public final ak.a b() {
        com.bumptech.glide.g gVar;
        q qVar;
        Iterator it8 = this.f161659b.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            gVar = this.f161661g;
            qVar = this.f161662h;
            if (!zHasNext) {
                break;
            }
            String str = (String) it8.next();
            ((Set) qVar.f124861b).remove(str);
            gVar.f26094a.remove(str);
        }
        HashMap map = this.f161658a;
        for (String str2 : map.keySet()) {
            Object value = ((xj.a) map.get(str2)).getValue();
            ((Set) qVar.f124861b).add(str2);
            gVar.f26094a.put(str2, value);
        }
        if (this.f161663j) {
            throw new TransactionInvalidatedException();
        }
        this.f161663j = true;
        return this.e.j(new k(this, 13));
    }

    public final void c(String str, boolean z) {
        Lock lock = this.i;
        lock.lock();
        try {
            this.f161658a.put(str, new yj.a(z, this.f));
        } finally {
            lock.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        a();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        Lock lock = this.i;
        lock.lock();
        try {
            return b().B();
        } finally {
            lock.unlock();
        }
    }

    public final void d(float f, String str) {
        Lock lock = this.i;
        lock.lock();
        try {
            this.f161658a.put(str, new yj.c(f, this.f));
        } finally {
            lock.unlock();
        }
    }

    public final void e(int i, String str) {
        Lock lock = this.i;
        lock.lock();
        try {
            this.f161658a.put(str, new yj.d(i, this.f));
        } finally {
            lock.unlock();
        }
    }

    public final void f(long j2, String str) {
        Lock lock = this.i;
        lock.lock();
        try {
            this.f161658a.put(str, new yj.e(j2, this.f));
        } finally {
            lock.unlock();
        }
    }

    public final void g(String str, String str2) {
        if (str2 == null) {
            i(str);
            return;
        }
        Lock lock = this.i;
        lock.lock();
        try {
            this.f161658a.put(str, new yj.f(str2, this.f));
        } finally {
            lock.unlock();
        }
    }

    public final void h(String str, Set set) {
        if (set == null) {
            i(str);
            return;
        }
        Lock lock = this.i;
        lock.lock();
        try {
            this.f161658a.put(str, new yj.b(set, this.f));
        } finally {
            lock.unlock();
        }
    }

    public final void i(String str) {
        Lock lock = this.i;
        lock.lock();
        try {
            this.f161659b.add(str);
        } finally {
            lock.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        c(str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        d(f, str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        e(i, str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j2) {
        f(j2, str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        g(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        h(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        i(str);
        return this;
    }
}
