package e1a;

import com.revolut.feature.payments.splitbill.impl.data.splitbilllink.SplitBillLinkService;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import f1a.l;
import f1a.r;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public SplitBillLink v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f121930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f121931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f121932y;
    public final /* synthetic */ dj0.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, String str, dj0.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121931x = fVar;
        this.f121932y = str;
        this.z = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f121931x, this.f121932y, this.z, continuation, 0);
            default:
                return new d(this.f121931x, this.f121932y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f121930w;
                f fVar = this.f121931x;
                if (i == 0) {
                    o.b(obj2);
                    SplitBillLinkService splitBillLinkService = fVar.f121935a;
                    f1a.c cVar = new f1a.c(this.z, this.f121932y);
                    this.f121930w = 1;
                    obj2 = splitBillLinkService.createSplitBillLink(cVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SplitBillLink splitBillLink = this.v;
                        o.b(obj2);
                        return splitBillLink;
                    }
                    o.b(obj2);
                }
                SplitBillLink splitBillLinkW = uj3.b.w((l) obj2);
                this.v = splitBillLinkW;
                this.f121930w = 2;
                List listC = (List) fVar.f121936b.get("CACHE_KEY_SPLIT_BILL_LINKS");
                if (listC == null && (listC = fVar.c()) == null) {
                    listC = f0.f322471a;
                }
                List listA = g.a(u.c(splitBillLinkW), listC);
                x4l.c cVar2 = fVar.e;
                Object obj3 = Unit.f186387a;
                Object objF = cVar2.f(obj3, listA, this);
                if (objF == aVar) {
                    obj3 = objF;
                }
                return obj3 == aVar ? aVar : splitBillLinkW;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f121930w;
                f fVar2 = this.f121931x;
                if (i2 == 0) {
                    o.b(obj2);
                    SplitBillLinkService splitBillLinkService2 = fVar2.f121935a;
                    r rVar = new r(this.z);
                    this.f121930w = 1;
                    obj2 = splitBillLinkService2.updateSplitBillLink(this.f121932y, rVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SplitBillLink splitBillLink2 = this.v;
                        o.b(obj2);
                        return splitBillLink2;
                    }
                    o.b(obj2);
                }
                SplitBillLink splitBillLinkW2 = uj3.b.w((l) obj2);
                this.v = splitBillLinkW2;
                this.f121930w = 2;
                List listC2 = (List) fVar2.f121936b.get("CACHE_KEY_SPLIT_BILL_LINKS");
                if (listC2 == null && (listC2 = fVar2.c()) == null) {
                    listC2 = f0.f322471a;
                }
                List listA2 = g.a(u.c(splitBillLinkW2), listC2);
                x4l.c cVar3 = fVar2.e;
                Object obj4 = Unit.f186387a;
                Object objF2 = cVar3.f(obj4, listA2, this);
                if (objF2 == aVar2) {
                    obj4 = objF2;
                }
                return obj4 == aVar2 ? aVar2 : splitBillLinkW2;
        }
    }
}
