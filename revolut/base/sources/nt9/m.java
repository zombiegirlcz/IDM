package nt9;

import cli.y;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.group_creation.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f219008w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar, h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f219008w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.v, this.f219008w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Image image;
        com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar = this.v;
        y yVar = bVar.f79487w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        h hVar = this.f219008w;
        if (i == 0) {
            yhm.o.b(obj2);
            Image image2 = ((g) ((j2) yVar.f22677a).getValue()).f218999a;
            image = image2 instanceof FileImage ? (FileImage) image2 : null;
            if (image == null) {
                zs9.e eVar = bVar.o;
                RetailBackgroundKey.SplitBillGroupCreation splitBillGroupCreationA = hVar.a();
                this.u = 1;
                obj2 = eVar.d(splitBillGroupCreationA, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            bVar.H2(yVar, new neg.q(image, 4, bVar, hVar));
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        image = (Image) obj2;
        bVar.H2(yVar, new neg.q(image, 4, bVar, hVar));
        return Unit.f186387a;
    }
}
