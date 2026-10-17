package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import zhm.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class MemberScopeKt {
    public static final Set<Name> flatMapClassifierNamesOrNull(@NotNull Iterable<? extends MemberScope> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends MemberScope> it8 = iterable.iterator();
        while (it8.hasNext()) {
            Set<Name> classifierNames = it8.next().getClassifierNames();
            if (classifierNames == null) {
                return null;
            }
            a0.x(classifierNames, hashSet);
        }
        return hashSet;
    }
}
