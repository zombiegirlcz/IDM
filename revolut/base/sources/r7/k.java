package r7;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class k extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251965a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f251965a) {
            case 0:
                return new PathMeasure();
            case 1:
                return new Path();
            case 2:
                return new Path();
            default:
                return new float[4];
        }
    }
}
