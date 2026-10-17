package nkm;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final class j implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Sequence f216847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f216848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f216849c;

    public j(Sequence sequence, Function1 transformer, Function1 iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f216847a = sequence;
        this.f216848b = transformer;
        this.f216849c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new i(this);
    }
}
