package com.fourthline.orca.internal;

import androidx.lifecycle.ViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vj0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f34370a = new LinkedHashMap();

    public final Object a(String key, Function0 create) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(create, "create");
        Map map = this.f34370a;
        Object objInvoke = map.get(key);
        if (objInvoke == null) {
            objInvoke = create.invoke();
            map.put(key, objInvoke);
        }
        Intrinsics.i(objInvoke, "null cannot be cast to non-null type T of com.fourthline.orca.core.internal.viewmodel.PersistentStorage.getOrCreate");
        return objInvoke;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        Iterator it8 = this.f34370a.entrySet().iterator();
        while (it8.hasNext()) {
            ((Map.Entry) it8.next()).getValue();
        }
        this.f34370a.clear();
    }
}
