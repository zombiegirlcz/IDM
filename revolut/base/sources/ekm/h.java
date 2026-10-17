package ekm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* JADX INFO: loaded from: classes13.dex */
public interface h {
    TypeAliasDescriptor a(Name name);

    Set b();

    void c(ArrayList arrayList, DescriptorKindFilter descriptorKindFilter, Function1 function1, LookupLocation lookupLocation);

    Collection getContributedFunctions(Name name, LookupLocation lookupLocation);

    Collection getContributedVariables(Name name, LookupLocation lookupLocation);

    Set getFunctionNames();

    Set getVariableNames();
}
