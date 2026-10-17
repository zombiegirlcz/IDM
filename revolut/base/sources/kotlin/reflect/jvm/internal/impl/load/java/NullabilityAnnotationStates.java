package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public interface NullabilityAnnotationStates<T> {

    @NotNull
    public static final Companion Companion = Companion.f186900a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f186900a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final NullabilityAnnotationStatesImpl f186901b = new NullabilityAnnotationStatesImpl(r0.g());

        @NotNull
        public final NullabilityAnnotationStates getEMPTY() {
            return f186901b;
        }
    }

    T get(@NotNull FqName fqName);
}
