package mmm;

import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class f0 extends kotlin.collections.a implements RandomAccess {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m[] f207263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f207264b;

    public f0(m[] mVarArr, int[] iArr) {
        this.f207263a = mVarArr;
        this.f207264b = iArr;
    }

    @Override // zhm.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj2) {
        if (obj2 instanceof m) {
            return super.contains((m) obj2);
        }
        return false;
    }

    @Override // kotlin.collections.a, java.util.List
    public final Object get(int i) {
        return this.f207263a[i];
    }

    @Override // zhm.a
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f207263a.length;
    }

    @Override // kotlin.collections.a, java.util.List
    public final /* bridge */ int indexOf(Object obj2) {
        if (obj2 instanceof m) {
            return super.indexOf((m) obj2);
        }
        return -1;
    }

    @Override // kotlin.collections.a, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj2) {
        if (obj2 instanceof m) {
            return super.lastIndexOf((m) obj2);
        }
        return -1;
    }
}
