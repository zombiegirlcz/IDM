package i8;

import android.content.res.AssetManager;

/* JADX INFO: loaded from: classes.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager f159340b;

    public /* synthetic */ a(AssetManager assetManager, int i) {
        this.f159339a = i;
        this.f159340b = assetManager;
    }

    @Override // i8.v
    public final u a(b0 b0Var) {
        switch (this.f159339a) {
        }
        return new b(this.f159340b, this, 0);
    }
}
