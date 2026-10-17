package nkm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216827a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sequence f216828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f216829c;

    public c(Sequence sequence, Function2 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f216828b = sequence;
        this.f216829c = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f216827a) {
            case 0:
                return new b(this.f216828b.iterator(), (Function1) this.f216829c);
            case 1:
                ArrayList arrayListK = y.K(this.f216828b);
                zhm.z.w(arrayListK, (Comparator) this.f216829c);
                return arrayListK.iterator();
            default:
                return new z(this);
        }
    }

    public c(Sequence source, Function1 keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f216828b = source;
        this.f216829c = keySelector;
    }

    public c(Sequence sequence, Comparator comparator) {
        this.f216828b = sequence;
        this.f216829c = comparator;
    }
}
