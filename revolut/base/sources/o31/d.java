package o31;

import android.content.Context;
import android.util.SparseIntArray;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f221678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseIntArray f221679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f221680c;
    public final SparseIntArray d;
    public final SparseIntArray e;
    public final Lazy f;

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f221678a = context;
        this.f221679b = new SparseIntArray();
        this.f221680c = new SparseIntArray();
        this.d = new SparseIntArray();
        this.e = new SparseIntArray();
        this.f = j.b(new o23.b(5));
    }

    public final int a(int i) {
        SparseIntArray sparseIntArray = this.d;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        int iW = kli.a.w(i, this.f221678a);
        sparseIntArray.put(i, iW);
        return iW;
    }
}
