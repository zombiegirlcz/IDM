package ey7;

import aii.u;
import android.content.Intent;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.IntentCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nhi.j;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PolicyDocument.Pdf f130584w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, PolicyDocument.Pdf pdf2, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f130584w = pdf2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f130584w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            PolicyDocument.Pdf pdf2 = this.f130584w;
            f9i.c cVar = new f9i.c(new f9i.e(pdf2.f76271b, pdf2.f76272c));
            this.u = 1;
            obj2 = ((nhi.b) this.v).b(cVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        u uVar = (u) obj2;
        if (!(uVar instanceof ExternalDestination.ImplicitActivity)) {
            if (uVar instanceof ExternalDestination.ByIntent) {
                ExternalDestination.ByIntent byIntent = (ExternalDestination.ByIntent) uVar;
                return new IntentCommand(byIntent.f98289a, byIntent.f98290b);
            }
            throw new IllegalStateException(("Unsupported PDF navigation destination: " + uVar).toString());
        }
        ExternalDestination.ImplicitActivity implicitActivity = (ExternalDestination.ImplicitActivity) uVar;
        Intent intent = new Intent(implicitActivity.f98294a);
        intent.setDataAndType(implicitActivity.e, intent.getType());
        intent.setFlags(implicitActivity.f);
        intent.setComponent(implicitActivity.f98298h);
        String str2 = implicitActivity.f98296c;
        if (str2 != null && ((str = implicitActivity.d) == null || intent.setClassName(str2, str) == null)) {
            Intrinsics.checkNotNullExpressionValue(intent.setPackage(str2), "setPackage(...)");
        }
        nim.a.F(intent, implicitActivity.f98295b);
        return new IntentCommand(intent, implicitActivity.i);
    }
}
