package vx9;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx9.a f292867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co9.a f292868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ufm.d f292869c;

    public i(kx9.a recentsDao, co9.a paymentCounterpartyFeatureChecker, ufm.d mapper) {
        Intrinsics.checkNotNullParameter(recentsDao, "recentsDao");
        Intrinsics.checkNotNullParameter(paymentCounterpartyFeatureChecker, "paymentCounterpartyFeatureChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f292867a = recentsDao;
        this.f292868b = paymentCounterpartyFeatureChecker;
        this.f292869c = mapper;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // vx9.t
    public final efm.b a(List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        if (!this.f292868b.a()) {
            return pfm.m.f235744a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : transactions) {
            if (obj2 instanceof ux9.g) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList) {
            String str = ((ux9.g) obj3).f283924a;
            Object objO = linkedHashMap.get(str);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, str);
            }
            ((List) objO).add(obj3);
        }
        pfm.a aVar = new pfm.a(this.f292869c.h(linkedHashMap, nx9.d.PAYMENT_COUNTERPARTY), new vx5.m(new b(this, 2), 12), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
