package ij;

import android.content.SharedPreferences;
import ao.h;
import com.google.firebase.messaging.t;
import cpi.g;
import ecm.q;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f161643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f161644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f161645c;
    public final com.bumptech.glide.g d;
    public final gpk.c e;
    public final ie.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lock f161646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lock f161647h;
    public final nj.a i;

    public a(t tVar, g gVar, q qVar, com.bumptech.glide.g gVar2, gpk.c cVar, ie.a aVar, h hVar, nj.a aVar2) {
        this.f161643a = tVar;
        this.f161644b = gVar;
        this.f161645c = qVar;
        this.d = gVar2;
        this.e = cVar;
        this.f = aVar;
        ReadWriteLock readWriteLock = (ReadWriteLock) hVar.f7847b;
        this.f161646g = readWriteLock.readLock();
        this.f161647h = readWriteLock.writeLock();
        this.i = aVar2;
    }

    @Override // android.content.SharedPreferences
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e edit() {
        Lock lock = this.f161646g;
        lock.lock();
        try {
            return new e(this.f161643a, this.f161644b, this.e, this.f, this.d, this.f161645c, this.f161647h);
        } finally {
            lock.unlock();
        }
    }

    public final Set b() {
        Lock lock = this.f161646g;
        lock.lock();
        try {
            return Collections.unmodifiableSet((Set) this.f161645c.f124861b);
        } finally {
            lock.unlock();
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.i.contains(str);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.i.getAll();
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((Boolean) this.i.k(Boolean.valueOf(z), str)).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return ((Float) this.i.k(Float.valueOf(f), str)).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return ((Integer) this.i.k(Integer.valueOf(i), str)).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j2) {
        return ((Long) this.i.k(Long.valueOf(j2), str)).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) this.i.k(str2, str);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) this.i.k(set, str);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Lock lock = this.f161647h;
        lock.lock();
        try {
            ((List) this.f161644b.f107954b).add(new mj.b(this, onSharedPreferenceChangeListener));
        } finally {
            lock.unlock();
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Lock lock = this.f161647h;
        lock.lock();
        try {
            ((List) this.f161644b.f107954b).remove(new mj.b(this, onSharedPreferenceChangeListener));
        } finally {
            lock.unlock();
        }
    }
}
