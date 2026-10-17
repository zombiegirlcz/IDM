package fjm;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f135688b;

    public /* synthetic */ e(g gVar, int i) {
        this.f135687a = i;
        this.f135688b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f135687a) {
            case 0:
                Name name = (Name) obj2;
                if (name == null) {
                    g.a(8);
                    throw null;
                }
                g gVar = this.f135688b;
                MemberScope memberScope = gVar.d.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
                if (memberScope != null) {
                    return gVar.b(name, memberScope.getContributedFunctions(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                g.a(9);
                throw null;
            default:
                Name name2 = (Name) obj2;
                if (name2 == null) {
                    g.a(4);
                    throw null;
                }
                g gVar2 = this.f135688b;
                MemberScope memberScope2 = gVar2.d.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
                if (memberScope2 != null) {
                    return gVar2.b(name2, memberScope2.getContributedVariables(name2, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                g.a(9);
                throw null;
        }
    }
}
