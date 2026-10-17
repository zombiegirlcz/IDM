package omm;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f226859a;

    static {
        ArrayList arrayList = new ArrayList();
        boolean z = arrayList instanceof c;
        Object obj2 = arrayList;
        if (!z) {
            pmm.a aVar = new pmm.a();
            aVar.f237648a = arrayList;
            obj2 = aVar;
        }
        f226859a = obj2;
    }
}
