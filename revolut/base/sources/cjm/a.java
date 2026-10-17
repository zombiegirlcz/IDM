package cjm;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns$Companion;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends KotlinBuiltIns {

    @NotNull
    public static final FallbackBuiltIns$Companion Companion = new FallbackBuiltIns$Companion(null);
    public static final a f;

    static {
        a aVar = new a(new LockBasedStorageManager("FallbackBuiltIns"));
        aVar.c(true);
        f = aVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final PlatformDependentDeclarationFilter f() {
        return PlatformDependentDeclarationFilter.All.INSTANCE;
    }
}
