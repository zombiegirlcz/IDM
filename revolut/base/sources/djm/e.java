package djm;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotFoundClasses f115410b;

    public /* synthetic */ e(NotFoundClasses notFoundClasses, int i) {
        this.f115409a = i;
        this.f115410b = notFoundClasses;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        DeclarationDescriptor declarationDescriptor;
        switch (this.f115409a) {
            case 0:
                FqName fqName = (FqName) obj2;
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return new EmptyPackageFragmentDescriptor(this.f115410b.f186532b, fqName);
            default:
                f fVar = (f) obj2;
                Intrinsics.checkNotNullParameter(fVar, "<destruct>");
                ClassId classId = fVar.f115411a;
                List list = fVar.f115412b;
                if (classId.isLocal()) {
                    throw new UnsupportedOperationException("Unresolved local class: " + classId);
                }
                ClassId outerClassId = classId.getOuterClassId();
                NotFoundClasses notFoundClasses = this.f115410b;
                if (outerClassId == null || (declarationDescriptor = notFoundClasses.getClass(outerClassId, d0.V(list, 1))) == null) {
                    declarationDescriptor = (ClassOrPackageFragmentDescriptor) notFoundClasses.f186533c.invoke(classId.getPackageFqName());
                }
                DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
                boolean zIsNestedClass = classId.isNestedClass();
                StorageManager storageManager = notFoundClasses.f186531a;
                Name shortClassName = classId.getShortClassName();
                Integer num = (Integer) d0.d0(list);
                return new NotFoundClasses.MockClassDescriptor(storageManager, declarationDescriptor2, shortClassName, zIsNestedClass, num != null ? num.intValue() : 0);
        }
    }
}
