package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmFunctionExtension implements KmFunctionExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(o0.f186429a.b(JvmFunctionExtension.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JvmMethodSignature f186845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f186846b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final String getLambdaClassOriginName() {
        return this.f186846b;
    }

    public final JvmMethodSignature getSignature() {
        return this.f186845a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return TYPE;
    }

    public final void setLambdaClassOriginName(String str) {
        this.f186846b = str;
    }

    public final void setSignature(JvmMethodSignature jvmMethodSignature) {
        this.f186845a = jvmMethodSignature;
    }
}
