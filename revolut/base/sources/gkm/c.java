package gkm;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractTypeConstructor f144512b;

    public /* synthetic */ c(AbstractTypeConstructor abstractTypeConstructor, int i) {
        this.f144511a = i;
        this.f144512b = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144511a) {
            case 0:
                e supertypes = (e) obj2;
                Intrinsics.checkNotNullParameter(supertypes, "supertypes");
                AbstractTypeConstructor abstractTypeConstructor = this.f144512b;
                List listFindLoopsInSupertypesAndDisconnect = abstractTypeConstructor.e().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, supertypes.f144516a, new b(abstractTypeConstructor), new c(abstractTypeConstructor, 1));
                if (listFindLoopsInSupertypesAndDisconnect.isEmpty()) {
                    KotlinType kotlinTypeC = abstractTypeConstructor.c();
                    List listC = kotlinTypeC != null ? u.c(kotlinTypeC) : null;
                    if (listC == null) {
                        listC = f0.f322471a;
                    }
                    listFindLoopsInSupertypesAndDisconnect = listC;
                }
                List listD1 = listFindLoopsInSupertypesAndDisconnect instanceof List ? (List) listFindLoopsInSupertypesAndDisconnect : null;
                if (listD1 == null) {
                    listD1 = d0.d1(listFindLoopsInSupertypesAndDisconnect);
                }
                List listF = abstractTypeConstructor.f(listD1);
                Intrinsics.checkNotNullParameter(listF, "<set-?>");
                supertypes.f144517b = listF;
                break;
            default:
                KotlinType it8 = (KotlinType) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f144512b.g(it8);
                break;
        }
        return Unit.f186387a;
    }
}
