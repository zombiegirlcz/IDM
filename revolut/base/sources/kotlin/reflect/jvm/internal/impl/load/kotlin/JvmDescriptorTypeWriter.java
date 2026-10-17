package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public class JvmDescriptorTypeWriter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f187085b;

    public final void a(Object type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.f187085b == null) {
            int i = this.f187084a;
            if (i <= 0) {
                this.f187085b = type;
            } else {
                a0.C("[", i);
                throw null;
            }
        }
    }

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.f187085b == null) {
            this.f187084a++;
        }
    }

    public void writeClass(@NotNull T objectType) {
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        a(objectType);
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        a(type);
    }
}
