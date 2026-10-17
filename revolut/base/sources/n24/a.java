package n24;

import com.revolut.feature.credit.application.plugins.impl.repositories.documents_upload.DocumentsUploadRepositoryImpl$getDocumentsType$1;
import gim.i;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f211440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f211441x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ry3.a f211442y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, String str, String str2, ry3.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cVar;
        this.f211440w = str;
        this.f211441x = str2;
        this.f211442y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.v, this.f211440w, this.f211441x, this.f211442y, continuation, 0);
            default:
                return new a(this.v, this.f211440w, this.f211441x, this.f211442y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ry3.a aVar = this.f211442y;
        String str = this.f211441x;
        String str2 = this.f211440w;
        c cVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ve0.c cVar2 = cVar.f211444a;
                String strA = c.a(str2);
                ve0.c cVar3 = cVar.f211444a;
                String strA2 = c.a(str2);
                Type type = new DocumentsUploadRepositoryImpl$getDocumentsType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type, "getDocumentsType(...)");
                Map map = (Map) cVar3.v0(r0.g(), strA2, type);
                Map mapQ = r0.q(map, new Pair(str, d0.F0(s.L(aVar), (Collection) map.getOrDefault(str, f0.f322471a))));
                Type type2 = new DocumentsUploadRepositoryImpl$getDocumentsType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type2, "access$getDocumentsType(...)");
                cVar2.G(mapQ, strA, type2);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ve0.c cVar4 = cVar.f211444a;
                String strA3 = c.a(str2);
                ve0.c cVar5 = cVar.f211444a;
                String strA4 = c.a(str2);
                Type type3 = new DocumentsUploadRepositoryImpl$getDocumentsType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type3, "getDocumentsType(...)");
                Map map2 = (Map) cVar5.v0(r0.g(), strA4, type3);
                Map mapQ2 = r0.q(map2, new Pair(str, d0.A0((Iterable) map2.getOrDefault(str, f0.f322471a), s.L(aVar))));
                Type type4 = new DocumentsUploadRepositoryImpl$getDocumentsType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type4, "access$getDocumentsType(...)");
                cVar4.G(mapQ2, strA3, type4);
                break;
        }
        return Unit.f186387a;
    }
}
