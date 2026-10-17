package fjm;

import java.util.Collections;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Name f135684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractTypeParameterDescriptor f135685b;

    public c(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, Name name) {
        this.f135685b = abstractTypeParameterDescriptor;
        this.f135684a = name;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this.f135685b.getTypeConstructor(), Collections.EMPTY_LIST, false, new LazyScopeAdapter(new ajm.d(this, 14)));
    }
}
