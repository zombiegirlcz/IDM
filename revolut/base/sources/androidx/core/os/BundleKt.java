package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\b"}, d2 = {"bundleOf", "Landroid/os/Bundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class BundleKt {
    @NotNull
    public static final Bundle bundleOf(@NotNull Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = (String) pair.f186385a;
            Object obj2 = pair.f186386b;
            if (obj2 == null) {
                bundle.putString(str, null);
            } else if (obj2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj2).booleanValue());
            } else if (obj2 instanceof Byte) {
                bundle.putByte(str, ((Number) obj2).byteValue());
            } else if (obj2 instanceof Character) {
                bundle.putChar(str, ((Character) obj2).charValue());
            } else if (obj2 instanceof Double) {
                bundle.putDouble(str, ((Number) obj2).doubleValue());
            } else if (obj2 instanceof Float) {
                bundle.putFloat(str, ((Number) obj2).floatValue());
            } else if (obj2 instanceof Integer) {
                bundle.putInt(str, ((Number) obj2).intValue());
            } else if (obj2 instanceof Long) {
                bundle.putLong(str, ((Number) obj2).longValue());
            } else if (obj2 instanceof Short) {
                bundle.putShort(str, ((Number) obj2).shortValue());
            } else if (obj2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj2);
            } else if (obj2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj2);
            } else if (obj2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj2);
            } else if (obj2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj2);
            } else if (obj2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj2);
            } else if (obj2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj2);
            } else if (obj2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj2);
            } else if (obj2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj2);
            } else if (obj2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj2);
            } else if (obj2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj2);
            } else if (obj2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj2);
            } else if (obj2 instanceof Object[]) {
                Class<?> componentType = obj2.getClass().getComponentType();
                Intrinsics.h(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj2);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
                    }
                    bundle.putSerializable(str, (Serializable) obj2);
                }
            } else if (obj2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj2);
            } else if (obj2 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj2);
            } else if (obj2 instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, str, (Size) obj2);
            } else {
                if (!(obj2 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj2.getClass().getCanonicalName() + " for key \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR);
                }
                BundleApi21ImplKt.putSizeF(bundle, str, (SizeF) obj2);
            }
        }
        return bundle;
    }

    @NotNull
    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
