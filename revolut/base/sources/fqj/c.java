package fqj;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f137268b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f137267a = i;
        this.f137268b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [ifm.c, java.lang.Object] */
    @Override // ifm.c
    public final void dispose() {
        switch (this.f137267a) {
            case 0:
                Collection collectionValues = ((h) this.f137268b).e.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                Iterator it8 = collectionValues.iterator();
                while (it8.hasNext()) {
                    ((ifm.c) it8.next()).dispose();
                }
                break;
            default:
                ((gif.h) this.f137268b).i.dispose();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [ifm.c, java.lang.Object] */
    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f137267a) {
            case 0:
                Collection collectionValues = ((h) this.f137268b).e.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                Collection collection = collectionValues;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator it8 = collection.iterator();
                while (it8.hasNext()) {
                    if (!((ifm.c) it8.next()).isDisposed()) {
                        return false;
                    }
                }
                return true;
            default:
                return ((gif.h) this.f137268b).i.isDisposed();
        }
    }
}
