package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmTypeExtension implements KmTypeExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(o0.f186429a.b(JvmTypeExtension.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f186853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f186854b = new ArrayList();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!JvmTypeExtension.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension");
        JvmTypeExtension jvmTypeExtension = (JvmTypeExtension) obj2;
        return this.f186853a == jvmTypeExtension.f186853a && Intrinsics.f(this.f186854b, jvmTypeExtension.f186854b);
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.f186854b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return TYPE;
    }

    public int hashCode() {
        return this.f186854b.hashCode() + (Boolean.hashCode(this.f186853a) * 31);
    }

    public final boolean isRaw() {
        return this.f186853a;
    }

    public final void setRaw(boolean z) {
        this.f186853a = z;
    }
}
