package nkm;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final class b0 implements Sequence, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sequence f216825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f216826c;

    public b0(Sequence sequence, int i, int i2) {
        this.f216824a = i2;
        switch (i2) {
            case 1:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                this.f216825b = sequence;
                this.f216826c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(p.a.k(CoreConstants.DOT, "count must be non-negative, but was ", i).toString());
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                this.f216825b = sequence;
                this.f216826c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(p.a.k(CoreConstants.DOT, "count must be non-negative, but was ", i).toString());
                }
                return;
        }
    }

    @Override // nkm.e
    public final Sequence a(int i) {
        switch (this.f216824a) {
            case 0:
                int i2 = this.f216826c;
                return i >= i2 ? f.f216837a : new a0(this.f216825b, i, i2);
            default:
                int i3 = this.f216826c + i;
                return i3 < 0 ? new b0(this, i, 1) : new b0(this.f216825b, i3, 1);
        }
    }

    @Override // nkm.e
    public final Sequence b(int i) {
        switch (this.f216824a) {
            case 0:
                return i >= this.f216826c ? this : new b0(this.f216825b, i, 0);
            default:
                int i2 = this.f216826c;
                int i3 = i2 + i;
                return i3 < 0 ? new b0(this, i, 0) : new a0(this.f216825b, i2, i3);
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f216824a) {
            case 0:
                return new d(this);
            default:
                return new d(this, (byte) 0);
        }
    }
}
