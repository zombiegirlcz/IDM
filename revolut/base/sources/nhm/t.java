package nhm;

import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes13.dex */
public interface t extends mhm.e {
    default boolean J0() {
        return false;
    }

    default boolean R0() {
        return false;
    }

    default String V5(String str) {
        StringBuilder sb6 = new StringBuilder((CharSequence) str);
        iterator().map(new com.google.android.material.color.utilities.f(9)).J8(", ").forEach(new f5l.g(sb6, 1));
        sb6.append((CharSequence) ")");
        return sb6.toString();
    }

    int length();

    @Override // mhm.e, java.lang.Iterable
    default Spliterator spliterator() {
        int i = J0() ? 1025 : 1024;
        if (R0()) {
            i |= 16;
        }
        if (z()) {
            return Spliterators.spliterator(iterator(), length(), i | 16448);
        }
        return Spliterators.spliteratorUnknownSize(iterator(), i);
    }

    boolean z();
}
