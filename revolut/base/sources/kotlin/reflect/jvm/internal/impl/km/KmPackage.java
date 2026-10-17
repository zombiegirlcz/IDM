package kotlin.reflect.jvm.internal.impl.km;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmPackage implements KmDeclarationContainer {
    @NotNull
    public final List<KmPackageExtension> getExtensions$kotlin_metadata() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    @NotNull
    public List<KmFunction> getFunctions() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    @NotNull
    public List<KmProperty> getProperties() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    @NotNull
    public List<KmTypeAlias> getTypeAliases() {
        return null;
    }
}
