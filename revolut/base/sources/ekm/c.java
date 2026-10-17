package ekm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import zhm.a0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends DeserializedMemberScope {
    public final KotlinTypeRefiner f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NotNullLazyValue f127192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NotNullLazyValue f127193h;
    public final /* synthetic */ DeserializedClassDescriptor i;

    public c(DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.i = deserializedClassDescriptor;
        DeserializationContext c2 = deserializedClassDescriptor.getC();
        List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
        Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
        List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.getClassProto().getPropertyList();
        Intrinsics.checkNotNullExpressionValue(propertyList, "getPropertyList(...)");
        List<ProtoBuf.TypeAlias> typeAliasList = deserializedClassDescriptor.getClassProto().getTypeAliasList();
        Intrinsics.checkNotNullExpressionValue(typeAliasList, "getTypeAliasList(...)");
        List<Integer> nestedClassNameList = deserializedClassDescriptor.getClassProto().getNestedClassNameList();
        Intrinsics.checkNotNullExpressionValue(nestedClassNameList, "getNestedClassNameList(...)");
        List<Integer> list = nestedClassNameList;
        NameResolver nameResolver = deserializedClassDescriptor.getC().getNameResolver();
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(NameResolverUtilKt.getName(nameResolver, ((Number) it8.next()).intValue()));
        }
        super(c2, functionList, propertyList, typeAliasList, new ajm.d(arrayList, 9));
        this.f = kotlinTypeRefiner;
        this.f127192g = this.f187724a.getStorageManager().createLazyValue(new b(this, 0));
        this.f127193h = this.f187724a.getStorageManager().createLazyValue(new b(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void a(ArrayList result, Function1 nameFilter) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        e eVar = this.i.f187716p;
        if (eVar != null) {
            Set<Name> setKeySet = eVar.f127195a.keySet();
            arrayList = new ArrayList();
            for (Name name : setKeySet) {
                Intrinsics.checkNotNullParameter(name, "name");
                ClassDescriptor classDescriptor = (ClassDescriptor) eVar.f127196b.invoke(name);
                if (classDescriptor != null) {
                    arrayList.add(classDescriptor);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        result.addAll(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void c(Name name, ArrayList functions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = ((Collection) this.f127193h.invoke()).iterator();
        while (it8.hasNext()) {
            arrayList.addAll(((KotlinType) it8.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        functions.addAll(this.f187724a.getComponents().getAdditionalClassPartsProvider().getFunctions(name, this.i));
        k(name, arrayList, functions);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void d(Name name, ArrayList descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = ((Collection) this.f127193h.invoke()).iterator();
        while (it8.hasNext()) {
            arrayList.addAll(((KotlinType) it8.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        k(name, arrayList, descriptors);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final ClassId e(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.i.f187711h.createNestedClassId(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set f() {
        List<KotlinType> supertypes = this.i.f187715n.getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it8 = supertypes.iterator();
        while (it8.hasNext()) {
            Set<Name> classifierNames = ((KotlinType) it8.next()).getMemberScope().getClassifierNames();
            if (classifierNames == null) {
                return null;
            }
            a0.x(classifierNames, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set g() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.i;
        List<KotlinType> supertypes = deserializedClassDescriptor.f187715n.getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it8 = supertypes.iterator();
        while (it8.hasNext()) {
            a0.x(((KotlinType) it8.next()).getMemberScope().getFunctionNames(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f187724a.getComponents().getAdditionalClassPartsProvider().getFunctionsNames(deserializedClassDescriptor));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public final ClassifierDescriptor mo3796getContributedClassifier(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo3799recordLookup(name, location);
        e eVar = this.i.f187716p;
        if (eVar != null) {
            Intrinsics.checkNotNullParameter(name, "name");
            ClassDescriptor classDescriptor = (ClassDescriptor) eVar.f127196b.invoke(name);
            if (classDescriptor != null) {
                return classDescriptor;
            }
        }
        return super.mo3796getContributedClassifier(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection getContributedDescriptors(DescriptorKindFilter kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f127192g.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection getContributedFunctions(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo3799recordLookup(name, location);
        return super.getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection getContributedVariables(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo3799recordLookup(name, location);
        return super.getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set h() {
        List<KotlinType> supertypes = this.i.f187715n.getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it8 = supertypes.iterator();
        while (it8.hasNext()) {
            a0.x(((KotlinType) it8.next()).getMemberScope().getVariableNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final boolean j(SimpleFunctionDescriptor function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return this.f187724a.getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.i, function);
    }

    public final void k(Name name, ArrayList arrayList, final ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.f187724a.getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(name, arrayList, arrayList3, this.i, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
            public final void a(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
                Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof FunctionDescriptorImpl) {
                    ((FunctionDescriptorImpl) fromCurrent).putInUserDataMap(DeserializedDeclarationsFromSupertypeConflictDataKey.INSTANCE, fromSuper);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            public void addFakeOverride(CallableMemberDescriptor fakeOverride) {
                Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
                OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                arrayList2.add(fakeOverride);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public final void mo3799recordLookup(Name name, LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        UtilsKt.record(this.f187724a.getComponents().getLookupTracker(), location, this.i, name);
    }
}
