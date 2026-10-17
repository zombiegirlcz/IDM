package kotlin.collections;

import java.util.ArrayList;
import java.util.RandomAccess;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends a implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f186396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f186397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f186398c;

    public e(ArrayList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f186396a = list;
    }

    @Override // kotlin.collections.a, java.util.List
    public final Object get(int i) {
        a.Companion companion = a.INSTANCE;
        int i2 = this.f186398c;
        companion.getClass();
        a.Companion.b(i, i2);
        return this.f186396a.get(this.f186397b + i);
    }

    @Override // zhm.a
    public final int getSize() {
        return this.f186398c;
    }
}
