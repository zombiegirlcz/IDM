package com.onfido.android.sdk.capture.utils;

import a10.b;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u0000¢\u0006\u0002\u0010\u0006\u001a\u001e\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\"\u0004\b\u0000\u0010\u0003H\u0000\u001a'\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u0002H\u0003H\u0002¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"bundleArgument", "Lkotlin/properties/ReadWriteProperty;", "Landroid/os/Bundle;", "T", "", "defaultValue", "(Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "bundleArgumentNullable", "put", "", "key", "", "value", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BundleArgumentDelegateKt {
    @NotNull
    public static final <T> ReadWriteProperty bundleArgument(@NotNull T defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return new BundleArgumentDelegate(defaultValue);
    }

    @NotNull
    public static final <T> ReadWriteProperty bundleArgumentNullable() {
        return new BundleArgumentDelegateNullable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void put(Bundle bundle, String str, T t2) {
        if (t2 instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) t2).booleanValue());
            return;
        }
        if (t2 instanceof Byte) {
            bundle.putByte(str, ((Number) t2).byteValue());
            return;
        }
        if (t2 instanceof Character) {
            bundle.putChar(str, ((Character) t2).charValue());
            return;
        }
        if (t2 instanceof Short) {
            bundle.putShort(str, ((Number) t2).shortValue());
            return;
        }
        if (t2 instanceof Double) {
            bundle.putDouble(str, ((Number) t2).doubleValue());
            return;
        }
        if (t2 instanceof Float) {
            bundle.putFloat(str, ((Number) t2).floatValue());
            return;
        }
        if (t2 instanceof Integer) {
            bundle.putInt(str, ((Number) t2).intValue());
            return;
        }
        if (t2 instanceof Long) {
            bundle.putLong(str, ((Number) t2).longValue());
            return;
        }
        if (t2 instanceof Bundle) {
            bundle.putBundle(str, (Bundle) t2);
            return;
        }
        if (t2 instanceof String) {
            bundle.putString(str, (String) t2);
            return;
        }
        if (t2 instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) t2);
            return;
        }
        if (t2 instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) t2);
            return;
        }
        if (t2 instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) t2);
            return;
        }
        if (t2 instanceof char[]) {
            bundle.putCharArray(str, (char[]) t2);
            return;
        }
        if (t2 instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) t2);
            return;
        }
        if (t2 instanceof float[]) {
            bundle.putFloatArray(str, (float[]) t2);
            return;
        }
        if (t2 instanceof int[]) {
            bundle.putIntArray(str, (int[]) t2);
            return;
        }
        if (t2 instanceof long[]) {
            bundle.putLongArray(str, (long[]) t2);
            return;
        }
        if (t2 instanceof short[]) {
            bundle.putShortArray(str, (short[]) t2);
        } else if (t2 instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) t2);
        } else {
            if (!(t2 instanceof Parcelable)) {
                throw new IllegalStateException(b.s("Type of property ", str, " is not supported"));
            }
            bundle.putParcelable(str, (Parcelable) t2);
        }
    }
}
