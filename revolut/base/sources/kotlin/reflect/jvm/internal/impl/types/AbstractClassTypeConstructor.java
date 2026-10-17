package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(@NotNull StorageManager storageManager) {
        super(storageManager);
        if (storageManager != null) {
        } else {
            h(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void h(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor.h(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[RETURN] */
    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            r1 = 0
            if (r0 == 0) goto L78
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = r5.mo3795getDeclarationDescriptor()
            java.lang.String r2 = "first"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "second"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r6.getName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r3)
            r3 = 1
            if (r2 != 0) goto L24
        L22:
            r6 = r1
            goto L75
        L24:
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r0.getContainingDeclaration()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r6 = r6.getContainingDeclaration()
        L2c:
            if (r0 == 0) goto L56
            if (r6 == 0) goto L56
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
            if (r2 == 0) goto L37
            boolean r6 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
            goto L75
        L37:
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
            if (r2 == 0) goto L3c
            goto L22
        L3c:
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            if (r2 == 0) goto L58
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            if (r2 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r0
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r0.getFqName()
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r6
            kotlin.reflect.jvm.internal.impl.name.FqName r6 = r6.getFqName()
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r0, r6)
            if (r6 == 0) goto L22
        L56:
            r6 = r3
            goto L75
        L58:
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            if (r2 == 0) goto L5d
            goto L22
        L5d:
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r4 = r6.getName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r4)
            if (r2 != 0) goto L6c
            goto L22
        L6c:
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r0.getContainingDeclaration()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r6 = r6.getContainingDeclaration()
            goto L2c
        L75:
            if (r6 == 0) goto L78
            return r3
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor.a(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final KotlinType c() {
        if (KotlinBuiltIns.isSpecialClassWithNoSupertypes(mo3795getDeclarationDescriptor())) {
            return null;
        }
        return getBuiltIns().getAnyType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection d(boolean z) {
        DeclarationDescriptor containingDeclaration = mo3795getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            h(3);
            throw null;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        smartList.add(classDescriptor.getDefaultType());
        ClassDescriptor classDescriptorMo3785getCompanionObjectDescriptor = classDescriptor.mo3785getCompanionObjectDescriptor();
        if (z && classDescriptorMo3785getCompanionObjectDescriptor != null) {
            smartList.add(classDescriptorMo3785getCompanionObjectDescriptor.getDefaultType());
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(mo3795getDeclarationDescriptor());
        if (builtIns != null) {
            return builtIns;
        }
        h(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassDescriptor mo3795getDeclarationDescriptor();
}
