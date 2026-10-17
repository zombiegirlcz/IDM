package nkm;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final class r implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f216862b;

    public /* synthetic */ r(Object obj2, int i) {
        this.f216861a = i;
        this.f216862b = obj2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f216861a) {
            case 0:
                return (Iterator) this.f216862b;
            default:
                return new s(this.f216862b);
        }
    }
}
