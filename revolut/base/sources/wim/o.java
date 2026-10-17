package wim;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes13.dex */
public interface o extends KProperty, Function0 {
    Object get();

    Object getDelegate();

    @Override // kotlin.reflect.KProperty
    kotlin.reflect.a getGetter();
}
