package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.tg;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c31 implements vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qo f27352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gj f27353c;

    public c31(List countries, qo flowConfig, gj dataBundle) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        this.f27351a = countries;
        this.f27352b = flowConfig;
        this.f27353c = dataBundle;
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
    @Override // com.fourthline.orca.internal.vg
    public void a(tg document) {
        di diVar;
        Object next;
        Object obj2;
        String documentType;
        Intrinsics.checkNotNullParameter(document, "document");
        if (document instanceof tg.a) {
            Iterator it8 = this.f27351a.iterator();
            while (true) {
                diVar = null;
                obj2 = null;
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                String strC = ((fd) next).c();
                kn knVarA = ((tg.a) document).a();
                if (Intrinsics.f(strC, knVarA != null ? knVarA.getIssuingCountry() : null)) {
                    break;
                }
            }
            fd fdVar = (fd) next;
            this.f27353c.a(fdVar);
            gj gjVar = this.f27353c;
            if (fdVar != null) {
                Iterator it9 = di.e.a(fdVar, this.f27352b.h()).iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Object next2 = it9.next();
                    DocumentType documentTypeC = ((di) next2).c();
                    kn knVarA2 = ((tg.a) document).a();
                    if (documentTypeC == ((knVarA2 == null || (documentType = knVarA2.getDocumentType()) == null) ? null : CountryNetworkModelKt.toDocumentType(documentType, fdVar.c()))) {
                        obj2 = next2;
                        break;
                    }
                }
                diVar = (di) obj2;
            }
            gjVar.a(diVar);
        }
    }
}
