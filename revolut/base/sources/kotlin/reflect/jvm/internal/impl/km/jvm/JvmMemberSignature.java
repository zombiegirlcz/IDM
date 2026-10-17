package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class JvmMemberSignature {
    public JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public abstract String getDescriptor();

    @NotNull
    public abstract String getName();

    @NotNull
    public abstract String toString();
}
