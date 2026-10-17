package xy9;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ApmDescriptor f309666w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SendFromClipboardType.PixType f309667x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PixIdentifiedType.Valid f309668y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, ApmDescriptor apmDescriptor, SendFromClipboardType.PixType pixType, PixIdentifiedType.Valid valid, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f309666w = apmDescriptor;
        this.f309667x = pixType;
        this.f309668y = valid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, this.f309666w, this.f309667x, this.f309668y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        PixIdentifiedType.Valid valid = this.f309668y;
        o oVar = this.v;
        l lVar = new l(oVar, this.f309666w, this.f309667x, valid, null);
        this.u = 1;
        Object objY2 = oVar.Y2(this, lVar);
        return objY2 == aVar ? aVar : objY2;
    }
}
