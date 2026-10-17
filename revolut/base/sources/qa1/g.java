package qa1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f243937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f243938c;

    public g(String hash, ArrayList filesData) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(filesData, "filesData");
        this.f243936a = hash;
        this.f243937b = filesData;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = filesData.iterator();
        while (it8.hasNext()) {
            a0.x(((h) it8.next()).e, arrayList);
        }
        this.f243938c = arrayList.size();
    }
}
