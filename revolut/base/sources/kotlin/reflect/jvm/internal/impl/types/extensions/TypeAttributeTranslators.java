package kotlin.reflect.jvm.internal.impl.types.extensions;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class TypeAttributeTranslators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f187850a;

    public TypeAttributeTranslators(@NotNull List<? extends TypeAttributeTranslator> translators) {
        Intrinsics.checkNotNullParameter(translators, "translators");
        this.f187850a = translators;
    }

    @NotNull
    public final List<TypeAttributeTranslator> getTranslators() {
        return this.f187850a;
    }
}
