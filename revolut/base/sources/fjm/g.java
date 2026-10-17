package fjm;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends MemberScopeImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MemoizedFunctionToNotNull f135690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemoizedFunctionToNotNull f135691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f135692c;
    public final /* synthetic */ EnumEntrySyntheticClassDescriptor d;

    public g(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, StorageManager storageManager) {
        if (storageManager == null) {
            a(0);
            throw null;
        }
        this.d = enumEntrySyntheticClassDescriptor;
        this.f135690a = storageManager.createMemoizedFunction(new e(this, 0));
        this.f135691b = storageManager.createMemoizedFunction(new e(this, 1));
        this.f135692c = storageManager.createLazyValue(new ajm.d(this, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fjm.g.a(int):void");
    }

    public final LinkedHashSet b(Name name, Collection collection) {
        if (name == null) {
            a(10);
            throw null;
        }
        if (collection == null) {
            a(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        OverridingUtil.DEFAULT.generateOverridesInFunctionGroup(name, collection, Collections.EMPTY_SET, this.d, new f(linkedHashSet));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set getClassifierNames() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        a(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        if (descriptorKindFilter == null) {
            a(13);
            throw null;
        }
        if (function1 == null) {
            a(14);
            throw null;
        }
        Collection collection = (Collection) this.f135692c.invoke();
        if (collection != null) {
            return collection;
        }
        a(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection getContributedFunctions(Name name, LookupLocation lookupLocation) {
        if (name == null) {
            a(5);
            throw null;
        }
        if (lookupLocation == null) {
            a(6);
            throw null;
        }
        Collection collection = (Collection) this.f135690a.invoke(name);
        if (collection != null) {
            return collection;
        }
        a(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection getContributedVariables(Name name, LookupLocation lookupLocation) {
        if (name == null) {
            a(1);
            throw null;
        }
        if (lookupLocation == null) {
            a(2);
            throw null;
        }
        Collection collection = (Collection) this.f135691b.invoke(name);
        if (collection != null) {
            return collection;
        }
        a(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set getFunctionNames() {
        Set set = (Set) this.d.f186584j.invoke();
        if (set != null) {
            return set;
        }
        a(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set getVariableNames() {
        Set set = (Set) this.d.f186584j.invoke();
        if (set != null) {
            return set;
        }
        a(19);
        throw null;
    }
}
