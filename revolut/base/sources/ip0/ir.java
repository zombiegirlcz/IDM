package ip0;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ir implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tr f164735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.Model f164736c;

    public /* synthetic */ ir(InputTextDelegate.Model model, tr trVar) {
        this.f164734a = 0;
        this.f164736c = model;
        this.f164735b = trVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f164734a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                InputTextDelegate.Model model = this.f164736c;
                Clause clause = model.d;
                py0.c cVar = clause != null ? new py0.c(clause) : null;
                tr trVar = this.f164735b;
                or0.u.k(trVar.f).n0().a(trVar.f, model, cVar);
                return model;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                tr trVar2 = this.f164735b;
                py0.f fVarN0 = or0.u.k(trVar2.f).n0();
                InputText inputText = trVar2.f;
                InputTextDelegate.Model model2 = this.f164736c;
                Image image = model2.f52586l;
                fVarN0.a(inputText, model2, image != null ? new py0.b(image) : null);
                return model2;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                tr trVar3 = this.f164735b;
                py0.f fVarN02 = or0.u.k(trVar3.f).n0();
                InputText inputText2 = trVar3.f;
                InputTextDelegate.Model model3 = this.f164736c;
                Image image2 = model3.f52587m;
                fVarN02.a(inputText2, model3, image2 != null ? new py0.b(image2) : null);
                return model3;
        }
    }

    public /* synthetic */ ir(tr trVar, InputTextDelegate.Model model, int i) {
        this.f164734a = i;
        this.f164735b = trVar;
        this.f164736c = model;
    }
}
