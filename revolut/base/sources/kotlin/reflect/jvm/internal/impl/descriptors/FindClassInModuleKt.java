package kotlin.reflect.jvm.internal.impl.descriptors;

import djm.c;
import djm.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import nkm.t;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class FindClassInModuleKt {
    public static final ClassDescriptor findClassAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments = classId.getRelativeClassName().pathSegments();
            ClassifierDescriptor classifierDescriptorMo3796getContributedClassifier = packageViewDescriptor.getMemberScope().mo3796getContributedClassifier((Name) d0.b0(listPathSegments), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo3796getContributedClassifier == null) {
                return null;
            }
            for (Name name : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(classifierDescriptorMo3796getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo3796getContributedClassifier2 = ((ClassDescriptor) classifierDescriptorMo3796getContributedClassifier).getUnsubstitutedInnerClassesScope().mo3796getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo3796getContributedClassifier = classifierDescriptorMo3796getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo3796getContributedClassifier2 : null;
                if (classifierDescriptorMo3796getContributedClassifier == null) {
                    return null;
                }
            }
            return classifierDescriptorMo3796getContributedClassifier;
        }
        PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments2 = classId.getRelativeClassName().pathSegments();
        ClassifierDescriptor classifierDescriptorMo3796getContributedClassifier3 = packageViewDescriptor2.getMemberScope().mo3796getContributedClassifier((Name) d0.b0(listPathSegments2), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo3796getContributedClassifier3 == null) {
            classifierDescriptorMo3796getContributedClassifier3 = null;
            break;
        }
        for (Name name2 : listPathSegments2.subList(1, listPathSegments2.size())) {
            if (classifierDescriptorMo3796getContributedClassifier3 instanceof ClassDescriptor) {
                ClassifierDescriptor classifierDescriptorMo3796getContributedClassifier4 = ((ClassDescriptor) classifierDescriptorMo3796getContributedClassifier3).getUnsubstitutedInnerClassesScope().mo3796getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo3796getContributedClassifier3 = classifierDescriptorMo3796getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo3796getContributedClassifier4 : null;
                if (classifierDescriptorMo3796getContributedClassifier3 != null) {
                }
            }
            classifierDescriptorMo3796getContributedClassifier3 = null;
        }
        if (classifierDescriptorMo3796getContributedClassifier3 != null) {
            return classifierDescriptorMo3796getContributedClassifier3;
        }
        PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments3 = classId.getRelativeClassName().pathSegments();
        ClassifierDescriptor classifierDescriptorMo3796getContributedClassifier5 = packageViewDescriptor3.getMemberScope().mo3796getContributedClassifier((Name) d0.b0(listPathSegments3), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo3796getContributedClassifier5 == null) {
            return null;
        }
        for (Name name3 : listPathSegments3.subList(1, listPathSegments3.size())) {
            if (!(classifierDescriptorMo3796getContributedClassifier5 instanceof ClassDescriptor)) {
                return null;
            }
            ClassifierDescriptor classifierDescriptorMo3796getContributedClassifier6 = ((ClassDescriptor) classifierDescriptorMo3796getContributedClassifier5).getUnsubstitutedInnerClassesScope().mo3796getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
            classifierDescriptorMo3796getContributedClassifier5 = classifierDescriptorMo3796getContributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo3796getContributedClassifier6 : null;
            if (classifierDescriptorMo3796getContributedClassifier5 == null) {
                return null;
            }
        }
        return classifierDescriptorMo3796getContributedClassifier5;
    }

    @NotNull
    public static final ClassDescriptor findNonGenericClassAcrossDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, y.J(y.x(t.g(classId, d.f), c.f115406b)));
    }

    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
