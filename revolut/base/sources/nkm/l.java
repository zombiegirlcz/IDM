package nkm;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216853a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f216854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f216855c;

    public l(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f216855c = sequence;
        this.f216854b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f216853a) {
            case 0:
                return new k(this);
            default:
                return new g(this);
        }
    }

    public l(Function0 getInitialValue, Function1 getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f216855c = getInitialValue;
        this.f216854b = getNextValue;
    }
}
