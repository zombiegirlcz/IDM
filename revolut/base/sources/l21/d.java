package l21;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.prefs.base.StorageExtensionsKt$MUTABLE_MAP_TYPE_REFERENCE$1;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StorageExtensionsKt$MUTABLE_MAP_TYPE_REFERENCE$1 f191610a = new TypeToken<Map<String, Long>>() { // from class: com.revolut.data.prefs.base.StorageExtensionsKt$MUTABLE_MAP_TYPE_REFERENCE$1
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f191611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f191612c;
    public static final Type d;
    public static final Type e;
    public static final Type f;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.data.prefs.base.StorageExtensionsKt$MUTABLE_MAP_TYPE_REFERENCE$1] */
    static {
        new TypeToken<String>() { // from class: com.revolut.data.prefs.base.StorageExtensionsKt$STRING_TYPE_REFERENCE$1
        };
        new TypeToken<Boolean>() { // from class: com.revolut.data.prefs.base.StorageExtensionsKt$BOOLEAN_TYPE_REFERENCE$1
        };
        new TypeToken<Long>() { // from class: com.revolut.data.prefs.base.StorageExtensionsKt$LONG_TYPE_REFERENCE$1
        };
        f191611b = new TypeToken<Set<? extends String>>() { // from class: com.revolut.data.prefs.base.StorageExtensionsKt$SET_OF_STRINGS_TYPE$1
        }.getType();
        f191612c = new TypeToken<List<? extends String>>() { // from class: com.revolut.data.prefs.base.StorageExtensionsKt$LIST_OF_STRINGS_TYPE$1
        }.getType();
        Type type = new TypeToken<String>() { // from class: com.revolut.data.prefs.base.StorageExtensionsKt$STRING_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        d = type;
        e = new TypeToken<Boolean>() { // from class: com.revolut.data.prefs.base.StorageExtensionsKt$BOOLEAN_TYPE$1
        }.getType();
        f = new TypeToken<Long>() { // from class: com.revolut.data.prefs.base.StorageExtensionsKt$LONG_TYPE$1
        }.getType();
        new TypeToken<Map<String, ? extends Boolean>>() { // from class: com.revolut.data.prefs.base.StorageExtensionsKt$MAP_STRING_BOOLEAN_TYPE$1
        }.getType();
    }
}
