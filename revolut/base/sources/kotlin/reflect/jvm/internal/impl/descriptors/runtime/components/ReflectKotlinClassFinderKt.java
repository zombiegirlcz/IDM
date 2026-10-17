package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import ch.qos.logback.core.CoreConstants;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class ReflectKotlinClassFinderKt {
    public static final String access$toRuntimeFqName(ClassId classId) {
        String strE = a0.E(classId.getRelativeClassName().asString(), CoreConstants.DOT, CoreConstants.DOLLAR);
        if (classId.getPackageFqName().isRoot()) {
            return strE;
        }
        return classId.getPackageFqName() + CoreConstants.DOT + strE;
    }
}
