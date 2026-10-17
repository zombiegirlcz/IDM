package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final class c0 implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f187901b;

    public /* synthetic */ c0(int i, CharSequence charSequence) {
        this.f187900a = i;
        this.f187901b = charSequence;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f187900a) {
            case 0:
                return new l(this.f187901b);
            default:
                CharSequence charSequence = this.f187901b;
                Intrinsics.checkNotNullParameter(charSequence, "<this>");
                return new b0(charSequence);
        }
    }
}
