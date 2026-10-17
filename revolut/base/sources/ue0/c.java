package ue0;

import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public interface c extends od0.e {
    default Flow C0(String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        throw new UnsupportedOperationException();
    }

    void G(Object obj2, String str, Type type);

    boolean I0(String str);

    Object T2(String str, Type type);

    Set keys();

    Object v0(Object obj2, String str, Type type);
}
