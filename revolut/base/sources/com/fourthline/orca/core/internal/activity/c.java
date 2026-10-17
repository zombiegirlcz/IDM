package com.fourthline.orca.core.internal.activity;

import java.util.Iterator;
import java.util.List;
import kem.k0;
import kem.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oem.o;
import ydm.k;
import zdm.e;
import zhm.d0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26656b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f26655a = i;
        this.f26656b = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f26655a;
        Object obj4 = this.f26656b;
        switch (i) {
            case 0:
                break;
            case 1:
                String key = (String) obj2;
                List values = (List) obj3;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(values, "values");
                ((k0) obj4).i.c(values, key);
                break;
            case 2:
                String name = (String) obj2;
                List values2 = (List) obj3;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(values2, "values");
                ((o) obj4).c(values2, name);
                break;
            default:
                Function2 function2 = (Function2) obj4;
                String key2 = (String) obj2;
                List values3 = (List) obj3;
                Intrinsics.checkNotNullParameter(key2, "key");
                Intrinsics.checkNotNullParameter(values3, "values");
                List list = u.f183239a;
                if (!"Content-Length".equals(key2) && !"Content-Type".equals(key2)) {
                    if (k.f312726a.contains(key2)) {
                        Iterator it8 = values3.iterator();
                        while (it8.hasNext()) {
                            ((e) function2).invoke(key2, (String) it8.next());
                        }
                    } else {
                        ((e) function2).invoke(key2, d0.k0(values3, "Cookie".equals(key2) ? "; " : ",", null, null, 0, null, 62));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
