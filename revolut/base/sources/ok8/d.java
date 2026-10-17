package ok8;

import com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage;
import com.revolut.feature.junior_progression.impl.ui.prompt.JuniorProgressionFlowContract$State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JuniorProgressionPromptStage f225935b;

    public /* synthetic */ d(JuniorProgressionPromptStage juniorProgressionPromptStage, int i) {
        this.f225934a = i;
        this.f225935b = juniorProgressionPromptStage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        JuniorProgressionFlowContract$State update = (JuniorProgressionFlowContract$State) obj2;
        switch (this.f225934a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
        }
        return JuniorProgressionFlowContract$State.a(update, this.f225935b, 0, null, 6);
    }
}
