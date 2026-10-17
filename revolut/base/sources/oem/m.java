package oem;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes23.dex */
public interface m {

    @NotNull
    public static final l Companion = l.f224672a;

    boolean a();

    List b(String str);

    default void c(Function2 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        for (Map.Entry entry : entries()) {
            body.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    Set entries();

    default String get(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List listB = b(name);
        if (listB != null) {
            return (String) d0.d0(listB);
        }
        return null;
    }

    boolean isEmpty();
}
