package androidx.compose.runtime;

import java.util.Comparator;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return ComposerImplKt.InvalidationLocationAscending$lambda$0((Invalidation) obj2, (Invalidation) obj3);
    }
}
