package olm;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f226465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KClass f226466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f226467c;

    public b(g original, KClass kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f226465a = original;
        this.f226466b = kClass;
        this.f226467c = original.f226475a + '<' + kClass.m() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor b(int i) {
        return this.f226465a.f226478g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return this.f226465a.f226477c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return this.f226465a.f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.f226467c;
    }

    public final boolean equals(Object obj2) {
        b bVar = obj2 instanceof b ? (b) obj2 : null;
        return bVar != null && this.f226465a.equals(bVar.f226465a) && Intrinsics.f(bVar.f226466b, this.f226466b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f226465a.g(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f226465a.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.bumptech.glide.d getKind() {
        return this.f226465a.f226476b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return this.f226465a.f226479h[i];
    }

    public final int hashCode() {
        return this.f226467c.hashCode() + (this.f226466b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.f226465a.i[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f226466b + ", original: " + this.f226465a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
