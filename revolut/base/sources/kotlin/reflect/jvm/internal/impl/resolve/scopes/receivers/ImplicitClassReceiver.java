package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassDescriptor f187637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassDescriptor f187638b;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor, ImplicitClassReceiver implicitClassReceiver) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.f187637a = classDescriptor;
        this.f187638b = classDescriptor;
    }

    public boolean equals(Object obj2) {
        ImplicitClassReceiver implicitClassReceiver = obj2 instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj2 : null;
        return Intrinsics.f(this.f187637a, implicitClassReceiver != null ? implicitClassReceiver.f187637a : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    @NotNull
    public final ClassDescriptor getClassDescriptor() {
        return this.f187637a;
    }

    public int hashCode() {
        return this.f187637a.hashCode();
    }

    @NotNull
    public String toString() {
        return "Class{" + getType() + CoreConstants.CURLY_RIGHT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    @NotNull
    public SimpleType getType() {
        SimpleType defaultType = this.f187637a.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        return defaultType;
    }
}
