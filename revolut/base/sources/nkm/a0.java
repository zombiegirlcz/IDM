package nkm;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final class a0 implements Sequence, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f216820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f216821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f216822c;

    public a0(Sequence sequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f216820a = sequence;
        this.f216821b = i;
        this.f216822c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(a0.d.n("startIndex should be non-negative, but is ", i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(a0.d.n("endIndex should be non-negative, but is ", i2).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a0.d.g(i2, i, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // nkm.e
    public final Sequence a(int i) {
        int i2 = this.f216822c;
        int i3 = this.f216821b;
        return i >= i2 - i3 ? f.f216837a : new a0(this.f216820a, i3 + i, i2);
    }

    @Override // nkm.e
    public final Sequence b(int i) {
        int i2 = this.f216822c;
        int i3 = this.f216821b;
        return i >= i2 - i3 ? this : new a0(this.f216820a, i3, i + i3);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new z(this);
    }
}
