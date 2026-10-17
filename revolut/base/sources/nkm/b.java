package nkm;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends zhm.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f216823c;
    public final Function1 d;
    public final HashSet e;

    public b(Iterator source, Function1 keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f216823c = source;
        this.d = keySelector;
        this.e = new HashSet();
    }

    @Override // zhm.b
    public final void a() {
        Object next;
        do {
            Iterator it8 = this.f216823c;
            if (!it8.hasNext()) {
                this.f322461a = 2;
                return;
            } else {
                next = it8.next();
            }
        } while (!this.e.add(this.d.invoke(next)));
        this.f322462b = next;
        this.f322461a = 1;
    }
}
