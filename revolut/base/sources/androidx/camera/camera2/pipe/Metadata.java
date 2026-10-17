package androidx.camera.camera2.pipe;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0001\nJ$\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H¦\u0002¢\u0006\u0002\u0010\u0006J)\u0010\u0007\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\b\u001a\u0002H\u0003H&¢\u0006\u0002\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/Metadata;", "", "get", "T", "key", "Landroidx/camera/camera2/pipe/Metadata$Key;", "(Landroidx/camera/camera2/pipe/Metadata$Key;)Ljava/lang/Object;", "getOrDefault", "default", "(Landroidx/camera/camera2/pipe/Metadata$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Key", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Metadata {

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\nB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/camera/camera2/pipe/Metadata$Key;", "T", "", "name", "", "type", "Lkotlin/reflect/KClass;", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;)V", "toString", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Key<T> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Map<String, Key<?>> keys = new HashMap();

        @NotNull
        private final String name;

        @NotNull
        private final KClass type;

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR0\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/Metadata$Key$Companion;", "", "<init>", "()V", "T", "", "name", "Lkotlin/reflect/KClass;", "type", "Landroidx/camera/camera2/pipe/Metadata$Key;", "create", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Landroidx/camera/camera2/pipe/Metadata$Key;", "", "keys", "Ljava/util/Map;", "getKeys$camera_camera2_pipe", "()Ljava/util/Map;", "getKeys$camera_camera2_pipe$annotations", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final <T> Key<T> create(@NotNull String name, @NotNull KClass type) {
                Key<T> key;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                synchronized (getKeys$camera_camera2_pipe()) {
                    try {
                        Map<String, Key<?>> keys$camera_camera2_pipe = Key.INSTANCE.getKeys$camera_camera2_pipe();
                        Object key2 = keys$camera_camera2_pipe.get(name);
                        if (key2 == null) {
                            key2 = new Key(name, type, null);
                            keys$camera_camera2_pipe.put(name, key2);
                        }
                        key = (Key) key2;
                        if (!Intrinsics.f(((Key) key).type, type)) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return key;
            }

            @NotNull
            public final Map<String, Key<?>> getKeys$camera_camera2_pipe() {
                return Key.keys;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Key(String str, KClass kClass, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, kClass);
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("Metadata.Key("), this.name, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        private Key(String str, KClass kClass) {
            this.name = str;
            this.type = kClass;
        }
    }

    <T> T get(@NotNull Key<T> key);

    <T> T getOrDefault(@NotNull Key<T> key, T t2);
}
