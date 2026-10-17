package fkm;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes13.dex */
public class e extends kotlin.reflect.jvm.internal.impl.storage.d implements CacheWithNullableValues {
    public e(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
        super(lockBasedStorageManager, concurrentHashMap, new d());
    }
}
