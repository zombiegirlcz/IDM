package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmPropertyExtension implements KmPropertyExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(o0.f186429a.b(JvmPropertyExtension.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JvmFieldSignature f186851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JvmMethodSignature f186852c;
    public JvmMethodSignature d;
    public JvmMethodSignature e;
    public JvmMethodSignature f;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final JvmFieldSignature getFieldSignature() {
        return this.f186851b;
    }

    public final JvmMethodSignature getGetterSignature() {
        return this.f186852c;
    }

    public final int getJvmFlags() {
        return this.f186850a;
    }

    public final JvmMethodSignature getSetterSignature() {
        return this.d;
    }

    public final JvmMethodSignature getSyntheticMethodForAnnotations() {
        return this.e;
    }

    public final JvmMethodSignature getSyntheticMethodForDelegate() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return TYPE;
    }

    public final void setFieldSignature(JvmFieldSignature jvmFieldSignature) {
        this.f186851b = jvmFieldSignature;
    }

    public final void setGetterSignature(JvmMethodSignature jvmMethodSignature) {
        this.f186852c = jvmMethodSignature;
    }

    public final void setJvmFlags(int i) {
        this.f186850a = i;
    }

    public final void setSetterSignature(JvmMethodSignature jvmMethodSignature) {
        this.d = jvmMethodSignature;
    }

    public final void setSyntheticMethodForAnnotations(JvmMethodSignature jvmMethodSignature) {
        this.e = jvmMethodSignature;
    }

    public final void setSyntheticMethodForDelegate(JvmMethodSignature jvmMethodSignature) {
        this.f = jvmMethodSignature;
    }
}
