package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class CompanionObjectMapping {

    @NotNull
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f186462a;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator<T> it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(StandardNames.getPrimitiveFqName((PrimitiveType) it8.next()));
        }
        ArrayList arrayListF0 = d0.F0(StandardNames.FqNames._enum.toSafe(), d0.F0(StandardNames.FqNames._boolean.toSafe(), d0.F0(StandardNames.FqNames.string.toSafe(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it9 = arrayListF0.iterator();
        while (it9.hasNext()) {
            linkedHashSet.add(companion.topLevel((FqName) it9.next()));
        }
        f186462a = linkedHashSet;
    }

    @NotNull
    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        return f186462a;
    }

    @NotNull
    public final Set<ClassId> getClassIds() {
        return f186462a;
    }
}
