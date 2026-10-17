package mlm;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import maa.r;
import yhm.k;
import zhm.f0;
import zhm.p;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends qlm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f207089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f207090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f207091c;

    public d(KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f207089a = baseClass;
        this.f207090b = f0.f322471a;
        this.f207091c = yhm.j.c(k.PUBLICATION, new r(this, 12));
    }

    @Override // qlm.b
    public final KClass c() {
        return this.f207089a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f207091c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f207089a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(KClass baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f207090b = p.c(classAnnotations);
    }
}
