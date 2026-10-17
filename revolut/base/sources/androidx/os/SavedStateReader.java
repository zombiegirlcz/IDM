package androidx.os;

import aim.f;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import nim.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010!J\u001d\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010!J3\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\b\b\u0000\u0010(*\u00020'2\u0006\u0010\b\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)¢\u0006\u0004\b+\u0010,J\u0015\u00101\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b/\u00100J\u0015\u00105\u001a\u0002022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b3\u00104J\u0015\u00109\u001a\u0002062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b7\u00108J\u0015\u0010=\u001a\u00020:2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b;\u0010<J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070>2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b?\u0010@J\u0019\u0010D\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bB\u0010CJ\u001d\u0010F\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bE\u0010CJ\r\u0010I\u001a\u00020\u0014¢\u0006\u0004\bG\u0010HJ\r\u0010L\u001a\u00020\t¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bM\u0010\u000bJ\u0018\u0010P\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\bO\u0010\u000bJ\u0019\u0010T\u001a\u00020\t2\n\u0010Q\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\bR\u0010SJ\r\u0010V\u001a\u00020\u0014¢\u0006\u0004\bU\u0010HJ\u001b\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010W¢\u0006\u0004\bX\u0010Y\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006["}, d2 = {"Landroidx/savedstate/SavedStateReader;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "constructor-impl", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "", "getBoolean-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "getBoolean", "getBooleanOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "getBooleanOrNull", "", "getFloat-impl", "(Landroid/os/Bundle;Ljava/lang/String;)F", "getFloat", "", "getInt-impl", "(Landroid/os/Bundle;Ljava/lang/String;)I", "getInt", "", "getLong-impl", "(Landroid/os/Bundle;Ljava/lang/String;)J", "getLong", "getString-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "getString", "", "getSavedStateList-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "getSavedStateList", "getStringList-impl", "getStringList", "getStringListOrNull-impl", "getStringListOrNull", "Landroid/os/Parcelable;", "T", "Lkotlin/reflect/KClass;", "parcelableClass", "getParcelableList-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/util/List;", "getParcelableList", "", "getBooleanArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "getBooleanArray", "", "getFloatArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "getFloatArray", "", "getIntArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "getIntArray", "", "getLongArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "getLongArray", "", "getStringArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "getStringArray", "getSavedState-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "getSavedState", "getSavedStateOrNull-impl", "getSavedStateOrNull", "size-impl", "(Landroid/os/Bundle;)I", "size", "isEmpty-impl", "(Landroid/os/Bundle;)Z", "isEmpty", "isNull-impl", "isNull", "contains-impl", "contains", "other", "contentDeepEquals-impl", "(Landroid/os/Bundle;Landroid/os/Bundle;)Z", "contentDeepEquals", "contentDeepHashCode-impl", "contentDeepHashCode", "", "toMap-impl", "(Landroid/os/Bundle;)Ljava/util/Map;", "toMap", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SavedStateReader {
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m3590constructorimpl(@NotNull Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3591containsimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.containsKey(key);
    }

    /* JADX INFO: renamed from: contentDeepEquals-impl, reason: not valid java name */
    public static final boolean m3592contentDeepEqualsimpl(Bundle bundle, @NotNull Bundle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Bundle.contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(bundle, other);
    }

    /* JADX INFO: renamed from: contentDeepHashCode-impl, reason: not valid java name */
    public static final int m3593contentDeepHashCodeimpl(Bundle bundle) {
        return Bundle.contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt(bundle);
    }

    /* JADX INFO: renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m3594getBooleanimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z = bundle.getBoolean(key, false);
        if (z || !bundle.getBoolean(key, true)) {
            return z;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: getBooleanArray-impl, reason: not valid java name */
    public static final boolean[] m3595getBooleanArrayimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray != null) {
            return booleanArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getBooleanOrNull-impl, reason: not valid java name */
    public static final Boolean m3596getBooleanOrNullimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z = bundle.getBoolean(key, false);
        if (z || !bundle.getBoolean(key, true)) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: getFloat-impl, reason: not valid java name */
    public static final float m3597getFloatimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float f = bundle.getFloat(key, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: getFloatArray-impl, reason: not valid java name */
    public static final float[] m3598getFloatArrayimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float[] floatArray = bundle.getFloatArray(key);
        if (floatArray != null) {
            return floatArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getInt-impl, reason: not valid java name */
    public static final int m3599getIntimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i = bundle.getInt(key, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: getIntArray-impl, reason: not valid java name */
    public static final int[] m3600getIntArrayimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getLong-impl, reason: not valid java name */
    public static final long m3601getLongimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long j2 = bundle.getLong(key, Long.MIN_VALUE);
        if (j2 != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: getLongArray-impl, reason: not valid java name */
    public static final long[] m3602getLongArrayimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long[] longArray = bundle.getLongArray(key);
        if (longArray != null) {
            return longArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m3603getParcelableListimpl(Bundle bundle, @NotNull String key, @NotNull KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(bundle, key, a.o(parcelableClass));
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m3604getSavedStateimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: getSavedStateList-impl, reason: not valid java name */
    public static final List<Bundle> m3605getSavedStateListimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return m3603getParcelableListimpl(bundle, key, o0.f186429a.b(Bundle.class));
    }

    /* JADX INFO: renamed from: getSavedStateOrNull-impl, reason: not valid java name */
    public static final Bundle m3606getSavedStateOrNullimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getBundle(key);
    }

    @NotNull
    /* JADX INFO: renamed from: getString-impl, reason: not valid java name */
    public static final String m3607getStringimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: getStringArray-impl, reason: not valid java name */
    public static final String[] m3608getStringArrayimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    @NotNull
    /* JADX INFO: renamed from: getStringList-impl, reason: not valid java name */
    public static final List<String> m3609getStringListimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getStringListOrNull-impl, reason: not valid java name */
    public static final List<String> m3610getStringListOrNullimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getStringArrayList(key);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3611isEmptyimpl(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* JADX INFO: renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m3612isNullimpl(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return m3591containsimpl(bundle, key) && bundle.get(key) == null;
    }

    /* JADX INFO: renamed from: size-impl, reason: not valid java name */
    public static final int m3613sizeimpl(Bundle bundle) {
        return bundle.size();
    }

    @NotNull
    /* JADX INFO: renamed from: toMap-impl, reason: not valid java name */
    public static final Map<String, Object> m3614toMapimpl(Bundle bundle) {
        f builder = new f(bundle.size());
        for (String str : bundle.keySet()) {
            Intrinsics.h(str);
            builder.put(str, bundle.get(str));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }
}
