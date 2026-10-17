package r40;

import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.tickets.api.extensions.TicketsWidgetContract$State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Feedback f251365b;

    public /* synthetic */ r0(Feedback feedback, int i) {
        this.f251364a = i;
        this.f251365b = feedback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f251364a) {
            case 0:
                return a.a((a) obj2, null, false, null, null, this.f251365b, null, 47);
            default:
                Feedback feedback = this.f251365b;
                Data update = (Data) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                try {
                    Object content = update.getContent();
                    return new Data(content != null ? TicketsWidgetContract$State.a((TicketsWidgetContract$State) content, null, null, feedback, 3) : null, update.getError(), update.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, update.getLoading());
                }
        }
    }
}
