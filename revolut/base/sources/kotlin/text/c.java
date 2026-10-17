package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f187897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f187898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f187899c;

    public c(CharSequence input, int i, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f187897a = input;
        this.f187898b = i;
        this.f187899c = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
