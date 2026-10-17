package qll;

import com.revolut.sso.impl.domain.models.Identifier;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.unified.a f247585b;

    public /* synthetic */ d0(com.revolut.sso.impl.ui.combined_authentication.unified.a aVar, int i) {
        this.f247584a = i;
        this.f247585b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f247584a) {
            case 0:
                q update = (q) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return q.a(update, new m(((q) ((j2) this.f247585b.D.f22677a).getValue()).f247595a), null, null, null, 30);
            case 1:
                q update2 = (q) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return q.a(update2, new m(((q) ((j2) this.f247585b.D.f22677a).getValue()).f247595a), null, null, null, 30);
            default:
                com.revolut.sso.impl.ui.combined_authentication.unified.a aVar = this.f247585b;
                cli.y yVar = aVar.D;
                s7a.a0 outputData = (s7a.a0) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                s7a.c0 c0Var = outputData.f260599a;
                if (!(c0Var instanceof s7a.q)) {
                    throw new IllegalStateException("Check failed.");
                }
                wi0.a aVar2 = wi0.b.Companion;
                String str = ((s7a.q) c0Var).f260624a;
                aVar2.getClass();
                wi0.b bVarA = wi0.a.a(str);
                Identifier.Phone phone = ((q) ((j2) yVar.f22677a).getValue()).f247596b;
                String strJ = aVar.u.j(bVarA);
                fj0.b.Companion.getClass();
                Serializable serializableB = fj0.a.b(strJ);
                yhm.o.b(serializableB);
                aVar.H2(yVar, new qce.a(aVar, Identifier.Phone.a(phone, null, ((fj0.b) serializableB).f135518a, bVarA, 1), 19));
                return Unit.f186387a;
        }
    }
}
