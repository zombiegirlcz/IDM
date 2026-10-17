package nkm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.q implements Function1 {
    public static final w f = new w();

    public w() {
        super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Sequence p0 = (Sequence) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.iterator();
    }
}
