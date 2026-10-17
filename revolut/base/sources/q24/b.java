package q24;

import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import e04.f;
import e04.h;
import gim.i;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f241529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f241530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f241531y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241529w = cVar;
        this.f241530x = str;
        this.f241531y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f241529w, this.f241530x, this.f241531y, continuation, 0);
            default:
                return new b(this.f241529w, this.f241530x, this.f241531y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DropOutConfig.FeedbackForm feedbackForm;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService = this.f241529w.f241533b;
                    this.v = 1;
                    obj2 = creditPluginsService.getDropoutConfig(this.f241530x, this.f241531y, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                f fVar = (f) obj2;
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                boolean zJ = pd.b.j(fVar.getFeedbackCollectionEnabled());
                f.c feedbackForm2 = fVar.getFeedbackForm();
                DropOutConfig.ConfirmationContent confirmationContent = null;
                if (feedbackForm2 != null) {
                    Intrinsics.checkNotNullParameter(feedbackForm2, "<this>");
                    String formKey = feedbackForm2.getFormKey();
                    Map formParams = feedbackForm2.getFormParams();
                    if (formParams == null) {
                        formParams = r0.g();
                    }
                    feedbackForm = new DropOutConfig.FeedbackForm(formKey, formParams);
                } else {
                    feedbackForm = null;
                }
                f.b confirmationContent2 = fVar.getConfirmationContent();
                if (confirmationContent2 != null) {
                    String title = confirmationContent2.getTitle();
                    String description = confirmationContent2.getDescription();
                    f.a primaryButton = confirmationContent2.getPrimaryButton();
                    DropOutConfig.Button button = new DropOutConfig.Button(primaryButton.getText(), e04.a.a(primaryButton.getAction()));
                    f.a secondaryButton = confirmationContent2.getSecondaryButton();
                    confirmationContent = new DropOutConfig.ConfirmationContent(title, description, button, new DropOutConfig.Button(secondaryButton.getText(), e04.a.a(secondaryButton.getAction())));
                }
                return new DropOutConfig(zJ, confirmationContent, feedbackForm);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    CreditPluginsService creditPluginsService2 = this.f241529w.f241533b;
                    h hVar = new h(this.f241531y);
                    this.v = 1;
                    if (creditPluginsService2.submitDropoutForm(this.f241530x, hVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
