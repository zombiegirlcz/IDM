package kotlin.reflect.jvm.internal.impl.metadata.serialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public interface StringTable {
    int getQualifiedClassNameIndex(@NotNull String str, boolean z);

    int getStringIndex(@NotNull String str);
}
