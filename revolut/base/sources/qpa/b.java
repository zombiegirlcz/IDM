package qpa;

import ihm.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f248320a = p.a.h("toSerialized(...)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f248321b = new ArrayList();

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f248320a.onNext(message);
        ArrayList arrayList = this.f248321b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            if (((hpa.a) it8.next()).b(message)) {
                return true;
            }
        }
        return false;
    }
}
