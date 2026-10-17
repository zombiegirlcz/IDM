package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public interface JavaValueParameter extends JavaAnnotationOwner {
    Name getName();

    @NotNull
    JavaType getType();

    boolean isVararg();
}
