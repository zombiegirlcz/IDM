package ekm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends AbstractClassTypeConstructor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f127194c;
    public final /* synthetic */ DeserializedClassDescriptor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(deserializedClassDescriptor.getC().getStorageManager());
        this.d = deserializedClassDescriptor;
        this.f127194c = deserializedClassDescriptor.getC().getStorageManager().createLazyValue(new a(deserializedClassDescriptor, 6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection b() {
        String strAsString;
        FqName fqNameAsSingleFqName;
        DeserializedClassDescriptor deserializedClassDescriptor = this.d;
        List<ProtoBuf.Type> listSupertypes = ProtoTypeTableUtilKt.supertypes(deserializedClassDescriptor.getClassProto(), deserializedClassDescriptor.getC().getTypeTable());
        ArrayList arrayList = new ArrayList(w.t(listSupertypes, 10));
        Iterator<T> it8 = listSupertypes.iterator();
        while (it8.hasNext()) {
            arrayList.add(deserializedClassDescriptor.getC().getTypeDeserializer().type((ProtoBuf.Type) it8.next()));
        }
        ArrayList arrayListE0 = d0.E0(deserializedClassDescriptor.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(deserializedClassDescriptor), arrayList);
        ArrayList<NotFoundClasses.MockClassDescriptor> arrayList2 = new ArrayList();
        Iterator it9 = arrayListE0.iterator();
        while (it9.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((KotlinType) it9.next()).getConstructor().mo3795getDeclarationDescriptor();
            NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorMo3795getDeclarationDescriptor instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor : null;
            if (mockClassDescriptor != null) {
                arrayList2.add(mockClassDescriptor);
            }
        }
        if (!arrayList2.isEmpty()) {
            ErrorReporter errorReporter = deserializedClassDescriptor.getC().getComponents().getErrorReporter();
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList2) {
                ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                if (classId == null || (fqNameAsSingleFqName = classId.asSingleFqName()) == null || (strAsString = fqNameAsSingleFqName.asString()) == null) {
                    strAsString = mockClassDescriptor2.getName().asString();
                    Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                }
                arrayList3.add(strAsString);
            }
            errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor, arrayList3);
        }
        return d0.d1(arrayListE0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final SupertypeLoopChecker e() {
        return SupertypeLoopChecker.EMPTY.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassDescriptor mo3795getDeclarationDescriptor() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return (List) this.f127194c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return true;
    }

    public final String toString() {
        String string = this.d.getName().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassifierDescriptor mo3795getDeclarationDescriptor() {
        return this.d;
    }
}
