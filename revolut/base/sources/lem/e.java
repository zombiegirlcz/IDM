package lem;

import com.google.android.material.internal.ViewUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.p;

/* JADX INFO: loaded from: classes23.dex */
public final class e extends xem.b {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i2) {
        super(i);
        this.f = i2;
    }

    @Override // xem.b
    public Object d(Object obj2) {
        switch (this.f) {
            case 0:
                c instance = (c) obj2;
                Intrinsics.checkNotNullParameter(instance, "instance");
                ArrayList arrayList = instance.f194598a;
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    f.f194602a.d5((int[]) it8.next());
                }
                arrayList.clear();
                Intrinsics.checkNotNullParameter(instance, "instance");
                return instance;
            case 1:
                int[] instance2 = (int[]) obj2;
                Intrinsics.checkNotNullParameter(instance2, "instance");
                p.q(-1, instance2);
                Intrinsics.checkNotNullParameter(instance2, "instance");
                return instance2;
            default:
                super.d(obj2);
                return obj2;
        }
    }

    @Override // xem.b
    public final Object f() {
        switch (this.f) {
            case 0:
                c cVar = new c();
                cVar.f194598a = new ArrayList();
                return cVar;
            case 1:
                int[] iArr = new int[ViewUtils.EDGE_TO_EDGE_FLAGS];
                for (int i = 0; i < 768; i++) {
                    iArr[i] = -1;
                }
                return iArr;
            case 2:
                return new char[2048];
            default:
                return new byte[4096];
        }
    }
}
