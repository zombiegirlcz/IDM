package mj;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class b implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij.a f205893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences.OnSharedPreferenceChangeListener f205894b;

    public b(ij.a aVar, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f205893a = aVar;
        this.f205894b = onSharedPreferenceChangeListener;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || b.class != obj2.getClass()) {
            return false;
        }
        b bVar = (b) obj2;
        ij.a aVar = bVar.f205893a;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = bVar.f205894b;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = this.f205894b;
        if (onSharedPreferenceChangeListener2 != null) {
            if (!onSharedPreferenceChangeListener2.equals(onSharedPreferenceChangeListener)) {
                return false;
            }
        } else if (onSharedPreferenceChangeListener != null) {
            return false;
        }
        return this.f205893a.equals(aVar);
    }

    public final int hashCode() {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.f205894b;
        return this.f205893a.hashCode() + ((onSharedPreferenceChangeListener != null ? onSharedPreferenceChangeListener.hashCode() : 0) * 31);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f205894b.onSharedPreferenceChanged(this.f205893a, str);
    }
}
