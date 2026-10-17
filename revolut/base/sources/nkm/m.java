package nkm;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final class m implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sequence f216857b;

    public m(Sequence sequence, int i) {
        this.f216856a = i;
        switch (i) {
            case 1:
                this.f216857b = sequence;
                break;
            default:
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                this.f216857b = sequence;
                break;
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f216856a) {
            case 0:
                return new d(this);
            default:
                ArrayList arrayListK = y.K(this.f216857b);
                zhm.z.v(arrayListK);
                return arrayListK.iterator();
        }
    }
}
