package kotlinx.serialization.descriptors;

import com.bumptech.glide.d;
import java.util.List;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public interface SerialDescriptor {
    SerialDescriptor b(int i);

    int c();

    String d(int i);

    String e();

    default boolean f() {
        return false;
    }

    int g(String str);

    default List getAnnotations() {
        return f0.f322471a;
    }

    d getKind();

    List h(int i);

    boolean i(int i);

    default boolean isInline() {
        return false;
    }
}
