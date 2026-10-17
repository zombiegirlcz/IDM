package wim;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1$Getter;

/* JADX INFO: loaded from: classes13.dex */
public interface p extends KProperty, Function1 {
    Object get(Object obj2);

    Object getDelegate(Object obj2);

    @Override // kotlin.reflect.KProperty
    KProperty1$Getter getGetter();
}
