package zim;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes14.dex */
public final class a1 extends l0 {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f322585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f322586c;

    public a1(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f322585b = jClass;
        this.f322586c = yhm.j.c(yhm.k.PUBLICATION, new w0(this, 0));
    }

    @Override // kotlin.jvm.internal.j
    /* JADX INFO: renamed from: a */
    public final Class getF186423a() {
        return this.f322585b;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a1) {
            return Intrinsics.f(this.f322585b, ((a1) obj2).f322585b);
        }
        return false;
    }

    @Override // zim.l0
    public final Collection g() {
        return zhm.f0.f322471a;
    }

    public final int hashCode() {
        return this.f322585b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.l0
    public final Collection j(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        h2 h2Var = ((z0) this.f322586c.getValue()).d;
        KProperty kProperty = z0.f322731g[1];
        Object objInvoke = h2Var.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return ((MemberScope) objInvoke).getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.l0
    public final PropertyDescriptor n(int i) {
        yhm.r rVar = (yhm.r) ((z0) this.f322586c.getValue()).f.getValue();
        if (rVar == null) {
            return null;
        }
        JvmNameResolver jvmNameResolver = (JvmNameResolver) rVar.f314201a;
        ProtoBuf.Package r110 = (ProtoBuf.Package) rVar.f314202b;
        MetadataVersion metadataVersion = (MetadataVersion) rVar.f314203c;
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable = JvmProtoBuf.packageLocalVariable;
        Intrinsics.checkNotNullExpressionValue(packageLocalVariable, "packageLocalVariable");
        ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(r110, packageLocalVariable, i);
        if (property == null) {
            return null;
        }
        ProtoBuf.TypeTable typeTable = r110.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
        return (PropertyDescriptor) o2.f(this.f322585b, property, jvmNameResolver, new TypeTable(typeTable), metadataVersion, w.f322716c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.l0
    public final Class p() {
        Class cls = (Class) ((z0) this.f322586c.getValue()).e.getValue();
        return cls == null ? this.f322585b : cls;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.l0
    public final Collection q(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        h2 h2Var = ((z0) this.f322586c.getValue()).d;
        KProperty kProperty = z0.f322731g[1];
        Object objInvoke = h2Var.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return ((MemberScope) objInvoke).getContributedVariables(name, NoLookupLocation.FROM_REFLECTION);
    }

    public final String toString() {
        return "file class " + ReflectClassUtilKt.getClassId(this.f322585b).asSingleFqName();
    }
}
