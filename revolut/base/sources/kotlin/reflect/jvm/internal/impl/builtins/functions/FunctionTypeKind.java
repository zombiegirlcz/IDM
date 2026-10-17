package kotlin.reflect.jvm.internal.impl.builtins.functions;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FunctionTypeKind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqName f186480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186481b;

    public static final class Function extends FunctionTypeKind {

        @NotNull
        public static final Function INSTANCE = new Function(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function", false, null, true);
    }

    public static final class KFunction extends FunctionTypeKind {

        @NotNull
        public static final KFunction INSTANCE = new KFunction(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KFunction", true, null, false);
    }

    public static final class KSuspendFunction extends FunctionTypeKind {

        @NotNull
        public static final KSuspendFunction INSTANCE = new KSuspendFunction(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KSuspendFunction", true, null, false);
    }

    public static final class SuspendFunction extends FunctionTypeKind {

        @NotNull
        public static final SuspendFunction INSTANCE = new SuspendFunction(StandardNames.COROUTINES_PACKAGE_FQ_NAME, "SuspendFunction", false, null, true);
    }

    public FunctionTypeKind(@NotNull FqName packageFqName, @NotNull String classNamePrefix, boolean z, ClassId classId, boolean z3) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(classNamePrefix, "classNamePrefix");
        this.f186480a = packageFqName;
        this.f186481b = classNamePrefix;
    }

    @NotNull
    public final String getClassNamePrefix() {
        return this.f186481b;
    }

    @NotNull
    public final FqName getPackageFqName() {
        return this.f186480a;
    }

    @NotNull
    public final Name numberedClassName(int i) {
        Name nameIdentifier = Name.identifier(this.f186481b + i);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f186480a);
        sb6.append(CoreConstants.DOT);
        return j6.a.u(sb6, this.f186481b, 'N');
    }
}
