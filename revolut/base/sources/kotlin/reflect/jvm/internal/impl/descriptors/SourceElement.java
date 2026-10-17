package kotlin.reflect.jvm.internal.impl.descriptors;

import djm.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface SourceElement {
    public static final SourceElement NO_SOURCE = new h();

    @NotNull
    SourceFile getContainingFile();
}
