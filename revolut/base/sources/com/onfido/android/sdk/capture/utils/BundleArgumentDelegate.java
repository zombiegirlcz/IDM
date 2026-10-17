package com.onfido.android.sdk.capture.utils;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J$\u0010\b\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0096\u0002¢\u0006\u0002\u0010\fJ,\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0010\u0010\u0005\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/BundleArgumentDelegate;", "T", "", "Lkotlin/properties/ReadWriteProperty;", "Landroid/os/Bundle;", "defaultValue", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Landroid/os/Bundle;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Landroid/os/Bundle;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BundleArgumentDelegate<T> implements ReadWriteProperty {

    @NotNull
    private final T defaultValue;

    public BundleArgumentDelegate(@NotNull T defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.defaultValue = defaultValue;
    }

    @Override // sim.d
    @NotNull
    public T getValue(Bundle thisRef, @NotNull KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        T t2 = null;
        Object obj2 = thisRef != null ? thisRef.get(property.getName()) : null;
        if (obj2 != null) {
            t2 = (T) obj2;
        }
        return t2 == null ? this.defaultValue : t2;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Bundle thisRef, @NotNull KProperty property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        if (thisRef != null) {
            BundleArgumentDelegateKt.put(thisRef, property.getName(), value);
        }
    }
}
