package do8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_settings.impl.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jmrtd.lds.LDSFile;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d f116462w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f116462w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(0, this.f116462w, continuation);
            default:
                return new q(1, this.f116462w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar = this.f116462w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    zq.a aVar2 = dVar.f77288q;
                    String str = dVar.o.f77277a;
                    this.v = 1;
                    if (aVar2.f(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                j60.a.v(dVar.f77290s, false, null, 3);
                return dVar.X1(new mii.f("ID_SHOT_INVITATION_CANCELLATION_SUCCESS", new TextLocalisedClause(R$string.junior_login_invitation_cancellation_success_title, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_16_check_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar2 = this.f116462w;
                q qVar = new q(0, dVar2, null);
                this.v = 1;
                Object objB0 = u0.b0(dVar2.X(), "TAG_CANCEL_INVITATION_BUTTON", qVar, this);
                return objB0 == aVar3 ? aVar3 : objB0;
        }
    }
}
