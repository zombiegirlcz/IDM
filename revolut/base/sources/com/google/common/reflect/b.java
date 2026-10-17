package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.reflect.MutableTypeToInstanceMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements Function {
    @Override // com.google.common.base.Function
    public final Object apply(Object obj2) {
        return MutableTypeToInstanceMap.UnmodifiableEntry.d((Map.Entry) obj2);
    }
}
