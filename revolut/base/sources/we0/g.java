package we0;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f296612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f296613c;

    public /* synthetic */ g(int i, int i2, int i3) {
        this.f296611a = i3;
        this.f296612b = i;
        this.f296613c = i2;
    }

    public int a() {
        switch (this.f296611a) {
        }
        return this.f296613c;
    }

    public int b() {
        switch (this.f296611a) {
        }
        return this.f296612b;
    }

    public abstract void c(SharedPreferences sharedPreferences, je0.d dVar);
}
