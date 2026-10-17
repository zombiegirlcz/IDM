package kotlin.reflect.jvm.internal.impl.km;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public interface KmDeclarationContainer {
    @NotNull
    List<KmFunction> getFunctions();

    @NotNull
    List<KmProperty> getProperties();

    @NotNull
    List<KmTypeAlias> getTypeAliases();
}
