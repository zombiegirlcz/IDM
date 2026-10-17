package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends a implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f186393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f186394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f186395c;

    public c(a list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f186393a = list;
        this.f186394b = i;
        a.Companion companion = a.INSTANCE;
        int size = list.size();
        companion.getClass();
        a.Companion.d(i, i2, size);
        this.f186395c = i2 - i;
    }

    @Override // kotlin.collections.a, java.util.List
    public final Object get(int i) {
        a.INSTANCE.getClass();
        a.Companion.b(i, this.f186395c);
        return this.f186393a.get(this.f186394b + i);
    }

    @Override // zhm.a
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f186395c;
    }

    @Override // kotlin.collections.a, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public final List subList(int i, int i2) {
        a.INSTANCE.getClass();
        a.Companion.d(i, i2, this.f186395c);
        int i3 = this.f186394b;
        return new c(this.f186393a, i + i3, i3 + i2);
    }
}
