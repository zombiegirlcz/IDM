package l7l;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements IntPredicate {
    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        return Character.isLetterOrDigit(i);
    }
}
