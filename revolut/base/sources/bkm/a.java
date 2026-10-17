package bkm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f16432b;

    public /* synthetic */ a(int i, Function0 function0) {
        this.f16431a = i;
        this.f16432b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f16431a;
        Function0 function0 = this.f16432b;
        switch (i) {
            case 0:
                MemberScope memberScope = (MemberScope) function0.invoke();
                return memberScope instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScope).getActualScope() : memberScope;
            default:
                KProperty[] kPropertyArr = DeserializedMemberScope.e;
                return d0.i1((Iterable) function0.invoke());
        }
    }
}
