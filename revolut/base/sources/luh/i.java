package luh;

import cli.y;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a f200240w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f200240w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f200240w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f200240w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((e60.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((zth.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a aVar = this.f200240w;
        switch (i) {
            case 0:
                e60.m mVar = (e60.m) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                y yVar = aVar.f168616p;
                Answer.Documents documents = (Answer.Documents) ((iuh.e) ((j2) yVar.f22677a).getValue()).f168607b;
                if (documents == null) {
                    documents = new Answer.Documents(((Question.Documents) ((iuh.e) ((j2) yVar.f22677a).getValue()).f168606a).f105611a, r0.g());
                }
                LinkedHashMap linkedHashMapZ = r0.z(documents.f96518b);
                linkedHashMapZ.put(mVar.b(), null);
                Unit unit = Unit.f186387a;
                aVar.I2(Answer.Documents.b(documents, linkedHashMapZ));
                break;
            default:
                zth.a aVar3 = (zth.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                y yVar2 = aVar.f168616p;
                Answer.Documents documents2 = (Answer.Documents) ((iuh.e) ((j2) yVar2.f22677a).getValue()).f168607b;
                if (documents2 == null) {
                    documents2 = new Answer.Documents(((Question.Documents) ((iuh.e) ((j2) yVar2.f22677a).getValue()).f168606a).f105611a, r0.g());
                }
                LinkedHashMap linkedHashMapZ2 = r0.z(documents2.f96518b);
                linkedHashMapZ2.put(aVar3.f325166b, aVar3.f325167c);
                Unit unit2 = Unit.f186387a;
                aVar.I2(Answer.Documents.b(documents2, linkedHashMapZ2));
                break;
        }
        return Unit.f186387a;
    }
}
