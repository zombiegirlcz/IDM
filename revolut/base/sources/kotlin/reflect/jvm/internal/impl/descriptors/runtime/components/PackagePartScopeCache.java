package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class PackagePartScopeCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializedDescriptorResolver f186678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReflectKotlinClassFinder f186679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f186680c;

    public PackagePartScopeCache(@NotNull DeserializedDescriptorResolver resolver, @NotNull ReflectKotlinClassFinder kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f186678a = resolver;
        this.f186679b = kotlinClassFinder;
        this.f186680c = new ConcurrentHashMap();
    }

    @NotNull
    public final MemberScope getPackagePartScope(@NotNull ReflectKotlinClass fileClass) {
        Collection collectionC;
        Intrinsics.checkNotNullParameter(fileClass, "fileClass");
        ClassId classId = fileClass.getClassId();
        ConcurrentHashMap concurrentHashMap = this.f186680c;
        Object obj2 = concurrentHashMap.get(classId);
        if (obj2 == null) {
            FqName packageFqName = fileClass.getClassId().getPackageFqName();
            KotlinClassHeader.Kind kind = fileClass.getClassHeader().getKind();
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
            DeserializedDescriptorResolver deserializedDescriptorResolver = this.f186678a;
            if (kind == kind2) {
                List<String> multifilePartNames = fileClass.getClassHeader().getMultifilePartNames();
                collectionC = new ArrayList();
                for (String str : multifilePartNames) {
                    ClassId.Companion companion = ClassId.Companion;
                    FqName fqNameForTopLevelClassMaybeWithDollars = JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
                    Intrinsics.checkNotNullExpressionValue(fqNameForTopLevelClassMaybeWithDollars, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.f186679b, companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), deserializedDescriptorResolver.getComponents().getConfiguration().getMetadataVersion());
                    if (kotlinJvmBinaryClassFindKotlinClass != null) {
                        collectionC.add(kotlinJvmBinaryClassFindKotlinClass);
                    }
                }
            } else {
                collectionC = u.c(fileClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(deserializedDescriptorResolver.getComponents().getModuleDescriptor(), packageFqName);
            ArrayList arrayList = new ArrayList();
            Iterator it8 = collectionC.iterator();
            while (it8.hasNext()) {
                MemberScope memberScopeCreateKotlinPackagePartScope = deserializedDescriptorResolver.createKotlinPackagePartScope(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it8.next());
                if (memberScopeCreateKotlinPackagePartScope != null) {
                    arrayList.add(memberScopeCreateKotlinPackagePartScope);
                }
            }
            List listD1 = d0.d1(arrayList);
            MemberScope memberScopeCreate = ChainedMemberScope.Companion.create("package " + packageFqName + " (" + fileClass + CoreConstants.RIGHT_PARENTHESIS_CHAR, listD1);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(classId, memberScopeCreate);
            obj2 = objPutIfAbsent == null ? memberScopeCreate : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return (MemberScope) obj2;
    }
}
